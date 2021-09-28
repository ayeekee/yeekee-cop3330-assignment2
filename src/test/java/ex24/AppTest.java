package ex24;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test
    void isAnagram( ) {
        char[] one = {'t', 'o', 'n', 'e'};
        char[] two = {'n', 'o', 't', 'e'};
        char[] three = {'f', 'o', 'u', 'r'};
        char[] four = {'t', 'r', 'e', 'e'};
        assertEquals(true, App.isAnagram(one, two, 4));
        assertEquals(false, App.isAnagram(three, four, 4));
    }
}