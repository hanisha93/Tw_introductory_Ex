import java.util.Scanner;
import java.lang.*;
public class Main {
    public void verticalAsterik(int n)
    {
        for(int i=0;i<n;i++)

        System.out.println("*");
    }
    public void rightTraingle(int n)
    {   int count=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<count;j++)
                System.out.print("*");
            System.out.println();
            count++;
        }
    }
    public void centeredTraingle(int n)
    {   int count=1,count1=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-count;j++)
                System.out.print(" ");
            for(int m=0;m<count1;m++)
                System.out.print("*");
            System.out.println();
            count++;
            count1=count1+2;
        }
    }
    public void Diamond(int n)
    {   int count=n-1,count1=1;
        int b=count+n;
        for(int i=0;i<b;i++)
        {


                for (int j = 0; j < count; j++)
                    System.out.print(" ");
                for (int m = 0; m < count1; m++)
                    System.out.print("*");
                System.out.println();
               if(i+1>=n) {
                   count++;
                   count1 = count1 - 2;
               }
               else {
                   count--;
                   count1 = count1 +2;
               }

        }
    }
    public void DiamondName(int n)
    {   int count=n-1,count1=1;
        int b=count+n;
        for(int i=0;i<b;i++)
        {


            for (int j = 0; j < count; j++)
                System.out.print(" ");
            if(count==0)
                System.out.print("hanisha");
            else
            for (int m = 0; m < count1; m++)


                    System.out.print("*");
            System.out.println();
            if(i>=n-1) {
                count++;
                count1 = count1 - 2;
            }
            else {
                count--;
                count1 = count1 +2;
            }

        }
    }
    public void fizzBuzz() {
        for (int i = 1; i <= 100; i++)
        {
            System.out.println(
                    (i % 15 == 0) ? "FizzBuzz" : (i % 3 == 0) ? "Fizz" :(i % 5 == 0) ? "Buzz" :i);
        }
    }
    public void generate(int n){
        System.out.println("prime factors");


        int i=2;
        while(n>1)
        {
            if(n%i == 0)
            {
                System.out.print(i+" ");
                n=n/i;
            }
            else
                i++;
        }



    }
    public static void main(String[] args) {
        int a;


        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        a = in.nextInt();
        Main mn=new Main();
        //mn.DiamondName(a);
        //mn.fizzBuzz();
        mn.generate(a);

    }
}
