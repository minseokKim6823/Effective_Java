package 아이템6;

public class test {
    private static Long sum1(){
        Long sum=0L;
        for (Long i = 0L;i<=Integer.MAX_VALUE;i++)
            sum+=i;

        return sum;
    }

    private static long sum2(){
        long sum=0L;
        for (long i = 0L;i<=Integer.MAX_VALUE;i++)
            sum+=i;

        return sum;
    }

    public static void main(String[] args){
            long start, end;

            start = System.nanoTime();
            System.out.println(sum1());
            end = System.nanoTime();
            System.out.println("sum1 실행 시간: " + (end - start) / 1_000_000.0 + " ms");

            start = System.nanoTime();
            System.out.println(sum2());
            end = System.nanoTime();
            System.out.println("sum2 실행 시간: " + (end - start) / 1_000_000.0 + " ms");
    }
}
