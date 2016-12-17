import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class AnaliseCombinatoria {
	public static void main(String[] args) {
		ArrayList<Integer> t = new ArrayList<Integer>();
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
	
	
	//SEGUNDO FORMULA A QUANTIDADE MAXIMA DE GERAÇÕES PARA UM NUMERO N DE NUMEROS PARA NUMEROS DE TAMANHO R EH DADO POR:
	// N!/ ((N-R)!*R!)
	public static String gerarSolucoesPara12(ArrayList<Integer> initialNumbers){
		LinkedList<HashSet<Integer>> list = new LinkedList<HashSet<Integer>>();
		StringBuilder str = new StringBuilder();

		for(int i = 0; i <12; i++){
			for(int j = 0; j < 12; j++){
				for(int k = 0; k < 12; k++){
					for(int l = 0; l < 12; l++){
						for(int m = 0; m < 12; m++){
							for(int n = 0; n < 12; n++){
								for(int o = 0; o < 12; o++){
										HashSet<Integer> value = new HashSet<Integer>();
										value.add(initialNumbers.get(i));

										if(!value.contains(initialNumbers.get(j))){
											value.add(initialNumbers.get(j));

											if(!value.contains(initialNumbers.get(k))){
												value.add(initialNumbers.get(k));

												if(!value.contains(initialNumbers.get(l))){
													value.add(initialNumbers.get(l));

													if(!value.contains(initialNumbers.get(m))){
														value.add(initialNumbers.get(m));


														if(!value.contains(initialNumbers.get(n))){
															value.add(initialNumbers.get(n));

															if(!value.contains(initialNumbers.get(o))){
																value.add(initialNumbers.get(o));

																	if(!list.contains(value)){
																		list.add(value);
																		str.append(value.toString());
																		str.append("\n");
																		System.out.println(value.toString());
																	}
															}
														}
													}
												}
											}
										}
								}
							}
						}
					}
				}
			}
		}
		return str.toString();

	}


	public static String gerarSolucoesPara13(ArrayList<Integer> initialNumbers){
		LinkedList<HashSet<Integer>> list = new LinkedList<HashSet<Integer>>();
		StringBuilder str = new StringBuilder();

		for(int i = 0; i <13; i++){
			for(int j = 1; j < 13; j++){
				for(int k = 2; k < 13; k++){
					for(int l = 3; l < 13; l++){
						for(int m = 4; m < 13; m++){
							for(int n = 5; n < 13; n++){
								for(int o = 6; o < 13; o++){
									for(int p = 7; p < 13; p++){
										HashSet<Integer> value = new HashSet<Integer>();
										value.add(initialNumbers.get(i));

										if(!value.contains(initialNumbers.get(j))){
											value.add(initialNumbers.get(j));

											if(!value.contains(initialNumbers.get(k))){
												value.add(initialNumbers.get(k));

												if(!value.contains(initialNumbers.get(l))){
													value.add(initialNumbers.get(l));

													if(!value.contains(initialNumbers.get(m))){
														value.add(initialNumbers.get(m));


														if(!value.contains(initialNumbers.get(n))){
															value.add(initialNumbers.get(n));

															if(!value.contains(initialNumbers.get(o))){
																value.add(initialNumbers.get(o));

																if(!value.contains(initialNumbers.get(p))){
																		value.add(initialNumbers.get(p));
																		if(!list.contains(value)){
																			list.add(value);
																			str.append(value.toString());
																			str.append("\n");
																			System.out.println(value.toString());
																		}
																	}
																}
															}
														}
													}
												}
											}
									}
								}
							}
						}
					}
				}
			}
	
		}
		return str.toString();
	}
}