package chua_bai.bai_2;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Duong", 20, new double[] {9, 10, 8});
        Student s2 = new Student("Ning", 21, new double[] {6, 7, 8});
        double avgScoreS1 = s1.getAverage();
        double avgScoreS2 = s2.getAverage();
        if(avgScoreS1 > avgScoreS2) {
            s1.display();
        } else if(avgScoreS1 < avgScoreS2) {
            s2.display();
        } else {
            s1.display();
            s2.display();
        }
    }
}
