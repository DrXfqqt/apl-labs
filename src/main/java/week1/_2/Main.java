
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char cont = 'y';
        while (cont == 'y'){
            System.out.println("Enter how many numbers you want to add (2,3 or 4): ");
            int num = input.nextInt();
            
            if (num == 2){
                System.out.println("Enter 2 numbers to add: ");
                int a = input.nextInt();
                int b = input.nextInt();
                Addition add = new Addition(a, b);
                add.display();
            }
            else if (num == 3){
                System.out.println("Enter 3 numbers to add: ");
                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();
                Addition add = new Addition(a, b, c);
                add.display();
            }
            else if (num == 4){
                System.out.println("Enter 4 numbers to add: ");
                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();
                int d = input.nextInt();
                Addition add = new Addition(a, b, c, d);
                add.display();
            }

            System.out.println("Do you want to continue? Press 'y' or 'n': ");
            cont = input.next().charAt(0);
        }
        input.close();
    }
}
