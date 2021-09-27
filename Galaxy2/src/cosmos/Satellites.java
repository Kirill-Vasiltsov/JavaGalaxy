package cosmos;

public class Satellites {
    private String name;
    private double mass;

    public Satellites() {
    }

    public Satellites(String name, int mass) {
        this.name = name;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Satellites{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}
