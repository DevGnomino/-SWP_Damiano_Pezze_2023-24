package Algorithms;

public class SelectionSort implements Algorithm{
    @Override
    public int[] sort(int[] input) {
        for (int i = 0; i < input.length; i++){
            for (int j = i; j < input.length; j++){
                if(input[i] > input[j]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }
}
