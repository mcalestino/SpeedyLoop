import java.util.Arrays;

/**
 * Maria Calestino
 * June 16, 2021
 */

/**
 * Node classed needed for the graph class
 * @author mariacalestino
 *
 */
public enum Node {
    A(0), B(1), C(2), D(3), E(4);

    private Integer code;

    Node(Integer code) {
        this.code = code;
    }

    public Integer index() {
        return code;
    }

    public static Node byValue(String node) {
        return Arrays.stream(Node.values())
                .filter(c -> c.name().equalsIgnoreCase(node))
                .findFirst().orElse(null);
    }
}
