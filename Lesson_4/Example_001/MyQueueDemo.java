package Lesson_4.Example_001;

import java.util.logging.Logger;

public class MyQueueDemo {

    private static Logger log = Logger.getLogger(MyQueueDemo.class.getName());

    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        log.info("=====================================");

        mq.enqueue("Добавили первый элемент");
        log.info("=====================================");

        mq.enqueue("Добавили второй элемент");
        log.info("=====================================");

        mq.enqueue("Добавили третий элемент");
        log.info("=====================================");

        System.out.println("Первый элемент в списке: " + mq.first());
        log.info("=====================================");
        
        mq.dequeue();
        log.info("=====================================");
    }
}
