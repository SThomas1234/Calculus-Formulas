
public class Trig {


	public void Identites(String myString, String[] CoFunction, String[] NegAngles, String[] AddSub,
			String[] DoubleAngle, String[] Product, String[] Pythagorean, String[] HalfAngle, String[] Sum) {
		// TODO Auto-generated method stub

		DoubleAngle[0] = "Sin(2x) = 2sinxcosx";
		DoubleAngle[1] = "Cos(2x) = cos^2x-sin^2x, 2cos^2x - 1, or 1-2sin^2x";
		DoubleAngle[2] = "Tan(2x) = (2tanx) / (1-tan^2(x)))";

		HalfAngle[0] = "Sin(x/2) = sqrt((1-cosx) / (2))";
		HalfAngle[1] = "Cos(x/2) = sqrt((1+cosx) / (2))";
		HalfAngle[2] = "Tan(x/2) = sqrt((1-cosx) / (1+cosx))";

		Pythagorean[0] = "1 + tan^2(x) = Sec^2(x)";
		Pythagorean[1] = "1 + cot^2(x) = csc^2(x)";
		Pythagorean[2] = "Sin^2(x) + Cos^2(x) = 1";

		Product[0] = "Sin(A)Cos(B) = .5(Sin(A+B) + Sin(A-B)";
		Product[1] = "Cos(A)Sin(B) = .5(Sin(A+B) - Sin(A-B)";
		Product[2] = "Cos(A)Cos(B) = .5(Cos(A+B) + Cos(A-B)";
		Product[3] = "Sin(A)Sin(B) = .5(Cos(A-B) - Cos(A+B)";

		CoFunction[0] = "Sin(x) = Cos(pi/2 - x";
		CoFunction[1] = "Sec(x) = Csc{pi/2 - x)";
		CoFunction[2] = "Tan(x) = Cot(pi/2 - x)";
		CoFunction[3] = "Sin(pi-x) = Sin(x)";
		CoFunction[4] = "Cos(pi-x) = -Cos(x)";
		CoFunction[5] = "Tan(pi-x) = -Tan(x)";
		CoFunction[6] = "Csc(pi-x) = Csc(x)";
		CoFunction[7] = "Sec(pi-x) = -Sec(x)";
		CoFunction[8] = "Cot(pi-x) = Cot(x)";
		CoFunction[9] = "Sin(pi+x) = -Sin(x)";
		CoFunction[10] = "Cos(pi+x) = -Cos(x)";
		CoFunction[11] = "Tan(pi+x) = Tan(x)";
		CoFunction[12] = "Csc(pi+x) = -Csc(x)";
		CoFunction[13] = "Sec(pi+x) = -Sec(x)";
		CoFunction[14] = "Cot(pi+x) = Cot(x)";

		NegAngles[0] = "Sin(-x) = -Sin(x)";
		NegAngles[1] = "Cos(-x) = Cos(x)";
		NegAngles[2] = "Tan(-x) = -Tan(x)";
		NegAngles[3] = "Csc(-x) = -Csc(x)";
		NegAngles[4] = "Sec(-x) = Sec(x)";
		NegAngles[5] = "Cot(-x) = -Cot(x)";

		AddSub[0] = "Sin(A+B) = Sin(A)Cos(B) + Cos(A)Sin(B)";
		AddSub[1] = "Cos(A+B) = Cos(A)Cos(B) - Sin(A)Sin(B)";
		AddSub[2] = "Tan(A+B) = (TanA+TanB) / (1-TanA*TanB)";
		AddSub[3] = "Sin(A-B) = Sin(A)Cos(B) - Cos(A)Sin(B)";
		AddSub[4] = "Cos(A-B) = Cos(A)Cos(B) + Sin(A)Sin(B)";
		AddSub[5] = "Tan(A-B) = (TanA - TanB) / (1+TanA*TanB)";

		Sum[0] = "Sin(A) + Sin(B) = 2Sin((A+B)/(2)) * Cos((A-B) / (2))";
		Sum[1] = "Sin(A) - Sin(B) = 2Cos((A+B)/(2)) * Sin((A-B) / (2))";
		Sum[2] = "Cos(A) + Cos(B) = 2Cos((A+B)/(2)) * Cos((A-B) / (2))";
		Sum[3] = "Cos(A) - Cos(B) = -2sin((A+B)/(2)) * Sin((A-B) / (2))";

		if (myString.equalsIgnoreCase("Trig Cofunction Identities")) {
			for (int i = 0; i < CoFunction.length; i++)
				System.out.println(CoFunction[i]);
		}

		if (myString.equalsIgnoreCase("Trig angle identities")) {
			for (int i = 0; i < HalfAngle.length; i++) {
				System.out.println(HalfAngle[i]);
				System.out.println(DoubleAngle[i]);
			}
		}

		if (myString.equalsIgnoreCase("Sum Identities")) {
			for (int i = 0; i < Sum.length; i++)
				System.out.println(Sum[i]);
		}

		if (myString.equalsIgnoreCase("Add and Subtract Identities")) {
			for (int i = 0; i < AddSub.length; i++)
				System.out.println(AddSub[i]);
		}
		if (myString.equalsIgnoreCase("Negative Angle Identities")) {
			for (int i = 0; i < NegAngles.length; i++)
				System.out.println(NegAngles[i]);
		}

		if (myString.equalsIgnoreCase("Pythagorean Identities")) {
			for (int i = 0; i < Pythagorean.length; i++)
				System.out.println(Pythagorean[i]);
		}

		else if (myString.equalsIgnoreCase("Product identities")) {
			for (int i = 0; i < Product.length; i++)
				System.out.println(Product[i]);
		}

	
	}
	
		
	}
