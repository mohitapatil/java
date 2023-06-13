package com.sapient.models;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.sonatype.inject.Parameters;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.*;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class ClaimTest {

    private Claim claim;
    private static BufferedReader bufferedReader;
    private static ResourceBundle resourceBundle;
    private static String path;
    private static File file;


    @BeforeAll
    public static void createClaimInstance(){
    resourceBundle= ResourceBundle.getBundle("db");
        path=resourceBundle.getString("path");
        file=new File(path,"claims.csv");
        try{
            bufferedReader=new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @BeforeEach
    public void beforeEachTest(){
        claim= new Claim();
    }

//    @Test
    @RepeatedTest(2)
    @DisplayName("Claim Not Null Test")
    void claimNotNullTest(){
        assertNotNull(claim);
    }

    @ParameterizedTest
    @Tag("prod")
    @ValueSource(strings= {"445","99999","10"})
    public void claimIdNotZeroTest(String data){

        claim.setClaimNo(Integer.parseInt(data));
        assertTrue(claim.getClaimNo()>0);
    }

    @ParameterizedTest
    @Tag("dev")
    @ValueSource(strings={"2022-01-02","2022-03-04","2021-09-16"})
    public void claimDateNotCurrentDateTest(String data){

        claim.setCalimDate(LocalDate.parse(data));
        assertTrue(LocalDate.now().isAfter(claim.getCalimDate()));
    }

    @AfterEach
    public void unlinkClaimInstances(){

    }

    @AfterAll
    public void afterAllTests(){
        try {
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    @Test
    @EnabledOnOs(OS.MAC)
    void testOnMacOs() {
        assertTrue(true);
    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    void doNotTestOnWindows() {
        assertTrue(true);
    }

    @Test
    @DisabledOnJre(JRE.JAVA_8)
    void onlyOnJava8() {
        assertTrue(true);
    }

    @Test
    @EnabledOnJre({ JRE.JAVA_17, JRE.JAVA_18 })
    void onJava17Or18() {
        assertTrue(true);
    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_11)
    void notFromJava8to11() {
        assertTrue(true);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_12, max = JRE.JAVA_18)
    void fromJava12to18() {
        assertTrue(true);
    }

    @Test
    @EnabledIfSystemProperty(named = "any.system.property", matches = "value-regex*")
    public void onlyIfPropertyValueIsFound() {
        assertTrue(true);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches = ".*development.*")
    public void executeOnlyInDevEnvironment() {
        assertTrue(true);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "ENV", matches = ".*prod.*")
    public void disabledOnProdEnvironment() {
        assertTrue(true);
    }

    @Test
    @EnabledIf("customConditionalFunction")
    void enabled() {
        assertTrue(true);
    }

    @Test
    @DisabledIf("customConditionalFunction")
    void disabled() {
        assertTrue(true);
    }

    boolean customConditionalFunction() {
        return true;
    }
     */

//    @ParameterizedTest
//    @Timeout(unit= TimeUnit.SECONDS,value = 5)
//    @Tag("Prod")
//    @CsvFileSource(resources = "../../../../../main/resources/claims.csv", numLinesToSkip = 1)
//    void testWithCsvFileSource(int claimNo, int policyNo, long claimAmount, LocalDate claimDate){
//        claim.setClaimNo(claimNo);
//        claim.setPolicyNo(policyNo);
//        claim.setCalimDate(claimDate);
//        claim.setClaimAmount(claimAmount);
//        assertTrue(claim.getClaimAmount()>20000);
//    }
}
