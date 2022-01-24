package e.operators;

public class BMICalculator {

	public static void main(String[] args) {

		// bmi = weight in kg/(height * height)

		double height = 5.11;
		double weight = 70;

		double toMeters = 0.4536;
		double heightInMeters = height * toMeters;

		double bmi = weight / (heightInMeters * heightInMeters);

		System.out.println("BMI: " + bmi);
	}

}
