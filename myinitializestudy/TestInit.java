package myinitializestudy;

public class TestInit {

    public  static void f(int i){
        System.out.println("my name is int");
    }
//    public static void f(Integer i){
//        System.out.println("my name is Integer");
//    }
    public static void f(double d){
        System.out.println("my name is double");
    }
    public static void main(String[] args) {
        Integer i=new Integer(1);
        f((int)i);
        f(i);
    }
}
