import java.util.ArrayList;

public class Main {
    public static void main(String[] Args) {

        RunningRace Race = new RunningRace(10);
        Runner Runner1 = new Runner("Jakub", "Maly", 25, 45.32);
        Runner Runner2 = new Runner("David", "Kovar", 30, 42.15);
        Runner Runner3 = new Runner("Anna", "Sedlackova", 28, 48.76);
        Runner Runner4 = new Runner("Ondrej", "Polak", 35, 39.88);
        Runner Runner5 = new Runner("Tereza", "Nemcova", 22, 51.20);
        Runner Runner6 = new Runner("Filip", "Marek", 45, 55.43);
        Runner Runner7 = new Runner("Klara", "Vlckova", 30, 46.92);
        Runner Runner8 = new Runner("Adam", "Blaha", 28, 41.05);

        Race.addRunner(Runner1);
        Race.addRunner(Runner2);
        Race.addRunner(Runner3);
        Race.addRunner(Runner4);
        Race.addRunner(Runner5);
        Race.addRunner(Runner6);
        Race.addRunner(Runner7);
        Race.addRunner(Runner8);

        System.out.println("Vsichni ucastnici");
        Race.printAllRunners();
        System.out.println();

        System.out.println("Vitez zavodu");
        System.out.println(Race.getWinner());
        System.out.println();

        System.out.println("Nejstarsi ucastnik ");
        System.out.println(Race.getOldestRunner());
        System.out.println();

        double TimeLimit = 45.0;
        System.out.println("Bezci s casem pod " + TimeLimit );
        Runner[] FastRunners = Race.getRunnersUnderTime(TimeLimit);
        for (Runner R : FastRunners) {
            System.out.println(R);
        }
        System.out.println();

        int SearchAge = 30;
        System.out.println("Bezci ve veku " + SearchAge + "let");
        ArrayList<Runner> RunnersByAge = Race.getRunnersByAge(SearchAge);
        for (Runner R : RunnersByAge) {
            System.out.println(R);
        }
        System.out.println();

        SearchAge = 28;
        System.out.println("Bezci ve veku " + SearchAge + " let");
        RunnersByAge = Race.getRunnersByAge(SearchAge);
        for (Runner R : RunnersByAge) {
            System.out.println(R);
        }
    }
}
