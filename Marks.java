//Write a program which takes the student name, Physics,
Chemistry and Mathematics Marks of a student as input. For each subject, marks
are out of 100. Compute the total marks of that student, percentage in each
subject and total percentage.
Print the out as “[Student Name] obtained following % of marks in PCM:
Physics: [% in Physics ], Chemistry : [% in Chem], Maths : [% in Maths]
Total : [Total %]”
import java.util.*;
public class Marks{
       public static void main(String[] args){
            int t,pp,cp,mp,tp,tpp;
            Scanner a=new Scanner(System.in);
            System.out.println("student name:");
            String sn=a.next();
            System.out.println("Physics");
            int p=a.nextInt();
            System.out.println("chemisrty");
            int c=a.nextInt();
            System.out.println("Maths");     
            int m=a.nextInt();
            a.close();
            t=p+c+m;
            pp=p*%100;
            cp=c*100%100;
            mp=m*100%100;
            tp=pp+cp+mp;
            tpp=tp*100%300;
            System.out.println("Total marks="); 
            System.out.println(t);
            System.out.println("Maths %");
            System.out.println(mp);
            System.out.println("physics%");
            System.out.println(pp);
            System.out.println("chemistry%");
            System.out.println(cp);
            System.out.println("Total per="); 
            System.out.println(tp);   
            }
}
            