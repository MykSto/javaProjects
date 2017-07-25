package collections;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;


public class CollectionApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		System.out.println("***AIBES***");
		System.out.println("Does K relate to AIBES? " + set.contains("K"));
		System.out.println("Aibeje yra " + set.size());
		// Checks AIBES and list all present.
		Iterator<String> setIterator = set.iterator();
		while (setIterator.hasNext()) {
			System.out.println(setIterator.next());
		}
		// ENUM
		EnumSet<DiceEnum> diceSet = EnumSet.of(DiceEnum.FACE1, DiceEnum.FACE2,
				DiceEnum.FACE3);
		System.out.println("### AIBĖ ENUM SET ###");
		System.out.println("Ar 'FACE4' yra aibėje? "
				+ diceSet.contains(DiceEnum.FACE4));
		System.out.println("Aibėje yra " + diceSet.size());

		Iterator<DiceEnum> diceIterator = diceSet.iterator();
		while (diceIterator.hasNext()) {
			System.out.println(diceIterator.next());
		}
		
		
		//Stack
		Stack<String> stack = new Stack<>();
		stack.push("A");//add
		stack.push("B");
		stack.push("C");
		System.out.println("***STACK***");
		System.out.println("***VIRSUNE***" + stack.peek());
		System.out.println(stack);
		
		
		Iterator<String> stackIterator = stack.iterator();
		while(stackIterator.hasNext()){
			System.out.println(stackIterator.next());
		}
		System.out.println("Number of elements: " + stack.size());
		while(stack.size() > 0){
			System.out.println(stack.pop());//take out
		}
		
		
		// VECTOR
		Vector<Integer> vector = new Vector<Integer>();
		for (int i = 0; i < 10; i++) {
			vector.add(i + 5);
		}

		vector.insertElementAt(123, 5);
		System.out.println("***VECTOR***");
		System.out.println("NUMBER OF VECTORS IS: " + vector.size());
		System.out.println("CAPACITY OF VECTOR IS:" + vector.capacity());
		System.out.println("10th VECTOR IS: " + vector.get(10));
		
		//HASH MAP
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Jonas", 6);
		map.put("Andrius", 7);
		map.put("Charlie", 9);
		map.put("Tomas", 4);
		
		System.out.println("***GRADES***");
		System.out.println("Andriaus grade is: " + map.get("Andrius"));
		
		System.out.println("***VALUES***");
		Iterator<Integer> mapValue = map.values().iterator();
		while(mapValue.hasNext()){
			System.out.println(mapValue.next());
		}
		
		System.out.println("**KEYS**");
		Iterator<String> mapKey = map.keySet().iterator();
		while(mapKey.hasNext()){
			System.out.println(mapKey.next());
		}
		
		//key+values
		System.out.println("***KEYS+VALUES***");
		Iterator<Map.Entry<String, Integer>> mapIterator = map.entrySet().iterator();
		while(mapIterator.hasNext()){
			Map.Entry<String, Integer> entry = mapIterator.next();
			System.out.println(entry.getKey() + "" + entry.getValue());
		}
	}
}
