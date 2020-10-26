package Farver;

public class HSV {

    private double h;
    private double s;
    private double v;

    public HSV(double h, double s, double v) {
        this.h = h;
        this.s = s;
        this.v = v;
    }

    public double getH() {
        return h;
    }

    public double getS() {
        return s;
    }

    public double getV() {
        return v;
    }

    public String asRGB(HSV hsv) {
        double h = hsv.getH();
        double s = hsv.getS();
        double v = hsv.getV();

        double r;
        double g = 0;
        double b = 0;

        double c = getV() * getS();
        double m = getV() - c;
        double x = c * (1-Math.abs(((getH()/60) % 2) - 1));

        if(h > 0 && h < 60) {
            r = (int) c;
            g = (int) x;
            b = (int) 0;
        }
        if(h >= 60 && h < 120) {
            r = (int) x;
            g = (int) c;
            b = (int) 0;
        }
        if(h >= 120 && h < 180) {
            r = (int) 0;
            g = (int) c;
            b = (int) x;
        }
        if(h > 180 && h < 240) {
            r = (int) 0;
            g = (int) x;
            b = (int) c;
        }
        if(h > 240 && h < 300) {
            r = (int) x;
            g = (int) 0;
            b = (int) c;
        }
        if(h > 300 && h < 360) {
            r = (int) c;
            g = (int) 0;
            b = (int) x;
        }


        RGB HsvToRgb = new RGB((int)+255,(int)g+255,(int)b+255);

        return HsvToRgb.toString();
    }

    @Override
    public String toString() {
        return "HSV{" +
                "h=" + h +
                ", s=" + s +
                ", v=" + v +
                '}';
    }

}
