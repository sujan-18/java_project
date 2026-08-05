package hospital.model;

public class Doctor{
    private int doctorID;
    private String name;
    private String specialization;

    public Doctor(int doctorID, String name, String specialization){
        this.doctorID = doctorID;
        this.name = name;
        this.specialization = specialization;
    }

}