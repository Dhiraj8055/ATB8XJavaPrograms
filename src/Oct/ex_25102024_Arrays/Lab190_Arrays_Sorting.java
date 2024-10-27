package Oct.ex_25102024_Arrays;

import java.util.Arrays;

public class Lab190_Arrays_Sorting {
    public static void main(String[] args) {
        int [] marks1 = {79,71,34,45,85};
        for (int i=0;i<marks1.length;i++)
        {
            System.out.println(marks1[i]);
        }
         System.out.println("Array Sorting");
        Arrays.sort(marks1);
        for (int i=0;i<marks1.length;i++)
        {
            System.out.println(marks1[i]);
        }
        //Binnary Search
       Arrays.sort(marks1);
        int item = Arrays.binarySearch(marks1,34);
        System.out.println(item);
    }
}
