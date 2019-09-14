
public class Integral {
  public void Integrals(String myString, String[] riemannSums, String[] antiDerivatives) {
		riemannSums[0] = "\"Sigma (Delta x * f(xi))\\r\\n\" + \r\n" + "				\"i=0\\r\\n\" + \r\n"
				+ "				\"\");\r\n" + "";
		riemannSums[1] = "\"Sigma (Delta x * f(xi))\\r\\n\" + \r\n" + "				\"i=1\\r\\n\" + \r\n"
				+ "				\"\");\r\n" + "";
		
		// Need to edit formatting for Riemann sums.
		
		antiDerivatives[0] = "∫(0)dx = C";
		antiDerivatives[1] = "∫(1)dx = x + C";
		antiDerivatives[2] = "∫(x^n)dx = [(x^n+1) / (n+1)] +C";
		antiDerivatives[3] = "∫(e^x)dx = e^x + C";
		antiDerivatives[4] = "∫(1/x)dx = ln(x) + C";
		antiDerivatives[5] = "∫(n^x) = [(n^x) / (ln(n))] +C";
		antiDerivatives[6] = "∫(cosx)dx = sin(x) + C";
		antiDerivatives[7] = "∫(sinx)dx = -cos(x) + C";
		antiDerivatives[8] = "∫(sec^2(x))dx = tan(x) + C";
		antiDerivatives[9] = "∫csc^2(x)dx = -cot(x) + C";
		antiDerivatives[10] = "∫(tan(x)sec(x))dx = sec(x) + C";
		antiDerivatives[11] = "∫(cot(x)csc(x))dx = -csc(x) + C";
		antiDerivatives[12] = "∫[(1) / (sqrt(1-x2))]dx = ArcSin(x) + C";
		antiDerivatives[13] = "∫[(-1) / (sqrt(1-x2))]dx = ArcCos(x) + C";
		antiDerivatives[14] = "∫[(1) / (1+x^2)]dx = ArcTan(x) + C";
		antiDerivatives[15] = "∫[(-1) / (1+x^2)]dx = ArcCot(x) + C";
		antiDerivatives[16] = "∫[(1) / (x)(sqrt(x^2-1))]dx = ArcSec(x) + C";
		antiDerivatives[17] = "∫[(-1) / (x)(sqrt(x^2-1))]dx = ArcCsc(x) + C";

		if (myString.equalsIgnoreCase("Riemann Sums")) {
			for (int i = 0; i < riemannSums.length; i++)
				System.out.println(riemannSums[i]);
		}

		else if (myString.equalsIgnoreCase("Anti Derivatives")) {
			for (int i = 0; i < antiDerivatives.length; i++)
				System.out.println(antiDerivatives[i]);
		}

	}

}
