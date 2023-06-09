package com.sapient.utility;

import com.sapient.models.Claim;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ClaimAppStream {

    public static List<Claim> createClaims(){
        List<Claim>claimList=new ArrayList<Claim>();
        Claim claim=null;
        for(int i=0;i<100;i++){
            claim=new Claim();
            claim.setClaimNo(new Random().nextInt(10000));
            claim.setPolicyNo(new Random().nextInt(10000));
            claim.setClaimAmount(new Random().nextInt(1000000));
            claim.setCalimDate(LocalDate.of(1990+ new Random().nextInt(30),
                    1+new Random().nextInt(11),
                    1+new Random().nextInt(28)));
            claimList.add(claim);
        }
        return claimList;

    }
    public static void main(String[] args){

//        get the claims below 2 lakhs
        List<Claim> filteredClaims =createClaims().stream().filter(c->(c.getClaimAmount()<200000))
                .collect(Collectors.toList());

//        sort the filtered claim by date
        filteredClaims.stream()
                .sorted((c1,c2)->c1.getCalimDate()
                        .compareTo(c2.getCalimDate()))
                .forEach(System.out::println);

        System.out.println("   ........    ");
//        Sort by claim No i.e claim Id.
        filteredClaims.stream().sorted((c1,c2)->{
            if(c1.getClaimNo() > c2.getClaimNo())
                return 1;
            else if (c1.getClaimNo()<c2.getClaimNo()) {
                return -1;
            }
            else
                return 0;
        }
        ).forEach(System.out::println);
    }
}
