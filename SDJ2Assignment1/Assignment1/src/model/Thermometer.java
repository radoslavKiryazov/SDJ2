package model;

public class Thermometer {
    private double t;
    private double t0;
    private int p;
    private String id;
    private int distance;
    private boolean running;
    private boolean isOutside;
    private Radiator radiator;

    public Thermometer(Radiator radiator, String id, double t, int distance, double tempOut, boolean isOutside){
      this.radiator=radiator;
      this.id= id;
      this.t= t;
      this.distance =distance;
      this.t0 = tempOut;
      this.isOutside = isOutside;
    }
    public double calcTemperature(double t, int p, int d, double t0, int s)
    {
        double tMax = Math.min(11 * p + 10, 11 * p + 10 + t0);
        tMax = Math.max(Math.max(t, tMax), t0);
        double heaterTerm = 0;
        if (p > 0) {
            double den = Math.max((tMax * (20 - 5 * p) * (d + 5)), 0.1);
            heaterTerm = 30 * s * Math.abs(tMax - t) / den;
        }
        double outdoorTerm = (t - t0) * s / 250.0;
        t = Math.min(Math.max(t - outdoorTerm + heaterTerm, t0), tMax);
        return t;
    }
    public double externalTemperature(double t0, double min, double max) {
        double left = t0 - min;
        double right = max - t0;
        int sign = Math.random() * (left + right) > left ? 1 : -1;
        t0 += sign * Math.random();
        return t0;
    }
    public double getTemperature(){
        return t;
    }
}
