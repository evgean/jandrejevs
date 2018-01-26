package ru.job4j.array;

/**
 *@author Jevgenijs A.
 *@version $Id$
 *@since 0.1
 */

public class TwoArr {

    /**
     * @param arr1 - последовательный массив целых чисел
     * @param arr2 - последовательный массив целых чисел
     * @return массив состоящий из последовательных чисел из массивов arr1 и arr2
     */
    public int[] combineArr(int[] arr1, int[] arr2) {
        //создаем массив куда будем складывать числа по возростанию
        int[] combineArr = new int[(arr1.length + arr2.length)];
        //создаем индекы для массивов
        int firstIndex = arr1.length - 1, secondIndex = arr2.length - 1, indexNewArr = combineArr.length - 1;

        for (int i = indexNewArr; i >= 0; i--) {
            if (arr1[firstIndex] > arr2[secondIndex]) {
                combineArr[i] = arr1[firstIndex];
                if (firstIndex > 0) {
                    firstIndex--;
                } else {
                    arr1[0] = arr2[0];
                }
            } else {
                combineArr[i] = arr2[secondIndex];
                if (secondIndex > 0) {
                    secondIndex--;
                } else {
                    arr2[0] = arr1[0];
                }
            }
        }

        return combineArr;
    }
}
