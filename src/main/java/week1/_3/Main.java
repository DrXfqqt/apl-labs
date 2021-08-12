import java.util.Scanner;
class Rectangle{
    int length;
    int width;
    Rectangle(int l, int w){
        length = l;
        width = w; 
}
void area(){
        System.out.println("The area of given rectangle: " + length*width);
        } }
        class Cuboid{
            int length;
        int width; int height;
            Cuboid(int l, int w, int h){
                length = l;
        width = w;
        height = h; }
        void volume(){
        System.out.println("The volume of given cuboid is: " +
        length*width*height); }
        }
class Circle{
                int radius;
                Circle(int r){ radius = r;
                }
                void area(){
                System.out.println("The area of given circle is: " + 3.14*radius*radius);
                } }
                public class Main{
                    public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                for(int i = 0; i < 3; i++) {
                System.out.println("Enter the length of cuboid: ");
                int l = sc.nextInt();
                System.out.println("Enter the width of cuboid: ");
                int w = sc.nextInt();
                System.out.println("Enter the height of the cuboid: "); int h = sc.nextInt();
                Cuboid c1 = new Cuboid(l, w, h);
                c1.volume(); }
                System.out.println("Enter the radius of the circle: "); int r = sc.nextInt();
                Circle c2 = new Circle(r);
                c2.area();
                System.out.println("Enter the length of rectangle: "); int lr = sc.nextInt();
                System.out.println("Enter the width of rectangle: "); int wr = sc.nextInt();
                        Rectangle r1 = new Rectangle(lr, wr);
                r1.area(); 
        }
}
