package basic.problems.nestedclass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {

        //ArrayOperations op = new ArrayOperations();
        ArrayOperations.Statistics statistics = new Statistics(new int[]{1,2,3,4,5});
        System.out.println(statistics.mean());
    }


    protected static class Statistics {
        int[] array;
        Statistics(int[] array){
            this.array = array;
        }

        public int mean() {
            int sum=0;
            for (int i=0;i<array.length;i++){
                sum+=array[i];
            }
            return sum/array.length;
        }
    }
}
