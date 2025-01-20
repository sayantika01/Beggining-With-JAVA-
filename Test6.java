/*A6a
public class Test6 {
    public static void main(String[] args){
        String str=args[0];
        System.out.println("string is: "+str);
        char[] ch=str.toCharArray();
        System.out.println("char array is");
        for(char i:ch){
            System.out.println(i);
        }
    }
}*/

/*A6b
import java.util.Scanner;
class Test6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=sc.next();

        char[] ch=new char[5];
        System.out.println("Enter the char array: ");
        for(int i=0;i<ch.length;i++){
            ch[i]=sc.next().charAt(0);
        }
        String s2=new String(ch);
        String res=s1+s2;
        char[] newch=res.toCharArray();

        System.out.println("the new char array: ");
        for(char i:newch){
            System.out.println(i+" ");
        }
    }
}*/

/*A6c
import java.util.Scanner;
class Test6{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string: ");
            String s=sc.next();
            System.out.println("The length of the string is: "+s.length());
            System.out.println("Length without front and end spaces: "+s.trim().length());
    }
}*/

/*A6d
import java.util.Scanner;
class Test6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();
        char[] ch=s.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        System.out.println("The reversed string is: "+rev);
    }
}*/

/*A6e --- using string buffer
class Test6{
    public static void main(String[] args){
        String s=args[0];
        int n=s.length();
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
    }
}*/

/*A6f
class Test6{
    public static void main(String[] args) {
        String s = args[0];
        //int n = s.length();
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        if(s.equals(sb.toString())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not");
        }
    }
}*/

/*A6g
import java.util.Scanner;
class Test6{
    static String concat(String s1, String s2){
        String res="";
        if(s1.length()!=0 && s2.length()!=0 && s1.charAt(s1.length()-1)==s2.charAt(0)){
            res=s1+s2.substring(1);
        }
        else{
            res=s1+s2;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string: ");
        String s1 = sc.next();
        System.out.println("Enter 2nd string: ");
        String s2 = sc.next();
        System.out.println("The concat string is: "+concat(s1,s2));
    }
}*/

/*A6h
class Test6{
    public static void main(String[] args){
        String first=args[0];
        String mid="";
        String last="";
        String ab="";
        if(args.length==2){
            last=args[1];
            ab=first.charAt(0)+"."+last;
        }
        else if(args.length==3){
            mid=args[1];
            last=args[2];
            ab=first.charAt(0)+"."+mid.charAt(0)+"."+last;
        }
        System.out.println("Abbrevuiated is: "+ab);
    }
}*/

/*A6i
class Test6{
    public static void main(String[] args){
        String roll=args[0];
        if(args.length<3 || args.length>4){
            System.out.println("input format: <roll> <first> [<middle>] <last>");
            return;
        }
        if(roll.length()<4){
            System.out.println("length of roll must be>=4");
            return;
        }
        String first=args[1];
        String middle="";
        String last="";
        String password="";

        if(args.length==3){
            last=args[2];
            password= ""+first.charAt(0)+last.charAt(0)+roll.substring(roll.length()-4);
        }
        else if(args.length==4){
            middle=args[2];
            last=args[3];
            password= ""+first.charAt(0)+ middle.charAt(0)+ last.charAt(0)+ roll.substring(roll.length()-4);
        }
        System.out.println("password is: "+password);
    }
}*/

/*A6j
import java.util.Scanner;
class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string1: ");
        String s1=sc.nextLine();
        System.out.print("enter string2: ");
        String s2=sc.nextLine();

        String s3="";
        for(int i=0;i<Math.min(s1.length(),s2.length());i++){
            s3+=""+s1.charAt(i)+s2.charAt(i);
        }
        if(s1.length()>s2.length()){
            s3+=s1.substring(s2.length());
        }
        else if(s1.length()<s2.length()){
            s3+=s2.substring(s1.length());
        }
        System.out.print("s3= "+s3);
    }
}*/

/*A6k
class Test{
    public static void main(String[] args){
        String str="University of Technology";
        int pos=str.indexOf("Tech");
        if(pos==-1){
            System.out.println("not present");
        }
        else{
            System.out.println("position= "+pos);
        }
    }
}*/

/*A6l
class Test{
    static String half(String s1){
        int len=s1.length();
        if(len%2==0){
            return s1.substring(0,len/2);
        }
        return null;
    }
    public static void main(String[] args){
        String s1=args[0];
        System.out.println(half(s1));
    }
}*/

/*A6m ***************Important
import java.util.Scanner;
class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        char[] ch=s1.toCharArray();
        int len=ch.length;
        for(int i=0;i<len-1;i++){
            int minIdx=i;
            for(int j=i+1;j<len;j++){
                if(ch[j]<ch[minIdx]){
                    minIdx=j;
                }
            }
            if(ch[minIdx]!=ch[i]){
                char t=ch[minIdx];
                ch[minIdx]=ch[i];
                ch[i]=t;
            }
        }
        System.out.println("res= "+new String(ch));
    }
}*/

/*A6n
import java.util.Scanner;
class Test{
    static String deleteMe(String str, int m){
        if(m<0 || m>=str.length()){
            return str;
        }
        String old=""+str.charAt(m);
        return str.replace(old,"");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string: ");
        String str=sc.nextLine();
        System.out.print("enter index: ");
        int m=sc.nextInt();
        System.out.println("new string: "+deleteMe(str,m));
    }
}*/

/*A6o
import java.util.Scanner;
class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String correct="james gosling";
        System.out.println("Name of the inventor of java: ");
        for(int i=1;i<=3;i++){
            System.out.println("Chance "+i);
            String ans=sc.nextLine();
            if(correct.equals(ans.toLowerCase())){
                System.out.println("Good");
                return;
            }
            if(i==3){
                System.out.println("Correct answer is: "+correct);
                return;
            }
            System.out.println("Try Again");
        }
    }
}*/

/*A6o
import java.util.Scanner;
class Test6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine();
        int n=sc.nextInt();
        StringBuffer sb=new StringBuffer();
        String sub=s.substring(s.length()-n);
        for(int i=0;i<n;i++){
            sb.append(sub);
        }
        System.out.println(sb);
    }
}*/