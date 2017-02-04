package org.flamie.miau.layout;

import java.util.List;

/**
 * Created by flamie on 04.02.17 :3
 */

public interface Node {

    NodeInfo getNodeInfo();
    List<Node> getChildNodes();

}
