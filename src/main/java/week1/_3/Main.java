
import java.util.Scanner;

public class Main{
    public int height;
    public int depth;
    public int lengt;
    box(int a,int b,int c)
    {
        height=b;

        depth=c;
        lengt=a;
        System.out.println("volume of box is : "+ (a*b*c));

    }
    box(int a,int b)
    {
        height=b;
        lengt=a;
        System.out.println("area of rectangle is "+(a*b));
    }
    box(int a)
    {
        System.out.println("area of circle is : "+3.14*a*a);
    }
}
public class problem3_a {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(i<3){

            System.out.println("Enter dimensions of box "+i);
            int l,b,h;
            l= sc.nextInt();
            b= sc.nextInt();
            h= sc.nextInt();
            box b1=new box(l,b,h);

            i++;
        }


    }
}
