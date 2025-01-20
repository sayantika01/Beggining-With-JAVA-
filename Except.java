/*A7a
//To handle arithmetic exception
public class Except {
    public static void main(String[] args){
        System.out.println(10/0);
    }
}*/
/*A7b
//for multiple catch to fire ArrayIndexOutOfBoundsException and
//StringIndexOutOfBoundsException both.
class Test{
    public static <ArrayIndexOutOfBoundException> void main(String[] args){
        try{
            System.out.println(args[0]);
            System.out.println("java".charAt(6));
        }
        catch(ArrayIndexOutOfBoundException a){
            System.out.println(a);
        }
        catch(StringIndexOutOfBoundException s){
            System.out.println(s);
        }
    }
}*/
/*A7c
class Except{
    public static void main(String[] args){
        int[] a=new int[-10];
    }
}*/
/*A7h
class Except{
    public static void main(String[] args){
        try{
            String s=args[0];
            int start=Integer.parseInt(args[1]);
            int end= Integer.parseInt(args[2]);
            String sub=s.substring(start,end);
            StringBuffer rev=new StringBuffer(sub);
            System.out.println(rev);
        }
        catch(ArrayIndexOutOfBoundException a){
            System.out.println(a);
            System.out.println("Give a string and two integers");
        }
        catch(StringIndexOutOfBoundException se){
            System.out.println(se);
            System.out.println("Give the start and the end properly");
        }
    }
}*/
/*A7d
class Except{
    public static void main(String[] args){
        String s=null;
        try{
            s.length();
        }
        catch(NullPointerException ne){
            System.out.println(ne);
        }
    }
}*/
/*A7e
import java.io.*;
class Except{
    public static void main(String[] args) throws IOException{
        throw new IOException();
    }
}*/
/*A7f
class PayOutOfBoundException extends Exception{
    PayOutOfBoundException(String s) {
        super(s);
    }
}
class Except{
    public static void main(String[] args){
        int i=Integer.parseInt(args[0]);
        try{
            if(i<10000){
                throw new PayOutOfBoundException("Income is less than 10k");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}*/
/*A7g
class MyExp1 extends Exception{
    MyExp1(String s){
        super(s);
    }
}
class MyExp2 extends Exception{
    MyExp2(String s){
        super(s);
    }
}
class Except{
    void f() throws MyExp2{
        try{
            g();
        }
        catch(Exception e){
            System.out.println(e+" caught inside f()");
            throw new MyExp2("2nd Exception");
        }
    }
    void g() throws MyExp1{
        System.out.println("Inside g()");
        throw new MyExp1("1st Exception");
    }
    public static void main(String[] args){
        try{
            new Except().f();
        }
        catch(Exception e){
            System.out.println(e+" caught inside main()");
        }
    }
}*/