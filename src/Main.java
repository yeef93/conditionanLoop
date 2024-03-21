public class Main {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {

        int number = 2;
        String result = switch(number){
            case 1 -> "Number is 1";
            case 2 -> "Number is 2";
            case 3 -> "Number is 3";
            default -> "Many";
        };

        System.out.println(result);

        int number1 = 4;
        String results = switch(number1){
            case 1 -> "Number is 1";
            case 2 -> "Number is 2";
            case 3 -> "Number is 3";
            default -> {
                if(number1 % 2 ==0) yield "Many but even";
                yield "Many but odd";
            }
        };

        System.out.println(results);


        Day today = Day.SATURDAY;
                var isweekday = switch (today){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                yield true;
            }
            case SATURDAY, SUNDAY -> {
                yield false;
                    }
        };
         System.out.println("Should we work today? : "+isweekday);

         int number2 = -15;
         String result2 = (number2 > 0)? "Its Positive":(number2 < 0)? "Its Negative": "Its Zero";
         System.out.println(result2);

         char target = 'Z'; // example character
        int encodedValue = (target == '#')? 0 : (target == 'X')? 1 : (target == 'Z')?2:3;
        System.out.println(encodedValue);

    }
}