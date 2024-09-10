package cau2;

public class Radar {
    // Phương thức tính toán tín hiệu x(n) theo công thức [2]
    public double calculateRadarSignal(int n) {
        if (n >= 0 && n <= 15) {
            return 1 - ((double)n / 15);
        }
        return 0;
    }

    // Phương thức hiển thị tín hiệu rời rạc từ n1 tới n2
    public void displayRadarSignal(int n1, int n2) {
        for (int n = n1; n <= n2; n++) {
            System.out.println("Radar Signal x[" + n + "] = " + calculateRadarSignal(n));
        }
    }
}