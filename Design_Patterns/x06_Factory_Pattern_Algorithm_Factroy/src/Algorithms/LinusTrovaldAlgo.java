package Algorithms;

public class LinusTrovaldAlgo implements Algorithm {
    @Override
    public String encrypt(String encryptStr) {
        return "EncryptedLinusTrovaldAlgo:"+encryptStr;
    }

    @Override
    public String decrypt(String decryptStr) {
        return decryptStr.substring(26);
    }
}
