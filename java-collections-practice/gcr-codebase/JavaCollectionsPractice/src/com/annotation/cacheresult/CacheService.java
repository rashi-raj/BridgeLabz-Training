package com.annotation.cacheresult;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheService {

    private static final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int expensiveOperation(int n) throws InterruptedException {
        Thread.sleep(300);
        return n * n;
    }

    public static void main(String[] args) throws Exception {
        CacheService service = new CacheService();
        Method m = CacheService.class.getMethod("expensiveOperation", int.class);

        int input = 5;

        if (cache.containsKey(input)) {
            System.out.println("From Cache: " + cache.get(input));
        } else {
            int result = (int) m.invoke(service, input);
            cache.put(input, result);
            System.out.println("Computed: " + result);
        }

        // second call
        System.out.println("From Cache: " + cache.get(input));
    }
}
