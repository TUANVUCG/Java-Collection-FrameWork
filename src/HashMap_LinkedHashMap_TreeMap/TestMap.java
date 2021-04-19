package HashMap_LinkedHashMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {

        // HashMap
        Map<String ,Integer > studentsHash = new HashMap<>();
        studentsHash.put("Tú", 30);
        studentsHash.put("Kiên",22);
        studentsHash.put("Hiệp",20);
        studentsHash.put("Vũ",27);
        System.out.println(studentsHash+"\n");

        System.out.println("TreeMap");
        Map<String, Integer> studentTree = new TreeMap<>(studentsHash);
        System.out.println(studentTree);
    }

}
