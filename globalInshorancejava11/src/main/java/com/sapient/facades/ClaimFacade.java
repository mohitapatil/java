package com.sapient.facades;

import com.sapient.models.Claim;
import com.sapient.models.Vehicle;

import java.io.IOException;
import java.util.Random;
import java.util.function.Supplier;

public interface ClaimFacade {

    default boolean addClaim(Claim claim, Vehicle vehicle) throws IOException {
        return false;
    }
//    Claim updateClaim(Claim Claim);
//    boolean deleteClaim(long claimId);

    static long getOTP(){
        return new Random().nextInt(10000);
    }

}
