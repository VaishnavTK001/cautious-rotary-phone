public class OperatorPrecedence {
    public static void main(String[] args) {
        
        int result1 = 10 + 5 * 2;
        System.out.println("Result1 (10 + 5 * 2): " + result1);
        // Explanation: 5 * 2 = 10, then 10 + 10 = 20

        int result2 = (10 + 5) * 2;
        System.out.println("Result2 ((10 + 5) * 2): " + result2);
        // Explanation: 10 + 5 = 15, then 15 * 2 = 30

        int result3 = 20 / 1 + 2 * 3;
        System.out.println("Result3 (20 / 1 + 2 * 3): " + result3);
        // Explanation: 20 / 1 = 20, 2 * 3 = 6, then 20 + 6 = 26

        int result4 = 20 / (1 + 2) * 3;
        System.out.println("Result4 (20 / (1 + 2) * 3): " + result4);
        // Explanation: 1 + 2 = 3, then 20 / 3 = 6 (integer division), then 6 * 3 = 18
    }
}
