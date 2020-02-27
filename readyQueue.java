
//implmenting linked list prioity queue
import java.util.*;

public class readyQueue{ 
    
    
    static class Node{
    Process process;

    int priority;

    Node next;
}




    //node Class containing the process
    //priority is eqaul to the time of the process
    //the smallest time goes to the front of the process



    //creation of the first node
   static Node head = new Node();

   static Node newNode(Process process)
    {
        Node temp = new Node();
        temp.process = process;
        temp.priority = process.remaining_time;
        temp.next = null;

        return temp;
    }

    static Process peek()
    {
        return (head).process;
    }

    static Process pop()
    {
       
        Process tempProcess = new Process();
        tempProcess = head.process;
        (head) = head.next;
        return tempProcess;

    }

    

    static Node push(Process d){
          
        Node temp = newNode(d);  
    if(head.process == null){

        head = temp;
        return head;
    }  

    Node start = head;
    
    if ((head).priority < d.remaining_time) {  
    
        // Insert New Node before head  
        temp.next = head;  
        (head) = temp;  
    }  
    else {  
    
         
        while (start.next != null &&  
               start.next.priority > d.remaining_time) {  
            start = start.next;  
        }  
    
        temp.next = start.next;  
        start.next = temp;  
    }  
    return head; 
}  
  

// Function to check is list is empty  
static int isEmpty(Node head)  
{  
    return ((head) == null)?1:0;  
} 


}