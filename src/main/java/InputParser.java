public class InputParser {

    FizzBuzz numberChanger;

    public InputParser() {
        this.numberChanger = new FizzBuzz();
    }

    public String changeInput(Integer a, Integer b, Integer c) {
        String toReturn = "";
        toReturn = toReturn + this.numberChanger.fizzBuzz(a) + " ";
        toReturn = toReturn + this.numberChanger.fizzBuzz(b) + " ";
        toReturn = toReturn + this.numberChanger.fizzBuzz(c) + " ";

        return toReturn;
    }

    public static void main(String[] args) {
        InputParser inputParser = new InputParser();

        System.out.println(inputParser.changeInput(5, 15, 2));
    }

}
