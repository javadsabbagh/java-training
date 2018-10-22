package org.kodnuts.samples.collections;

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
}
