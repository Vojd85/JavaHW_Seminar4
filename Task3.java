/*
1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка. 
2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди. 
*/

package HomeWorks.Seminar4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        Object[] array = {45, "hsdf", 333, 'h', 724, "shjdfhdfdf", 2.2, '=', null, false};
        printStack(array);
        printQueue(array);
    }

    static void printStack(Object[] arr){
        Stack<Object> stack = new Stack<>();
        Object[] temp = new Object[arr.length];
        for (Object item: arr){
            stack.push(item);
        }
        for (int i = 0; i < arr.length; i++) {
            temp[i] = stack.pop();
        }
        System.out.println(Arrays.toString(temp));
    }

    static void printQueue(Object[] arr){
        Queue<Object> queue = new LinkedList<>();
        for (Object item: arr){
            queue.add(item);
        }
        System.out.println(queue);
    }
}
