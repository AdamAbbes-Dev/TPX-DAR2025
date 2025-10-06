package serverPackage;
import java.io.*;
import java.net.*;


public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// La première étape :
		//à compléter (TODO)
		//S.o.p("Je suis un serveur en attente la connexion d'un client ");
		try (ServerSocket serversocket = new ServerSocket(12345)) {
			System.out.println("Je suis un serveur en attente la connextion d'un client");
			// La deuxième étape :
			//S.o.p("un client est connecté");
			try(Socket clientsocket = serversocket.accept())
			{
				System.out.println("a cliet is connecetd !!");
				BufferedReader input = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
				PrintWriter output = new PrintWriter(clientsocket.getOutputStream(),true);
				String clientmessage = input.readLine();
				System.out.println("Message received from the client"+clientmessage);
				output.println("Hello,client. I received your message");
			}
			
		}catch(IOException E)
		{
			E.printStackTrace();
		}
		
		// La dernière étape : Fermer socket
		// à compléter (TODO)
		System.out.println("CONNECTION TERMINATED.");
	}

}
