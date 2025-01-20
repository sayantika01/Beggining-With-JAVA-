/*A8a
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}
public class threadss {
    public static void main(String[] args){
        MyThread t=new MyThread();
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}*/

/*A8d
class MyRunnable implements Runnable{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(100);
            }
            catch(Exception e){}
        }
    }
}
class threadss{
    public static void main(String[] args){
        MyRunnable r=new MyRunnable();
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        Thread t4=new Thread(r);
        Thread t5=new Thread(r);

        t1.setPriority(10);
        t2.setPriority(1);
        t3.setPriority(4);
        t4.setPriority(2);
        t5.setPriority(6);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName());
        }

    }
}*/

/*A8e
class Display{
    synchronized void wishmsg(String name){
        for(int i=0;i<2;i++){
            System.out.print("hello ");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
            System.out.println(name);
        }
    }
}
class MyThread extends Thread{
    Display d;
    String name;
    MyThread(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wishmsg(name);
    }
}
class threadss {
    public static void main(String[] args) {
        Display d=new Display();
        MyThread t1=new MyThread(d,"dhoni");
        MyThread t2=new MyThread(d,"kohli");
        t1.start();
        t2.start();
    }
}*/

/*A8f
class MyThread extends Thread{
    public void run(){
        System.out.println("child alive inside run: "+Thread.currentThread().isAlive());
        for(int i=0;i<5;i++){
            System.out.println("child thread");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}
class threadss {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        try{
            t.join();
        }
        catch(Exception e){}
        System.out.println("child alive inside main: "+t.isAlive());
        for(int i=0;i<5;i++){
            System.out.println("main thread");
        }
    }
}*/