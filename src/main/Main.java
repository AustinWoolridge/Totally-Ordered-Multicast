package main;

public class Main {
	static long localClock = 0;
	static long processID=0;
	
	public static void main(String[] args) {
		process pr = new process();
		localClock = pr.SendMessage();
		
		localClock= pr.ReceiveMessage(localClock, "deneme", processID);
		System.out.println(localClock);
		pr.showClock();
	}
	
	
}