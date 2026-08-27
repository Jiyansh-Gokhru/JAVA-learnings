import java.util.Scanner;

public class l2 {
    public static void main(String[] args){
        //variable and datatypes
        String name="Jagdish"; 
        int a=20;
        int b=40;
        // double c=2325.54;
        // boolean e=true;
        // float d=382.23f;
        // char f='a'; // single character 
        b=58;
        name="Mustard";
        float sum= a+b;
        //output with variables
        System.out.println(name+": "+(sum));

        //input
        Scanner x = new Scanner(System.in);
        name = x.nextLine(); //.next take single token , .nextline takes whole line
        //nextline(), nextfloat(), nextint(), etc   
        System.out.println("Output: "+name);

        //Practice sum of a and b:
        a = x.nextInt();
        b = x.nextInt();

        System.out.println("Sum: "+(a + b));
        x.close();
    }
}
