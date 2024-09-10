package midterm1;

public class Main {
    public static void main(String[] args) {
        // Tạo tín hiệu rời rạc
        int[] discreteValues = {1, 2, 3, 4, 5};
        DiscreteSignal discreteSignal = new DiscreteSignal(5.0, 2.0, 1.0, 10.0, discreteValues);
        System.out.println("Tín hiệu rời rạc:");
        discreteSignal.displaySignal();

        // Tạo tín hiệu liên tục
        ContinuousSignal continuousSignal = new ContinuousSignal(5.0, 1.0, 1.0, 20.0);
        System.out.println("\nTín hiệu liên tục:");
        continuousSignal.displaySignal(0.0, 2.0, 0.1);
    }
}
