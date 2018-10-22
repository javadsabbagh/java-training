package org.kodnuts.samples.collections;

import java.util.Objects;

public class Student {
    private long id;
    private int grade;
    private int score;

    public Student() {
    }

    public Student(long id, int grade, int score) {
        this.id = id;
        this.grade = grade;
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                grade == student.grade &&
                score == student.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, grade, score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", grade=" + grade +
                ", score=" + score +
                '}';
    }
}
