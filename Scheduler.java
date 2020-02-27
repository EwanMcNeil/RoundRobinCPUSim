import java.util.*;
import java.text.DecimalFormat;

public class Scheduler implements Runnable {
	ArrayList<Process> processes;
	String output = "";
	DecimalFormat df = new DecimalFormat("#.#");


	
	public Scheduler(ArrayList<Process> processes) {
		this.processes = processes;
	}

	public void pushProcesses(){

		//push them all into the ready queue
		for(int i = 0; i < processes.size(); i++ ){

			//need to ensure that the states get changed
			processes.get(i);
			readyQueue.push(processes.get(i));
		}


	}

	@Override
	public void run() {
		pushProcesses();
		runProcesses(processes);
	}


	
	public void displayProcesses() {
		for(Process process : processes) {
			System.out.print(process);
		}
	}



    public void runProcesses(ArrayList<Process> processes) {
	
		/*
		System.out.println("output from ready Queue");
		for(int i = 0; i < processes.size(); i++ ){
			Process tempOut = new Process();
			tempOut = readyQueue.pop();

			finishedQueue.push(tempOut);
			System.out.println(tempOut.arrival_time);
		}

		System.out.println("Output from finished queue");

		for(int i = 0; i < processes.size(); i++ ){
			Process tempOut = new Process();
			tempOut = finishedQueue.pop();
			System.out.println(tempOut.arrival_time);
		}
		*/

		int i = 0;
		while(i < 20){

			System.out.println("Time: " + i);

			//this reloads finished queue into ready queue after all have done round robin
			if(readyQueue.peek().id == 0){
				while(finishedQueue.peek().id != 0){
					readyQueue.push(finishedQueue.pop());
				}

			}

			//checking if the head of the ready queue process has arrived
			//should do this in a differnet function
			//not how the cpu should work 
			if(readyQueue.peek().arrival_time == i){
				Process tempOut = new Process();
				tempOut = readyQueue.pop();
				tempOut.remaining_time = tempOut.remaining_time -1;
				System.out.println(tempOut.toString());
				finishedQueue.push(tempOut);
				i++;
				continue;
			}

			i++;

		}

    }
  

}
