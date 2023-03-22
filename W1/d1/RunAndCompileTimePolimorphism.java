package W1.d1;

public class RunAndCompileTimePolimorphism{

    public static int add(int x, int y){
        return x+y;
    }
 
    public static double add(double x, double y){
        return x+y;
    }

    public void CompileTime(){
        System.out.println("Parent class print");
    }


    public static void main(String args[]){
        System.out.println("Runtime Polymorphism:");
        System.out.println(44+5);
        System.out.println(43.5+21.1);

        RunAndCompileTimePolimorphism child = new ChildCompileTimePoli();
        child.CompileTime();
    }
}

class ChildCompileTimePoli extends RunAndCompileTimePolimorphism{
    public void CompileTime(){
        System.out.println("Child class print");
    }

}