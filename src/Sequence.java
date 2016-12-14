import java.util.HashSet;
import java.util.LinkedList;

public class Sequence {
	private LinkedList<HashSet<Integer>> sequence;
	
	
	public Sequence(){
		this.setSequence(new LinkedList<>());
	}


	public LinkedList<HashSet<Integer>> getSequence() {
		return sequence;
	}


	public void setSequence(LinkedList<HashSet<Integer>> sequence) {
		this.sequence = sequence;
	}
}
