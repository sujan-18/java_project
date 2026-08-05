package hospital.resources;

import java.util.concurrent.atomic.AtomicInteger;

public class PatientCounter {
    private int unsafeCounter = 0;
    private int synchronizedCounter = 0;
    private AtomicInteger atomicCounter = new AtomicInteger(0);

    //This method can produce a race condition
    public int getUnsafePatientId(){
        int currentValue = unsafeCounter;

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();}

            unsafeCounter = currentValue + 1;
            return unsafeCounter;
    }

    //Only one thread can access this method at a time
    public synchronized int getSynchronizedPatientId(){
        synchronizedCounter++;
        return synchronizedCounter;
}

//Thread-safe Counter without synchronized
    public int getAtomicPatientId(){
        return atomicCounter.incrementAndGet();
    }

    public int getUnsafeCounter() {
        return unsafeCounter;
    }

    public int getSynchronizedCounter() {
        return synchronizedCounter;
    }

    public int getAtomicCounter() {
        return atomicCounter.get();
    }
}
