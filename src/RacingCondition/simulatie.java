package RacingCondition;

public class simulatie {

    int totalTested=0;
    int numberStations = 50;
    int capacityTeststations = 10000;




    private class teststation implements Runnable{
        @Override
        public void run() {
            for (int i=0;i<capacityTeststations;i++){
                totalTested++;
            }
        }
    }

    void startSimulatie() throws InterruptedException {
        for (int i=0;i<numberStations;i++){
            new Thread(new teststation()).start();
        }
        System.out.println("Starting 2 second sleep period");
        Thread.sleep(2000);
        System.out.println("Total number tested: "+totalTested);
        System.out.println("Expected tests: " +(numberStations*capacityTeststations));
    }
}
