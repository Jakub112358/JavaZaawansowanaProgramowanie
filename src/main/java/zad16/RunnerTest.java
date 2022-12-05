package zad16;

import java.time.LocalTime;

public class RunnerTest {
    public static void main(String[] args) {
        System.out.println(Runner.getFitnessLevel(LocalTime.of(1, 15)));
        System.out.println(Runner.getFitnessLevel(LocalTime.of(3, 15)));
        System.out.println(Runner.getFitnessLevel(LocalTime.of(3, 16)));
        System.out.println(Runner.getFitnessLevel(LocalTime.of(4, 0)));
        System.out.println(Runner.getFitnessLevel(LocalTime.of(4, 1)));
        System.out.println(Runner.getFitnessLevel(LocalTime.of(20, 15)));
        System.out.println(Runner.getFitnessLevel(null));
    }
}
