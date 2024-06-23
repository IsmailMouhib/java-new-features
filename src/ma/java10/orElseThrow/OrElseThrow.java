package ma.java10.orElseThrow;

import java.util.Optional;

public class OrElseThrow {
// The orElseThrow() method of java.util.Optional class in Java is used to get
// the value of this Optional instance if present. If there is no value present
// in this Optional instance,
// then this method throws the exception generated from the specified supplier.
    public static void main(String[] args) {
        // create an Optional
        Optional<Integer> op = Optional.of(9455);

        // print supplier
        System.out.println("Optional: " + op);

        // orElseThrow supplier
        System.out.println(
                "Value by orElseThrow("
                        + "ArithmeticException::new) method: "
                        + op.orElseThrow(ArithmeticException::new));

        // create a Optional
        Optional<Integer> op1 = Optional.empty();

        // print supplier
        System.out.println("Optional: " + op1);

        try {

            // orElseThrow supplier
            System.out.println(
                    "Value by orElseThrow("
                            + "ArithmeticException::new) method: "
                            + op.orElseThrow(ArithmeticException::new));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
