import java.util.Scanner;

public class Addition {
    int sum;
    Addition (int a, int b){
        sum =  a + b;
    }
    Addition (int a, int b, int c) {
        sum = a + b + c;
    }
    Addition (int a, int b, int c, int d) {
        sum = a + b + c + d;
    }
    
    void display(){
        System.out.println("The sum is " + sum);
    }
}
