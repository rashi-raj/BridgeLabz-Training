package day2.medinventory;

import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MedInventoryManager<T extends Item> {

    private Set<T> uniqueItems = new HashSet<>();
    private Map<String, List<T>> categoryMap = new HashMap<>();

    // Regex for date: dd-MM-yyyy
    private static final Pattern DATE_PATTERN =
            Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

    // Critical stock limit
    private static final int LOW_STOCK_LIMIT = 5;

    // 🔹 Read inventory CSV
    public void processInventoryFile(String filePath) {

        uniqueItems.clear();
        categoryMap.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {

                try {
                    processLine(line, lineNumber);
                } catch (LowStockException e) {
                    System.out.println("🚨 LOW STOCK ALERT: " + e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println("⚠️ Line " + lineNumber + " skipped: " + e.getMessage());
                }

                lineNumber++;
            }

            System.out.println("\n✅ Inventory processing completed.");

        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
    }

    // 🔹 Process each CSV line
    private void processLine(String line, int lineNumber) throws LowStockException {

        line = line.trim();

        if (line.isEmpty()) {
            throw new IllegalArgumentException("Empty line");
        }

        String[] parts = line.split(",");

        if (parts.length != 4) {
            throw new IllegalArgumentException("Invalid CSV format -> " + line);
        }

        String id = parts[0].trim();
        String name = parts[1].trim();
        int quantity;
        String expiry = parts[3].trim();

        try {
            quantity = Integer.parseInt(parts[2].trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid quantity -> " + line);
        }

        // 🔹 Validate date using Regex
        Matcher matcher = DATE_PATTERN.matcher(expiry);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid expiry date format -> " + expiry);
        }

        @SuppressWarnings("unchecked")
        T item = (T) new Item(id, name, quantity, expiry);

        // 🔹 Remove duplicates using Set
        if (!uniqueItems.add(item)) {
            System.out.println("🔁 Duplicate item skipped: " + id);
            return;
        }

        // 🔹 Low stock check
        if (quantity < LOW_STOCK_LIMIT) {
            throw new LowStockException(name + " (ID: " + id + ") has critical stock: " + quantity);
        }

        // 🔹 Categorize by item name prefix (Gloves, Syringe, Oxygen, etc.)
        String category = detectCategory(name);

        categoryMap.computeIfAbsent(category, k -> new ArrayList<>()).add(item);

        System.out.println("Processed: " + item);
    }

    // 🔹 Simple category detection
    private String detectCategory(String itemName) {

        itemName = itemName.toLowerCase();

        if (itemName.contains("glove")) return "Gloves";
        if (itemName.contains("syringe")) return "Syringes";
        if (itemName.contains("oxygen")) return "Oxygen Cylinders";
        if (itemName.contains("mask")) return "Masks";

        return "Others";
    }

    // 🔹 Display categorized inventory
    public void displayByCategory() {

        System.out.println("\n📦 Inventory Categorized:");

        for (Map.Entry<String, List<T>> entry : categoryMap.entrySet()) {

            System.out.println("\nCategory: " + entry.getKey());

            for (T item : entry.getValue()) {
                System.out.println("  " + item);
            }
        }
    }
}