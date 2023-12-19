public class MyLinkedList<E> implements MyList<E> {
    MyNode<E> headNode;
    MyNode<E> tailNode;

    public MyLinkedList() {
        this.headNode = null;
    }

    public E get(int index){
        MyNode<E> currentNode = headNode;
        int counter = 0;

        //Alle Nodes durchgehen, bis der richtige Index erreicht ist
        while (counter != index) {
            currentNode = currentNode.getNext();
            counter++;
        }

        return currentNode.getValue();
    }
    
    public void add(E value){
        //Neuer Knoten wird mit neuem Wert erstellt
        MyNode<E> newNode = new MyNode<E>(value);

        // Wenn die Liste leer ist, wird der neue Knoten zum Kopf der Liste
        if (headNode == null) {
            headNode = newNode;
            return;
        }else {
            MyNode<E> tempNode = headNode;

            // Letztes Element der Liste Finden finden
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
                //tempNode zeigt nun auf letzte Node
            }

            // Neuer Knoten wird an den letzten Knoten angeknüpft
            tempNode.setNext(newNode);
            newNode.setPrev(tempNode);
            this.tailNode = newNode;
        }
    }

    public void remove(int index){
        MyNode<E> currentNode = headNode;
        int counter = 0;

        while (counter != index) {
            currentNode = currentNode.getNext();
            counter++;
        }

        //Pointer versetzen, die currentNode wird dann automatisch vom Garbage Collector gelöscht
        try {
            MyNode<E> prevNode = currentNode.getPrev();
            MyNode<E> nextNode = currentNode.getNext();

            if (prevNode == null) {
                this.headNode = nextNode;
                nextNode.setPrev(null);
            } else if (nextNode == null) {
                prevNode.setNext(null);
                this.tailNode = prevNode;
            } else {
                prevNode.setNext(nextNode);
                nextNode.setPrev(prevNode);
            }
        }catch (Exception e){
            System.out.println("Error:" + e);
        }
    }

    public void print() {
        MyNode<E> currentNode = headNode;

        System.out.print("My Linked List: ");
        //Alle Nodes von Anfang bis Ende durchgehen und ausgeben
        while (currentNode != null) {
            System.out.print(currentNode.getValue() + " ");
            currentNode = currentNode.getNext();
        }

        System.out.println();
    }
}
