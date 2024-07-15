package basic.problems.enums_generics;

import java.util.Arrays;

public class TestEnum {
    public static void main(String[] args) {
        //Days day = Days.MONDAY;
        //System.out.println(day+"\nAction for this day:"+day.getAction());
        System.out.println("Total Days:"+Arrays.toString((Days.values())));
        for (Days tempDay : Days.values()){
            System.out.println(tempDay + ":"+tempDay.getAction());
        }

    }
}
