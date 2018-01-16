package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.*;
import static org.junit.Assert.*;

/**
 * @author Jevgenijs A.
 * @version $Id$
 * @since 0.1
 */
 
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
		ArrayDuplicate arrObj = new ArrayDuplicate();
		String[] input = {"apple", "apple", "orange", "candy", "orange", "apple", "apple"};
		String[] expected = {"apple", "orange", "candy"};
		String[] rslt = arrObj.remove(input);
		assertThat(rslt, arrayContainingInAnyOrder(expected));
    }
	
	@Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate2() {
		ArrayDuplicate arrObj = new ArrayDuplicate();
		String[] input = {"Sun", "Sat", "Mon", "Tue", "Sat", "Thu", "Sun", "Wed", "Thu", "Fri", "Sun", "Sat", "Thu" };
		String[] expected = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		String[] rslt = arrObj.remove(input);
		assertThat(rslt, arrayContainingInAnyOrder(expected));
    }
}