package Algorithms;

public class BillGatesAlgo implements Algorithm{
    @Override
    public String encrypt(String encryptStr) {
        return "EncryptedBillGatesAlgo:"+encryptStr;
    }

    @Override
    public String decrypt(String decryptStr) {
        return decryptStr.substring(23);
    }
}
