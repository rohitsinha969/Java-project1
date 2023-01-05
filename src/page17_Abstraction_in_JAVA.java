/**
 * page17_Abstraction_in_JAVA
 */
abstract class parent {
    public parent() {
        System.out.println("Hi this is parent class");
    }

    abstract public void greet1();

    abstract public void greet2();
}

class child extends parent {

    @Override
    public void greet1() {
        // TODO Auto-generated method stub
        System.out.println("Overriden-Abstract method for greet 1");
    }

    @Override
    public void greet2() {
        // TODO Auto-generated method stub
        System.out.println("Overriden-Abstract method for greet 2");
    }

}

public class page17_Abstraction_in_JAVA {
    public static void main(String[] args) {
        child ch = new child();
        // parent pp = new parent(); ---> Error (cant create object for abstract classS)
        ch.greet1();
        ch.greet2();
    }
}