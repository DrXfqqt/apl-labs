import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 4 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int max = 0, min = 0;

        System.out.println("Using if-else statements: ");        
//maximum
        if(a>b){
            if(a>c){
                if(a>d){max = a;}
                else{max = d;}
            }
            else{
                if(c>d){max = c;}
                else{max = d;}
            }
        }
        else{
            if(b>c){
                if(b>d){max = b;}
                else{max = d;}
            }
            else{
                if(c>d){max = c;}
                else{max = d;}
            }
        }
//minimum
        if(a<b){
            if(a<c){
                if(a<d){min = a;}
                else{min = d;}
            }
            else{
                if(c<d){min = c;}
                else{min = d;}
            }
        }
        else{
            if(b<c){
                if(b<d){min = b;}
                else{min = d;}
            }
            else{
                if(c<d){min = c;}
                else{min = d;}
            }
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
        System.out.println();

        max = min = 0;
        System.out.println("Using ternary operator: ");
//maximum
        max = ((a>b)?((a>c)?((a>d)?a:d):((c>d)?c:d)):((b>c)?((b>d)?b:d):((c>d)?c:d)));
//minimum
        min = ((a<b)?((a<c)?((a<d)?a:d):((c<d)?c:d)):((b<c)?((b<d)?b:d):((c<d)?c:d)));
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
        
        input.close();
    }
}
