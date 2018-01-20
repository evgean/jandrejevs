package ru.job4j.array;

/**
 *@author Jevgenijs A.
 *@version $Id$
 *@since 0.1
 */

public class WordInWord {

    public boolean contains(String origin, String sub) {
        int charArrayLength = origin.length() + sub.length();
        int originLength = origin.length();
        char [] charArray = new char [charArrayLength];
        // то, что возращает метод
        boolean answer = false;
        //записывает в массивы символы из двух строк
        for (int index = 0; index != charArrayLength; index++) {
            if (index < originLength) {
                charArray[index] = origin.charAt(index);
            } else {
                charArray[index] = sub.charAt(index - originLength);
            }
        }
        //проверяем есть ли первая буква искомого слова в сраке
        for (int i = 0; i < originLength; i++) {
            //необходима проверка, что бы лишний раз не запускать цикл
            if (answer) {
                break;
                //находим совпадение.
            } else if (charArray[i] == charArray[originLength]) {
                //повторно запускаем цикл проверяя подрят стоящии символы на равенство
                for (int index = originLength; index < charArrayLength; index++) {
                    //если длина массива кончилась или хотя бы один символ не совпадает выходим из цикла
                    if (charArray[index] != charArray[i + (index - originLength)]) {
                        answer = false;
                        break;
                    }
                    //если не одно условие выше не выполнилось - ответ true
                    answer = true;
                    }
                }
            }

        return answer;
        }
}
