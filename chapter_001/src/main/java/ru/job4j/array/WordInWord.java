package ru.job4j.array;

/**
 *@author Jevgenijs A.
 *@version $Id$
 *@since 0.1
 */

public class WordInWord {

    public boolean contains(String origin, String sub) {
        char[] originArr = new char[origin.length()];
        char[] subArr = new char[sub.length()];
        boolean answer = false;
        int count = 0;

        for (int i = 0; i < origin.length(); i++) {
            originArr[i] = origin.charAt(i);
        }
        for (int i = 0; i < sub.length(); i++) {
            subArr[i] = sub.charAt(i);
        }

        for (int out = 0; out <= (originArr.length - subArr.length) + 1; out++) {
            if (count == subArr.length) {
                answer = true;
                break;
            } else {
                count = 0;
                for (int in = 0; in < subArr.length; in++) {
                    if (subArr[in] == originArr[out + in]) {
                        count++;
                    }
                }
            }
        }
        return answer;
    }
}
