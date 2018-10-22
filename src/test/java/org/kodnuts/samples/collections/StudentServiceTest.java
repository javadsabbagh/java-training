package org.kodnuts.samples.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StudentServiceTest {

    @Test
    public void testFindTopStudents() {
        List<Student> allStudents = new ArrayList<>();

        allStudents.add(new Student(1L, 2, 67));
        allStudents.add(new Student(2L, 2, 80));
        allStudents.add(new Student(3L, 2, 73));

        allStudents.add(new Student(4L, 3, 90));
        allStudents.add(new Student(5L, 3, 55));
        allStudents.add(new Student(6L, 3, 50));
        allStudents.add(new Student(7L, 3, 93));

        allStudents.add(new Student(8L, 4, 78));

        StudentService service = new StudentService();
        List<Student> topStudents = service.findTopStudents(allStudents);

        assertThat(topStudents).containsExactly(new Student(2L, 2, 80),
                new Student(7L, 3, 93),
                new Student(8L, 4, 78));
    }

}
