import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @org.junit.jupiter.api.Test
    void print() {
        Division a = new Division(1, "test");
        assertEquals("division.id = 1; division.name = test", a.print());
    }

}