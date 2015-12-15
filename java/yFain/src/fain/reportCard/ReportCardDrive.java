package fain.reportCard;

public class ReportCardDrive {
    public static void main(String[] args) {
        ReportCard rc = new ReportCard();

        char yourGrade = rc.convertGrades(88);

        switch (yourGrade) {
            case 'A':
                System.out.println("Excelent!!");
                break;
            case 'B':
                System.out.println("Good Work!");
                break;
            case 'C':
                System.out.println("You need more knowledge");
                break;
            case 'D':
                System.out.println("Be more seriously");
                break;
        }
    }
}
