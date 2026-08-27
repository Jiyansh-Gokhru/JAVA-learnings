
public class l12 {
    public static void main(String args[]) {
        //concatenation 
        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName + "@" + lastName;
        System.out.println(fullName.length());

        //charAt
        for(int i=0; i<fullName.length();i++) {
            System.out.println(fullName.charAt(i));
        }
        //compare
        String name1 = "Tony";
        String name2 = "Tony";
        //name1 name2: 0 (<:+ve,=:0,>:-ve)
        
        if (name1.compareTo(name2)==0) {
            System.out.println("SAMEEEE!");
        }
        else{
            System.out.println("Not same!");
        }

        String sentence="My name is tony!";
        String name = sentence.substring(11, sentence.length());

        System.out.println(name);
        //strings are immutable
    }

}