package Lesson_4.Example_001;

import java.util.LinkedList;
import java.util.logging.Logger;

public class MyQueue {

    private static Logger log = Logger.getLogger(MyQueue.class.getName());

    private LinkedList elements = new LinkedList();

    public MyQueue() {
        log.info("Вызван конструктор по-умолчанию для класса MyQueue");
    }

    public MyQueue(LinkedList linkedList) {
        this.elements = linkedList;
    }

    public void enqueue(Object element) {
        log.info("Содержимое списка до выполнения метода enqueue(): " + elements.toString());

        this.elements.add(element);

        log.info("Элемент " + element + " добавлен в конец списка. ");
        log.info("Содержимое списка после выполнения метода enqueue(): " + elements.toString());
    }

    public Object dequeue() {
        log.info("Содержимое списка до выполнения метода dequeue(): " + elements.toString());

        Object removedElement = this.elements.removeFirst();

        log.info("Содержимое списка после выполнения метода dequeue(): " + elements.toString());

        return removedElement;
    }

    public Object first() {
        log.info("Вызван метод получения первого элемента списка first()");
        return this.elements.getFirst();
    }
}
