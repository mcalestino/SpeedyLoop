import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Maria Calestino
 * June 16, 2021
 */

/**
 * Graph class of the directed graph
 * @author mariacalestino
 *
 */
public class Graph {
    private Integer[][] graph;

    public Graph(Integer files, Integer columns) {
        this.graph = new Integer[files][columns];
    }

    public void setWeight(String path) {
        String[] chars = path.split("");
        if (chars.length == 3) {
            Integer from = Node.byValue(chars[0]).index();
            Integer to = Node.byValue(chars[1]).index();
            Integer value = Integer.valueOf(chars[2]);
            graph[from][to] = value;
        }
    }

    public String getWeight(String path) {
        String[] values = path.split("-");
        Integer counter = 0;

        for (int index = 0; index < values.length - 1; index++) {
            Node from = Node.byValue(values[index]);
            Node to = Node.byValue(values[index + 1]);
            if (from != null && to != null && this.graph[from.index()][to.index()] != null) {
                counter += this.graph[from.index()][to.index()];
            } else {
                return "NO SUCH ROUTE";
            }
        }
        return counter.toString();
    }
}
