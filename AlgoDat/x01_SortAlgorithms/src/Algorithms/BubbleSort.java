package Algorithms;

public class BubbleSort implements Algorithm{
    @Override
    public int[] sort(int[] input) {
        boolean noneSwitched = false;
        while(!noneSwitched) {
            noneSwitched = true;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    noneSwitched = false;
                }
            }
        }
        return input;
    }
}
