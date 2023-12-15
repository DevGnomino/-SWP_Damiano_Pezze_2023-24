import Algorithms.Algorithm;

public class Sorter {
    Algorithm currentAlgo;

    public int[] doSort(int[] array){
        return currentAlgo.sort(array);
    }

    public void setAlgorithm(Algorithm Algo){
        this.currentAlgo = Algo;
    }
}
