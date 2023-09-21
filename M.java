class A {
    void exp() {
        System.out.println("A is the class");
    }
}

class B extends A {
    void bexp() {
        System.out.println("B is the class ");
    }
}

class C extends A{
    void me() {
        System.out.println("C is the class");
    }
}

public class M{
    public static void main(String[] args) {
        A a= new A();
        a.exp();

        B b = new B();
        b.bexp();

        C c = new C();
        c.me();
;
    }
}