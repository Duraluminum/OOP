package src;


public class Liquid {
    private String color;
    private double density;
    private double freezingTemp;

    public Liquid(String color, double density, double freezingTemp) {
        this.color = color;
        this.density = density;
        this.freezingTemp = freezingTemp;
    }

    
    public String getColor() {
        return color;
    }

    public double getDensity() {
        return density;
    }

    public double getFreezingTemp() {
        return freezingTemp;
    }

    
    public void setColor(String color) {
        this.color = color;
    }

    public void setDensity(double density) {
        if (density > 0) {
            this.density = density;
        } else {
            throw new IllegalArgumentException("Invalid density value: " + density);
        }
    }

    public void setFreezingTemp(double freezingTemp) {
        this.freezingTemp = freezingTemp;
    }

    
    public String heat(double deg) {
        return "Heating liquid to " + deg + " degrees";
    }

    public String cool(double deg) {
        return "Cooling liquid to " + deg + " degrees";
    }

    public String getState() {
        return "Liquid: color - " + color + ", density - " + density + ", freezing temperature - " + freezingTemp;
    }
}