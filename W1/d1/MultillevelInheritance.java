package W1.d1;

public class MultillevelInheritance {
    public static void main(String args[]) {
        level1 l = new level4();

        System.out.println(l.a);
    }
}

class level1{

    int a;
    public level1() {
        a=1;
    }
    
}

class level2 extends level1{
    public level2(){
        a=2;
    }
}

class level3 extends level2{
    public level3(){
        a=3;
    }
}

class level4 extends level3{
    public level4(){
        a=4;
    }
}


