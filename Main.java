import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         /*A1b----
        System.out.println("Enter the value in rupees: ");
        float n=sc.nextFloat();
        System.out.println("The value in paisa is: "+(int)(n*100));*/

        /*A1c----
        System.out.println("Enter the temp in farhenheit: ");
        Scanner sc=new Scanner(System.in);
        float f= sc.nextFloat();
        System.out.println("The temmp in Celsius is: "+(f-32)/1.8);*/

       /*A1d----
        System.out.println("Enter the limit of the series: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double t=1.0/(i*i);
            if (i % 2 == 0) {
                t = -t;
            }
            sum = sum + t;
        }
        System.out.println("The total sum of the series is: " + sum);*/

        /*A1e----
        System.out.println("Enter the integer: ");
        int n=sc.nextInt();
        int sum=0;
        int Onum=n;
        if(n<0){
            n=-n;
        }
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        System.out.println("Sum of the digits of the integer is : "+sum);*/

        /*A1g----
        System.out.println("Enter the integer value: ");
        int n=sc.nextInt();
        int reverse=0;
        int Onum=n;
        if(n<0){
            n=-n;
        }
        while(n>0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        System.out.println("The reverse of the number is : "+reverse);*/

        /*A1h
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int Onum=n;
        int reverse=0;
        if(n<0){
            n=-n;
        }
        while(n>0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        if(Onum==reverse){
            System.out.printf("The numbner is palindrome");
        }
        else{
            System.out.printf("The number is not palindrome");
        }*/

        /*A1k
        System.out.println("Enter the 1st number : ");
        int n=sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int m=sc.nextInt();

        System.out.println("The numbers before swapping is:"+n+" "+m);
        n=n^m;
        m=n^m;
        n=n^m;
        System.out.println("The numbers after swapping is: "+n+" "+m);*/

         /*A1m
        System.out.println("Enter the 1st number : ");
        int n=sc.nextInt();
        int mul=n<<1;
        float div=n>>2;
        System.out.println("The number when multiplied by 2 and divided by 4 gives: "+mul+" "+div);*/

         /*A1o
        System.out.println("Enter the 1st number : ");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("The factorial is not defines..");
        }
        long[] dp=new long[n+1];
        dp[0]=1; // 0!=1;
        for(int i=1;i<=n;i++){
            dp[i]=i*dp[i-1];
        }
        System.out.println("The factorial of the number is: "+dp[n]);*/

        /*A1p
        System.out.println("Enter the limit of the series: ");
        int n=sc.nextInt();
        System.out.println("Enter the value: ");
        int x=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.pow(x,i);
        }
        System.out.println("The sum of the series="+sum);*/

    }
}