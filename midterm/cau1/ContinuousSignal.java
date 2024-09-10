package cau1;

public class ContinuousSignal implements Signal {
    private double amplitude;
    private double frequency;
    private double period;
    private double wavelength;

    public ContinuousSignal(double amplitude, double frequency, double period, double wavelength) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.period = period;
        this.wavelength = wavelength;
    }

    @Override
    public double getAmplitude() {
        return amplitude;
    }

    @Override
    public double getFrequency() {
        return frequency;
    }

    @Override
    public double getPeriod() {
        return period;
    }

    @Override
    public double getWavelength() {
        return wavelength;
    }

    public double calculateSignalAt(double t) { //tính giá trị của tín hiệu tại thời điểm t
        return amplitude * Math.sin(2 * Math.PI * frequency * t);
    }

    public void displaySignal(double startTime, double endTime, double step) { //in ra giá trị của tín hiệu tại các thời điểm từ startTime đến endTime với bước thời gian step
        for (double t = startTime; t <= endTime; t += step) {
            System.out.println("x(" + t + ") = " + calculateSignalAt(t));
        }
    }
}