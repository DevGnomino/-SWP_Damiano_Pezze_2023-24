public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(12);
        linkedList.add(5);
        linkedList.add(33);
        linkedList.add(98);

        linkedList.print();
        System.out.println("Get: " + linkedList.get(1));
        linkedList.remove(0);
        linkedList.print();
        linkedList.remove(2);
        linkedList.print();
    }
}