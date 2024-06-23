package ma.java10.copyOf;

import java.util.ArrayList;
import java.util.List;

public class CopyOf {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ismail");
        names.add("Marouane");
        names.add("Imad");

        System.out.println(names);



        List<String> copyOfopyNames = List.copyOf(names);

        // java.lang.UnsupportedOperationException (ImmutableCollections)
        //addNameTolist(copyOfopyNames);

        System.out.println(copyOfopyNames);
    }

    private static void addNameTolist(List<String> copyOfopyNames) {
        copyOfopyNames.add("Samid");
    }
}
