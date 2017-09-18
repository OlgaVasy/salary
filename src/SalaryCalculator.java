// Ex.4.20: SalaryCalculator class
// determines the gross pay for each of three employees

public class SalaryCalculator {

   private String name; // employees' names
   private int hours; // hours worked
   private double rate; // hourly rates

   // a constructor that initializes the three instance variables
   public SalaryCalculator(String name, int hours, double rate){

      //assign names to instance variables
      this.name = name;
      this.hours = hours;
      this.rate = rate;
   }
   //methods to set and retrieve the variables
   public void setName(String name){
      this.name = name;
   }
   public String getName(){
      return name;
   }

   public void setHours(int hours){this.hours = hours;
   }
   public int getHours(){
      return hours;
   }

   public void setRate(double rate){this.rate = rate;
   }
   public double getRate(){
      return rate;
   }

   //a method that determines the employees' gross pay
   public double getGrossPay() {
      if (hours <= 40)
         {double grossPay = hours * rate;
          return grossPay;}
      else
         {double grossPay = 40 * rate + (hours - 40)*(rate * 1.5);
         return grossPay;}
}}
