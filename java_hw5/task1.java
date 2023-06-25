// Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
// Пример: Россия идет вперед всей планеты. Планета — это не Россия.
// Запрос: Россия
// Ответ: Россия - 2

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        String str = "Россия идет вперед всей планеты. Планета — это не Россия";
        String[] masStr = str.toLowerCase().split(" ");
        
        System.out.print("Enter a search word: ");
        String inWord = scanner.next();
        inWord = inWord.toLowerCase();
        map.put(inWord, 0);
        for (String inNewStr : masStr) {
            if (map.containsKey(inNewStr)) {
                map.put(inWord, (map.get(inWord) + 1));
            }
        }
        for (var entry : map.entrySet()) {
            System.out.println("The word - " + entry.getKey() + " ,  - meets " + entry.getValue());
        }
    }
}
