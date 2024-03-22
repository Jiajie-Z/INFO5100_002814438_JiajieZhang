import java.util.ArrayList;
import java.util.Collections;

public class Session {
    ArrayList<Student> students;

    public Session() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double calculateAverageQuizScore() {
        double totalScore = 0;
        int totalStudents = 0;

        for (Student student : students) {
            totalStudents++;
            double studentTotalScore = 0;
            for (double score : student.quizScore) {
                studentTotalScore += score;
            }
            totalScore += studentTotalScore / student.quizScore.size();
        }

        return totalScore / totalStudents;
    }

    public void printQuizScoresAscending() {
        ArrayList<Integer> allScores = new ArrayList<>();
        for (Student student : students) {
            allScores.addAll(student.quizScore);
        }
        Collections.sort(allScores);
        System.out.println("Quiz Scores in Ascending Order:");
        for (int score : allScores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }

    public void printPartTimeStudents() {
        System.out.println("Part-Time Students:");
        for (Student student : students) {
            if (student instanceof PartTimeStudent) {
                System.out.println(student.lastName);
            }
        }
    }

    public void printFullTimeStudentsExamScores() {
        System.out.println("Full-Time Students Exam Scores:");
        for (Student student : students) {
            if (student instanceof FullTimeStudent) {
                System.out.println(student.lastName + ": Exam 1 Score - " + ((FullTimeStudent) student).exam1Score +
                        ", Exam 2 Score - " + ((FullTimeStudent) student).exam2Score);
            }
        }
    }

    public static void main(String[] args) {
        Session session = new Session();

        session.addStudent(new FullTimeStudent("Alice", "Chen", "FT123", 85, 90));
        session.addStudent(new PartTimeStudent("Bob", "Dylan", "PT456"));
        session.addStudent(new PartTimeStudent("Charlie", "Puth", "PT789"));

        for (int i = 0; i < 20; i++) {
            session.students.get(0).addQuizScore((int) (Math.random() * 100));
            session.students.get(1).addQuizScore((int) (Math.random() * 100));
            session.students.get(2).addQuizScore((int) (Math.random() * 100));
        }

        System.out.println("Average Quiz Score for the whole class: " + session.calculateAverageQuizScore());
        session.printQuizScoresAscending();
        session.printPartTimeStudents();
        session.printFullTimeStudentsExamScores();
    }
}
