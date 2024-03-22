import java.util.ArrayList;

public class Student {
    String lastName;
    String firstName;
    String studentId;
    ArrayList<Integer> quizScore;



    public Student(String lastName, String firstName,String studentId){
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentId = studentId;
        this.quizScore = new ArrayList<>();
    }

    public void addQuizScore(int score){
        quizScore.add(score);
    }

    public void displayInfo() {
        System.out.println("Name: " + lastName + firstName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Quiz Scores:");
        for (int i = 0; i < quizScore.size(); i++) {
            System.out.println("Quiz " + (i + 1) + ": " + quizScore.get(i));
        }
    }

}
