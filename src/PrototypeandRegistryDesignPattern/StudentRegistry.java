package PrototypeandRegistryDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<String, Student> map;

    public StudentRegistry() {
        map = new HashMap<String, Student>();
    }

    public void addStudent(String name, Student student){
        map.put(name,student);
    }

    public Student getStudent(String name){
        return map.get(name);
    }
}
