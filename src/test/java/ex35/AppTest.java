package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void numberChooser() {
        List<String> players = new ArrayList<>();
        players.add("Rachel");
        players.add("Henry");
        players.add("Lisa");

        int max = players.size();
        int min = 0;
        int num = App.numberChooser(players);

        assertTrue(min <= num && num <= max);
    }
}