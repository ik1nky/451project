package Eval;

import java.util.ArrayList;

/**
 * Created by jackrosenhauer on 12/3/14.
 */
public class Node {

    String value;
    ArrayList<Node> children = null;

    public Node(String value){
        this.children = new ArrayList<Node>();
        this.value = value;
    }

    public void addChild(Node child){
        children.add(child);
    }

    public ArrayList<Node> getChildren(){
        return children;
    }



}
