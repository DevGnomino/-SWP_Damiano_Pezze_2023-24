package Components;

import java.util.List;

public class SDcard {
    private int capacity;
    private List<PhoneFile> phoneFiles;

    public SDcard(int capacity) {
        this.capacity = capacity;
    }

    public void saveFile(){

    }

    public List<PhoneFile> getAllFiles(){
        return this.phoneFiles;
    }

    public int getFreeSpace(){
        return 1;
    }
}
