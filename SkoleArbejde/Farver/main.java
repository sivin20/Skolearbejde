package Farver;

public class main {
    public static void main(String[] args) {
        RGB rgb1 = new RGB(37,33,15);
        System.out.println(rgb1.asHSV(rgb1));

        HSV hsv1 = new HSV(53, 30, 67);
        System.out.println(hsv1.asRGB(hsv1));
    }
}
