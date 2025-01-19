/* A3a
public class Test1 {
    void m1(){
        System.out.println("Void Method");
    }
    int m1(int k){
        System.out.println("Int Method"); // Gives compile time error.. As chnge in return type does not provide method overloading
    }
    public static void main(String[] args){
        System.out.println("Hi");
    }
}*/

/*A3b
public class Test1{
    void addition(int a,int b){
        int e=a+b;
        System.out.println("Sum is: "+e);
    }
    void addition(int a,int b,int c){
        int d=a+b+c;
        System.out.println("Sum is: "+d);
    }
    void addition(double a,double b){
        double f=a+b;
        System.out.println("Sum is: "+f);
    }
    public static void main(String[] args){
        Test1 t1=new Test1();
        t1.addition(5,6);
        t1.addition(3,5,8);
        t1.addition(2.5,6.7);

    }
}*/

/*A3c
class Addition{
    int i,a,b;
    Addition(int i){
        this.i=i;
        System.out.println("Sum is: "+i);
    }
    Addition(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Sum is: "+(a+b));
    }
}
public class Test1{
    public static void main(String[] args){
        Addition ad1=new Addition(200);
        Addition ad2=new Addition(19,309);
    }
}*/

/*A3d

class Box{
    Box(int h){
        System.out.println("Volume of cube is= "+(h*h*h));
    }
    Box(int h,int r){
        System.out.println("Volume of cone is: "+((1/3.0)*3.14*r*r*h));
    }
    public static void main(String[] args){
        Box cube= new Box(3);
        Box cone= new Box(3,5);
    }
}*/

/*A3e
class Box{
    void vol(int l){
        System.out.println("The volume of the cube is: "+(l*l*l));
    }
    void vol(int l,int r){
        System.out.println("The volume of the cone is: "+((1/3.0)*3.14*r*r*l));
    }
}
public class Test1{
    public static void main(String[] args){
        Box b=new Box();
        b.vol(10);
        b.vol(10,3);

    }
}*/

/*A3f
import java.util.Scanner;
class Student{
    int roll;
    String name;
    Student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    public String toString(){
        return name+" "+roll;
    }
}
public class Test1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String name1=sc.nextLine();
        System.out.println("Enter the roll number of the student: ");
        int roll1= sc.nextInt();
        Student s1=new Student(roll1,name1);
        sc.nextLine();
        System.out.println("Enter the name of the student: ");
        String name2=sc.nextLine();
        System.out.println("Enter the roll number of the student: ");
        int roll2= sc.nextInt();
        Student s2=new Student(roll2,name2);
        System.out.println("The details of the students: ");
        System.out.println(s1);
        System.out.println(s2);
    }
}*/

/*A3g
import java.util.Scanner;
class EMP{
    String name;
    int id;
    EMP(String name,int id){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return name+" "+id;
    }
}
class Scientist extends EMP{
    int no_Publication;
    String exp;
    Scientist(String name,int id,int no_Publication,String exp){
        super(name,id);
        this.exp=exp;
        this.no_Publication=no_Publication;
    }
    public String toString(){
        return super.toString()+" "+no_Publication+" "+exp;
    }
}
class Dscientist extends Scientist{
    int awards;
    Dscientist(String name,int id, int no_Publication,String exp,int awards){
        super(name,id,no_Publication,exp);
        this.awards=awards;
    }
    public String toString(){
        return super.toString()+" "+awards;
    }
}
public class Test1{
    public static void main(String[] args){
//       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter the name: ");
//       String name=sc.nextLine();
//        System.out.println("Enter the id: ");
//        int id=sc.nextInt();
//        System.out.println("Enter the name: ");
//        int no_Pub=sc.nextInt();
//        System.out.println("Enter the name: ");
//        String exp=sc.nextLine();
//        System.out.println("Enter the name: ");
//        int awards=sc.nextInt();

        EMP e=new EMP("John",12);
        Scientist s=new Scientist("Harry",14,5,"Ten");
        Dscientist d= new Dscientist("Saks",19,9,"8",4);
        System.out.println("Employee: "+e);
        System.out.println("Scientist: "+s);
        System.out.println("Dscientist: "+d);
    }
}*/

/*A3h -------Overriding of methods
class Test{
    void show(){
        System.out.println("Dispaly");
    }
}
class Test2 extends Test{
    void show(){
        System.out.println("Display 1");
    }
}
class Test3 extends Test2{
    void show(){
        System.out.println("Display 2");
    }
}
class Test4 extends Test3{
    void show(){
        System.out.println("Display 3");
    }
}
public class Test1{
    public static void main(String[] args){
        Test t=new Test();
        Test2 t2=new Test2();
        Test3 t3=new Test3();
        Test4 t4=new Test4();

        t.show();
        t2.show();
        t3.show();
        t4.show();
    }
}*/

/*A3h ------ Using Polymorphism------ Dynamic Method dispatch
class Test{
    void show(){
        System.out.println("Dispaly");
    }
}
class Test2 extends Test{
    void show(){
        System.out.println("Display 1");
    }
}
class Test3 extends Test2{
    void show(){
        System.out.println("Display 2");
    }
}
class Test4 extends Test3{
    void show(){
        System.out.println("Display 3");
    }
}
public class Test1{
    public static void main(String[] args){
        Test t;
        t=new Test2();
        t.show();

        t=new Test3();
        t.show();

        t=new Test4();
        t.show();
    }
}
*/