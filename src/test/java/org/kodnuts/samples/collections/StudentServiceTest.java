package org.kodnuts.samples.collections;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceTest {

    @Test
    public void testFindTopStudents() {
        List<Student> allStudents = new ArrayList<>();
        allStudents

        StudentService service = new StudentService();
        List<Student> topStudents = service.findTopStudents();
    }

}
