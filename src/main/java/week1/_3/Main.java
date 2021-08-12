import java.util.Scanner;
class Cuboid{
    int length, width, height;
    void set_length(int l){
        length = l;
}
void set_width(int w){
width = w; }
    void set_height(int h){
        height = h;
}
void volume(){
System.out.println("The volume of given cuboid is: " + (length*width*height));
} }
class circle{
    int radius;
    void set_radius(int r){
        radius = r;
}

void area(){
        System.out.println("The Area of given circle is: " +
        3.14*radius*radius); }
        }
        class rectangle{
            int length;
        int width;
            void set_rlength(int l){
                length = l;
        }
        void set_rwidth(int w){
        width = w; }
        void rarea(){
        System.out.println("The area of the given rectangle is: " +
        length*width); }
        }
public class Main{
        public static void main(String args[]){
        
        Cuboid c1 = new Cuboid();
        System.out.println("Enter the length of cuboid: ");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        c1.set_length(l);
        System.out.println("Enter the width of cuboid: ");
        int w = sc.nextInt();
        c1.set_width(w);
        System.out.println("Enter the height of the cuboid: ");
        int h = sc.nextInt();
        c1.set_height(h);

        c1.volume();

        circle c2 = new circle();
         System.out.println("Enter int radius of the cicle: ");
        int r = sc.nextInt(); 
        c2.set_radius(r); 
        c2.area();
       
        rectangle r1 = new rectangle();
        System.out.println("Enter the length of rectangle: "); 
        int lr = sc.nextInt();
        r1.set_rlength(lr);
        System.out.println("Enter the width of rectangle: ");
        int wr = sc.nextInt();
        r1.set_rwidth(wr);
        r1.rarea();

        }
}
