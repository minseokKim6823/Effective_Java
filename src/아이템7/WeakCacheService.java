package 아이템7;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakCacheService {
    private final Map<String, String> cache = new WeakHashMap<>();

    public void put(String key, String value) {
        cache.put(key, value);
    }

    public String get(String key) {
        return cache.getOrDefault(key, "캐시 없음");
    }

    public void printCacheSize() {
        System.out.println("캐시 크기: " + cache.size());
    }
}
