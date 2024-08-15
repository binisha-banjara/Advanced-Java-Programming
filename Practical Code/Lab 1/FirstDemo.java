
/**
 * Program to create a class, instance variable, constructor and method.
 * Then create a class FirstDemo with main method and access the member of above class
 */
class MyClass {
    int a;
    int b;

    public MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


public class FirstDemo{
    public static void main(String[] args){
        MyClass object = new MyClass(5, 10);
        object.display();
    }
}