package main;

import java.util.*;

public class process {
	
	private static long localClock = 0;
	private static long processID = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long a =SendMessage();
		System.out.println(a);
	}

	
	public static long SendMessage() {
		
		localClock +=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your Message:\n");
		String message = in.nextLine();
		long timeStamp = localClock;
		String messageID = Integer.toString(message.hashCode()) + "@" + processID;
		System.out.println(message + "\n" + "MessageID: " + messageID);
		return timeStamp;
		
	}
	
	public static long ReceiveMessage(long timeStamp, String message, long processIDM) {
		String messageID = Integer.toString(message.hashCode()) + "@" + String.valueOf(processIDM);
		System.out.println(message + "\n" + "MessageID: " + messageID);
		if(timeStamp>=localClock)
			localClock = timeStamp;
		
		else
			timeStamp = localClock;
			return timeStamp;
		
	}
	
	public void showClock() {
		System.out.println(localClock);
	}
	
	
	
	
	
	
	
	
	
}
