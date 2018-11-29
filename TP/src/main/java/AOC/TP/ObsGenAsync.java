package AOC.TP;

import java.util.concurrent.Future;

public interface ObsGenAsync extends ObsGen{
	public Future<Void> update(IGenerator g) throws Exception;

	public void setAfficheur(ObsGen afficheur);
	
}
