# SpeedyLoop

Speedy loop:

Following is complete algorithm for finding shortest distances.
1) Initialize distance.
2) Create a toplogical order of all vertices.
3) Do following for every vertex u in topological order.
    example:
        for (int index = 0; index < values.length - 1; index++) {
            Node from = Node.byValue(values[index]);
            Node to = Node.byValue(values[index + 1]);
            if (from != null && to != null && this.graph[from.index()][to.index()] != null) {
                counter += this.graph[from.index()][to.index()];

