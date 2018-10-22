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
        Map<Integer, Optional<Student>> gradeToStudent = allStudents.stream()
                .collect(groupingBy(Student::getGrade, reducing((s1, s2) -> s1.getGrade() >= s2.getGrade() ? s1 : s2)));

        return gradeToStudent.values().stream().map(Optional::get).collect(toList());
    }
}
