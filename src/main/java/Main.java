import io.github.noooda.countup.controller.AppController;
import io.github.noooda.countup.service.CounterService;
import io.github.noooda.countup.util.InputReader;

public class Main {
    public static void main(String[] args) {
        // ここでクラスを初期化するのは良いのか
        InputReader inputReader = new InputReader(System.in);
        CounterService counterService = new CounterService();
        AppController appController = new AppController(inputReader, counterService);

        appController.run();
    } 
}