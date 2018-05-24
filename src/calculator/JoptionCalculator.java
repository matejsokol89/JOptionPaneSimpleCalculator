package calculator;

import javax.swing.JOptionPane;

public class JoptionCalculator {

	public static void main(String args[]) {
		// incijalizrao sam varijable koje sam kasnije proslijeđivao na pravo mjesto :D
		
		String prviBrojS, drugiBrojS, operatorS;
		double prviBroj, drugiBroj, odgovor = 0;

		// u JOptionPane dajem input koji ispisuje neke porukice, tj. da korisnik zna tocno sto unijeti i kojim redom
		prviBrojS = JOptionPane.showInputDialog("Unesi prvi broj ", "Prvi broj ");
		operatorS = JOptionPane.showInputDialog("Unesi operator", "+ - * /");
		drugiBrojS = JOptionPane.showInputDialog("Unesi drugi broj ", "Drugi broj ");
		
		// parso dobule tj converto string u broj
		prviBroj = Double.parseDouble(prviBrojS);
		drugiBroj = Double.parseDouble(drugiBrojS);
		
		// ispiso if uvjete koji se izvršavaju na način ako je uvjet točan izvršava dolje postavljeni algoritam odnosno zbraja,oduzima, množi, dijeli prvi od drugog broja
		//ovisno o tome sto korisnik upiše znam profesore da postoji način da se komentira više linija ali mi se nije dalo tražiti haha
		if (operatorS.equals("+")) {
			odgovor = prviBroj + drugiBroj;

		}

		if (operatorS.equals("-")) {
			odgovor = prviBroj - drugiBroj;

		}

		if (operatorS.equals("*")) {
			odgovor = prviBroj * drugiBroj;

		}

		if (operatorS.equals("/")) {
			odgovor = prviBroj / drugiBroj;

		}
		//završna radnja koja ispisuje rezultat
		JOptionPane.showMessageDialog(null, "Točan izračun je " + odgovor);

	}

}
