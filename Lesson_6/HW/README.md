
# Задание

Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.

Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.

Создайте метод

public boolean equals(Object o)

Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.

Создайте метод
public int hashCode()

который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))

Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

[Решение](../Example_001/Task_1.java)