public class InterestingDays {
   public static void main(String[] args) {
      Day apDay = new Day(2023, 5, 8);
      Day birthDay = new Day(2006, 2, 17);
      Day toDay = new Day(2023, 10, 17);
      
      System.out.print("Landen is ");
      System.out.print(toDay.daysFrom(birthDay));
      System.out.println(" days old.");
      
      System.out.print("There are ");
      System.out.print(toDay.daysFrom(apDay));
      System.out.println(" days until the AP CS exam.");
 
   }
}