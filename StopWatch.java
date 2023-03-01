package SortAnalysis;

/*
 * Class: StopWatch
 * 
 * Description:
 *   start() ->  Starts the timer
 *   stop()  ->  Stops the timer
 *   long getElapsedTime()  ->  returns the difference between stop() and star() as a long
 */

public class StopWatch {
  
  private double startTime = 0;
  private double stopTime = 0;
  
  
  public void start() 
  {
    this.startTime = System.nanoTime();
  }
  
  
  public void stop() 
  {
    this.stopTime = System.nanoTime();
  }
  
  
  //elapsed time in "Donald" time  (nanosecond/1000)
  public double getElapsedTime()
  {
    double elapsed;   
    elapsed = (stopTime - startTime)/1000;    
    return elapsed;
  }
  
}