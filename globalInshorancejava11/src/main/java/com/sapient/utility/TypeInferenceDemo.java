package com.sapient.utility;

import com.sapient.models.Claim;
import lombok.NonNull;

import java.time.LocalDate;
import java.util.stream.Collectors;

public class TypeInferenceDemo {

    public static void main(String[] args){
        //    class type inference
        var claim=new Claim(389,8928,4555,
                LocalDate.of(2022,2,11));
        System.out.println(claim);



//        Lambda type inferene
        var result=  ClaimAppStream.createClaims().stream()
                .filter((@NonNull var x)->x.getCalimDate()
                .isBefore(LocalDate.now())).
                map((var x)->x.getCalimDate().toString())
                .collect(Collectors.joining(","));
        System.out.println(result);


    }
}
