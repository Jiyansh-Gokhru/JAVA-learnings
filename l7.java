import java.util.*;
public class l7 {
    // public static int function(int x){
    //     x = x / 10;
    //     return x;
    // }

    // public static void main(String[] arg){  
    //     Scanner x =new Scanner(System.in);
    //     int a = x.nextInt();
    //     int out = function(a);
    //     System.out.println(out);
    //     x.close();
    // }

    public static int factorial(int n){
        if ((n==1) || (n==0)){
            return 1;
        }
        else if (n>1){
            return n * factorial(n-1);
            
        }
        else{
            System.out.println("Invalid Number!");
            return 0;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        int fact=factorial(no);
        System.out.println(fact);
        sc.close();
    }
}
