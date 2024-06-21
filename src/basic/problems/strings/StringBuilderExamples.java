package basic.problems.strings;

/**
 * String vs StringBuilder vs StringBuffer
 * StringBuilder is more convenient way to use string concatenation
 * String is immutable so its not used in threaded environment
 * StringBuilder is manipulative so its not thread safe
 * StringBuffer is thread safe as it
 */
public class StringBuilderExamples {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hi");
        sb.append(" Manoj");
        sb.append(" How Are You..");
        System.out.println(sb);
    }
}
