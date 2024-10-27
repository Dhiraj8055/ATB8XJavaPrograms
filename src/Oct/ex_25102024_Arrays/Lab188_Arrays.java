package Oct.ex_25102024_Arrays;

public class Lab188_Arrays {
    public static void main(String[] args) {
        int [] marks = {97,100,57,87,99};
        System.out.println(marks.length);
        //System.out.println(marks[5]);//arrayindexoutofbound exception
        for( int i=0;i<marks.length;i++)
        {
            System.out.print("Marks of Student : " +marks[i]);
        }
        //anather way of declarring array
        System.out.println("-----------------------");
System.out.println("Anather way of Array Delcaration");
        int [] marks_2 = new int[5];
        marks_2[0]=11;
        marks_2[1]=12;
        marks_2[2]=13;
        marks_2[3]=14;
        marks_2[4]=15;
        System.out.println(marks_2[1]);
        System.out.println(marks_2[4]);
       // System.out.println(marks_2[6]);//Arrayindexoutofbound
    }
}
