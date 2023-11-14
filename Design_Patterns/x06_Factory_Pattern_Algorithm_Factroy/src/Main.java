import Algorithms.Algorithm;

public class Main {
    public static void main(String[] args) {
        Algorithm algo = Factory.getAlgo();

        System.out.println(algo.encrypt("HEELLOOOO"));
        System.out.println(algo.decrypt("EncryptedLinusTrovaldAlgo:HEELLOOOO"));
    }
}