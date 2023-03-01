package SortAnalysis;

public class SortAnalysis
{
	public static void main(String[] args)
	{
		SortAnalysis helpme = new SortAnalysis();
		StopWatch stopwatch = new StopWatch();
		
		for (int length = 1; length <= 100000; length *= 10)
		{
			double[] times = new double[10];
			for (int i = 0; i < 10; i++)
			{
				stopwatch.start();
				Sorts.quickSort(ArrayGen.fewUniqueArray(length));
				stopwatch.stop();
				times[i] = stopwatch.getElapsedTime();
			}
			if (length != 1)
			{
				System.out.println(helpme.average(times));
			}
		}
	}
	
	public double average(double[] numbers)
	{
		double sum = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			sum += numbers[i];
		}
		return sum / numbers.length;
	}
}