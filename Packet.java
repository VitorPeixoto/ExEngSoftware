package content;
import nodes.LANNode;
import nodes.PrintServer;

public class Packet {
	public String contents;
	public LANNode originator;
	public LANNode addressee;

	public String getPacketInfo()

	{
		String packetInfo = originator + ": " +
		addressee + "[" + contents + "]";
		return packetInfo;
	}
}