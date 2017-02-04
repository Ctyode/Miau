package org.flamie.miau.layout;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by flamie on 04.02.17 :3
 */
public class NodeDefinition {

    private NodeInfo nodeInfo;
    private List<NodeDefinition> childNodes;

    public NodeDefinition() {
        childNodes = new ArrayList<>();
    }

    public NodeDefinition withNodeInfo(NodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }

    public NodeDefinition withChildNode(NodeDefinition nodeDefinition) {
        childNodes.add(nodeDefinition);
        return this;
    }

    public TreeNode buildTree() {
        return new TreeNode(childNodes.stream().map(NodeDefinition::buildTree).collect(Collectors.toList()), nodeInfo);
    }

}
