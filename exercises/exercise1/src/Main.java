public class Main {
    public static void main(String[] args) {
        Session session = new Session();

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                session.addStudent(new PartTimeStudent("Chen" + i, "Alice", "PT" + i));
            } else {
                session.addStudent(new FullTimeStudent("Puth" + i, "Charlie", "FT" + i, 80 + i, 85 + i));
            }

            for (int j = 0; j < 15; j++) {
                session.students.get(i - 1).addQuizScore((int) (Math.random() * 100));
            }
        }

        System.out.println("Average Quiz Score for the whole class: " + session.calculateAverageQuizScore());
        System.out.println();
        session.printQuizScoresAscending();
        System.out.println();
        session.printPartTimeStudents();
        System.out.println();
        session.printFullTimeStudentsExamScores();
    }
}