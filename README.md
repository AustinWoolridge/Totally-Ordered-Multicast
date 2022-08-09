# Totally-Ordered-Multicast
Totally ordered multicast simulation in distributed systems using java Totally Ordered Multicast Designed and implemented a simulation environment for the totally ordered multicast protocol based on Lamport's logical clocks. The simulation parameters are as follows:

* Number-of-processes
* Index-of-the-simulated-process
* Total-ordering-of-all-processes
* Here is an example configuration:

* 5
* 2
* 1,2,3,4,5
For the above configuration, there are 5 processes and I am simulating process 2. The total ordering is given as a comma-separated sequence of process identifiers containing exactly 5 values (according to line 1), such that one value in this sequence will match our process identifier (according to line 2). The simulated process will first initialize its local clock as 0 and then start waiting for event entries by the end-user. There will be 3 options:

* Send new message m: ask for the message text, generate and display the globally unique message ID and message timestamp. 
* Receive message m from process i: ask for the message text, the globally unique message ID, message timestamp, and sender's process identifier.
* Receive acknowledgement on message m: list the received messages and ask the user to pick the message to be acknowledged. Notice that sending acknowledgement messages have been left out on purpose. Received messages will be assumed to be acknowledged automatically by the simulated process.
Globally unique message identifiers has been generated easily using one of the options listed below or through mechanism:

* Sender generated global identifier: every sender will assign a locally unique ID to its identifier. A globally unique ID is obtained by concatenating the local ID with process ID. Example: local ID is 10, process is 2 such that global ID will be ``10@2''.
* Cryptographic hash of the message generated with SHA or DSA: concatenate message text with message timestamp and sender process ID and produce the hash value. Your process will adjust Lamport timestamps automatically. For the 3 event-options listed above, detailed explanation of the progress will be output to the console.