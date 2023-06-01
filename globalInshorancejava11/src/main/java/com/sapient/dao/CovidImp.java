package com.sapient.dao;

import com.sapient.facades.CovidFacade;

import java.io.*;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class CovidImp implements CovidFacade {

    @Override
    public void getAllData(String fileName) throws IOException {
        ResourceBundle resourceBundle= ResourceBundle.getBundle("db");
        String path=resourceBundle.getString("path");
        System.out.println(path);
        File file=new File(path,"country_wise_latest.csv");
        BufferedReader bufferedReader=null;
        List<String> fields= null;
        String line =null;
        if(file.exists()){
            System.out.println("File Exists");
            try{
                bufferedReader=new BufferedReader(new FileReader(file));
                while((line=bufferedReader.readLine())!=null){
                    fields = line.lines().collect(Collectors.toList());
                    fields.forEach(System.out::println);
//                    or
//                    System.out.ptintln(line);

//                    or
//                    fields=line.split(",");
//                    for(String field : fields)
//                        System.out.println(field+ " ");
//                    System.out.println("\n");
                }
            }
            catch (FileNotFoundException e){
                throw e;
            }catch (IOException e){
                throw e;
            }
            finally{
                bufferedReader.close();
            }

        }
        else
            System.out.println("File not found...");

    }
}
