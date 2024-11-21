package oo.step7;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import oo.Klass;
import oo.School;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SchoolTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void should_print_teacher_introductions_when_startSchool_is_called() {
        School school = new School();
        Teacher teacher1 = new Teacher(1, "Alice", 30);

        school.attach(teacher1);
        school.startSchool();

        String expectedOutput = "My name is Alice. I am 30 years old. I am a teacher.";

        assertThat(systemOut().trim()).isEqualTo(expectedOutput);
    }

    private String systemOut() {
        return outContent.toString();
    }
}
