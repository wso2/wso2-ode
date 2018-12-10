package org.apache.ode.scheduler.simple;

/**
 * This class used to represent node in the cluster setup
 */
public class Node {

    private String nodeId;
    private long heartbeat;
    private String leaderNode;

    public Node(String nodeId, long heartbeat, String leaderNode) {
        this.nodeId = nodeId;
        this.heartbeat = heartbeat;
        this.leaderNode = leaderNode;
    }

    public String getNodeId() {
        return nodeId;
    }

    public long getHeartbeat() {
        return heartbeat;
    }

    public String getLeaderNode() {
        return leaderNode;
    }

    @Override
    public String toString() {
        return nodeId + "[heartbeat:" + heartbeat + ", leaderNode:" + leaderNode + "]";
    }
}
