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
        //опрежеляем свободный индекс массива combineArr
        int combineArrIndex = 0;
        //определяем с каково индекса нужно будет начинать переберать второго массив если было найдено меньшее число
        int lastArr2i = 0;
        for (int arr1i = 0; arr1i <= arr1.length; arr1i++) {
            for (int arr2i = lastArr2i; arr2i <= arr2.length; arr2i++) {
                // правда, что второй массив не вышел из ренджа? И (правда первый массив не вышел из ренджа? ИЛИ правда число первого массива боль числа второго?)
                if (arr2i != arr2.length && (arr1i == arr1.length || arr1[arr1i] >= arr2[arr2i])) {
                    combineArr[combineArrIndex] = arr2[arr2i];
                    combineArrIndex++;
                    lastArr2i++;
                } else {
                    //правда первый массив не вышел из ренджа?
                    if (arr1i != arr1.length) {
                        combineArr[combineArrIndex] = arr1[arr1i];
                        combineArrIndex++;
                    }
                    //если первый массив вышел за придел просто выход
                    break;
                }
            }
        }

        return combineArr;
    }
}
