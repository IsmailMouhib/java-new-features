package ma.java21.patternMatchingSwitch;

// https://belief-driven-design.com/looking-at-java-21-switch-pattern-matching-14648/
public class PatternMatchingSwitch {


    public static void main(String[] args) {

        Integer i= 6;
        Integer v = switch (i) {
            case null -> 1;
            case 23, 42 -> 2;
            case 0 -> 3;
            default -> {
                if (i > 0) {
                    System.out.println('h');
                    yield 0;
                }
                yield 1;
            }
        };
    }

    // With Java 21, switch finally allows case null to be included:
    static String asStringValue(String anyValue) {
        return switch (anyValue) {
            case null       -> "n/a";
            case String str -> str;
        };
    }
}
