package coherences;

import java.util.List;
import java.util.concurrent.Future;

import AOC.TP.IGenerator;
import AOC.TP.ObsGenAsync;

public class CoherenceSequentielle  implements IAlgoDiffusion {

	int[] values = new int[10];
	int inde= 0;
	private List<ObsGenAsync> canalList;
	private List<Future<Void>> futurList;
	
	public CoherenceSequentielle(List<ObsGenAsync> canalList,
			List<Future<Void>> futurList) {
		this.canalList = canalList;
		this.futurList = futurList;
	}

	
	public void configure() {
		// TODO Auto-generated method stub
		
	}

	public void execute(IGenerator gen) {
        // TODO Auto-generated method stub
        System.out.println("will udpate "+canalList.size()+" canals");
        for(ObsGenAsync c : canalList) {
            //futurList.add();
            try {
				futurList.add(c.update(gen));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        executeFutureList();
    }
    
    private void executeFutureList() {
        System.out.println("future get");
    	for(Future f : futurList) {
    		 try {
 				f.get();
 			} catch (Exception e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
    	}
    }

}
