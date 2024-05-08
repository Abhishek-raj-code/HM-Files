interface I{
    int a=10;
    void add();
    void sub();
}

interface J{
    int b=20;
    void mul();
    void div();
}

interface K extends I,J{

}

class C implements K{
    public void sub(){
        System.out.println("A-B" + (I.a - J.b));
    }
}

class demo 25{
    public static void main(String[] args){
      C c = new C();
      c.add();
    }
}