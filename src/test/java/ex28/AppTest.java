package ex28;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void add() {
        ArrayList<Integer> numList = new ArrayList<Integer>(5);

        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);

        assertEquals(15, App.add(numList));
    }
}