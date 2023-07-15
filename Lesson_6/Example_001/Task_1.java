package Lesson_6.Example_001;

import java.util.HashSet;
import java.util.Set;

public class Task_1 {
    public static void main(String[] args) {
        Cat margo = new Cat(111, "Margo", 5, 4.56, 25.0);
        Cat safa = new Cat(112, "Ksafen", 2, 6.1, 30.0);
        Cat tifa = new Cat(113, "Tifa", 3, 3.2, 22.0);
        Cat sneja = new Cat(114, "Sneja", 3, 3.1, 22.0);
        Cat margo1 = new Cat(111, "Margo", 5, 4.56, 25.0);

        Set<Cat> cats = new HashSet<>();
        cats.add(margo);
        cats.add(safa);
        cats.add(tifa);
        cats.add(sneja);
        cats.add(margo1);

        System.out.println(cats.size());
    }
}
