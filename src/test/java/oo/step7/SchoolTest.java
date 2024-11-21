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

    @Test
    public void should_print_introductions_with_teacher_and_student_when_startSchool_is_called() {
        School school = new School();
        Teacher teacher1 = new Teacher(1, "Alice", 30);
        Teacher teacher2 = new Teacher(2, "Tommy", 35);
        Student student1 = new Student(1, "Jackson", 18);
        Student student2 = new Student(2, "David", 19);

        school.attach(teacher1);
        school.attach(teacher2);
        school.attach(student1);
        school.attach(student2);

        school.startSchool();

        String expectedOutput = "My name is Alice. I am 30 years old. I am a teacher.\n" +
                "My name is Tommy. I am 35 years old. I am a teacher.\n" +
                "My name is Jackson. I am 18 years old. I am a student.\n" +
                "My name is David. I am 19 years old. I am a student.\n";

        assertThat(systemOut().trim()).isEqualTo(expectedOutput.trim());
    }

    private String systemOut() {
        return outContent.toString();
    }
}
