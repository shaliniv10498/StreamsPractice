package streamsPractice.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeStreams {

	public static <R> void main(String[] args) {
		//------------------Example1--------------------------------------
		List<String> list = Arrays.asList("tesst1","test2","test3","abc");
		
		list.stream().filter(s->s.startsWith("test")).forEach(System.out::println);
		//------------------------------------------------------------------------
		
		//-------------------Example2---------------------------------------------
		List<Integer> intObj = new ArrayList<>();
		intObj.add(1);
		intObj.add(2);
		intObj.add(3);
		intObj.add(4);
		intObj.add(5);
		
		long sum =  intObj.stream().map(i->i*i).filter(i->i>10).count();
		
		System.out.println(sum);
		//-------------------------------------------------------------------------
		
		//-------------------------------Example3----------------------------------
		
		Set<String> setContainingA = Stream.of("a1","b1","c1","am1","az2","d1","e1")
		.sorted(Comparator.reverseOrder())
		.filter(s-> s.startsWith("a"))
		.collect(Collectors.toSet());
		
		setContainingA.forEach(System.out::println);
		//--------------------------------------------------------------------------
		
		//-----------------------------Example 4-----------------------------------
		HashMap<Object,Object> hashMap =  new HashMap<>();
		hashMap.put("key1", "value123");
		hashMap.put("keyTestObj", "mp123");
		hashMap.put("keyTesting2", "level123");
		hashMap.put("square", 2);
		hashMap.put("cubic", 3);
		
		
//	    HashMap<Object,Object> ha= hashMap.entrySet().stream().filter(k -> k.getKey().size() == size)
//	    		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (prev,next)->next ,HashMap::new
//	    			));
//	    
		
		//----------------------------------------------------------------------------
		
		//-----------------------------------------Example 5-------------------------
		
		Object welcomeMsg = Stream.of("Hi","Shalini","Welcome","to","Streams","Concept")
		.reduce((s1,s2)->s1+" "+s2);
		
		System.out.println(welcomeMsg);
		
		
		
		//--------------------------------------------------------------------------
		
	}

}
