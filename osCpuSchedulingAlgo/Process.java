public class Process {
    private int id = 0;
    private int arrivalTime;
    private int burstTime;

    private int completionTime;
    private int turnAroundTime;
    private int waitingTime;
    private int responseTIme;


    public Process(int id, int arrivalTime, int burstTime) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }

    public static void printTable(Process p) {
        System.out.println(p.id + "\t" + p.arrivalTime + "\t" + p.burstTime + "\t" + p.completionTime + "\t");

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public int getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(int completionTime) {
        this.completionTime = completionTime;
    }

    public int getTurnAroundTime() {
        return turnAroundTime;
    }

    public void setTurnAroundTime(int turnAroundTime) {
        this.turnAroundTime = turnAroundTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getResponseTIme() {
        return responseTIme;
    }

    public void setResponseTIme(int responseTIme) {
        this.responseTIme = responseTIme;
    }


}
