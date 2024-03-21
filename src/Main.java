import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

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

        // practice for looping
        int n = 5;
        //for loop
        for(int i = 1; i <= n; i++){
            System.out.println("Java is fun if code work");
            System.out.println(i);
        }

        // practice for looping with trim Name
        String Name = "Yuninda Faranika";
        String[] arrOfStr = Name.split(" ");

        //for loop
        for(int i = 0; i < arrOfStr.length; i++){
            System.out.println("Java is fun if code work");
            System.out.println(arrOfStr[i]);
        }

        // practice for looping with trim Name
        String names = "Yuninda Faranika";
        String[] namesplitted = names.split(" ");

        //for loop
        for(String item : namesplitted){
            System.out.println("Java is fun if code work");
            System.out.println(item);
        }

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        for (Integer num : numbers){
            System.out.println(num);
        }

        // looping day
        List<String> Days = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        for (String day : Days){
            System.out.println(day);
        }

        // while do
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);

        //for genap data only
        for (int j = 0; j<10; j++){
            if(j % 2 ==0){
                continue;
            }
            System.out.println(j);
        }

        System.out.println("Search Character");
        String[] nama = {"a", "b", "c", "d"};
        String searchTarget = "b";
        for(int k=0;k< nama.length; k++){
            if(nama[k].equals(searchTarget)) {
                System.out.println(searchTarget + " Found at index" + k);
                break;
            }
            System.out.println(nama[k]+ " is not "+searchTarget );
        }


    }
}