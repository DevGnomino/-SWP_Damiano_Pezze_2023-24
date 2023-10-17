package Components;

public class PhoneFile {
    private String extension;
    private int size;
    private String name;
    private static int fileCount = 0;

    public PhoneFile(String extension, int size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = Integer.toString(fileCount);
        fileCount += 1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo(){
        System.out.println("Name:\t"+this.name+"\nExtension:\t"+this.extension+"\nSize:\t"+this.size);
    }
}
