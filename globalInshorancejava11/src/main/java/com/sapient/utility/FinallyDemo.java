package com.sapient.utility;

import com.sapient.dao.ClaimImpl;
import com.sapient.dao.CovidImp;
import com.sapient.facades.ClaimFacade;
import com.sapient.facades.CovidFacade;
import com.sapient.models.Claim;
import com.sapient.models.Vehicle;

import java.io.*;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class FinallyDemo {

    public static void main(String[] args) throws IOException {

        ClaimFacade claimFacade= new ClaimImpl("claims.csv");
        try{
            claimFacade.addClaim(new Claim(485685,34598459,
                    450000,
                    LocalDate.of(2022,2,12)),new Vehicle());
        }catch (IOException e) {

        }

        CovidFacade covidFacade=new CovidImp();
        try{
            covidFacade.getAllData("country_wise_latest.csv");
        }catch(IOException e){

        }
    }
}
