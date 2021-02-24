class CheckLeapYear{
    public static void main(String[] args) {
     int Year;
         Year= Integer.parseInt(args[0]);
         boolean Leap = false;
         if (Year % 4 == 0) {
              if (Year % 100 == 0) {
                   if (Year % 400 == 0)
                        Leap = true;
                   else
                        Leap = false;
                   }
                   else
                     Leap = true;
              }
              else
                Leap = false;

          if (Leap)
             System.out.println(Year + " is a Leap year.");
         else
             System.out.println(Year + " is not a Leap year.");            
 
         }
    }
