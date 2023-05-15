package W4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1,"One",22));
        products.add(new Product(2,"Two",100));
        products.add(new Product(3,"Three",222));
        products.add(new Product(4,"wedkjni",99));
        products.add(new Product(5,"kdbefi",32122));

        List<String> expensiveProductsName= products.stream().filter(p -> p.price >=100).map(p-> p.name).collect(Collectors.toList());

        List<Product> expensiveProducts= products.stream().filter(p -> p.price >100).collect(Collectors.toList());

        List<Integer> sorted =products.stream().map(p-> p.price).sorted().collect(Collectors.toUnmodifiableList());

        Object[] myProducts= products.stream().map(p-> p.id).toArray();

        System.out.println(products.stream().map(p-> p.price).reduce(0,(p1,p2)->p1+p2));

        System.out.println(products.stream().filter(p -> p.price >=100).count());

        System.out.println(products.stream().filter(p -> p.price >=100).max((a,b)->a.price-b.price).get());

        expensiveProductsName.forEach(p->{ System.out.print(p+ "  ");});
        System.out.println(" ");

        expensiveProducts.forEach(p->
        {
            System.out.print(p.toString());
        }
        );

        sorted.forEach(p->{ System.out.print(p+ "  ");});
        System.out.println(" ");

        System.out.print(myProducts.toString().indexOf(99) +"\n");
        System.out.println(" ");

        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");
 
        Stream.concat(list1.stream(), list2.stream()).forEach(str ->System.out.print(str + " "));


    }
}

class Product{  
    int id;  
    String name;  
    int price;  
    public Product(int id, String name, int price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  id+ " "+ name+ " "+ price+ "\n";
    }
}  
