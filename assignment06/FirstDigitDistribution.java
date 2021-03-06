package assignment06;

/**
   This class analyzes the distribution of the first digit of values
   from a sequence.
*/
public class FirstDigitDistribution
{
   private int[] counters;

   /**
      Constructs a distribution whose counters are set to zero.
   */
   public FirstDigitDistribution()
   {
      counters = new int[10];
   }

   /**
      Processes values from this sequence.
      @param seq the sequence from which to obtain the values
      @param valuesToProcess the number of values to process
   */
   public void process(Sequence seq, int valuesToProcess)
   {
      for (int i = 1; i <= valuesToProcess; i++)
      {
         int value = seq.next();
         int firstDigit = Character.getNumericValue(Integer.toString(value).charAt(0));
         //System.out.println(firstDigit);
         counters[firstDigit]++;
      }
   }

   /**
      Displays the counter values of this distribution.
   */
   public void display()
   {
        int max = 0;
      for (int i = 0; i < counters.length; i++)
      {
        if(counters[i]>max)
            max = counters[i];
      }
      for (int i = 0; i < counters.length; i++)
      {
         System.out.print(i + ": ");
         for(int a = 0;a<counters[i]*40/max;a++){
         System.out.print("*");
         }
         System.out.println("");
      }
   }
}
