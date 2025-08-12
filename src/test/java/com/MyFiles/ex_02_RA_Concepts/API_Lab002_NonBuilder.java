package com.MyFiles.ex_02_RA_Concepts;

public class API_Lab002_NonBuilder {

    public void step1(){
        System.out.println("step1");
    }

    public void step2(){
        System.out.println("s2");
    }

    public void step3(String param1){
        System.out.println("s3");
    }

    public static void main(String[] args) {
        API_Lab002_NonBuilder nbp = new API_Lab002_NonBuilder();
    //FOr NON buidler pattern you cant use . . . like when().log().All()
        nbp.step3("ss");
        nbp.step1();
        nbp.step2();


    }
}
