package 아이템3;

// 싱글톤 패턴
public class Elvis1 {
    public static final Elvis1 INSTANCE = new Elvis1();
    public static Elvis1 getInstance(){
        return INSTANCE;
    }
    public void leaveTheBuilding(){
        System.out.println("정적 팩토리 방식의 싱글톤");
    }
}
