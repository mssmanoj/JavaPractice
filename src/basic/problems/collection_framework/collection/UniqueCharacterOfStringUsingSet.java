package basic.problems.collection_framework.collection;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacterOfStringUsingSet {
    public static void main(String[] args) {
        String string = new String("ABBCDEEAF");
        Set<Character> set = new HashSet<>();
        set = unique(string);
        System.out.println(set + "\nSize: "+ set.size());
    }

    public static Set<Character> unique(String string){
        Set<Character> set = new HashSet<>();
        for (char str : string.toCharArray()){
            set.add(str);
        }
        return set;
    }
}
