package W1.Strings;

import java.util.*;

final class Immutable {
    private final List<Integer> list ;
    private final Date date ;

    Immutable(List<Integer> list, Date date){
        this.list=Collections.unmodifiableList(list);
        this.date=new Date(date.getTime());
    }

    public Date getDate() {
        return (Date) date.clone();
    }

    public List<Integer> getList(){
        return new ArrayList<Integer> (list);
    }

    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(12345);
        list.add(2);
        list.add(543);
        list.add(12345);
        Date date = new Date();
        Immutable imm= new Immutable(list, date);

        System.out.println(imm.getDate());
        System.out.println(imm.getList());
        imm.getList().add(99);
        imm.getDate().setTime(020103);

        System.out.println(imm.getDate());
        System.out.println(imm.getList());

    }


}
