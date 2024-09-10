package midterm.cau1;

public class DiscreteSignal implements Signal {
    private double amplitude;
    private double frequency;
    private double period;
    private double wavelength;
    private int[] signalValues;

    public DiscreteSignal(double amplitude, double frequency, double period, double wavelength, int[] signalValues) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.period = period;
        this.wavelength = wavelength;
        this.signalValues = signalValues;
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

    public int calculateSignalAt(int n) {
        if (n >= 0 && n < signalValues.length) {
            return signalValues[n];
        } else {
            return 0;
        }
    }

    public void displaySignal() {
        for (int i = 0; i < signalValues.length; i++) {
            System.out.println("x[" + i + "] = " + calculateSignalAt(i));
        }
    }
}
