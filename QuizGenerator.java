import java.util.*;
public class QuizGenerator
{
    public static void updateQuiz(ArrayList<String> question,List<List<String>> options,ArrayList<String> opt,ArrayList<Integer> answer)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Question for the Quiz :");
        question.add(sc.nextLine());
        for(int i=0;i<4;i++)
        {
            System.out.println("Enter "+(i+1)+" option:");
            opt.add(sc.nextLine());
        }
        options.add(opt);
        System.out.print("Enter it's correct option:");
        answer.add(sc.nextInt());
    }
    public static void playQuiz(ArrayList<String> question,List<List<String>> options,ArrayList<Integer> answer)
    {
        int point=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<question.size();i++)
        {
            System.out.println(question.get(i));
            for(int j=0;j<4;j++)
            {
                System.out.println((j+1)+". "+options.get(i).get(j));
            }
            System.out.print("Your Answer :");
            int n=sc.nextInt();
            if(n==answer.get(i))
            point++;
        }
        System.out.println("Points scored "+point+" out of "+question.size());
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=1;
        ArrayList<String> question=new ArrayList<>();
        List<List<String>> options=new ArrayList<List<String>>();
        ArrayList<Integer> answer=new ArrayList<>();
        System.out.println("Recommanded to Generate Multiple Quiz Questions then Play the Quiz Smoothly!!!");
        while(num==1)
        {
            updateQuiz(question,options,new ArrayList<>(),answer);
            System.out.println("Enter 1 : Generate Quiz Questions");
            System.out.println("Enter 2 : Play Quiz");
            num=sc.nextInt();
        }
        playQuiz(question,options,answer);
    }
}