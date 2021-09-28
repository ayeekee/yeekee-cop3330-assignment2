package ex40;

import ex39.App;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void fNameMap() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(0, "Jacquelyn");
        map.put(1, "Jake");
        map.put(2, "John");
        map.put(3, "Michaela");
        map.put(4,"Sally");
        map.put(5, "Tou");

        HashMap<Integer, String> genMap = new HashMap<Integer, String>();
        genMap = ex39.App.fNameMap();

        assertEquals(6, genMap.size());
    }

    @Test
    void lNameMap() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(0, "Jacquelyn");
        map.put(1, "Jake");
        map.put(2, "John");
        map.put(3, "Michaela");
        map.put(4,"Sally");
        map.put(5, "Tou");

        HashMap<Integer, String> genMap = new HashMap<Integer, String>();
        genMap = ex39.App.lNameMap();

        assertEquals(6, genMap.size());
    }

    @Test
    void positionMap() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(0, "Jacquelyn");
        map.put(1, "Jake");
        map.put(2, "John");
        map.put(3, "Michaela");
        map.put(4,"Sally");
        map.put(5, "Tou");

        HashMap<Integer, String> genMap = new HashMap<Integer, String>();
        genMap = ex39.App.positionMap();

        assertEquals(6, genMap.size());
    }

    @Test
    void dateMap() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(0, "Jacquelyn");
        map.put(1, "Jake");
        map.put(2, "John");
        map.put(3, "Michaela");
        map.put(4,"Sally");
        map.put(5, "Tou");

        HashMap<Integer, String> genMap = new HashMap<Integer, String>();
        genMap = App.dateMap();

        assertEquals(6, genMap.size());
    }
}