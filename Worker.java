package Number_5;

public class Worker {
    private String name;
    private double hourlyRate;
    private double hoursWorked;

    public Worker(String name, double hourlyRate, double hoursWorked) {
        this.setName(name);
        this.setHourlyRate(hourlyRate);
        this.setHoursWorked(hoursWorked);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
