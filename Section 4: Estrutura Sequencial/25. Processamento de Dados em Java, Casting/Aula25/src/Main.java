public class Main {

    public static void main(String[] args){


        //ex 1:
        int x, y;
        x = 5;
        y = 2*x;
        System.out.println(x);
        System.out.println(y);

        //ex2 - Áreado trapézio
        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B)/2.0*h;
        System.out.println(area);
        //boa prática:
        float a, A, H, Area;
        a = 6f;
        A = 8f;
        H = 5f;
        Area = (a + A)/2f*H;
        System.out.println(Area);
    }
    
}
