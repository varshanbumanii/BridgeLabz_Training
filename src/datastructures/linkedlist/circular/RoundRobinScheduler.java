package datastructures.linkedlist.circular;

import java.util.Scanner;

class ProcessNode {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime = 0;
    int turnaroundTime = 0;
    ProcessNode next;

    ProcessNode(int pid, int burst, int priority) {
        this.pid = pid;
        this.burstTime = burst;
        this.remainingTime = burst;
        this.priority = priority;
        this.next = null;
    }
}

class CircularProcessList {
    ProcessNode head = null;
    ProcessNode tail = null;

    // Add process at end
    void addProcess(int pid, int burst, int priority) {
        ProcessNode node = new ProcessNode(pid, burst, priority);

        if (head == null) {
            head = tail = node;
            node.next = head;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
        System.out.println("Process added.");
    }

    // Remove completed process
    void removeProcess(ProcessNode target) {
        if (head == null) return;

        if (head == tail && head == target) {
            head = tail = null;
            return;
        }

        ProcessNode curr = head;
        ProcessNode prev = null;

        do {
            if (curr == target) {
                if (curr == head) {
                    head = head.next;
                    tail.next = head;
                } else if (curr == tail) {
                    prev.next = head;
                    tail = prev;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Display queue
    void displayQueue() {
        if (head == null) {
            System.out.println("Queue empty.");
            return;
        }

        ProcessNode temp = head;
        System.out.print("Queue: ");
        do {
            System.out.print("[P" + temp.pid + " RT=" + temp.remainingTime + "] ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

public class RoundRobinScheduler {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CircularProcessList list = new CircularProcessList();

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Process ID: ");
            int pid = sc.nextInt();
            System.out.print("Burst Time: ");
            int burst = sc.nextInt();
            System.out.print("Priority: ");
            int priority = sc.nextInt();
            list.addProcess(pid, burst, priority);
        }

        System.out.print("Enter Time Quantum: ");
        int quantum = sc.nextInt();

        int currentTime = 0;
        int completed = 0;
        double totalWaiting = 0;
        double totalTurnaround = 0;

        ProcessNode current = list.head;

        System.out.println("\n--- Scheduling Started ---");

        while (list.head != null) {

            ProcessNode executing = current;
            int execTime = Math.min(quantum, executing.remainingTime);

            System.out.println("\nExecuting Process P" + executing.pid +
                    " for " + execTime + " units");

            executing.remainingTime -= execTime;
            currentTime += execTime;

            // Update waiting time for others
            ProcessNode temp = list.head;
            do {
                if (temp != executing) {
                    temp.waitingTime += execTime;
                }
                temp = temp.next;
            } while (temp != list.head);

            if (executing.remainingTime == 0) {
                executing.turnaroundTime = currentTime;
                totalWaiting += executing.waitingTime;
                totalTurnaround += executing.turnaroundTime;

                System.out.println("Process P" + executing.pid + " completed.");

                ProcessNode nextProcess = executing.next;
                list.removeProcess(executing);
                current = nextProcess;
                completed++;
            } else {
                current = current.next;
            }

            list.displayQueue();
        }

        System.out.println("\n--- Scheduling Completed ---");
        System.out.println("Average Waiting Time     = " + (totalWaiting / n));
        System.out.println("Average Turnaround Time  = " + (totalTurnaround / n));

        sc.close();
    }
}

