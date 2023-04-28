public class Tree {
    private int nounOfKids;
    private Node root;
    private class Node{
        Node[] kids = new Node[nounOfKids];
        int[] values = new int[nounOfKids-1];
        Node(int value){
            this.values[0]=value;
        }
    }
}
