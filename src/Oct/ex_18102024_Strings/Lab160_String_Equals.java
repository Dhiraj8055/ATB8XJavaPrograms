package Oct.ex_18102024_Strings;

public class Lab160_String_Equals {
    public static void main(String[] args) {
        String s1 = "Hello";//SCP
        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s4="hello";
        //
        System.out.println("to check the ref locations:");
        System.out.println(s1==s2); //false
        System.out.println(s2==s3);//false
        System.out.println(s1==s4);//true
        //object area
        // == This is checking the ref locations

        //equal checks the values

        System.out.println("To check the value through Equals:");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equalsIgnoreCase(s4));


    }
}
