package pl.bonus.zad2_pdf_java_zaawansowana;

public class Bridge {

    public synchronized void driveThrough(Car car) {
        System.out.println("Driving " + car);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished " + car);
    }

}
