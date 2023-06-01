package com.sapient.utility;

import com.sapient.exceptions.PasswordException;
import com.sapient.models.Claim;
import com.sapient.models.CustomerVO;

public class MulticatchException {

    public static void main(String[] args){
//        int size=1;
//        Claim[] claim=new Claim[size];
//        try{
//            try{
//                claim[size]=new Claim();
//                System.out.println(claim[0].getClaimAmount());
//            }
//            catch (NullPointerException | ArithmeticException exception) {
//
//            }
//            System.out.println("Printing outer block");
//        }catch (NegativeArraySizeException negativeArraySizeException){
//
//        }

//        test password
        CustomerVO customerVO=new CustomerVO();
        customerVO.setUserName("mohit");
        try {
            customerVO.setPassword("$123");
        }
        catch (PasswordException e){
            e.printStackTrace();
            System.out.println("NOT able to continue");
        }
        System.out.println("able to continue");


        /*
        catch (NullPointerException nullPointerException){
            nullPointerException.printStackTrace();
            for(StackTraceElement stackTraceElement:
            nullPointerException.getStackTrace()){
                System.out.println(stackTraceElement.getClassName());
                System.out.println(stackTraceElement.getLineNumber());
                System.out.println(stackTraceElement.getMethodName());
                System.out.println(stackTraceElement.getClass().getName());
            }
        }
        catch (Exception exception){
            exception.printStackTrace();
            for(StackTraceElement stackTraceElement:
                    exception.getStackTrace()){
                System.out.println(stackTraceElement.getClassName());
                System.out.println(stackTraceElement.getLineNumber());
                System.out.println(stackTraceElement.getMethodName());
                System.out.println(stackTraceElement.getClass().getName());
            }
            */
    }
}
