package hospital.task;

import hospital.model.Patient;
import hospital.resources.PatientCounter;

public class PatientRegistrationTask implements Runnable{

    private Patient patient;
    private PatientCounter patientCounter;

    public PatientRegistrationTask(Patient patient, PatientCounter patientCounter) {
        this.patient = patient;
        this.patientCounter = patientCounter;
    }

    @Override
    public void run() {
        // Simulate patient registration process
        int patientId = patientCounter.getAtomicPatientId();
        patient.setPatientId(patientId);

        System.out.println(
            patient.getName() 
            + "registered by "
            + Thread.currentThread().getName()
            + " with Patient ID: "
            + patientId
        );
    }
}