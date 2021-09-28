package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void easy() {
        int num = App.easy();
        int min = 1;
        int max = 10;
        assertTrue(min <= num && num <= max);
    }

    @Test
    void med() {
        int num = App.med();
        int min = 1;
        int max = 100;
        assertTrue(min <= num && num <= max);
    }

    @Test
    void hard() {
        int num = App.hard();
        int min = 1;
        int max = 1000;
        assertTrue(min <= num && num <= max);
    }
}