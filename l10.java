import java.util.*;
public class l10 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("No.of elements in arrays:" + " ");
        int n = x.nextInt();
        int[] array= new int[n];

        for(int i=0;i<n;i++){
            System.out.print("At index ["+i + "] ");
            array[i] = x.nextInt();
        }
        System.out.print("Final Array:" + " ");
        for(int i=0;i<n;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int array2[]= {232,2323,232,13,24}; //valid
        System.out.print("Array2:" + " ");
        for(int i=0;i<n;i++){
            System.out.print(array2[i] + " ");
        }

        x.close();
    }
}
