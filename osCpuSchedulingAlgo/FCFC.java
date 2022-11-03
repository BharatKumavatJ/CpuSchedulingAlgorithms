
public class FCFC {

    public void implement(Process process[]) {

        int numberOfProcess = process.length;

        int time = 0;
        for (int i = 0; i < numberOfProcess; i++) {
            process[i].setResponseTIme(time - process[i].getArrivalTime());
            time = time + process[i].getBurstTime();
            process[i].setCompletionTime(time);
            process[i].setTurnAroundTime(process[i].getCompletionTime() - process[i].getArrivalTime());
            process[i].setWaitingTime(process[i].getTurnAroundTime() - process[i].getBurstTime());

        }


    }
}

