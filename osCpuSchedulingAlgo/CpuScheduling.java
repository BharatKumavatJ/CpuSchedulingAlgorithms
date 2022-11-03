import java.util.Scanner;

public class CpuScheduling {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("How many processes do you have ? ");
        int numberOfProcess = sc.nextInt();
        Process process[] = new Process[numberOfProcess];

        for(int i = 0; i < numberOfProcess; i++){
            int id = sc.nextInt();
            int arrivalTIme = sc.nextInt();
            int burstTime = sc.nextInt();

            process[i] = new Process(id, arrivalTIme,burstTime);

        }

        System.out.println("1. FCFC first come first serve");
        System.out.println("2. SJF sortest job first ");
        System.out.println("3. SRTF sortest remaining job first");
        System.out.println("Enter your choice : ");
        int algo = sc.nextInt();


        switch (algo){
            case 1:
                FCFC fcfc = new FCFC();
                fcfc.implement(process);
            break;
            case 2:
                SJF sjf = new SJF();
                sjf.implement(process);
            break;

        }

        PrintStatics obj = new PrintStatics();

        obj.print(process);
    }
}
