package chua_bai.bai_2;

import java.util.Arrays;

public class Student {
    String name;
    int age;
    double[] scores;

    Student(String name, int age, double[] scores) {
        this.name = name;
        this.age = age;
        this.scores = scores;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setScores(double[] scores) {
        this.scores = scores;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Scores: " + Arrays.toString(scores));
        double avg = this.getAverage();
        System.out.println("Avg: " + avg);
    }

    double getAverage() {
        double sum = 0;
        for(double item: this.scores) {
            sum += item;
        }
        return sum / this.scores.length;
    }
}
