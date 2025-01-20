/*A5(i)d
public class Test34on {
    {
        System.out.println("B1");
    }
    {
        System.out.println("B2");
    }
    static{
        System.out.println("B3");
    }
    static{
        System.out.println("B4");
    }
    public static void main(String[] args){
        Test34on t=new Test34on();
    }
}*/

/*A5(i)e
class Parent{
    static{
        System.out.println("Static block of Parent class");
    }
}
class Child extends Parent{
    static{
        System.out.println("Static block of child xlass");
    }
}
public class Test34on{
    public static void main(String[] args){
        System.out.println("Main method executed.");
        Child c=new Child();
    }
}*/

/*A5(i)f
class Outer{
    int i=20;
    static int j=10;
    void m1(){
        System.out.println("From outer");
        Inner in=new Inner();
        System.out.println("k="+in.k);
        System.out.println("m="+in.m);
    }
    class Inner{
        int k=30;
        static int m=5;
        void m2(){
            System.out.println("From Inner");
            System.out.println("i="+i);
            System.out.println("j="+j);
        }
    }
}
public class Test34on{
    public static void main(String[] args){
        Outer o=new Outer();
        Outer.Inner i=o.new Inner();
        o.m1();
        i.m2();
    }
}*/

/*A5(i)g*/
interface A{
    void m1();
}
abstract class B{
    public abstract void m2();
}
class Test34on{
    public static void main(String[] args){
        A a=new A(){
           public void m1(){
               System.out.println("Hi");
           }
        };
        a.m1();
        B b=new B(){
            public void m2(){
                System.out.println("Hello");
            }
        };
        b.m2();
    }
}