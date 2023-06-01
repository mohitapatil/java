package com.sapient.dao;

import com.sapient.facades.ClaimFacade;
import com.sapient.models.Claim;
import com.sapient.models.Vehicle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ResourceBundle;

public class ClaimImpl implements ClaimFacade {

    private String fileName;
    private boolean status;
    public ClaimImpl(String fileName) {
        this.fileName= fileName;
    }

    @Override
    public boolean addClaim(Claim claim, Vehicle vehicle) throws IOException {
        ResourceBundle resourceBundle= ResourceBundle.getBundle("db");
        String path=resourceBundle.getString("path");
        File file=new File(path,"claims.csv");
        BufferedWriter bufferedWriter=null;
        if(file.exists()){
            writeData(claim, file, bufferedWriter);
            status= true;
        }
        else{
            file.createNewFile();
            writeData(claim, file, bufferedWriter);
            status= true;
        }

        return status;
    }

    private void writeData(Claim claim, File file, BufferedWriter bufferedWriter) throws IOException{
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            bufferedWriter.write(claim.getClaimNo() + ",");
            bufferedWriter.write(claim.getPolicyNo() + ",");
            bufferedWriter.write(claim.getClaimAmount() + ",");
        } catch(IOException e){
            throw e;
        }
        finally{
            bufferedWriter.close();
        }
    }
}
