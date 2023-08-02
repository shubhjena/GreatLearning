package Backend_Week1.MyArrayList;

public class Client {
    public static void main(String[] args) {
        MyList myList = new MyArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        System.out.println(myList);
        myList.add(5, 0);
        System.out.println(myList.get(0));
        myList.delete();
        System.out.println(myList);
    }
}
