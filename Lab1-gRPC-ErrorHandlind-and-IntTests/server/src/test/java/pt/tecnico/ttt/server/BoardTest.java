package pt.tecnico.ttt.server;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BoardTest {
    
    private TTTGame ttt = null;

    @BeforeAll
    public static void oneTimeSetUp() { }

    @AfterAll
    public static void oneTimeTearDown() { }

    @BeforeEach
    public void setUp() {
        ttt = new TTTGame();
    }

    @AfterEach
    public void tearDown() {
        ttt = null;
    }

   @Test //this one runs
    public void testTests() {
        assertEquals(1, 1);
    }

    @Test //this one doesn't run
    public void boardToStringTest() {
        final String expectedBoard = "\n\n 1 | 2 | 3\n---+---+---\n 4 | 5 | 6\n---+---+---\n 7 | 8 | 9\n ";
        assertEquals(expectedBoard, ttt.toString());
    }

}
