package nodes;
import content.Packet;

public class NetworkTester extends LANNode {
	protected void sendPacket(Packet p){}
	public void testSendToSelf() {
		Packet packet = new Packet ();
		packet.addressee = this;
		packet.originator = this;
		send (packet);
	}

	void testLosePacket(boolean losePacket) {
		Packet packet = new Packet ();
		packet.addressee = new LANNode ();
		packet.originator = this;
		if (losePacket) sendPacket(packet);
		else send(packet);

	}

	public void accept (Packet p) {
		if (p.originator == this)
			System.out.println("network works OK");
		else super.accept(p);
	}
}