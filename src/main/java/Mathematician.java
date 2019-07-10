public class Mathematician {

    private Calculator calculator = new Calculator();

    public Mathematician(Calculator calculator) {
        this.calculator = calculator;
    }

    public int calculateVeryComplicatedCalculation() {
        int integral = calculator.calculateIntegral();
        int integral2 = calculator.calculateIntegral();

        return calculator.add(integral, integral2);
    }
}
