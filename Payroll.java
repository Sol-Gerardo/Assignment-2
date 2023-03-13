package Number_5;

public class Payroll {
    public void processPayments(Worker worker) {
        double payment = worker.getHoursWorked() * worker.getHourlyRate();
        System.out.println("Payment processed for " + worker.getName() + " is " + payment);
    }
}
