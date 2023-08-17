//Задача №3.1 Java-программа, которая инвертирует односвязный список
public class Node<T> {
    public T value;
    public Node next;

    public Node(T value) {
        this.value = value;
    }

    public void displayNode(){
        System.out.print("{" + value + "} ");
    }

}
