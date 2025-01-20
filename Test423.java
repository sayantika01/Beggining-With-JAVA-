/*A5(ii)b
interface A1{
    void m1();
    void m2();
}
interface B1{
    void m3();
    void m4();
}
interface C extends A1,B1{
    void m5();
}
class Demo{
    void m6(){
        System.out.println("Concrete class");
    }
}
public class Test423 extends Demo implements C{
    public void m1(){
        System.out.println("M1 method of interface A1");
    }
    public void m2(){
        System.out.println("M2 method of interface A1");
    }
    public void m3(){
        System.out.println("M3 method of interface B1");
    }
    public void m4(){
        System.out.println("M4 method of interface B1");
    }
    public void m5(){
        System.out.println("M5 method of interface C");
    }
    public static void main(String[] args){
        Test423 t=new Test423();
        t.m1();
        t.m2();
        t.m3();
        t.m4();
        t.m5();
        t.m6();
    }
}*/

/*A5(ii)c
interface Car{
    int noEngine=1;
    int noWheels=4;
    int noSteering=1;
    void engineCap();
    void seat();
}
interface lux extends Car{
    void enter();
    void air();
    void sensor();
}
class Mercedes implements lux{
    public void engineCap(){
        System.out.println("1500cc");
    }
    public void seat(){
        System.out.println("4");
    }
    public void enter(){
        System.out.println("1screen 2 boxes");
    }
    public void air(){
        System.out.println("2");
    }
    public void sensor(){
        System.out.println("2sensors");
    }
}
class Alto implements Car{
    public void engineCap(){
        System.out.println("998cc");
    }
    public void seat(){
        System.out.println("4");
    }
}
class Test423{
    public static void main(String[] args){
        Mercedes m=new Mercedes();
        Alto a=new Alto();
        System.out.println("Merecedes: ");
        m.engineCap();
        m.seat();
        m.enter();
        m.air();
        m.sensor();
        System.out.println("Alto: ");
        m.engineCap();
        m.seat();
    }
}
*/