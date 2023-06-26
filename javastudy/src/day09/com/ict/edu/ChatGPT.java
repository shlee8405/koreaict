
package day09.com.ict.edu;
import java.util.*;

public class ChatGPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        
        // Create a list to store student information
        List<Student> studentList = new ArrayList<Student>();
        
        // Loop through each student and get their scores
        for (int i = 1; i <= numStudents; i++) {
            System.out.println("Enter scores for student " + i);
            System.out.print("English: ");
            int engScore = sc.nextInt();
            System.out.print("Math: ");
            int mathScore = sc.nextInt();
            System.out.print("Science: ");
            int sciScore = sc.nextInt();
            
            // Create a new student object and add it to the list
            Student student = new Student(i, engScore, mathScore, sciScore);
            studentList.add(student);
        }
        
        // Calculate the average score for each student and sort the list in descending order
        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Float.compare(s2.getAverageScore(), s1.getAverageScore());
            }
        });
        
        // Print out the index, average score, and sorted list of students
        System.out.println("\nIndex\tAverage Score");
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            System.out.printf("%d\t%.2f\n", student.getIndex(), student.getAverageScore());
        }
    }
}

class Student {
    private int index;
    private int engScore;
    private int mathScore;
    private int sciScore;
    
    public Student(int index, int engScore, int mathScore, int sciScore) {
        this.index = index;
        this.engScore = engScore;
        this.mathScore = mathScore;
        this.sciScore = sciScore;
    }
    
    public int getIndex() {
        return index;
    }
    
    public float getAverageScore() {
        return (float) (engScore + mathScore + sciScore) / 3;
    }
}