import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Subjects");
        int sub=sc.nextInt();
        int[] marks=new int[sub];
        int count=1;
        int Total_Marks=0;
        float average_marks;
        char grade;
        int i=0;
        for(;i<sub;i++){
            System.out.print("Enter marks of Subject "+count+" out of 100 :");
            int mark=sc.nextInt();
            if(mark>=0 && mark<101){
                marks[i]=mark;
            }
            else{
                System.out.println("Enter marks between 0 to 100");
                i--;
                continue;
            }
            count++;
        }
        for(int a:marks){
            Total_Marks+=a;
        }
        average_marks=((float) Total_Marks /(sub*100))*100;
        if(average_marks>89){
            grade='A';
        } else if (average_marks>79) {
            grade='B';
        }
        else if (average_marks>69) {
            grade='C';
        }
        else if (average_marks>59) {
            grade='D';
        }
        else if (average_marks>34) {
            grade='E';
        }
        else{
            grade='F';
        }
        System.out.println("Total Marks : "+ Total_Marks);
        System.out.println("Average Percentage : "+ average_marks+"%");
        System.out.println("Grade : "+ grade);
    }
}
