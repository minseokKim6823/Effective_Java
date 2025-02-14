package 아이템7;

public class WeakHashMapTest {
    public static void main(String[] args) throws InterruptedException {
        WeakCacheService cacheService = new WeakCacheService();

        // (1) 캐시에 값 저장
        String key1 = new String("user1"); // 새 String 객체 생성 (GC 수거 가능)
        String key2 = "user2"; // 리터럴 문자열 (GC가 수거 안 함)

        cacheService.put(key1, "Alice");
        cacheService.put(key2, "Bob");

        // (2) 캐시 출력 (GC 실행 전)
        cacheService.printCacheSize(); // 출력: 2

        // (3) key1을 참조 해제 후 GC 실행
        key1 = null;
        System.gc(); // GC 강제 실행
        Thread.sleep(10000);

        // (4) 캐시 출력 (GC 실행 후)
        cacheService.printCacheSize(); // 출력: 1 (user1 제거됨)
    }
}