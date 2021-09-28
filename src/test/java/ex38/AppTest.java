package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void filterEvenNumbers() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] answer = {2, 4, 6};
        int[] output = App.filterEvenNumbers(input);

        assertArrayEquals(answer, output);
    }
}