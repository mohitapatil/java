package com.sapient.models;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Claim {

    private long claimNo;
    private  long policyNo;
    private  long claimAmount;
    private LocalDate calimDate;

}
