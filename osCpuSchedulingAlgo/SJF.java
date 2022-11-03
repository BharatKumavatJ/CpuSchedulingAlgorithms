import java.util.LinkedList;
import java.util.PriorityQueue;

public class SJF {


    private Process[] timeLine;

    public void implement(Process process[]) {
        timeLine = new Process[10000];

        int n = process.length;

        int k = 0;
        for(int i = 0; i < 10000; i++){
            if(i == process[k].getArrivalTime()){
                this.timeLine[i] = process[i];
                System.out.println(process[k]);
                k++;
            }
                if(k >= n) break;
        }

        PriorityQueue<Process> pq = new PriorityQueue<>((a, b) -> a.getBurstTime() - b.getBurstTime());

        pq.add(process[0]);

        int time = 0;
        while (pq.isEmpty() == false){

            Process p = pq.poll();
            System.out.println(p);
            p.setResponseTIme(time - p.getArrivalTime());

            for(int i = time + 1 ; i < time +  p.getBurstTime() + time; i++){
                if(timeLine[i] != null) pq.add(timeLine[i]);
            }
            time += p.getBurstTime();

            System.out.println(time);
            p.setCompletionTime(time);

            p.setTurnAroundTime(p.getCompletionTime() - p.getArrivalTime());
            p.setWaitingTime(p.getTurnAroundTime() - p.getBurstTime());

        }

    }
}
