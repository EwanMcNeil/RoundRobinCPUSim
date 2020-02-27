import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Driver {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner reader = new Scanner(new File("Input.txt"));


		ArrayList<Process> processes = new ArrayList<Process>();

		
		int i = 1;
		// We fetch the value from the text file
		while(reader.hasNext()) {
			int arrival_time = 0;
			int execution_time = 0;
			arrival_time += reader.nextInt();
			execution_time += reader.nextInt();
			Process process = new Process(i,arrival_time, execution_time);
			processes.add(process);
			i++;
		}
		
		reader.close();
		i = 0;
		while(i < 3){
			System.out.println(processes.get(i).arrival_time);
			i++;
		}
		
	
		Thread t1 = new Thread(new Scheduler(processes));
        t1.start();
		
	}
}
