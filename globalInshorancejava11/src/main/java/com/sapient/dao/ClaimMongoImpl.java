package com.sapient.dao;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.sapient.facades.ClaimFacade;
import com.sapient.models.Claim;
import com.sapient.models.Vehicle;

import java.io.IOException;

public class ClaimMongoImpl implements ClaimFacade {


    private MongoClient mongoClient;
    private boolean status;
    private MongoCollection mongoCollection;
    public ClaimMongoImpl(){
        mongoClient=MongoClient.getCollection();
//        create db
        var database= mongoClient.getDatabase("globalingurancedc");
        database.createCollection("claims");
        mongoCollection=database.getCollection("claims");
    }
    @Override
    public boolean addClaim(Claim claim) {
        mongoCollection.insertOne(claim);
        status = true;
        return status;
    }
}
