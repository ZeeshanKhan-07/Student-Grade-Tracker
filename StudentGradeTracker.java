import java.util.Scanner;
import java.util.ArrayList;

public class StudentGradeTracker{
    //Finding Highest
    static int findHighest(ArrayList<Integer> grades){
        int highest = grades.get(0);
        for(int grade : grades){
            if(grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    //Finding Lowest
    static int findLowest(ArrayList<Integer> grades){
        int lowest = grades.get(0);
        for(int grade : grades){
            if(grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }

    //Finding Average
    static double findAverage(ArrayList<Integer> grades){
        int sum = 0;
        for(int grade : grades){
            sum += grade;
        }

        return (double) sum / grades.size();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter the number of Students:");
        int numStudents = sc.nextInt();

        for(int i = 0; i < numStudents; i++){
            System.out.println("Enter the grade for Student " + (i + 1) + " : ");
            int grade = sc.nextInt();
            grades.add(grade);
        }

        int highest = findHighest(grades);
        int lowest = findLowest(grades);
        double average = findAverage(grades);

        System.out.println("Grade Summary : ");
        System.out.println("Highest Grade is : " + highest);
        System.out.println("Lowest Grade is : " + lowest);
        System.out.println("Average Grade is : " + average);

        sc.close();
    }
}