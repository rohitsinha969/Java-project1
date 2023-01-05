class A {
    public void method1() {
        System.out.println("method 1 of A");
    }
}

class B extends A {
    @Override // Annotation for override
    public void method1() {
        System.out.println("method 1 of B");
    }
}

public class page16_Method_Overriding_in_JAVA {
    public static void main(String[] args) {
        B b_objectB = new B();
        A a_objectA = new A();
        a_objectA.method1();
        b_objectB.method1();
    }
}
