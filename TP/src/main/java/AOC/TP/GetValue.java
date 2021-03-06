package AOC.TP;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class GetValue implements Callable<Integer> {

	private IGenerator generator;
	
	public GetValue(IGenerator g) {
		this.generator = g;
	}
		
	public Integer call() throws Exception {
		
		//System.out.println("call Getvalue");
		Integer value = (Integer) generator.getValue();		

		//Integer value = (Integer) Generator.Get().getValue();		
		return value;
	}

}
