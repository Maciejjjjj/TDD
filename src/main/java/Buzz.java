public class Buzz {
    public static String buzz(Integer input) {

        if ((input.intValue() % 5 == 0)) {
            return "Buzz";
        } else {
            return input.toString();
        }

    }

}
