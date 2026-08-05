package hospital.demo;

import hospital.resources.PatientCounter;

public class AtomicIntegerDemo {
    public static void runDemo(){

        System.out.println("\n---AtomicInteger Demo---");
        PatientCounter counter = new PatientCounter();
        Runnable registrationWork = () -> {
            for (int i = 0; i < 5; i++) {
                int Id = counter.getAtomicPatientId();
                System.out.println(Thread.currentThread().getName() + " registered patient with ID: " + Id);
            }
        };

        Thread staff1 = new Thread(registrationWork, "Thread-1");
        Thread staff2 = new Thread(registrationWork, "Thread-2");

        staff1.start();
        staff2.start();

        try {
            staff1.join();
            staff2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final Atomic Counter Value: " + counter.getAtomicCounter());
    }

}
