import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RunningRace race = new RunningRace(10);

        Runner runner1 = new Runner("Jakub", "Maly", 25, 45.32);
        Runner runner2 = new Runner("David", "Kovar", 30, 42.15);
        Runner runner3 = new Runner("Anna", "Sedlackova", 28, 48.76);
        Runner runner4 = new Runner("Ondrej", "Polak", 35, 39.88);
        Runner runner5 = new Runner("Tereza", "Nemcova", 22, 51.20);
        Runner runner6 = new Runner("Filip", "Marek", 45, 55.43);
        Runner runner7 = new Runner("Klara", "Vlckova", 30, 46.92);
        Runner runner8 = new Runner("Adam", "Blaha", 28, 41.05);

        race.addRunner(runner1);
        race.addRunner(runner2);
        race.addRunner(runner3);
        race.addRunner(runner4);
        race.addRunner(runner5);
        race.addRunner(runner6);
        race.addRunner(runner7);
        race.addRunner(runner8);

        System.out.println("Vsichni ucastnici");
        race.printAllRunners();
        System.out.println();

        System.out.println("Vitez zavodu");
        System.out.println(race.getWinner());
        System.out.println();

        System.out.println("Nejstarsi ucastnik ");
        System.out.println(race.getOldestRunner());
        System.out.println();

        double timeLimit = 45.0;
        System.out.println("Bezci s casem pod " + timeLimit );
        Runner[] fastRunners = race.getRunnersUnderTime(timeLimit);
        for (Runner r : fastRunners) {
            System.out.println(r);
        }
        System.out.println();

        int searchAge = 30;
        System.out.println("Bezci ve veku " + searchAge + "let");
        ArrayList<Runner> runnersByAge = race.getRunnersByAge(searchAge);
        for (Runner r : runnersByAge) {
            System.out.println(r);
        }
        System.out.println();

        searchAge = 28;
        System.out.println("Bezci ve veku " + searchAge + " let");
        runnersByAge = race.getRunnersByAge(searchAge);
        for (Runner r : runnersByAge) {
            System.out.println(r);
        }
    }
}
