import io.github.noooda.countup.service.CounterService;
import io.github.noooda.countup.util.InputReader;

public class Main {
    public static void main(String[] args) {
        CounterService counterService = new CounterService(); 
        InputReader inputReader = new InputReader();

        System.err.println("Please enter an integer. Enter 0 to exit.");

        while (true) {
            int number;

            try {
                number = inputReader.readInt();
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer");
                continue;
            }

            if (number == 0) {
                System.out.println("Finish.");
                break;
            }

            counterService.increment(number);
            System.out.println("Current total: " + counterService.getTotal());
        }
    } 
}