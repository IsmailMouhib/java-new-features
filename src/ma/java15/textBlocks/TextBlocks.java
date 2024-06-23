package ma.java15.textBlocks;

// Preview 13 & 14
public class TextBlocks {
    public static void main(String[] args) {
        // Avant
        System.out.println("\"First line\"\nSecond line");
        // Aprés
        System.out.println("""
                First line
                Second line
                """);
        System.out.println("""
                line 1
                line 2
                    line 3
                  line 4
                """);
        System.out.println("""
                line 1 : %s
                line 2 %d
                    line 3
                  line 4
                """.formatted("ccc", 0));
    }
}
