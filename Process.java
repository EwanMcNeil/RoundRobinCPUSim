import java.util.ArrayList;

public class Process {
	int id;
	int arrival_time;
	int execution_time;
	int running_time;
	int remaining_time;
	
	public enum State{
		Started,
		Resumed,
		Paused,
		Finished
	}
	
	public Process() {
		
	}
	
	public Process(int id, int arrival_time, int execution_time) {
		this.id = id;
		this.arrival_time = arrival_time;
		this.execution_time = execution_time;
		running_time = 1;   //clear time 
		remaining_time = execution_time;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getArrivalTime() {
		return this.arrival_time;
	}
	
	public double getExecutionTime() {
		return this.execution_time;
	}
	
	public double getRunningTime() {
		return this.running_time;
	}
	
	public double getRemainingTime() {
		return this.remaining_time;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setArrivalTime(int arrival_time) {
		this.arrival_time = arrival_time;
	}
	
	public void setExecutionTime(int execution_time) {
		this.execution_time = execution_time;
	}
	
	public void setRunningTime(int running_time) {
		this.running_time = running_time;
	}
	
	public void setRemainingTime(int remaining_time) {
		this.remaining_time = remaining_time;
	}
	
	@Override
	public String toString() {
		return ("[" + this.getId() + ", " + this.getArrivalTime() + ", " + this.getExecutionTime() + ", " + this.getRunningTime() + ", " + this.getRemainingTime() + "]" + "\n");
	}

	public void stateStarted(){

	}
}
