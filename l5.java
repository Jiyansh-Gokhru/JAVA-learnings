import java.util.*;
public class l5 {
    public static void main(String[] arg){
        Scanner x = new Scanner(System.in);
        int n= x.nextInt();
        // for (int i=n;i>=1;i--){
        //     System.out.println("*".repeat(i));
        // }

        // for (int i=1;i<=n;i++){
        //     for (int j=1;j<=1;j++){
        //         System.out.print(" ".repeat(n-i));
        //         System.out.print("*".repeat(i));
        //     }
        //     System.out.println();
        // }
        int first=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(first);
                if (first==0){
                    first=1;
                } else {
                    first=0;
                }
            }
            if (i%2==0){
                first=1;
            } 
            if (i%2!=0){
                first=0;
            }
            System.out.println();
        }
       
        x.close();
    }
}
