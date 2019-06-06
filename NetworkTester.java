package nodes;
import content.Packet;

public class NetworkTester extends LANNode {
	public void testSendToSelf() {
		Packet packet = new Packet ();
		packet.addressee = this;
		packet.originator = this;
		send (packet);
	}
	public void accept (Packet p) {
		if (p.originator == this)
			System.out.println("network works OK");
		else super.accept(p);
	}
}