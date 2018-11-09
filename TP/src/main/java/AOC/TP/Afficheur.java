package AOC.TP;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

//Client/Servant
public class Afficheur implements ObsGen {

	
	public Afficheur(ObsGenAsync c) {
		super();
		this.c = c;
		this.c.setAfficheur(this);
	}

	private ObsGenAsync c;
	private int value;
	private Future f;
	
	public Future<Integer> GetValue() throws InterruptedException, ExecutionException {
		f = c.GetValue();
		setValue((int)(Integer) f.get());
		return f;
	}
	
	private void setValue(int val) {
		value = val;
		display();
	}
	
	private void display() {
		System.out.println(" ------------------------ \n"
				+ "|                        |\n"
				+ "|                        |\n"
				+ "|                        |\n"
				+ "|           " + value + "           |\n"
				+ "|                        |\n"
				+ "|                        |\n"
				+ " ------------------------ "
				);
	}
}
