import java.util.*;
class StudentGrade
{
    public static void main(String args[])
    {
        int TotalMarks=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no of subjects ");
        int Subjects=sc.nextInt();
        for( int i=0;i<Subjects;i++)
        {
            System.out.println("enter the marks of subjects");
            int Marks=sc.nextInt();
            
            TotalMarks+= Marks;
        }
        
        
        double AverageMarks=(TotalMarks/Subjects);
        if(AverageMarks>90)
        {
            System.out.println("you got grade A");
        }
        else if(AverageMarks>70)
        {
            System.out.println("you got B grade ");
        }
        else if(AverageMarks>50)
        {
            System.out.println("you got c grade");
        }
        else if(AverageMarks>30)
        {
            System.out.println("you got D grade");
        }
        else
        {
            System.out.println("you got failed");
        }
        System.out.println("u got total marks"+TotalMarks+"");
        System.out.println("u got average percentage"+AverageMarks+"");
       sc.close();
    }
}