package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void validateFName() {
        String good = "John";
        String bad = "J";

        assertEquals(1, App.validateFName(bad));
        assertEquals(0, App.validateFName(good));
    }

    @Test
    void validateLName() {
        String good = "John";
        String bad = "J";

        assertEquals(2, App.validateLName(bad));
        assertEquals(0, App.validateLName(good));
    }

    @Test
    void validateZipCode() {
        String good = "33027";
        String bad = "afjels";

        assertEquals(3, App.validateZipCode(bad));
        assertEquals(0, App.validateZipCode(good));
    }

    @Test
    void validateID() {
        String good = "as-1234";
        String bad = "sfe";

        assertEquals(4, App.validateID(bad));
        assertEquals(0, App.validateID(good));
    }

}