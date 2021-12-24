package collection_demo;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> hashSet= new HashSet();

        hashSet.add("Java");
        hashSet.add("Spring and Spring Boot");
        hashSet.add("Cloud");
        hashSet.add("Java");
        hashSet.add("Cloud");

        for (String var: hashSet){

            System.out.println("Printing Set: "+var);
        }

        HashSet <Integer> integerHashSet= new HashSet<>();
        integerHashSet.add(33);
        integerHashSet.add(44);
        integerHashSet.add(33);
        integerHashSet.add(33);
        integerHashSet.add(44);
        integerHashSet.add(33);
        integerHashSet.add(44);

        for (Integer var: integerHashSet){
            System.out.println("Printing Integer Set: "+var);
        }

    }
}
