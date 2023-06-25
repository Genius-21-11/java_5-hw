// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

import java.util.*;
public class task2{ 
    public static void main(String[] args) { 
    List<String> employees = Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Иван Мечников", "Петр Петин", "Иван Ежов");
    Map<String, Integer> nameCount = new TreeMap<>(Collections.reverseOrder());

    for (String employee : employees) {
        String name = employee.split(" ")[0];
        nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
    }

    for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
        if (entry.getValue() > 1) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " повторений");
        }
    }
}
}