// 싱글톤 패턴
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    public static Elvis getInstance(){
        return INSTANCE;
    }
    public void leaveTheBuilding(){
        System.out.println("hello");

    }
}
