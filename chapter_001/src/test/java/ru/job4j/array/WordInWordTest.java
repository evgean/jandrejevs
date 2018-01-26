package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Jevgenijs A.
 * @version $Id$
 * @since 0.1
 */

public class WordInWordTest {
    @Test
    public void whenWordInBeginning() {
        WordInWord word = new WordInWord();
        String source = "asdplwevmewfjcwajnsdpd123123123";
        String searchKey = "sdp";
        boolean expected = true;
        boolean rslt = word.contains(source, searchKey);
        assertThat(rslt, is(expected));
    }

    @Test
    public void whenNoCont() {
        WordInWord word = new WordInWord();
        String source = "saddqwdqdwd2d1d";
        String searchKey = "12";
        boolean expected = false;
        boolean rslt = word.contains(source, searchKey);
        assertThat(expected, is(rslt));
    }

    @Test
    public void whenSameWordInEnd() {
        WordInWord word = new WordInWord();
        String source = "1231231231231234";
        String searchKey = "1234";
        boolean expected = true;
        boolean rslt = word.contains(source, searchKey);
        assertThat(expected, is(rslt));
    }
}