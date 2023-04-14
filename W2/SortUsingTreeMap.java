package W2;

import java.util.*;

class Student {
    int rollno;
    String name, address;

    public Student(int rollno, String name, String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    public String toString()
    {
        return this.rollno + " " + this.name + " "
            + this.address;
    }
}

class Sortbyroll implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        return  b.rollno - a.rollno;
    }
}

public class SortUsingTreeMap {
    public static void main(String[] args)
    {
        TreeMap<Student, Integer> tree_map
            = new TreeMap<Student, Integer>(
                new Sortbyroll());
        tree_map.put(new Student(1, "bbbb", "a"), 1);
        tree_map.put(new Student(3, "aaaa", "b"), 2);
        tree_map.put(new Student(2, "cccc", "c"), 3);
        System.out.println(tree_map);
    }
}
