class LibrarySystem {
    private Book book;
    private Member member;
    private Loan loan;

    public LibrarySystem() {
        this.book = new Book();
        this.member = new Member();
        this.loan = new Loan();
    }

    public void borrowBook(String keyword, String bookTitle, String memberName) {
        System.out.println("Library System: Initializing...");
        book.search(keyword);
        member.checkAvailability(bookTitle);
        loan.issueLoan(bookTitle, memberName);
        System.out.println("Library System: Book borrowed successfully!");
    }
}
