package org.flamie.miau.layout;

import java.util.List;

/**
 * Created by flamie on 04.02.17 :3
 */

public class TreeNode implements Node {

    public final List<Node> childNodes;
    public final NodeInfo nodeInfo;

    public TreeNode(List<Node> childNodes, NodeInfo nodeInfo) {
        this.childNodes = childNodes;
        this.nodeInfo = nodeInfo;
    }

    @Override
    public NodeInfo getNodeInfo() {
        return nodeInfo;
    }

    @Override
    public List<Node> getChildNodes() {
        return childNodes;
    }

}
