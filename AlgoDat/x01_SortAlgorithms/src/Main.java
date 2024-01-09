import Algorithms.Algorithm;
import Algorithms.BubbleSort;
import Algorithms.InsertionSort;
import Algorithms.SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = DataGenerator.generateData(5);
        DataGenerator.printArray(arr);

        Sorter sorter = new Sorter();
        int[] sortedArr;

        sorter.setAlgorithm(new SelectionSort());
        sortedArr = sorter.doSort(arr);
        System.out.println("\nSelection Sort: ");
        DataGenerator.printArray(sortedArr);

        sorter.setAlgorithm(new BubbleSort());
        sortedArr = sorter.doSort(arr);
        System.out.println("\nBubble Sort: ");
        DataGenerator.printArray(sortedArr);

        sorter.setAlgorithm(new InsertionSort());
        sortedArr = sorter.doSort(arr);
        System.out.println("\nInsertion Sort: ");
        DataGenerator.printArray(sortedArr);
    }
}