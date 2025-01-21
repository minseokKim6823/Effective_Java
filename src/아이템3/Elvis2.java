package 아이템3;

public class Elvis2 {
    public static final Elvis2 INSTANCE = new Elvis2();
    public void leaveTheBuilding(){
        System.out.println("public static final 필드 방식의 싱글턴");
    }
    //싱글튼임을 보장해누는 ReadResolve메소드
    public Object readResolve(){
        return INSTANCE;
    }
}
