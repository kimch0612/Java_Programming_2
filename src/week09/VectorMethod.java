package week09;

import java.util.List;
import java.util.Vector;

public class VectorMethod {
    public static void main(String[] args) {
        List<Integer> vector1 = new Vector<Integer>();
        //#1. add(E element)
        vector1.add(3);
        vector1.add(4);
        vector1.add(5);
        System.out.println(vector1.toString()); //=~.println(aList1) [3, 4, 5]
            
        //#2. add(int index, E element)
        vector1.add(1, 6);
        System.out.println(vector1.toString()); //[3, 6, 4, 5]
                
        //#3. addAll(또 다른 리스트 객체)
        List<Integer> vector2 = new Vector<>();
        vector2.add(1);
        vector2.add(2);
        vector2.addAll(vector1);
        System.out.println(vector2); //[1, 2, 3, 6, 4, 5]
   
    }
}
