package Algorithms;

public class SteveJobsAlgo implements Algorithm {
    @Override
    public String encrypt(String encryptStr) {
        return "EncryptedSteveJobsAlgo:"+encryptStr;
    }

    @Override
    public String decrypt(String decryptStr) {
        return decryptStr.substring(24);
    }
}
