public class FizzBuzz {

    public static String fizzBuzz(Integer input) {

        if ((input % 3 == 0) && (input % 5 == 0)) {
            return "FizzBuzz";
        }
        if ((input % 3 == 0)) {
            return "Fizz";
        }

        if ((input % 5 == 0)) {
            return "Buzz";
        } else {
            return input.toString();
        }
    }
}
