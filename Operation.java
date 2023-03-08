package mentorAssessment;
public class Operation {
    public static void main(String[] args) {
        int n = 1;
        
        // Multiply n by 15
        int result1 = (n << 4) - n;
        System.out.println("Result 1: " + result1);
        
        // Multiply an even integer n by 7.5
        int m = 12;
        int result2 = (m << 2) + (m >> 1);
        System.out.println("Result 2: " + result2);
        
        // Calculate value of 15 * n / 16
        int result3 = ((n << 4) - n) >> 4;
        System.out.println("Result 3: " + result3);
    }
}
