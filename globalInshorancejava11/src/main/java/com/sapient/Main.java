package com.sapient;

import com.sapient.facades.ClaimFacade;
import com.sapient.facades.SortClaim;
import com.sapient.models.Claim;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public  static Claim[] createClaims(){
        Claim[] claims= new Claim[3];
        for(int i=0;i<3;i++){
            claims[i]=new Claim();
            claims[i].setClaimNo(new Random().nextInt(10000));
            claims[i].setPolicyNo(new Random().nextInt(1000));
            claims[i].setClaimAmount(new Random().nextInt(100000));
            claims[i].setCalimDate(LocalDate.of(2022,1+new Random().nextInt(10),
                    1+ new Random().nextInt(26)));
        }
        return claims;
    }
    public static void main(String[] args) {

//        System.out.println("These are the claims, before sorting");
//        Claim[] calims= createClaims();
//        for(Claim claim: claims){
//            System.out.println(claim);
//        }
//
//        System.out.println("After sorting by claim date...");
//////        interface with anonymous
////        Arrays.sort(claims, new Comparator<Claim>() {
////            @Override
////            public int compare(Claim o1, Claim o2) {
////                return o1.getCalimDate().compareTo(o2.getCalimDate());
////            }
////        });
//
////        lambda expression
//        Comparator<Claim> comparator=(o1,o2)->{
//            return o1.getCalimDate().compareTo(o2.getCalimDate());
//        };
//
//        Arrays.sort(claims, comparator);
//
//        for(Claim claim: claims){
//            System.out.println(claim);
//        }


////        anonumious onject creation
//        Runnable runnable= new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };
    }
}