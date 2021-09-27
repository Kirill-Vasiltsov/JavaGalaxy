package cosmos;

import java.util.List;

public class Star_cluster {
    private String name;
    private List<Star_system> star_system;

    public Star_cluster() {

    }

    public Star_cluster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Star_system> getStar_system() {
        return star_system;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStar_system(List<Star_system> star_system) {
        this.star_system = star_system;
    }

    public void Info() {
        System.out.println("Star cluster name: " + name + "\n");
        for(int i = 0; i < star_system.size(); i++) {
            System.out.println("Star system name: " + star_system.get(i).getName() + ". Mass = " + star_system.get(i).Mass() + ". Number of space objects: " + star_system.get(i).Quantity() + "\n");
        }
    }

    @Override
    public String toString() {
        return "Star_cluster{" +
                "name='" + name + '\'' +
                ", star_system=" + star_system +
                '}';
    }
}
