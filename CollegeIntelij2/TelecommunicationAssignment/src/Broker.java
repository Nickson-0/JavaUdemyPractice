import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Map;

public class Broker extends Node {
	static final int DEFAULT_PORT = 50001;

	static final int HEADER_LENGTH = 2;
	static final int TYPE_POS = 0;

	static final byte TYPE_UNKNOWN = 0;

	static final byte TYPE_STRING = 1;
	static final int LENGTH_POS = 1;

	static final byte TYPE_ACK = 2;
	static final int ACKCODE_POS = 1;
	static final byte ACK_ALLOK = 10;

	Terminal terminal;
	/*
	 *
	 */
	Broker(Terminal terminal, int port) {
		try {
			this.terminal= terminal;
			socket= new DatagramSocket(port);
			listener.go();
		}
		catch(java.lang.Exception e) {e.printStackTrace();}
	}

	/**
	 * Assume that incoming packets contain a String and print the string.
	 */
	public synchronized void onReceipt(DatagramPacket packet) {
		try {
			String content;
			byte[] data;
			byte[] buffer;

			data = packet.getData();
			packet.getPort();
			switch(data[TYPE_POS]) {
				case TYPE_STRING:
					buffer= new byte[data[LENGTH_POS]];
					System.arraycopy(data, HEADER_LENGTH, buffer, 0, buffer.length);
					content= new String(buffer);
					// You could test here if the String says "end" and terminate the
					// program with a "this.notify()" that wakes up the start() method.

					if (packet.getPort() == Command_And_Control.DEFAULT_CandC_PORT) {
						terminal.println("Work Description received is: " + content);
					}

					// SEND ACKNOWLEDGEMENT THAT YOU RECEIVED THE MESSAGED
					data = new byte[HEADER_LENGTH];
					data[TYPE_POS] = TYPE_ACK;
					data[ACKCODE_POS] = ACK_ALLOK;

					DatagramPacket response;
					response = new DatagramPacket(data, data.length);
					response.setSocketAddress(packet.getSocketAddress());
					socket.send(response);
					break;
				case TYPE_ACK:
					terminal.println("Received ack");
					this.notify();
					break;
				default:
					terminal.println("Unexpected packet" + packet.toString());
			}

		}
		catch(Exception e) {e.printStackTrace();}
	}


	public synchronized void start() throws Exception {
		terminal.println("Waiting for contact");
		this.wait();
	}

	/*
	 *
	 */
	public static void main(String[] args) {
		try {
			Terminal terminal= new Terminal("Broker");
			(new Broker(terminal, DEFAULT_PORT)).start();
			terminal.println("Program completed");
		} catch(java.lang.Exception e) {e.printStackTrace();}
	}
}
