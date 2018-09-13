import TSim.*;
import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class Lab1 {
	// private Semaphore semaphore = new Semaphore(4);
    private AddingArrayList<int[]> switches;
    private AddingArrayList<Semaphore> semaphores;
    private AddingArrayList<int[]> sensors;

    private int switchesIndex;
    private int semaphoreIndex;
    private int sensorsIndex;
    
    public Lab1(int speed1, int speed2) {
    	
    TSimInterface tsi = TSimInterface.getInstance();
    
    switches =  new AddingArrayList<>();
    semaphores =  new AddingArrayList<>();
    sensors =  new AddingArrayList<>();
    
    switchesIndex = 0;
    semaphoreIndex = 0;
    sensorsIndex = 0;
    
    this.addSwitches();
    this.addSemaphores();
    this.addSensors();
    
    Thread train1 = new Train(1, speed1, true);
    Thread train2 = new Train(2, speed2, false);
    
    train1.start();
    train2.start();
    
  }
    private void addSwitch(int xPos, int yPos) {
    	switches.set(switchesIndex, new int[] {xPos, yPos});
    	switchesIndex++;
    }
    
    private void addSwitches() {
    	addSwitch(17,7);	
    	addSwitch(15,9);
    	addSwitch(14,9);
    	addSwitch(3,11);
    }
    
    private void addSemaphore() {
    	semaphores.set(semaphoreIndex, new Semaphore(1, true));
    	semaphoreIndex++;
    }
    private void addSemaphores() {
    	addSemaphore();
    	addSemaphore();
    	addSemaphore();
    	addSemaphore();
    	addSemaphore();
    	addSemaphore();
    }
    
    private void addSensor(int xPos, int yPos) {
    	sensors.set(sensorsIndex, new int[] {xPos, yPos});
    	sensorsIndex++;
    }
    
    
    
    

   
    
/*
    try {
      tsi.setSpeed(1,speed1);
    } 
    catch (CommandException e) {
      e.printStackTrace();    // or only e.getMessage() for the error
      System.exit(1);
    } */
    
}

