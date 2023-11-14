import Algorithms.Algorithm;
import Algorithms.BillGatesAlgo;
import Algorithms.LinusTrovaldAlgo;
import Algorithms.SteveJobsAlgo;


import java.util.Random;

public class Factory {

    public static Algorithm getAlgo(){
        Random random = new Random();
        int switcher = random.nextInt(3);

        switch (switcher){
            case 0:
                return new BillGatesAlgo();
            case 1:
                return new LinusTrovaldAlgo();
            case 2:
                return new SteveJobsAlgo();
            default:
                return new BillGatesAlgo();
        }
    }
}
