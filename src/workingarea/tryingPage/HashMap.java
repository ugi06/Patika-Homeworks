package workingarea.tryingpage;

import java.util.Map;

public class HashMap {

    public static void main(String[] args) {

        Map<String,Integer> myFirstMap = new java.util.HashMap<>();


        myFirstMap.put("ayşe",27);
        myFirstMap.put("ali",25);
        myFirstMap.put("uğur",28);

        System.out.println(myFirstMap.get("ayşe"));

        System.out.println(myFirstMap.keySet());

        System.out.println(myFirstMap.values());

        System.out.println(myFirstMap.size());

        System.out.println(myFirstMap.containsKey("roka")); // boolean tip

        System.out.println(myFirstMap.containsValue(28)); // boolean tip

        myFirstMap.remove("ali");

        System.out.println(myFirstMap);

        myFirstMap.clear();

        System.out.println(myFirstMap);



    }
}
