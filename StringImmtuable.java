package mentorAssessment;
public class StringImmtuable {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1;
        str1 = str1 + " World";

        System.out.println("str1: " + str1); // Hello World
        System.out.println("str2: " + str2); // Hello
    }
}
