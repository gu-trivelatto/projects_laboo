
public class BatedorDePenalti {
	int camisa;
	String time;
	
	public static void main (String args[]) {
		System.out.println("1o argumento: " + args[0]);
		System.out.println("2o argumento: " + args[1]);
		BatedorDePenalti rogerio = new BatedorDePenalti();
		rogerio.camisa = 1;
		rogerio.time = "SPFC";
		boolean comParadinha = (args[0].equals("true"));
		rogerio.bataPenalti(comParadinha);
	}
	
	void bataPenalti(boolean comParadinha) {
		if (comParadinha)
			System.out.println("Bati como o Pelé!");
		else
			System.out.println("Bati como o Zico!");
	}
}
