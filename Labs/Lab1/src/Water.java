package src;


public class Water extends Liquid {
    private double volume;
    private double phLvl;
    private double purity;

    public Water(String color, double density, double freezingTemp,
                 double volume, double phLvl, double purity) {
        super(color, density, freezingTemp);
        this.volume = volume;
        this.phLvl = phLvl;
        this.purity = purity;
    }

    
    public double getVolume() {
        return volume;
    }

    public double getPhLvl() {
        return phLvl;
    }

    public double getPurity() {
        return purity;
    }

    
    public void setVolume(double volume) {
        if (volume > 0) {
            this.volume = volume;
        } else {
            throw new IllegalArgumentException("Invalid volume value: " + volume);
        }
    }

    public void setPhLvl(double phLvl) {
        if (phLvl >= 0 && phLvl <= 14) {
            this.phLvl = phLvl;
        } else {
            throw new IllegalArgumentException("Invalid PH level value: " + phLvl);
        }
    }

    public void setPurity(double purity) {
        if (purity >= 0 && purity <= 100) {
            this.purity = purity;
        } else {
            throw new IllegalArgumentException("Invalid purity value: " + purity);
        }
    }

    
    public String drink() {
        return "Drinking water";
    }

    public String pour() {
        return "Pouring water";
    }

    public String waterInfo() {
        return "Water " + volume + " volume with PH level " + phLvl
                + " and " + purity + "% purity";
    }
}