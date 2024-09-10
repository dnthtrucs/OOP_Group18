package midterm2;
public class DiscreteSignal {
    private int[] xk; // Mảng chứa các giá trị tín hiệu x(k)

    // Constructor để khởi tạo tín hiệu rời rạc
    public DiscreteSignal(int[] xk) {
        this.xk = xk;
    }

    // Phương thức tính dãy xung đơn vị δ(n)
    private int unitImpulse(int n) {
        return (n == 0) ? 1 : 0;
    }

    // Phương thức tính tín hiệu rời rạc x(n) theo công thức [1]
    public int calculateSignal(int n) {
        int sum = 0;
        for (int k = 0; k < xk.length; k++) {
            sum += xk[k] * unitImpulse(n - k);
        }
        return sum;
    }

    // Phương thức hiển thị tín hiệu rời rạc từ n1 tới n2
    public void displaySignal(int n1, int n2) {
        for (int n = n1; n <= n2; n++) {
            System.out.println("x[" + n + "] = " + calculateSignal(n));
        }
    }
}
