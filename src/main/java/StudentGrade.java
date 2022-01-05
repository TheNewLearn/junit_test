import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentGrade {
    public static void main(String[] args) {
        System.out.print("Enetr the score = ");
        try {
            int score;
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            score = Integer.parseInt(br.readLine());
            Student student = new Student(score);
            String grade = student.checkgrade();
            System.out.println("The grade of " + score + " is " + grade);
        } catch (NumberFormatException ex) {
            System.out.println("Not an integer!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
