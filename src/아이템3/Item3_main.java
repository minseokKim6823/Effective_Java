package 아이템3;

public class Item3_main {
    public static void main(String[] args) {
        Elvis1 test1= Elvis1.getInstance();
        test1.leaveTheBuilding();
        Elvis2.INSTANCE.leaveTheBuilding();
        Elvis3.INSTANCE.leaveTheBuilding();
    }
}
