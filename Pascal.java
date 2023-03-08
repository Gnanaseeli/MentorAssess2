package mentorAssessment;
import java.util.*;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = sc.nextInt();
        List<List<Integer>> triangle = generate(numRows);
        System.out.println("Pascal's triangle with " + numRows + " rows:");
        System.out.println(triangle);
    }
    
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(1));
        
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                List<Integer> prevRow = triangle.get(i - 1);
                int sum = prevRow.get(j - 1) + prevRow.get(j);
                row.add(sum);
            }
            row.add(1);
            triangle.add(row);
        }
        
        return triangle;
    }
}
