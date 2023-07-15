package Lesson_6.Example_001;

import java.util.Objects;

public class Cat {
    private Integer id;
    private String name;
    private Integer age;
    private Double weight;
    private Double height;

    private static int count = 0;

    public Cat(Integer id, String name, Integer age, Double weight, Double height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

        count += 1;
    }

    public Integer getID() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public static Integer getCount() {
        return count;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Cat cat = (Cat) object;

        return Objects.equals(id, cat.id)
            && Objects.equals(name, cat.name)
            && Objects.equals(age, cat.age)
            && Objects.equals(weight, cat.weight)
            && Objects.equals(height, cat.height);
    }

    public int hashCode() {
        return Objects.hash(id, name, age, weight, height);
    }

}
