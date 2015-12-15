package reportCard;

public class ReportCard {
	public char convertGrades(int testResult) {
		char grade;
		
		if (testResult >= 90) {
			grade = 'A';
		} else if (testResult >= 80 && testResult < 90) {
			grade = 'B';
		} else if (testResult >= 60 && testResult < 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		
		return grade;
	}
}
