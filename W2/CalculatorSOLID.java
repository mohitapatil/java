package W2;

import java.util.*;

// Abstract
interface Operation{
    public int execute();
} 

// Marker interface
interface CalculatorInterface {

}

class Addition implements Operation{
    int x,y;
    public Addition(int i, int j) {
        this.x=i;
        this.y=j;
    }

    public int execute(){
        return x+y;
    }
}

class Substract implements Operation{
    int x,y;
    public Substract(int i, int j) {
        this.x=i;
        this.y=j;
    }

    public int execute(){
        return x-y;
    }
}

class Calculator implements CalculatorInterface{
    // Openclose - extend functionality without changing code
    // now any type of operation can be added in Calculator 
    // without changing this class
    List<Operation> operations;

    int ans=0;

    public Calculator(){
        this.operations = new ArrayList<Operation>();
    }

    public void addOperation(Operation operation){
        operations.add(operation);
    }

    public int performOperation(){
        
        // if + call Addition
        // if - call Substraction
        for(Operation ope: operations){
            ans =ope.execute();
            System.out.println(ans);
        }

        return ans;
    }
}

public class CalculatorSOLID {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Operation addition = new Addition(2,6);
        Operation substraction = new Substract(5,2);
        calc.operations.add(addition);
        calc.operations.add(substraction);

        calc.performOperation();
    }
}
