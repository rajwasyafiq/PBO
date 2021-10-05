public class MyClass {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.x = 50;
        myObj.PI = 25;
        System.out.println(myObj.x);
    }
}