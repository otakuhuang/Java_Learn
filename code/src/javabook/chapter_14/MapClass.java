package chapter_14;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Emp emp = new Emp(14, "小黄");
        Emp emp2 = new Emp(15, "小明");
        map.put(emp.getId(), emp.getName());
        map.put(emp2.getId(), emp2.getName());
        map.remove(15);
        System.out.println(map);
    }
}

class Emp {

    private int id;
    private String name;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
