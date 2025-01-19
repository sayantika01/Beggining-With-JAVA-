/*A4a
import java.util.Scanner;

class TwoD{
    double length;
    double breadth;
    TwoD(double l,double b){
        this.length=l;
        this.breadth=b;
    }
    TwoD(double l){
        this.length=l;
    }
    public double area(){
        return length*length;
    }
}
class Triangle extends TwoD{
    public Triangle(double length,double breadth) {
        super(length, breadth);
    }
    public double area(){
        return 0.5*length*breadth;
    }
}
class Square extends TwoD{
    public Square(double length){
        super(length);
    }
    public double area(){
        return length*length;
    }
}
class Rectangle extends TwoD{
    public Rectangle(double length, double breadth){
        super(length,breadth);
    }
    public double area(){
        return length*breadth;
    }
}
public class Test2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Length: ");
        double l=sc.nextDouble();
        System.out.println("Breadth: ");
        double b=sc.nextDouble();
        Rectangle rect=new Rectangle(l,b);
        System.out.println("Side: ");
        double s=sc.nextDouble();
        Square sq=new Square(s);
        System.out.println("Height: ");
        double h=sc.nextDouble();
        System.out.println("Base: ");
        double ba=sc.nextDouble();
        Triangle tri=new Triangle(h,ba);

        System.out.println("Area of Square:"+sq.area());
        System.out.println("Area of Square:"+tri.area());
        System.out.println("Area of Square:"+rect.area());
    }
}*/

/*A4c
abstract class Test{
    void m1(){
        System.out.println("concrete method of the class");
    }
    static void m2(){
        System.out.println("Static concrete method");
    }
}
public class Test2 extends Test{
    public static void main(String[] args){
        Test2 t=new Test2();
        t.m1();
        Test2.m2();
    }
}*/
/*A4d
abstract class Demo{
    abstract void m1();
    abstract void m2();
    abstract void m3();
}
class Test2 extends Demo{
    void m1(){
        System.out.println("m1 overridden");
    }
    //CT error
}*/

/*A4e
// Write a Java Program to create a base class Animal having properties: consume food, capable of motion. Two subclasses Mammal and Reptile having features: covered with hairs and feed breast milk to its infants, can crawl, have scales and cold blooded respectively. Show the properties of Human and cow for Mammal category, snake and crocodile for reptile category adding one new feature for each of the classes.
class Animal{
    void consumeFood(){
        System.out.println("this animal can consume food");
    }
    void capableOfMotion(){
        System.out.println("this animal can move");
    }
}
class Mammal extends Animal{
    void hasHair(){
        System.out.println("this Mammal are covered with hairs");
    }
    void feedsMilk(){
        System.out.println("this Mammal feed breast milk to its infants");
    }
}
class Reptile extends Animal{
    void crawl(){
        System.out.println("this Reptile can crawl");
    }
    void scales(){
        System.out.println("this Reptile have scales");
    }
    void coldblooded(){
        System.out.println("this Reptile have cold blood");
    }
}
class Human extends Mammal{
    void canThink(){
        System.out.println("humans can think");
    }
}
class Cow extends Mammal{
    void eatGrass(){
        System.out.println("cows eat grass");
    }
}
class Snake extends Reptile{
    void venomous(){
        System.out.println("snakes are venomous");
    }
}
class Crocodile extends Reptile{
    void canswim(){
        System.out.println("crocodiles can swim");
    }
}
class Test{
    public static void main(String[] args){
        Human human=new Human();
        System.out.println("human:");
        human.consumeFood();
        human.capableOfMotion();
        human.hasHair();
        human.feedsMilk();
        human.canThink();

        //rest are same
    }
}*/
