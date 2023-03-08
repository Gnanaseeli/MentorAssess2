package mentorAssessment;

import java.util.Stack;

public class Decode {
    
    public static String decode(String sequence) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i <= sequence.length(); i++) {
            stack.push(i + 1);
            
            if (i == sequence.length() || sequence.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String sequence1 = "IIDDIDID";
        String sequence2 = "IDIDII";
        String sequence3 = "DDDD";
        String sequence4 = "IIII";
        
        System.out.println(decode(sequence1)); // O/p: 125437698
        System.out.println(decode(sequence2)); // O/p: 1325467
        System.out.println(decode(sequence3)); // O/p: 54321
        System.out.println(decode(sequence4)); // O/p: 12345
    }
}
