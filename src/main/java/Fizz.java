public class Fizz {

    public static String fizz(Integer input) {

        if ((input.intValue() % 3 == 0)) {
            return "Fizz";
        } else {
            return input.toString();
        }

    }
}
