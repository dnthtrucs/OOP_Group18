package midterm.cau2;
public class Main {
    public static void main(String[] args) {
        // Tạo tín hiệu rời rạc với mảng x(k)
        int[] xk = {1, 2, 3, 4, 5};
        DiscreteSignal discreteSignal = new DiscreteSignal(xk);
        System.out.println("Discrete Signal from n = 0 to n = 5:");
        discreteSignal.displaySignal(0, 5);

        // Phân tích tín hiệu radar với mẫu [2]
        Radar radar = new Radar();
        System.out.println("\nRadar Signal from n = 0 to n = 15:");
        radar.displayRadarSignal(0, 15);
    }
}
