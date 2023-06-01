package com.sapient.utility;

import com.sapient.Main;
import com.sapient.facades.ClaimFacade;
import com.sapient.facades.PaymentImp;
import com.sapient.models.Claim;
import com.sapient.models.Vehicle;

import java.io.IOException;
import java.time.LocalDate;
import java.util.function.*;

public class ClaimApp {

    public  static void main(String[] args) throws IOException {

        Claim claim=new Claim(324,332,3332,
                LocalDate.of(2022,2,1));

        //lambda expression
        ClaimFacade claimFacade=(claimObj, vehiclsObj)->{
            if(vehiclsObj.getModel().startsWith("H")){
                return claimObj.getCalimDate().isBefore(LocalDate.now());
            }
            return false;
        };

        claimFacade.addClaim(claim, new Vehicle("TN-82-22","Honda"));

//        inbuild functional interface
        Function<Claim,Boolean> function=(claimObj)->{
            return claimObj.getClaimNo()>100;
        };

        System.out.println(function.apply(claim));

//        bifunction: 2 inputs an 1 output
        BiFunction<Claim, Claim, Boolean> biFunction=(claim1,claim2)->{
            return claim1.getCalimDate().isBefore(claim2.getCalimDate());
        };

        System.out.println(biFunction.apply(claim, new Claim(232,9999,
                1232132312,
                LocalDate.now().minusMonths(3))));

        Consumer<Claim[]> consumer=(claims)->{
            for(Claim claimObj : claims){
                System.out.println(claimObj);
            }
        };

        consumer.accept(Main.createClaims());

//        default impl
        PaymentImp paymentImp=new PaymentImp();
        System.out.println(paymentImp);

        //    supplier
        Supplier<Long> supplier= ClaimFacade::getOTP;
        supplier.get();

        Predicate<Claim> predicate=(claimObj)->{
            return claimObj.getClaimNo()>0;
        };

        System.out.println(predicate.test(new Claim(-222,34244,13222,
                LocalDate.now().minusMonths(2))));

    }
}
