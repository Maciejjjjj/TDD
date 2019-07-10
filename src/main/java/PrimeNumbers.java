import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public List<Integer> getPrimeNumbersInRange(int range) {

        List<Integer> primeList = new ArrayList<Integer>();
        checkAllNumbersGreaterOrEqualTwoArePrime(range, primeList);
        return primeList;

    }

    private void checkAllNumbersGreaterOrEqualTwoArePrime(int range, List<Integer> primeList) {
        for (int i = 2; i <= range; i++) {
            int max_divider = (int) Math.sqrt(i);
            checkIsPrimeAndAddToList(primeList, i, max_divider);
        }
    }

    private void checkIsPrimeAndAddToList(List<Integer> primeList, int i, int max_divider) {
        boolean isPrime = false;
        isPrime = checkIfHasDividers(i, max_divider, isPrime);
        if (!isPrime) {
            primeList.add(i);
        }
    }

    private boolean checkIfHasDividers(int i, int max_divider, boolean isPrime) {
        for (int j = 2; j <= max_divider; j++) {
            isPrime = checkIfPrime(i, isPrime, j);
            if (isPrime) {
                break;
            }
        }
        return isPrime;
    }

    private boolean checkIfPrime(int i, boolean isPrime, int j) {
        if (i % j == 0) {
            isPrime = true;
        }
        return isPrime;
    }

}
