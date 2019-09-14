
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Before we begin, here are some friendly reminders: ");
		ArrayList<String> Reminders = new ArrayList();

		Reminders.add("Don't forget the U' when doing the chain rule!");
		Reminders.add("Don't forget the + C when integrating!");

		ListIterator iterator = Reminders.listIterator();

		while (iterator.hasNext())
			System.out.println(iterator.next());

		System.out.println();

		System.out.println("Now, what type of formulas do you need?");
		String myString = scan.nextLine();

		String[] Formulas = new String[4];
		String[] InvTrig = new String[6];
		String[] Trig = new String[6];
		String[] ExpDerivatives = new String[4];
		String[] RiemannSums = new String[2];
		String[] AntiDerivatives = new String[18];
		String[] CoFunction = new String[15];
		String[] NegAngles = new String[6];
		String[] AddSub = new String[6];
		String[] DoubleAngle = new String[3];
		String[] Product = new String[4];
		String[] Pythagorean = new String[3];
		String[] HalfAngle = new String[3];
		String[] Sum = new String[4];
		

		Trig TrigObject = new Trig();
		TrigObject.Identites(myString, CoFunction, NegAngles, AddSub, DoubleAngle, Product, Pythagorean, HalfAngle,
				Sum);

		Derivative DerivativeObject = new Derivative();
		DerivativeObject.Derivatives(myString, InvTrig, Trig, Formulas, ExpDerivatives);

		Integral IntegralObject = new Integral();
		IntegralObject.Integrals(myString, RiemannSums, AntiDerivatives);


	}

}