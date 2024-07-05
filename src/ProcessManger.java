// Name: <Olajuwon Atunnise>
// Class: CS 3305/Section # CS 3305/W02
// Term: Summer 2024
// Instructor: Dr. Bobbie
// Assignment: Part 1

class Node <T extends Comparable> {
         T data;
         Node<T> next;
         T priority;
         public Node(T data, T prior) {
                 this.data = data;
                 this.priority = prior;
                 this.next = null;
         }
 }
        public class ProcessManager<T extends Comparable, U> {
                Node <T> front;
                //T is for Integer and U is for Double, ProcessWTime is for ProcessWaiting Time, ProccessATime is Arrival Time, ProcessSTime is for Service time.
                T ProcessID;
                T PriorityNumber;
                T ProcessWTime;
                T ProcessCompletionP;
                U ProcessATime;
                U ProcessSTime;
                private int QueueSize;
                public ProcessManager(T PI, T PN, T PWT, int QS, T PCP, U PAT, U PST) {
                        this.ProcessID = PI;
                        this.PriorityNumber = PN;
                        this.ProcessATime = PAT;
                        this.ProcessSTime = PST;
                        this.QueueSize = 0;
                        this.ProcessWTime = PWT;
                        this.ProcessCompletionP = PCP;
                        this.front = null;
                }
                // Check if the priority Queue is empty
                public boolean isEmpty() {
                        return front == null;
                }
                public void Enqueue(T ProcID, T PNum) {
                        //Check if Queue is full/Empty
                        //Create node to insert
                        Node<T> newNode = new Node(ProcID, PNum);
                       if (front == null || front.priority.compareTo(newNode.priority) <= 0) {
                               newNode.next= front;
                               front = newNode;
                       }
                       else {
                               Node <T> temp = front;
                               while (temp.next != null && temp.next.priority.compareTo(newNode.priority) >= 0) {
                                       temp = temp.next;
                               }
                               newNode.next = temp.next;
                               temp.next = newNode;
                       }
                                QueueSize++;
                }
                public void Dequeue() {
                        //Check if Queue is empty
                        if(front == null){
                                System.out.println("This Queue is empty");
                        }
                        //Object data = front.data;
                        front = front.next;
                                QueueSize--;
                        //return data;
                }
                T Reset_Priority(T process) {
                        Node<T>  temp = front;
                        //Check for the process inside the queue.
                        while (temp != null) {
                                if (temp.data.equals(process)) {
                                        return temp.priority;
                                }
                                temp = temp.next;
                        }
                                throw new IllegalArgumentException("Process is not in the Queue");
                        }


                int Waiting_Time(T process) {
                        Node<T> temp = front;
                        int waitingtime = 0;
                        while (temp != null) {
                                if (temp.data.equals(process)) {
                                        return waitingtime;
                                }
                                waitingtime++;
                                temp = temp.next;
                                //return the final value
                        }
                                throw new IllegalArgumentException("Process Not in the Queue");
                }

                void CPU_Running(T process) {
                        if queue != empty {
                                //Dequeue the highest priority from the queue
                                highest priority Process = Dequeue;
                                //Simulate CPU process by advancing the clock
                                //After ProcessSTime Update its status to completed.
                        }
                        return Error;
                }
                T Time_In_System(T process) {
                        //Calculate the difference between ProcessATime and ProcessSTime
                        ProcessATime - ProcessSTime = Time in System;
                        //Return the total time the process was in the system.
                        return Time in System;
                }

        }
