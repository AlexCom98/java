import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TernaryOperator {
    public static void main(String[] args) {
        int ora = LocalDateTime.now().getHour();
        int minute = LocalDateTime.now().getMinute();
        String perioada = ora >= 12 ? "pm" : "am";


        System.out.println(ora + ":" + minute);
        System.out.println(perioada);
        for(int i =1; i <10; i++){
            System.out.println(" ");
            for (int j = 1; j < 10 ; j++) {
                System.out.print(( i + " * " + j + " = " + (i*j) )+ " \t\t");

        }
    }

        }
    }

