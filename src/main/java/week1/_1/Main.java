import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("############\t CALCULATOR \t############");
        System.out.println();
        char cont = 'y';
        int a, b, choice;
        while(cont == 'y'){
            System.out.println("Press 1 for addition.");
            System.out.println("Press 2 for subtraction.");
            System.out.println("Press 3 for multiplication.");
            System.out.println("Press 4 for division.");
            System.out.println("Press 5 for modulo.");
            System.out.println("Press 6 for bitwise AND.");
            System.out.println("Press 7 for bitwise OR.");
            System.out.println("Press 8 for bitwise NOT.");
            choice = input.nextInt();

            if(choice < 8){
                System.out.print("Enter the two numbers: ");
                a = input.nextInt();
                b = input.nextInt();
                
                switch(choice){
                    case 1:
                        System.out.println("Sum is " + (a + b));
                        break;
                    case 2:
                        System.out.println("Difference is " + (a - b));
                        break;
                    case 3:
                        System.out.println("Product is " + (a*b));
                        break;
                    case 4:
                        System.out.println("Quotient is " + (double)((double)a/b));
                        break;
                    case 5:
                        System.out.println("Modulo is " + (a%b));
                        break;
                    case 6:
                        System.out.println("And is " + (a&b));
                        break;
                    case 7:
                        System.out.println("OR is " + (a|b));
                        break;
                }
            }
            else{
                System.out.println("Enter a number: ");
                a = input.nextInt();
                System.out.println("NOT of the number is " + (~a));
            }

            System.out.print("To continue press 'y' else press 'n': ");
            cont = input.next().charAt(0);
        }
        input.close();
    }
}

