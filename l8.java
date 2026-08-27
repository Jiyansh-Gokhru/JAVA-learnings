import java.util.*;
public class l8 {
    public static void gcd(int n1 , int n2){
        int gcd_0 =0;
        if (n1>=n2){
            for (int i=1;i<=n1;i++){
                if (n1%i==0){
                    if (n2%i==0){
                        if (i>gcd_0){
                            gcd_0=i;
        }}}}
        System.out.println(gcd_0);
        }
        else {
            System.out.println("Please enter greater digit first!");
        }
    }
    public static void fibSeries(int n){
        int a=0;
        System.out.print((a+" "));
        int b=1;
        System.out.print((b+" "));
        for (int i=2;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.print((c+" "));
        }
    }
    public static void main(String[] arg){
        Scanner x = new Scanner(System.in);
        //1. Avg
        // int i = x.nextInt();
        // int f = x.nextInt();
        // int r = x.nextInt();
        // System.out.println((i+f+r)/3);
        
        //2. Sum of Odd
        // int n = x.nextInt();
        // int sum=0;
        // for (int i=1;i<=n;i++){
        //     if (i%2!=0){
        //         sum+=i;
        //     }
        // }
        // System.out.println(sum);

        //3. Greater
        // int n = x.nextInt();
        // int m = x.nextInt();
        // if (n>m){
        //     System.out.println((n+" is greater than "+m));
        // }
        // if (m>n){
        //     System.out.println((m+" is greater than "+n));
        // }
        // 

        //4. Circumference
        // int r = x.nextInt();
        // double circumference = 2 * Math.PI * r;
        // System.out.println(circumference);

        //5. Voting Eligblty
        // int Age = x.nextInt();
        // if (Age>18){
        //     System.out.println("You are eligible");
        // }
        // else{
        //     System.out.println("oyu are not eligible");
        // }

        //6. Infinite loop (By do while)
        // int n = x.nextInt();
        // do {
        //     n =0;
        //     System.out.println("Donr");
        // } while (n==0);

        //7. Count of +ve/-ve/0's
        // System.out.println("how many numbers you will Enter?");
        // int n = x.nextInt();
        // int NoOfPositive=0;
        // int NoOfNegative=0;
        // int NoOfZero=0;
        // for (int i=1;i<=n;i++){
        //     int num = x.nextInt();
        //     if (num<0){
        //         NoOfNegative+=1;
        //     }
        //     else if (num>0){
        //         NoOfPositive+=1;
        //     }
        //     else {
        //         NoOfZero+=1;
        //     }
        // }
        // System.out.println(("No. of +ve :"+ NoOfPositive));
        // System.out.println(("No. of -ve :"+ NoOfNegative));
        // System.out.println(("No. of 0's :"+ NoOfZero));

        //8. Power
        // int y = x.nextInt();
        // int n= x.nextInt();
        // System.out.println(Math.pow(y,n));

        //9. Greatest Common Divisor 
        // int n = x.nextInt();
        // int m = x.nextInt();
        // gcd(n,m);

        //10. Fibonacci series
        // int n = x.nextInt();
        // fibSeries(n);

        x.close();
    }
}
