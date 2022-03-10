import java.util.Scanner;

class One {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			double hrsPerDay;
			double hrsInWorkWeek;
			double hrsInWorkYear;
			double DAYS_IN_WORK_WEEK = 5;
			double DAYS_IN_WORK_YEAR = 252;
			System.out.println("Please enter your hours you work every work day");
			hrsPerDay = Double.parseDouble(scanner.next());
			hrsInWorkWeek = hrsPerDay * DAYS_IN_WORK_WEEK;
			hrsInWorkYear = hrsPerDay * DAYS_IN_WORK_YEAR;
			System.out.println("You work " + hrsInWorkWeek + " hours in a work week");
			System.out.println("You work " + hrsInWorkYear + " hours in a work year");

		}
	}
}