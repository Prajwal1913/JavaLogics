package Collections;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class Realtimeexample {
public static void main(String[] args) {
	TreeSet<String> t = new TreeSet<String>();
	t.add("Bengaluru");
	t.add("tumkur");
	t.add("Davanagere");
	t.add("Mysuru");
	t.add("Mandya");
	TreeSet<String> t2 = new TreeSet<String>();
	t2.add("Alapee");
	t2.add("eduki");
	t2.add("Munnar");
	t2.add("wainad");
	t2.add("Varkala");
	TreeMap<String, TreeSet<String>> q= new TreeMap<String, TreeSet<String>>();
	q.put("Karnataka",t);
	q.put("Kerala",t2);
//	for(Entry<String, TreeSet<String>> a: q.entrySet()){
//		System.out.println("State : " + a.getKey() + " district --> " + a.getValue());
//	}
//	
	boolean f = true;
	for(Entry<String, TreeSet<String>> a : q.entrySet()){
		if(a.getValue().contains("Munnar"))
		{
			System.out.println(a.getKey());
			f=false;
		}
	}
	if(f==true)
	{
		System.out.println("NO DATA");
	}
}
}















