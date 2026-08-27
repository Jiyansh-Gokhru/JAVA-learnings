import java.util.*; 
public class l3 {
    public static void main(String[] args){
        //conditional statements
        Scanner x = new Scanner(System.in);

        int a = x.nextInt();
        int b = x.nextInt();

        if (a>b){
            System.out.println("Your first input is greater than second");
        }
        else {
            System.out.println("Your second input is greater than first");
            
        } 
        // Switch case:
        switch (a){
            case 1: System.out.println("manaste!");
            break;
            case 2: System.out.println("Hello!");
            break;
            case 3: System.out.println("Hola!");
            break;
            default : System.out.println("Invalid Output!");
        }
        x.close();
    }
}
