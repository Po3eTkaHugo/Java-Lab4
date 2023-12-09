import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void print() {
        Date dateTest = new Date();
        dateTest.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.format(dateTest);
        Division divisionTest = new Division(1, "test");
        Human a = new Human(1, "test","test",dateTest, divisionTest,1);
        assertEquals("ID = 1; name = test; gender = test; birthday = 09.12.2023; division.id = 1; division.name = test; salary = 1.0\n", a.print());
    }
}