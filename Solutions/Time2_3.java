public class Time2_3
{
  public static void main(String[] args)
  {
    int hour = 10;
    int minute = 59;
    int second = 35;
    final int N_S_I_D = 24 * 60 * 60;  //number of seconds in a day
    int sSM = hour*60*60+minute*60+second;  //sSM is secondsSinceMidnight
    int sED = N_S_I_D-(hour*60*60+minute*60+second); //sED is secondsuntilEndofDay
    double sID2 = 24.0 * 60 *60;
    double pDG = sSM / sID2 *100;  //pDG is percentoftheDayGone
    int hourB = 11;
    int minuteB = 32;
    int secondB = 20;
    int secondsSinceStart = (hourB*60*60+minuteB*60+secondB)-sSM;
    System.out.println("seconds since midnight " + sSM);
    System.out.println("seconds unitl the end of the day " + sED);
    System.out.printf("percent of day that has passed: %.1f%%\n" ,pDG);
    System.out.println("This is how long it took me do do this " + secondsSinceStart);
  }
}