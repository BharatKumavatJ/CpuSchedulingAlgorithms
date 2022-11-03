public class PrintStatics {
    public void print(Process[] process) {

        int totalWT = 0;
        int totalRT = 0;
        System.out.println("Id\tAT\tBT\tCT\tTAT\tWT\tRT");
        for(int i = 0; i < process.length; i++){
            System.out.println(
                    process[i].getId() + "\t" +
                            process[i].getArrivalTime() + "\t" +
                            process[i].getBurstTime() + "\t" +
                            process[i].getCompletionTime() + "\t" +
                            process[i].getTurnAroundTime() + "\t" +
                            process[i].getWaitingTime() + "\t" +
                            process[i].getResponseTIme() + "\t"
            );
            totalWT += process[i].getWaitingTime();
            totalRT += process[i].getResponseTIme();
        }

        System.out.println("Average Waiting time : " +(double)totalWT / process.length);
        System.out.println("Average Response time : " + (double)totalRT / process.length);

    }

}

