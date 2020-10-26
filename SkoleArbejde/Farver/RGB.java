package Farver;

import java.util.Arrays;


public class RGB {
    private int r;
    private int g;
    private int b;

    public int getR() {
        return r;
    }

    public int getB() {
        return b;
    }

    public int getG() {
        return g;
    }

    public RGB(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String asHSV(RGB rgb) {
        double r = rgb.getR();
        double g = rgb.getG();
        double b = rgb.getB();

        r /= 255;
        g /= 255;
        b /= 255;

        double h = 0;
        double s;
        double v;

        double cmin = Math.min(r,(Math.min(g, b)));
        double cmax = Math.max(r,(Math.max(g, b)));
        double diff = cmax - cmin;

        if (cmax == cmin) {
            h = 0;
        } else if (cmax == r) {
            h = (60 * ((g - b) / diff) + 360) % 360;
        } else if (cmax == g) {
            h = (60 * ((b - r) / diff) + 120) % 360;
        } else if (cmax == b) {
            h = (60 * ((r - g) / diff) + 240) % 360;
        }

        if(cmax == 0) {
            s = 0;
        } else {
            s = (diff/cmax) * 100;
        }

        v = cmax * 100;

        HSV RgbToHsv = new HSV(h,s,v);

        return RgbToHsv.toString();
    }

    @Override
    public String toString() {
        return "RGB{" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
    }
}


