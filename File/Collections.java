import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collections {    

    public static void main(String[] args) {
        Teacher t1= new Teacher(1,"t1","d1");
        Teacher t2= new Teacher(2,"t2","d2");
        Teacher t3= new Teacher(3,"t3","d2");
        Teacher t4= new Teacher(4,"t4","d2");

        List<Teacher> teachers= new ArrayList<>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);

        System.out.println( teachers.stream().collect(Collectors.groupingBy(Teacher::getDepartment, Collectors.toList())));
    }
}

class Teacher{
    int id;
    String name;
    String department;

    public Teacher(int id, String name, String department){
        this.id=id;
        this.name=name;
        this.department=department;
    }

    public String getDepartment(){
        return department;
    }

    @Override
    public String toString() {
        return id+ name+ department;
    }
}
