package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void removeName() {
        String name1 = "John Smith";
        String name2 = "Jeremy Goodwin";
        String name3 = "asf";

        assertEquals(0, App.removeName(name1));
        assertEquals(4, App.removeName(name2));
        assertEquals(-1, App.removeName(name3));

    }
}