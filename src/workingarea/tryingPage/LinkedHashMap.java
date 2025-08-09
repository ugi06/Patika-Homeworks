package workingarea.tryingpage;

import java.util.Map;

public class LinkedHashMap {

    public static void main(String[] args) {
        Map<String,String> myFirstLinkedHashMap = new java.util.LinkedHashMap<>();

        myFirstLinkedHashMap.put("Uğur","Taşdelen");

        myFirstLinkedHashMap.put("Hanife","Taşdelen");

        myFirstLinkedHashMap.put("Hasan","Taşdelen");

        myFirstLinkedHashMap.put("Rosanna","Taşdelen");

        System.out.println(myFirstLinkedHashMap);

        for (Map.Entry<String,String> entry : myFirstLinkedHashMap.entrySet()){

            System.out.println(entry.getKey());

            System.out.println(entry.getValue());

            System.out.println(entry.hashCode());

        }

    }
}
