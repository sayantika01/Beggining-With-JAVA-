//Write a List which take elements from user input and find the sum of the elements.

import java.util.*;
public class jcf1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<>();
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<6;i++){
            a.add(sc.nextInt());
        }
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        System.out.println("The sum is: "+sum);
    }
}
