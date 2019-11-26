package myinitializestudy;

class Cup{
    Cup(int i){
        System.out.println("cup "+i);
    }
    void f(int i){
        System.out.println("f "+i);
    }
}

class Cups{
    static Cup cup1;
    static Cup cup2;
    static {
        cup1=new Cup(1);
        cup2=new Cup(2);
    }
    Cups(){
        System.out.println("Cups()");
    }
}

enum A{

}

public class TestStaticInit {
    public static void main(String[] args) {
        Cups.cup1.f(99);
    }
//    static Cups c1=new Cups();
}
