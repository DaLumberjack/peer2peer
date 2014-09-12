package peer2peer;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class Node {

	 Node leftChild;
	  Node rightChild;
	  Node parent;
	  Node grandparent;
	  ArrayList<Node> availableConnection;
	  String iP;
	  InputStream inStream;
	  OutputStream outStream;
	  
	  public Node(String p, String str){
	  /*
	p= ip of parent with that we can set our grandparent
	    then ask for the availableConnection array
	str= our ip

	  */
	  }
	  
	  void sendMessage(String message){
	    short head;
	    /*
	appends appropriate header to message then sends it to peers
	    */
	  }
	  
	  void updateConnections(){
	    /*
	this will keep all connections the way that they are meant to be
	this is the logic of the network:

	    */
	  }
	  String connect(String known){
	    /*
	returns node to connect to, parent, the first IP address in the
	avaiableConnection list 
	    */    
		 return "";
	  }
	  
	  void disconnect(){
	    /*
	original disconnect called only once per disconnect sends 
	message to parent and children nodes
	    */    
	  }

	  void reconnect(){
	    /*
	if there is a drop then the peer will connect to its grandparent
	if there is a disconnect the peer will update its availableConnection
	  and if needed connect update its node attributes
	    */
	  }

	  void pushList(String known){
	    /*
	sends the list of available connections to the requestion peer
	    */    
	  }
	  
	  void messageProcessor(){
	    /*
	takes an incoming message and deals with it accordingly by calling 
	other methods in accordance with the message header
	    */    
	  }
	  
	    void messageSpreader(Message msg){
	    /*
	spreads the message to all peer that have not yet recieved
	the message
	    */
	  }
	  
	  void messageDispatcher(Message msg){
	    /*
	compiles a basic text message that one peer sends to another
	    */    
	  }
	  
	  //various getter/setter

	
	
	
}
