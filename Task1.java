// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package HomeWorks.Seminar4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class Task1 {
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
        System.out.println(list);        
        Deque<String> dequeList = new ArrayDeque<>(list.size());
        for(String item: list){
            dequeList.addFirst(item);
        }
        System.out.println(dequeList);
    }
}
