import java.util.Arrays;

/**
 * Created by Maria Calestino
 * June 16, 2021
 */

/**
 * Main Class
 * @author mariacalestino
 *
 */
public class Application {

    private static final String[] nodes = {"AB5", "BC4", "CD8", "DC8", "DE6", "AD5", "CE2", "EB3", "AE7"};

    public static void main(String[] args) {
        Graph graph = new Graph(5, 5);

        Arrays.stream(nodes).parallel().forEach(node -> graph.setWeight(node));

        System.out.println("Output #1: " + graph.getWeight("A-B-C"));
        System.out.println("Output #2: " + graph.getWeight("A-D"));
        System.out.println("Output #3: " + graph.getWeight("A-D-C"));
        System.out.println("Output #4: " + graph.getWeight("A-E-B-C-D"));
        System.out.println("Output #5: " + graph.getWeight("A-E-D"));
        System.out.println("Output #6: " + graph.getWeight("A-A"));
        System.out.println("Output #7: " + graph.getWeight("B-E-D"));
        System.out.println("Output #8: " + graph.getWeight("A-B"));
        System.out.println("Output #9: " + graph.getWeight("A-B-C-D-E"));
       
    }
}
