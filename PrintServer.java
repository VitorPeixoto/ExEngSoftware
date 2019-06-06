package nodes;
import content.Packet;

public class PrintServer extends LANNode {
	public void print(Packet p) {
		String packetInfo = getPacketInfo(p);
		System.out.println(packetInfo);
	}
	public String getPacketInfo (Packet p) {
		String packetInfo = p.originator + ": " +
		p.addressee+ "[" + p.contents + "]";
		return packetInfo;
	}
	public void accept (Packet p) {
		if (p.addressee == this) this.print(p);
		else super.accept(p);
	}
}