package Oct.ex_18102024_Strings;

public class Lab163_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        String name="Pramod";
        name="Dutta";

        System.out.println(name);

        //Final class StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
    }
}
