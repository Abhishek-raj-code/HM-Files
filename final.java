final class A {
    final int speed =200;
    void gare(){
System.out.println('s');
    }
}

class B extends A{
    void gare(){
        System.out.println("S");
    }
}

class demo20{
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.speed);
        //a.gare();
        b.gare();
    }
}
