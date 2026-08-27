import java.util.*;
public class l11 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("No.of Rows in arrays:" + " ");
        int n = x.nextInt();
        System.out.print("No.of Colunms in arrays:" + " ");
        int m = x.nextInt();
        int[][] array= new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                System.out.print("At index ["+i + "]["+j+"] :");
                array[i][j] = x.nextInt();
            }
        }
        System.out.println("Final Array:");
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int array2[][]= {{1,2,34,421,134},{1313,423,313,324,9}}; //valid
        System.out.println("Array2:" + " ");
        for(int i=0;i<array2.length;i++){
            for(int j=0;j<array2[i].length;j++){

                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        x.close();
    }
}
