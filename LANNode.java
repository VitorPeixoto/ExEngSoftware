package nodes;
import content.Packet;

public class LANNode {
	public String name;
	public LANNode nextNode;
	public void accept (Packet p) {
		this.send(p);
	}
	protected void send (Packet p) {
		System.out.println(name + nextNode.name);
		this.nextNode.accept(p);
	}
}