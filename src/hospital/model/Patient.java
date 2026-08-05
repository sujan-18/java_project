package com.hospital;

public class Patient{
    private int patientID;
    private int age;
    private String name;
    private String problem;

    public Patient(String name, int age, String problem){
        this.name = name;
        this.age = age;
        this.problem = problem;
    }

    public Patient(int patientID, String name, int age, String problem){
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.problem = problem;
    }

    public int getPatientID(){
        return patientID;
    }

    public void setPatientID(int patientID){
        this.patientID = patientID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getProblem(){
        return problem;
    }

    public void setProblem(String problem){
        this.problem = problem;
    }

    public void displayPatientDetails(){
        System.out.println("________________________");
        System.out.println("Patient ID: "+ patientID);
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Problem: "+ problem);
        System.out.println("________________________");
    }

    public String toString(){
        return "Patient {" + "Patient ID = " + patientID + "name = "+ name + " ,age = " + age + " ,problem = "+ problem + " }";
    }
}

