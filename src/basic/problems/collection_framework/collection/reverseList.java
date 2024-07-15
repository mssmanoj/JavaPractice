package basic.problems.collection_framework.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//collections methods mutates the original objects
public class reverseList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        reverseList(list);
        //after reversing
        System.out.println(list);

    }

    public static void reverseList(ArrayList<Integer> arrayList){
        Collections.reverse(arrayList);
    }
}
