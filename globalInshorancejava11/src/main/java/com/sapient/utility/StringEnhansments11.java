package com.sapient.utility;

import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class StringEnhansments11 {

    public static void main(String[] args){
//        test string in property file

        ResourceBundle resource=ResourceBundle.getBundle("db");
        System.out.println(resource.getString("url"));

//        java11
//        isblank
        System.out.println(resource.getString("url").isBlank());
        System.out.println(resource.getString("url").isEmpty());
        System.out.println(resource.getString("url").repeat(4));

        List<String> values= resource.getString("data")
                .lines().collect(Collectors.toList());
        values.stream().forEach(System.out::println);

    }
}
