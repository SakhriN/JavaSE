package dbz.superexempledelespace.exo3;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<String> callableTask = () -> {
            for (int i = 1; i <= 5;i++){
                CalculatorCallable calculatorCallable = new CalculatorCallable(i);
                System.out.println("Le cube de " + i + " : " + calculatorCallable.call());
                Thread.sleep(400);
            }
            return "Resultat du callable terminé";
        };

        Future<String> futureResult = executor.submit(callableTask);

        System.out.println("Resultat de callable : "+futureResult.get());
        executor.shutdown();
    }
}