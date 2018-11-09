package AOC.TP;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.ArrayList;
import java.util.List;


public class App {

	private static int nbCanaux = 4;
	private static List<ObsGenAsync> canaux;
	
	public static void main( String[] args )
    {
    	ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
    	canaux = new ArrayList<ObsGenAsync>();
    	for(int i = 0; i < nbCanaux; i++) {
    		ObsGenAsync canal = new Canal(service);
    		ObsGen aff = new Afficheur(canal);
    		canaux.add(canal);
    	}
		Generator gen = new Generator(canaux);
    	try {
			gen.Update();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
