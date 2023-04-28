import java.util.ArrayList;
import java.util.List;

public class Tree {
    private int nounOfKids;
    private Node root;
    private class Node{
        List<Node> kids = new ArrayList<>(nounOfKids);
        List<Integer> values = new ArrayList<>(nounOfKids-1);
        Node(int value){
            this.values.add(value);
        }
    }
}
