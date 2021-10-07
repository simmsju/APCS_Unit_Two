import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringMethodsTests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    void NamesTest() throws IOException {
        System.setIn(new FileInputStream("data_files/names.txt"));
        Names.main(null);
        assertTrue(outContent.toString().contains("Katherine Johnson\n16\nKJ\n1\n-1\n7\nKathnson Joherine"),
                "Did you use the correct arguments?");

    }

    @Test
    void PasswordTuring() throws IOException {
        System.setIn(new FileInputStream("data_files/passwordOne.txt"));
        Password.main(null);
        assertTrue(outContent.toString().contains("AIInng3075"));
    }

    @Test
    void CoursesTestEcon() throws IOException {
        System.setIn(new FileInputStream("data_files/courses.txt"));
        Courses.main(null);
        assertTrue(outContent.toString().contains("Department: ECON\nCourse Number: 203\nTitle: Advanced Macroeconomics"));
    }
}
