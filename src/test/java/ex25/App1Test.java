package ex25;

import ex24.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class App1Test {

    @Test
    void passwordValidator() {
        String test = "12345678";

        assertEquals(1, App1.passwordValidator(test));
    }
}