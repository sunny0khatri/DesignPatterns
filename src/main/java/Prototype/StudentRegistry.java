package Prototype;

import java.util.HashMap;

public class StudentRegistry{

    private HashMap<String,Student> mp=new HashMap<>();

    public void register(String key, Student st){
        mp.put(key,st);
    }

    public Student get(String key){
        return mp.getOrDefault(key,null);
    }
}



