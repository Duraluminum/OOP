package src;

import java.util.List;


public class MineralWater extends Water {
    private String source;
    private String brand;
    private List<String> minerals;

    public MineralWater(String color, double density, double freezingTemp,
                        double volume, double phLvl, double purity,
                        String source, String brand, List<String> minerals) {
        super(color, density, freezingTemp, volume, phLvl, purity);
        this.source = source;
        this.brand = brand;
        this.minerals = minerals;
    }


    public String getSource() {
        return source;
    }

    public String getBrand() {
        return brand;
    }

    public List<String> getMinerals() {
        return minerals;
    }


    public void setSource(String source) {
        this.source = source;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMinerals(List<String> minerals) {
        if (minerals != null) {
            this.minerals = minerals;
        } else {
            throw new IllegalArgumentException("Minerals must be a list, got null");
        }
    }


    public String getMineralsInfo() {
        if (minerals != null && !minerals.isEmpty()) {
            return minerals.toString();
        } else {
            return "No minerals";
        }
    }

    public String getSourceInfo() {
        return "Mineral water is from " + source;
    }

    public String isHealing() {
        if (minerals != null && minerals.size() > 3) {
            return "Healing";
        } else {
            return "Not healing";
        }
    }
}