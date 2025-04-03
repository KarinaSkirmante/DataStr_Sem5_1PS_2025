package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

import model.City;

public class MainService {

	public static void main(String[] args) {
		System.out.println("---------------------------------------");
		System.out.println("----------------HASHMAP----------------");
		System.out.println("---------------------------------------");
		System.out.println();
		
		HashMap<String, City> myHashMap = new HashMap<>();
		
		myHashMap.put("Ventspils", new City("Ventspils", 57.97f, 37057, "Vītoliņš"));
		myHashMap.put("Rīga", new City("Rīga", 307.2f, 605273, "Ķirsis"));
		myHashMap.put("Talsi", new City("Talsi", 7.85f, 36598 , "Aboliņš"));
		
		System.out.println("---------------VISAS ATSLĒGAS-------------------------");
		System.out.println(myHashMap.keySet());
		
		System.out.println("---------------IEGŪT PILSĒTU-------------------------");
		System.out.println(myHashMap.get("Ventspils"));
		System.out.println(myHashMap.get("Liepāja"));//dati neeksistē, tāpēc būs null
		
		System.out.println("---------------IZDZĒST PILSĒTU-------------------------");
		myHashMap.remove("Ventspils");
		System.out.println(myHashMap.get("Ventspils"));//te būs null, jo Ventspils ir izdzēsta
		
		
		System.out.println("---------------IEGŪT VISUS DATUS AR ATSLĒGĀM-------------------------");
		System.out.println(myHashMap.entrySet());
		
		System.out.println("---------------IEGŪT PILSĒTU (DAŽĀDI VARIANTI)-------------------------");
		myHashMap.put("Ventspils", new City("Ventspils", 57.97f, 37057, "Vītoliņš"));
		myHashMap.put("Ventspils", new City("Liepāja",68.02f, 67088, "Ansiņš"));
		System.out.println(myHashMap.get("Ventspils"));//dabūsim Liepāju, jo Liepāja ir saglabata pāri ventspilīj iekš Ventspils atslēgas
	
		
		myHashMap.put(null, new City());//testa pilsētu ielikt zem null atslegas
		System.out.println(myHashMap.get(null));//iegūsim testa pilsētu
		
		
		System.out.println("---------------IEGŪT VISUS DATUS AR ATSLĒGĀM-------------------------");
		System.out.println(myHashMap.entrySet());
		
		HashMap<String, ArrayList<City>> myHashMap2 = new HashMap<>();
		
		myHashMap2.put("Kurzeme", new ArrayList<>(Arrays.asList(
				myHashMap.get("Ventspils"),
				myHashMap.get("Talsi")
				)));
		
		myHashMap2.put("Vidzeme", new ArrayList<>(Arrays.asList(
				myHashMap.get("Rīga")
				)));
		
		System.out.println("---------------IEGŪT VISAS KURZEMES PILSĒTAS------------------------");
		System.out.println(myHashMap2.get("Kurzeme"));
		System.out.println();	
		System.out.println("---------------------------------------");
		System.out.println("----------------HASHTABLE--------------");
		System.out.println("---------------------------------------");
		System.out.println();
		
		
		Hashtable<String, City> myHashTable = new Hashtable<>();
		
		myHashTable.put("Ventspils", new City("Ventspils", 57.97f, 37057, "Vītoliņš"));
		myHashTable.put("Rīga", new City("Rīga", 307.2f, 605273, "Ķirsis"));
		myHashTable.put("Talsi", new City("Talsi", 7.85f, 36598 , "Aboliņš"));
		System.out.println("---------------IEGŪT PILSĒTU-------------------------");
		System.out.println(myHashTable.get("Talsi"));
		System.out.println("---------------IZDZĒST PILSĒTU-------------------------");
		myHashTable.remove("Rīga");
		System.out.println(myHashTable.get("Rīga"));//null
		System.out.println("---------------VISAS ATSLĒGAS-------------------------");
		System.out.println(myHashTable.keySet());
		
		myHashTable.put("Liepāja", null);//HashTable gadījuma būs izmests izņēmums
		
	}

}
