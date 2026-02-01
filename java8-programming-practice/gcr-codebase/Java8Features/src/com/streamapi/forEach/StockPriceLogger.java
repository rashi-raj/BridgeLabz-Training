package com.streamapi.forEach;
import java.util.List;

public class StockPriceLogger {
    public static void main(String[] args) {

        List<Double> stockPrices = List.of(2345.50, 2360.75, 2350.10, 2375.40);

        // forEach to log each stock price
        stockPrices.forEach(price ->
            System.out.println("Live Stock Price: " + price)
        );
    }
}
