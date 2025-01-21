package 아이템4;
//인스턴스화를 막는 예시
public class MathUtil {
    private MathUtil(){

    }
    public static int add(int a, int b){
        return a+b;
    }
}
