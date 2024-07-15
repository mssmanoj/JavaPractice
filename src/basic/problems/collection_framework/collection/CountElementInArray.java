package basic.problems.collection_framework.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//using collections
public class CountElementInArray {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(4,1,6,3,1,9,2, 11,1);
        System.out.println(arrayList);
        int count = Collections.frequency(arrayList,1);//used to count frequency of object
        System.out.println("Count for number 1 is:"+count);
    }
}
