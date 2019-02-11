// William Turner. This is the Date class. It represents a date in month/day/year format.
public class Date {
  
  // represents the month of a date
  private int month;
 
  // represents the day a date
  private int day;
 
  // represents the year of a date
  private int year;
 
  public Date(int month, int day, int year) {
 
    this.month = month;
    this.day = day;
    this.year = year;
   
 }  
 
  /* takes two dates and returns the difference between the two. Returns positive if the first
  * date comes after the second date, negative if it comes before. */
  public static int difference(Date d3, Date d4) {
   
    return d3.daysFromJan1() - d4.daysFromJan1();  
 }
 
  // gets the day of a date.
  public int getDay() {
   
  return day;    
 }
  
  // gets the month of a date.
  public int getMonth() {
   
    return month;  
 }
 
  // gets the year of a date.
  public int getYear() {
   
    return year;  
 }
 
  // gives month/day/year for a date.
  public String toString() {
   
    return  month + "/" + day + "/" + year;   
 }
 
  // compares whether or not two dates are identical.
  public boolean equals(int mm, int dd, int yy) {
   
    if (month == mm && day == dd && year == yy) 
      return true;
    else
      return false; 
 }
 
  // calculates the number of days between a given date and Jan. 1.
  public int daysFromJan1() {
    
    switch(month) {
   
      case 1:
      return (0 + (day - 1));
  
      case 2:
      return (31 + (day - 1));
  
      case 3:
      return (59 + (day - 1));
  
      case 4:
      return (90 + (day - 1));
  
      case 5:
      return (120 + (day - 1));
  
      case 6:
      return (151 + (day - 1));
  
      case 7:
      return (181 + (day - 1));
  
      case 8:
      return (212 + (day - 1));
  
      case 9:
      return (242 + (day - 1));
  
      case 10:
      return (273 + (day - 1));
  
      case 11:
      return (303 + (day - 1));
  
      case 12:
      return (334 + (day - 1)); 
    
      default:
        return 0;
    }   
  }
}