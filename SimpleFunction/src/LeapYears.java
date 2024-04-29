



 class Main {
    public static void main(String[]Args){

        int Year ;

        for (Year = 2000; Year<=2100; ++Year ){

           if(Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
               System.out.println(Year + " is a leap year");
           }
            else if(Year/4 != 0 ){

                continue;


               }
            }
        }
    }



