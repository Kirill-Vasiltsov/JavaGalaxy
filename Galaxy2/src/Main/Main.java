package Main;

import cosmos.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws ParserConfigurationException {

        //open file
        File file = new File("galaxy.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc = null;
        try {
            doc = dbf.newDocumentBuilder().parse(file);
        } catch (Exception e) {
            System.out.println("Parsing error" + e.toString());
        }

        //parsing
        Star_cluster star_cluster = new Star_cluster();
        List<Star_system> star_systemList = new ArrayList<>();
        Node star_clusterNode = doc.getFirstChild();
        NodeList star_clusterChilds = star_clusterNode.getChildNodes();

        for (int i = 0; i < star_clusterChilds.getLength(); i++) {
            if (star_clusterChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }

            switch (star_clusterChilds.item(i).getNodeName()) {
                case "name": {
                    star_cluster.setName(star_clusterChilds.item(i).getTextContent());
                    break;
                }
                case "star_system": {
                    Star_system star_system = new Star_system();
                    List<Cosmos_objects> cosmos_objectsList = new ArrayList<>();

                    Node star_systemNode = star_clusterChilds.item(i);
                    NodeList star_systemChilds = star_systemNode.getChildNodes();
                    for (int j = 0; j < star_systemChilds.getLength(); j++) {
                        if (star_systemChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
                            continue;
                        }

                        switch (star_systemChilds.item(j).getNodeName()) {
                            case "name": {
                                star_system.setName(star_systemChilds.item(j).getTextContent());
                                break;
                            }
                            case "cosmos_objects": {
                                Cosmos_objects cosmos_objects = new Cosmos_objects();
                                List<Stars> starsList = new ArrayList<>();
                                List<Planets> planetsList = new ArrayList<>();
                                List<Satellites> satellitesList = new ArrayList<>();

                                Node cosmos_objectsNode = star_systemChilds.item(j);
                                NodeList cosmos_objectsChilds = cosmos_objectsNode.getChildNodes();

                                for (int k = 0; k < cosmos_objectsChilds.getLength(); k++) {
                                    if (cosmos_objectsChilds.item(k).getNodeType() != Node.ELEMENT_NODE) {
                                        continue;
                                    }
                                    if (cosmos_objectsChilds.item(k).getTextContent().equals("")) {
                                        continue;
                                    }

                                    switch (cosmos_objectsChilds.item(k).getNodeName()) {
                                        case "stars": {

                                            Node starsNode = cosmos_objectsChilds.item(k);
                                            NodeList starsChilds = starsNode.getChildNodes();

                                            for (int f = 0; f < starsChilds.getLength(); f++) {
                                                Stars stars = new Stars();
                                                String stars_name = null;
                                                double stars_mass = 0;
                                                if (starsChilds.item(f).getNodeType() != Node.ELEMENT_NODE) {
                                                    continue;
                                                }
                                                if (!starsChilds.item(f).getNodeName().equals("element")) {
                                                    continue;
                                                }

                                                NodeList elementChilds = starsChilds.item(f).getChildNodes();
                                                for (int y = 0; y < elementChilds.getLength(); y++) {
                                                    if (elementChilds.item(y).getNodeType() != Node.ELEMENT_NODE) {
                                                        continue;
                                                    }
                                                    switch (elementChilds.item(y).getNodeName()) {
                                                        case "name": {
                                                            stars_name = elementChilds.item(y).getTextContent();
                                                            break;
                                                        }
                                                        case "mass": {
                                                            stars_mass = Double.parseDouble(elementChilds.item(y).getTextContent());
                                                            break;
                                                        }
                                                    }
                                                }
                                                stars.setName(stars_name);
                                                stars.setMass(stars_mass);
                                                starsList.add(stars);
                                            }

                                            break;
                                        }
                                        case "planets": {

                                            Node planetsNode = cosmos_objectsChilds.item(k);
                                            NodeList planetsChilds = planetsNode.getChildNodes();

                                            for (int f = 0; f < planetsChilds.getLength(); f++) {
                                                Planets planets = new Planets();
                                                String planets_name = null;
                                                double planets_mass = 0;
                                                if (planetsChilds.item(f).getNodeType() != Node.ELEMENT_NODE) {
                                                    continue;
                                                }
                                                if (!planetsChilds.item(f).getNodeName().equals("element")) {
                                                    continue;
                                                }

                                                NodeList elementChilds = planetsChilds.item(f).getChildNodes();
                                                for (int y = 0; y < elementChilds.getLength(); y++) {
                                                    if (elementChilds.item(y).getNodeType() != Node.ELEMENT_NODE) {
                                                        continue;
                                                    }
                                                    switch (elementChilds.item(y).getNodeName()) {
                                                        case "name": {
                                                            planets_name = elementChilds.item(y).getTextContent();
                                                            break;
                                                        }
                                                        case "mass": {
                                                            planets_mass = Double.parseDouble(elementChilds.item(y).getTextContent());
                                                            break;
                                                        }
                                                    }
                                                }
                                                planets.setName(planets_name);
                                                planets.setMass(planets_mass);
                                                planetsList.add(planets);
                                            }

                                            break;
                                        }
                                        case "satellites": {

                                            Node satellitesNode = cosmos_objectsChilds.item(k);
                                            NodeList satellitesChilds = satellitesNode.getChildNodes();

                                            for (int f = 0; f < satellitesChilds.getLength(); f++) {
                                                Satellites satellites = new Satellites();
                                                String satellites_name = null;
                                                double satellites_mass = 0;
                                                if (satellitesChilds.item(f).getNodeType() != Node.ELEMENT_NODE) {
                                                    continue;
                                                }
                                                if (!satellitesChilds.item(f).getNodeName().equals("element")) {
                                                    continue;
                                                }

                                                NodeList elementChilds = satellitesChilds.item(f).getChildNodes();
                                                for (int y = 0; y < elementChilds.getLength(); y++) {
                                                    if (elementChilds.item(y).getNodeType() != Node.ELEMENT_NODE) {
                                                        continue;
                                                    }
                                                    switch (elementChilds.item(y).getNodeName()) {
                                                        case "name": {
                                                            satellites_name = elementChilds.item(y).getTextContent();
                                                            break;
                                                        }
                                                        case "mass": {
                                                            satellites_mass = Double.parseDouble(elementChilds.item(y).getTextContent());
                                                            break;
                                                        }
                                                    }
                                                }
                                                satellites.setName(satellites_name);
                                                satellites.setMass(satellites_mass);
                                                satellitesList.add(satellites);
                                            }

                                            break;
                                        }

                                    }
                                }
                                cosmos_objects.setStars(starsList);
                                cosmos_objects.setPlanets(planetsList);
                                cosmos_objects.setSatellites(satellitesList);
                                cosmos_objectsList.add(cosmos_objects);
                                break;
                            }
                        }
                    }
                    star_system.setCosmos_objects(cosmos_objectsList);
                    star_systemList.add(star_system);
                    break;
                }
            }
        }
        star_cluster.setStar_system(star_systemList);
        System.out.println(star_cluster.toString());

        star_cluster.Info();






    }
}