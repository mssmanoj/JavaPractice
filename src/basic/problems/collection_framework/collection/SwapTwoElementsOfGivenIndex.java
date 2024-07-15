package basic.problems.collection_framework.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapTwoElementsOfGivenIndex {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,5,3,4,2));
        //List<Integer> arraylist = Arrays.asList(1,5,3,4,2);
        System.out.println(arrayList);
        elementSwapper(1,4,(ArrayList<Integer>) arrayList);
        System.out.println(arrayList);
    }

    public static void elementSwapper(int first, int second, ArrayList<Integer> arrayList){
        Collections.swap(arrayList,first,second); //passing to collections swap method
    }
}
