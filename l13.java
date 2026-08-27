// import java.util.*;

public class l13 {
    public static void main(String args[]){
        //Strig builder
        StringBuilder sb= new StringBuilder("Tiny");
        sb.append(" star");
        System.out.println(sb);
        //CharAt,append,length works same
        //new : SetCharCt(Index,"Char")
        //      Insert(Index,"Char")
        //      Delete.(stIndex,endIndex+1)
        
        //reverse
        StringBuilder sb1= new StringBuilder("");
        for(int i=sb.length()-1;i>=0;i--){
            sb1.append(sb.charAt(i));
        }
        sb=sb1;
        System.out.println(sb);

    }   
}
