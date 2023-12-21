package Hashtable;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableExample {

    public static void main(String[] args) {
        Hashtable<String,Integer> testResult= new Hashtable<>();

        testResult.put("Maths",90);
        testResult.put("English",85);
        testResult.put("Science",80);
        testResult.put("Physics",70);
        System.out.println(" Initial Test Result: \n" + testResult );

        int scoreEnglish = testResult.get("English");
        System.out.println("I got "+scoreEnglish+ " Marks in English");

        testResult.put("English",100);
        System.out.println("After Updating English Marks to 100 updated Test Result : \n" + testResult );

        testResult.remove("Physics");
        System.out.println("After removing Physics Test Result : \n" + testResult);

        boolean isExist = testResult.containsKey("Physics");
        System.out.println("Contains Physics : " + isExist);
        boolean isExist2 = testResult.containsKey("Science");
        System.out.println("Contains Physics : " + isExist2);

        int size = testResult.size();
        System.out.println("total no of subjects : " + size );

        System.out.println(" Iterate over the testResult");
        System.out.println("KeySet :" + testResult.keySet());

        for(String key : testResult.keySet()){
            int value = testResult.get(key);
            System.out.println("Key : "+ value);
        }

        testResult.clear();
        System.out.println("testResult After Clearing : " + testResult);
    }
}

