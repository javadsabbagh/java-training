package org.kodnuts.samples.collections;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.reducing;
import static java.util.stream.Collectors.toList;

public class StudentService {

    /**
     * Finds top students for every grade and returns the result in a list.
     */
    public List<Student> findTopStudents(List<Student> allStudents) {
        Student identity = new Student(0, 0, 0);
        Map<Integer, Student> gradeToStudent = allStudents.stream()
                .collect(groupingBy(Student::getGrade, reducing(
                        identity,  //  when identity is given result won't be Optional
                        (s1, s2) -> s1.getScore() >= s2.getScore() ? s1 : s2)
                ));

        return gradeToStudent.values().stream().collect(toList());
    }
}
