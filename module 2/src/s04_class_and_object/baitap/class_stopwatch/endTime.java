package s04_class_and_object.baitap.class_stopwatch;

import java.math.BigInteger;

public class endTime {

        public static void main(String[] args) {

            endTime stopwatch1 = new endTime();
            stopwatch1.start();
            Fibonacci(45);
            stopwatch1.stop();


            System.out.println("Elapsed time in milliseconds: "
                    + stopwatch1.getElapsedMilliseconds());

            System.out.println("Elapsed time in seconds: "
                    + stopwatch1.getElapsedSeconds());

            System.out.println("Elapsed time in minutes: "
                    + stopwatch1.getElapsedMinutes());

            System.out.println("Elapsed time in hours: "
                    + stopwatch1.getElapsedHours());

        }

    private String getElapsedHours() {
        return null;
    }

    private String getElapsedMinutes() {
        return null;
    }

    private String getElapsedSeconds() {
        return null;
    }

    private String getElapsedMilliseconds() {
        return null;
    }

    private void stop() {

    }

    private void start() {

    }

    private static BigInteger Fibonacci(int n) {
            if (n < 2)
                return BigInteger.ONE;
            else
                return Fibonacci(n - 1).add(Fibonacci(n - 2));
        }
    }

