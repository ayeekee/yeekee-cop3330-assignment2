package ex37;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void passwordGenerator() {
        ArrayList<String> password = new ArrayList<String>();

        password = App.passwordGenerator(10, 2, 2);

        assertTrue(password.size() >= 10);
    }
}