package factorial;

public class Main {

    public static void main(
        String[] args
    ) {

        Factorial obj =
            new Factorial();

        MyFunction function =
            obj::factorial;

        int result =
            function.calculate(5);

        System.out.println(
            "URK23CS1114"
        );

        System.out.println(
            "Factorial = " + result
        );
    }
}
