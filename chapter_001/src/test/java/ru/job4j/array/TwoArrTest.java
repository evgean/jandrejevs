package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Jevgenijs A.
 * @version $Id$
 * @since 0.1
 */

public class TwoArrTest {
    @Test
    public void whenCombineArraySimple() {
        TwoArr arrays = new TwoArr();
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 7};
        int[] rslt = arrays.combineArr(arr1, arr2);
        int[] expexted = {1, 2, 3, 4, 5, 7};
        assertArrayEquals(rslt, (expexted));
    }

    @Test
    public void whenCombineDifferetArr() {
        TwoArr arrays = new TwoArr();
        int[] arr1 = {1, 3, 5, 8, 9, 100, 202};
        int[] arr2 = {2, 4, 7, 99};
        int[] rslt = arrays.combineArr(arr1, arr2);
        int[] expexted = {1, 2, 3, 4, 5, 7, 8, 9, 99, 100, 202};
        assertArrayEquals(rslt, (expexted));
    }

    @Test
    public void whenCombineZeroArr() {
        TwoArr arrays = new TwoArr();
        int[] arr1 = {};
        int[] arr2 = {};
        int[] rslt = arrays.combineArr(arr1, arr2);
        int[] expexted = {};
        assertArrayEquals(rslt, (expexted));
    }
}