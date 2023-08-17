import java.util.Scanner;

//Задача №1 SQL-запрос, который вернет фамилию сотрудника со вторым максимальным опытом работы
//
//SELECT surname * FROM employees
//ORDER BY experience DESC
//OFFSET 1 ROWS
//FETCH NEXT 1 ROWS ONLY

public class Main {


    public static void main(String[] args) {

        //Задача №3.1 Java-программа, которая инвертирует односвязный список
        NodeList myNodeList = new NodeList();
        myNodeList.insertNode(1);
        myNodeList.insertNode(3);
        myNodeList.insertNode(5);
        myNodeList.insertNode(7);

        myNodeList.displayNodeList();
        myNodeList.reverseNodeList();
        myNodeList.displayNodeList();

        //Задача №2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        Reference<Integer> a = new Reference<>(sc.nextInt());
        System.out.println("Enter b: ");
        Reference<Integer> b = new Reference<>(sc.nextInt());
        swap(a, b);
        System.out.println("a = "+a.get());
        System.out.println("b = "+b.get());

    }

    //Задача №2 Метод, меняющий местами значения переменных a и b, не используя 3й переменной
    public static void swap (Reference<Integer>  a, Reference<Integer>  b){
        a.set(a.get()+b.get());
        b.set(a.get()-b.get());
        a.set(a.get()-b.get());
    }
}

//Задача №2 
class Reference<T> {
    private T referent;

    public Reference(T initialValue) {referent = initialValue;}
    public void set(T newVal) {referent = newVal;}
    public T get() {return referent;}
}


