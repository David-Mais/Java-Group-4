public class Main {
    public static void main(String[] args) {
//        Student[] students = new Student[5];
//        for (int i = 0; i < 5; i++) {
//            students[i] = new Student(
//                    "Student " + i,
//                    "Last " + i,
//                    i + 19,
//                    i + 1,
//                    (i + 3) / 4.0
//            );
//        }
//
//        for (Student student : students) {
//            System.out.println(student.toString());
//        }
//
//        System.out.println(bestStudent(students));

        BankAccount bankAccount = new BankAccount("abc");
        bankAccount.setPassword("abc");

        bankAccount.deposit(500);
        bankAccount.deposit(1500);
        bankAccount.deposit(850);
        bankAccount.withdraw(1780, "abc");
        bankAccount.deposit(987.98);

        bankAccount.printTransactionHistory();

        BankAccount otherBankAccount = new BankAccount("cba");
        otherBankAccount.setPassword("cba");
        System.out.println(otherBankAccount.getBalance());
        System.out.println(bankAccount.getBalance());

        bankAccount.transferMoney(otherBankAccount, 560.55);
        System.out.println(otherBankAccount.getBalance());
        System.out.println(bankAccount.getBalance());
    }

    static String bestStudent(Student[] students) {
        String bestStudent = students[0].getFirstName() + " " + students[0].getLastName();
        double bestScore = students[0].getAvgScore();
        for (Student student : students) {
            if (student.getAvgScore() > bestScore) {
                bestScore = student.getAvgScore();
                bestStudent = student.getFirstName() + " " + student.getLastName();
            }
        }
        return bestStudent;
    }
}