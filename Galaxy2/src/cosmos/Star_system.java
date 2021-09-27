package cosmos;

import java.util.List;

public class Star_system {
    private String name;
    private List<Cosmos_objects> cosmos_objects;

    public Star_system() {

    }

    public Star_system(String name, List<Cosmos_objects> cosmos_objects) {
        this.name = name;
        this.cosmos_objects = cosmos_objects;
    }



    public String getName() {
        return name;
    }

    public List<Cosmos_objects> getCosmos_objects() {
        return cosmos_objects;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCosmos_objects(List<Cosmos_objects> cosmos_objects) {
        this.cosmos_objects = cosmos_objects;
    }

    public double Mass() {
        double mass = 0;
        for (int i = 0; i < cosmos_objects.size(); i++) {
            for(int j = 0; j < cosmos_objects.get(i).getStars().size(); j++) {
                mass += cosmos_objects.get(i).getStars().get(j).getMass();
            }
            for(int j = 0; j < cosmos_objects.get(i).getPlanets().size(); j++) {
                mass += cosmos_objects.get(i).getPlanets().get(j).getMass();
            }
            for(int j = 0; j < cosmos_objects.get(i).getSatellites().size(); j++) {
                mass += cosmos_objects.get(i).getSatellites().get(j).getMass();
            }
        }
        return mass;
    }

    public int Quantity()
    {
        int quantity = 0;
        for (int i = 0; i < cosmos_objects.size(); i++) {
            for(int j = 0; j < cosmos_objects.get(i).getStars().size(); j++) {
                quantity++;
            }
            for(int j = 0; j < cosmos_objects.get(i).getPlanets().size(); j++) {
                quantity++;
            }
            for(int j = 0; j < cosmos_objects.get(i).getSatellites().size(); j++) {
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public String toString() {
        return "Star_system{" +
                "name='" + name + '\'' +
                ", cosmos_objects=" + cosmos_objects +
                '}';
    }
}
