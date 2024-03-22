class FullTimeStudent extends Student {
    int exam1Score;
    int exam2Score;

    public FullTimeStudent(String lastName, String firstName,String studentId, int exam1Score, int exam2Score) {
        super(lastName, firstName , studentId);
        this.exam1Score = exam1Score;
        this.exam2Score = exam2Score;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Exam 1 Score: " + exam1Score);
        System.out.println("Exam 2 Score: " + exam2Score);
    }
}