import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class AnaliseCombinatoria {
	
	public static void main(String[] args) {
		ArrayList<Integer> t = new ArrayList<>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		t.add(6);
		t.add(7);
		t.add(8);
		t.add(9);
		t.add(10);
		t.add(11);
		t.add(12);
		gerarSolucoesPara12(t);
	}
	
	public static Sequence gerarSolucoesPara12(ArrayList<Integer> initialNumbers){
		Sequence s = new Sequence();
		LinkedList<HashSet<Integer>> list = new LinkedList<>();
		
		for(int i = 0; i <12; i++){
			for(int j = 0; j < 11; j++){
				for(int k = 0; k < 10; k++){
					HashSet<Integer> value = new HashSet<>();
					value.add(initialNumbers.get(i));
					
					if(!value.contains(initialNumbers.get(j))){
						value.add(initialNumbers.get(j));
						if(!value.contains(initialNumbers.get(k))){
							value.add(initialNumbers.get(k));
							if(!list.contains(value)){
								list.add(value);
								System.out.println(value.toString());
							}
						}
					}
					
				}
			}
		}
		s.setSequence(list);
		return s;
	}


}
