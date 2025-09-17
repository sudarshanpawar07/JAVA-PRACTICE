class Demo1 {
    String a;
    int b;

    Demo1(String a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    public void displayDemo1() {
        System.out.println("Class Demo1 ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}

class Demo2 extends Demo1 {
    String c;
    int d;

    // Parameterized constructor
    Demo2(String a, int b, String c, int d) {
        super(a, b);
        this.c = c;
        this.d = d;
    }

    // Copy constructor
    Demo2(Demo2 oldObj) {
        super(oldObj.a, oldObj.b);
        this.c = oldObj.c;
        this.d = oldObj.d;
    }

    public void displayDemo2() {
        displayDemo1();
        System.out.println("Class Demo2 ");
        System.out.println("c : " + c);
        System.out.println("d : " + d + "\n");
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        // Original object
        Demo2 oldObj = new Demo2("demo1", 123, "demo2", 456);
        oldObj.displayDemo2();

        // Copy object using copy constructor
        Demo2 copyObj = new Demo2(oldObj);

        System.out.println("----------------- AFTER CHANGES -----------------");

        // Change copy object
        copyObj.a = "DEMO1";
        copyObj.c = "DEMO2";
        copyObj.displayDemo2();

        // Original remains unchanged
        oldObj.displayDemo2();
    }
}
