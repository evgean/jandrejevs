package ru.job4j.array;

/**
 *@author Jevgenijs A.
 *@version $Id$
 *@since 0.1
 */

public class WordInWord {

    public boolean contains(String origin, String sub) {
        Character[] arrayOrigin = new Character[origin.length()];
        Character[] arraySub = new Character[origin.length()];
        //читал о том, что если не вычислять каждый раз *.length а иметь точную переменную
        //  код будет быстрее работать.
        int originLength = origin.length();
        int subLength = sub.length();
        // то, что возращает метод
        boolean answer = false;
        //записывает в массивы символы
        for (int index = 0; index != originLength; index++) {
            arrayOrigin[index] = origin.charAt(index);
        }
        for (int index2 = 0; index2 != subLength; index2++) {
            arraySub[index2] = sub.charAt(index2);
        }
        //проверяем есть ли первая буква искомого слова в сраке
        for (int i = 0; i < originLength; i++) {
            //необходима проверка, что бы лишний раз не запускать цикл
            if (answer) {
                break;
                //находим совпадение.
            } else if (arraySub[0] == arrayOrigin[i]) {
                //повторно запускаем цикл проверяя подрят стоящии символы на равенство
                for (int index = 0; index < subLength; index++) {
                    //если длина массива кончилась или хотя бы один символ не совпадает выходим из цикла
                    if ((i + index) >= originLength || arraySub[index] != arrayOrigin[i + index]) {
                        answer = false;
                        break;
                    }
                    answer = true;
                    }
                }
            }

        return answer;
        }
}
