package p1;
interface Shape{
    double pi=3.14;
    void area();
}
class Circle implements Shape{
    double r;
    Circle(int r){
        this.r=r;
    }
    public void area(){
        System.out.println("Area of circle is: "+pi*r*r);
    }
}
class Rectangle implements Shape{
    double l,b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        System.out.println("Area of Rectangle is ; "+l*b);
    }
}

