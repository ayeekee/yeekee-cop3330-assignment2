package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test

    void average() {
        ArrayList<Double> values = new ArrayList<Double>();
        values.add(100.0);
        values.add(200.0);
        values.add(1000.0);
        values.add(300.0);

        assertEquals(400.0, App.average(values));
    }

    @Test
    void max() {
        ArrayList<Double> values = new ArrayList<Double>();
        values.add(100.0);
        values.add(200.0);
        values.add(1000.0);
        values.add(300.0);

        assertEquals(1000.0, App.max(values));
    }

    @Test
    void min() {
        ArrayList<Double> values = new ArrayList<Double>();
        values.add(100.0);
        values.add(200.0);
        values.add(1000.0);
        values.add(300.0);

        assertEquals(100.0, App.min(values));
    }

    @Test
    void std() {
        ArrayList<Double> values = new ArrayList<Double>();
        values.add(100.0);
        values.add(200.0);
        values.add(1000.0);
        values.add(300.0);

        assertEquals(353.5533905932738, App.std(values));
    }
}