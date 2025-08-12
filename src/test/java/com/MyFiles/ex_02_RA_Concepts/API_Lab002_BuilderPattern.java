package com.MyFiles.ex_02_RA_Concepts;

public class API_Lab002_BuilderPattern {
    public API_Lab002_BuilderPattern Step1(){
        System.out.println("s1");
        return this;
    }
    public API_Lab002_BuilderPattern Step2(){

        System.out.println("s1");
        return this;
    }
    public API_Lab002_BuilderPattern Step3(int i){
        System.out.println(i);
        return this;
    }
    //create instance
    public static void main(String[] args) {
        API_Lab002_BuilderPattern bp = new API_Lab002_BuilderPattern();
        bp.Step1().Step2().Step3(2);
        bp.Step2().Step1().Step3(1);
    }
}
