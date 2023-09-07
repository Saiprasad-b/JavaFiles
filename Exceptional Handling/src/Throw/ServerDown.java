package Throw;
//this is userdefined class that is used like an exception to display messages
public class ServerDown extends RuntimeException{
	
	public ServerDown() {
		//this is no argumented Constructor
	}
	public ServerDown(String s) {
		super(s);
	}

}
