package cosmos;

import java.util.List;

public class Cosmos_objects {
    private List<Stars> stars;
    private List<Planets> planets;
    private List<Satellites> satellites;

    public Cosmos_objects() {
    }

    public Cosmos_objects(List<Stars> stars, List<Planets> planets, List<Satellites> satellites) {
        this.stars = stars;
        this.planets = planets;
        this.satellites = satellites;
    }

    public List<Stars> getStars() {
        return stars;
    }

    public List<Planets> getPlanets() {
        return planets;
    }

    public List<Satellites> getSatellites() {
        return satellites;
    }

    public void setStars(List<Stars> stars) {
        this.stars = stars;
    }

    public void setPlanets(List<Planets> planets) {
        this.planets = planets;
    }

    public void setSatellites(List<Satellites> satellites) {
        this.satellites = satellites;
    }

    @Override
    public String toString() {
        return "Cosmos_objects{" +
                "stars=" + stars +
                ", planets=" + planets +
                ", satellites=" + satellites +
                '}';
    }
}
