package cosmos;

public class Planets {
    private String name;
    private double mass;

    public Planets() {
    }

    public Planets(String name, int mass) {
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
        return "Planets{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}
