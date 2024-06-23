package ma.java10.inferenceType;

import java.util.List;

public class InferenceType {

    public static void main(String[] args) {
        List<String> names1 = List.of("Ismail", "Jack");
        List<String> names2 = List.of("Imad", "Nabil");
        List<List<String>> names = List.of(names1, names2);
        var namesInferenceType = List.of(names1, names2);

        namesInferenceType.forEach(System.out::println);

        // java compiler infers typeof the variable at compile time
        // we can add final
        // we can use it in loop
        // you cannot assign null
        // var is not keyword
        // since 11 : var in lambda
    }
}
