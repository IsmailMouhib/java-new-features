package ma.java11.stringUtility;

public class StringUtility {
    static class Test {
        String str2 = null;
    }

    public static void main(String[] args) {
        // since 11
        System.out.println(" ".isBlank());
        System.out.println(" Ismail ".strip());
        System.out.println(" Ismail ".stripLeading());
        System.out.println(" Ismail ".stripTrailing());
        "line1\nline2\nline3".lines().forEach(System.out::println);
        // since 12
        System.out.println("ismail".<String>transform(s -> s.substring(2)));
        // since 15
        System.out.println("ismail %s %d age".formatted("mouhib", 34));
        // since 14
        //String str = null;
        //System.out.println(str.isBlank()); //java.lang.NullPointerException: Cannot invoke "String.isBlank()" because "str" is null
        Test test = new Test();
        System.out.println(test.str2.isBlank()); // java.lang.NullPointerException: Cannot invoke "String.isBlank()" because "test.str2" is null
        // "test.str2" plus de précision à proposd ou vient nullPointer
    }
}
