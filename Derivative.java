
public class Derivative {
  public void Derivatives(String myString, String[] InvTrig, String[] Trig, String[] Formulas,
			String[] ExpDerivatives) {
		
		Formulas[0] = "Product Rule: 1d2 + 2d1";
		Formulas[1] = "Quotient Rule: Lo*dHi - Hi*dLo / (Lo)^2";
		Formulas[2] = "Chain Rule: F'(U) * U'";
		Formulas[3] = "Power Rule: If y = x^n, y' = nx^n-1";

		InvTrig[0] = "ArcSin(x) = (1)(x') / (sqrt(1-x^2)";
		InvTrig[1] = "ArcCos(x) = - (1)(x') / (sqrt(1-x^2";
		InvTrig[2] = "ArcTan(x) = (1)(x') / (1+x^2)";
		InvTrig[3] = "ArcSec(x) = (1)(x') / (|x| * sqrt(x^2-1)";
		InvTrig[4] = "ArcCsc(x) = (-)(1)(x') / (|x| * sqrt(x^2-1)";
		InvTrig[5] = "ArcCot(x) = (-)(1)(x') / (1+x^2)";

		Trig[0] = "Sin (x) = Cos(x) * x'";
		Trig[1] = "Cos(x) = -Sin(x) * x'";
		Trig[2] = "Tan(x) = Sec^2(x) * x'";
		Trig[3] = "Csc(x) = -Csc(x)Cot(x) * x'";
		Trig[4] = "Sec(x) = Sec(x)Tan(x) * x'";
		Trig[5] = "Cot(x) = -Csc^2(x) * x'";

		ExpDerivatives[0] = "a^x = a^x * ln(a) * x'";
		ExpDerivatives[1] = "logbx = (1)(x') / (x)(ln(b))";
		ExpDerivatives[2] = "ln(x) = (1)(x') / (x)";
		ExpDerivatives[3] = "e^x = e^x * x'";

		if (myString.equalsIgnoreCase("Main Formulas")) {
			for (int i = 0; i < Formulas.length; i++) {
				System.out.println(Formulas[i]);
			}
		}

		if (myString.equalsIgnoreCase("Inverse Trig")) {
			for (int i = 0; i < InvTrig.length; i++) {
				System.out.println(InvTrig[i]);
			}
		}

		if (myString.equalsIgnoreCase("Trig Derivatives")) {
			for (int i = 0; i < Trig.length; i++)
				System.out.println(Trig[i]);
		}

		if (myString.equalsIgnoreCase("Exponential Derivatives")) {
			for (int i = 0; i < ExpDerivatives.length; i++)
				System.out.println(ExpDerivatives[i]);
		}

	}

}


