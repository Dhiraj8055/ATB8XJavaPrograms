package Oct.ex_18102024_Strings;

public class Lab161_String_Functions {
    public static void main(String[] args) {
        String name =" THERE Is Some";
        // length of string
        System.out.println("length is :" +name.length());

        //Substring --part of string
        System.out.println("Substring is : "+name.substring(0,6));

        // Trim -- remove spaces
        System.out.println("Trim is :" +name.trim());

        //Uppercase
        System.out.println("Uppercase is :" +name.toUpperCase());

        //Lowercase
        System.out.println("Lowercase is :"+name.toLowerCase());

        System.out.println(name.equals("Hello"));

        //charAT
        System.out.println("Character at : "+name.charAt(2));

        System.out.println(name.equals("Hello"));

        System.out.println(name.indexOf("H"));

        System.out.println(name.contains("T"));
    }

}
