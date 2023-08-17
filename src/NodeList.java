//Задача №3.1 Java-программа, которая инвертирует односвязный список
public class NodeList {
    private Node first;

    public NodeList() {
        first = null;
    }

    //вставка элемента в начало списка
    public <T> void insertNode(T value){
        Node newNode = new Node(value);
        newNode.next = first;
        first = newNode;
    }

    //метод выводит список на экран
    public void displayNodeList(){
        System.out.println("NodeList: ");
        Node current = first;
        while (current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    //метод инвертирует односвязный список
    public void reverseNodeList() {
        Node previous = null;
        Node current = first;

        while (current != null) {
            Node tmp = current.next;
            current.next = previous;
            previous = current;
            first = current;
            current = tmp;
        }
    }
}
