/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. 
*/


package HomeWorks.Seminar4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Земля");
        list.add("Марс");
        list.add("Венера");
        list.add("Меркурий");
        list.add("Нептун");
        list.add("Солнышко");
        list.add("Юпитер");
        list.add("Плутон");
        list.add("Сатурн");
        list.add("Уран");
        list.add("Луна");
        list.add("Европа");
        Queue<String> quePlanet = list;
        System.out.println(quePlanet);
        enqueue(quePlanet);
        System.out.println(quePlanet);
        System.out.println(dequeue(quePlanet));;
        System.out.println(quePlanet);
        System.out.println(first(quePlanet));
        System.out.println(quePlanet);
    }

    static void enqueue(Queue<String> list){ // В этом методе не понимаю почему не воспринимает русскую раскладку - возвращает "????". 
        Scanner scan = new Scanner(System.in); // Если вне метода производить add(), то все отлично
        System.out.println("Введите элемент для добавления: ");
        String itemString = scan.nextLine();
        list.add(itemString);
        scan.close();
    }

    static String dequeue(Queue<String> list){
        String item = list.poll();
        return item;
    }

    static String first(Queue<String> list){
        String item = list.element();
        return item;
    }
}
