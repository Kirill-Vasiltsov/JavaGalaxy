package cosmos;

public class Stars {
    private String name;
    private double mass;

    public Stars() {
    }

    public Stars(String name, int mass) {
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
        return "Stars{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}
