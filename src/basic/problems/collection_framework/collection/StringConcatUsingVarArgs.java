package basic.problems.collection_framework.collection;

public class StringConcatUsingVarArgs {
    public static void main(String[] args) {
        StringConcatUsingVarArgs obj = new StringConcatUsingVarArgs();
        String finalString = obj.concatStrings("Manoj", "Sakat", "Aditya", "Sakat");
        System.out.println(finalString);
    }

    private String concatStrings(String... strings) {
        String finalString = "";
        for (String string : strings) {
            finalString += strings;
        }
        return finalString;
    }
}
