package nodes;
import content.Packet;

public class WorkStation extends LANNode {
	public void generatePacket (Packet p) {
		p.originator = this;
		this.send(p);
	}
	public void accept(Packet p) {
		if (p.originator == this)
			System.err.println("no destination");
		else super.accept(p);
	}
}