public class Telephone {
	Receiver receiver = null;
	// wired receiver, chordless receiver
	Speaker speaker = null;
	Keypad keypad = null;
	Connection connection = null;
	Microphone mic = null;

	public Telephone(Receiver receiver, Speaker speaker, Keypad keypad, Connection connection, Microphone microphone) {
		this.receiver = receiver; 
		this.speaker = speaker;
		this.connection = connection;
		this.mic = microphone;
		this.keypad = keypad;
	}
	
	public static void main(String[] args) {
		Connection connection = new Connection();	
		Keypad keypad = new Keypad();
		Speaker speaker = new Speaker();
		Receiver receiver = new Receiver();
		Microphone microphone = new Microphone();
		Telephone telephone = new Telephone(receiver
				, speaker, keypad, connection, microphone);
	}
}
