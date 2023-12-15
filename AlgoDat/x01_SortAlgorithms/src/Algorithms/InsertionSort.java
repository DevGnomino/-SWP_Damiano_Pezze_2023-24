package Algorithms;

public class InsertionSort implements Algorithm {
    @Override
    public int[] sort(int[] input) {
        for (int i = 1; i < input.length; ++i) {
            int temp = i - 1;

            /* Verschieben der Elemente des sortierten Teils des Arrays
            die größer sind als der aktuelle Schlüssel, um Platz für den Schlüssel zu machen. */
            while (temp >= 0 && input[temp] > input[i]) {
                input[temp + 1] = input[temp];
                temp -= 1;
            }
            input[temp + 1] = input[i];
        }
        return input;
    }
}
