package com.sapient.facades;

import com.sapient.models.Claim;

import java.util.Comparator;
//THIS IS NOT USED, ANONYMOUS SORT INTERFACE IS USED INSTED
    public class SortClaim implements Comparator<Claim> {

        @Override
        public int compare(Claim o1, Claim o2) {
            return o1.getCalimDate().compareTo(o2.getCalimDate());
        }
    }
