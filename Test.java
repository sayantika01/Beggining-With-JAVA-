import java.util.Scanner;
/*A2a
public class Test {
    int i;
    static int s;
    void intMethod(){
        System.out.println("Instance method");
        System.out.println("Value of i= "+i);
        System.out.println("Value of s= "+s); //*** Non static-> static ----Possible
    }
    static void insMethod(){
        System.out.println("Static Method");
        //System.out.println("Value of i= "+i); //*** Static-> non static ----Not Possible
        System.out.println("Value of s= "+s);
    }
    public static void main(String[] args){
        Test t= new Test();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of i: ");
        t.i=sc.nextInt(); //***To call a non static var we need object reference
        System.out.println("Enter the value of s: ");
        s=sc.nextInt(); //***To call a static var we don't need object REference
        t.intMethod();
        insMethod();
    }
}*/

/*A2b
class Test1 {
    int i;
    static int s;

    void intMethod() {
        System.out.println("Instance method");
        System.out.println("Value of i= " + i);
        System.out.println("Value of s= " + s); //*** Non static-> static ----Possible
    }

    static void insMethod() {
        System.out.println("Static Method");
        //System.out.println("Value of i= "+i); //*** Static-> non static ----Not Possible
        System.out.println("Value of s= " + s);
    }
}
public class Test{
    public static void main(String[] args){
        Test1 t= new Test1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of i: ");
        t.i=sc.nextInt(); //***To call a non static var we need object reference
        System.out.println("Enter the value of s: ");
        t.s=sc.nextInt(); //***To call a static var we don't need object REference
        t.intMethod();
        t.insMethod();
    }
}*/

/*A2c & A2d is as same as the above two codes*/
/*A2e(i)
public class Test{
    int i;
    Test(int i){
        this.i=i;
    }
    void display(Test t){
        System.out.println("DISPLAY "+t.i);
    }
    public static void main(String[] args){
        Test t1=new Test(10);
        Test t2=new Test(20); //2 instances of the same class
        t1.display(t2); // passing value of one instance as parameter to the method called by 1st instance

    }
}*/

/*A2e(ii)
class Test1{
    int i;
    Test1(int i){
        this.i=i;
    }
    void display(Test2 t){
        System.out.println("DIsplay: "+t.value);
    }
}
class Test2{
    int value;
    Test2(int value){
        this.value=value;
    }
}
public class Test{
    public static void main(String[] args){
        Test1 t1=new Test1(10);
        Test2 t2=new Test2(20);
        t1.display(t2);

    }
}*/

/*A2f(i)
class Test1{
    int i;
    Test1(int i){
        this.i=i;
    }
    Test1 display(){
        System.out.println("Returning an object of the same class");
        return new Test1(10); // returning the class reference
    }
}
public class Test{
    public static void main(String[] args){
        Test1 t=new Test1(10);
        Test1 newObj=t.display(); //returning same class object
        System.out.println("Value in the new class Object: "+newObj.i);
    }
}*/

/*A2f(ii)
class Test1{
    int i;
    Test1(int i){
        this.i=i;
    }
}
class Test2{
    int j;
    Test2(int j){
        this.j=j;
    }
    Test1 display(){
        System.out.println("Returning an object of different class:");
        return new Test1(10);
    }
}

public class Test{
    public static void main(String[] args){
        Test2 t2=new Test2(100);
        Test1 t1=t2.display();
        System.out.println("Value of Test1 object returned by class Test2 is:"+t1.i);
    }
}*/

/*A2g
class BankAcc{
    private String NameOfTheDepositor;
    private String AccNumber;
    private String TypeOfAcc;
    private double Balance;
    void assignInitialValue(String Name,String Number,String Type,double Balance){
        this.NameOfTheDepositor=Name;
        this.AccNumber=Number;
        this.TypeOfAcc=Type;
        this.Balance=Balance;
    }
    public void deposit(int amount){
        if(amount>0){
            Balance+=amount;
            System.out.println("Deposit successful");
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=Balance){
            Balance-=amount;
            System.out.println("Withdrawl Successful");
        }
        else if(amount> Balance){
            System.out.println("Insufficiebnt balance");
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public void display(){
        System.out.println("Name of the depositor is: "+NameOfTheDepositor);
        System.out.println("Balance of the depositor is: "+Balance);
    }
}
public class Test{
    public static void main(String[] args){
        BankAcc b=new BankAcc();
        b.assignInitialValue("SK","","Savings",10000.50);
        b.display();
        b.deposit(5000);
        b.display();
        b.withdraw(1500.75);
        b.display();
        b.withdraw(90000);
        b.display();
    }
}*/