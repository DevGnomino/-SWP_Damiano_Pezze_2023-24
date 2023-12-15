import java.util.Random;

public class DataGenerator {
    //Array mit Daten generieren
    public static int[] generateData(int size){
        int[] Data = new int[size];
        Random rand = new Random();

        for(int i = 0; i < size; i++){
            Data[i] = rand.nextInt();
        }

        return Data;
    }

    //(Überladenes) Array mit Daten generieren zwischen min und max
    public static int[] generateData(int size, int min, int max){
        int[] Data = new int[size];
        Random rand = new Random();

        for(int i = 0; i < size; i++){
            Data[i] = rand.nextInt(max - min + 1) + min;
        }

        return Data;
    }

    public static void printArray(int[] Data){
        for (int number : Data) {
            System.out.print(number + ", ");
        }
    }
}
