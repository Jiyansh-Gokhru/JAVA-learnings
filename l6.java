import java.util.*;
public class l6 {
    public static void main(String[] arg){
        Scanner x = new Scanner(System.in);
        int n= x.nextInt();
// 1.
        for (int i=1;i<=(n);i++){
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat((2*n)-(2*i)));
            System.out.print("*".repeat(i));
            System.out.println();
        }
        for (int i=n;i>0;i--){
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat((2*n)-(2*i)));
            System.out.print("*".repeat(i));
            System.out.println();
        }
// 2.
        for (int i=1;i<=(n);i++){
            int Space= n-i;
            System.out.print(" ".repeat(Space));
            System.out.println("*".repeat(n));
        } 
// 3.
        for (int i=1;i<=(n);i++){
            int Space= n-i;
            System.out.print(" ".repeat(Space));
            System.out.println((i+" ").repeat(i));
        } 
// 4.
        for (int i=1;i<=(n);i++){
            int Space= n-i;
             System.out.print(" ".repeat(Space));
             for (int j=i;j>0;j--){
                System.out.print(j);
             }
             for (int j=2;j<=i;j++){
                System.out.print(j);
             }
             System.out.println("");
        }
// 5.
        for (int i=1;i<=(n);i++){
            int Space= n-i;
             System.out.print(" ".repeat(Space));
             
             for (int j=i;j>0;j--){
                System.out.print("*");
             }
             for (int j=2;j<=i;j++){
                System.out.print("*");
             }
             System.out.println("");
        }
        for (int i=n;i>=(1);i--){
            int Space= n-i;
             System.out.print(" ".repeat(Space));
             
             for (int j=i;j>0;j--){
                System.out.print("*");
             }
             for (int j=2;j<=i;j++){
                System.out.print("*");
             }
             System.out.println("");
        }

        x.close();
    }
}

//Problems by apna collage but solved by jiyansh (myself) ehe