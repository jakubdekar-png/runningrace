import java.util.ArrayList;

public class RunningRace {
    private Runner[] runners;
    private int count;

    public RunningRace(int capacity) {
        this.runners = new Runner[capacity];
        this.count = 0;
    }

    public void addRunner(Runner runner) {
        if (count < runners.length) {
            runners[count] = runner;
            count++;
        }
    }

    public void printAllRunners() {
        for (int i = 0; i < count; i++) {
            System.out.println(runners[i]);
        }
    }

    public Runner getWinner() {
        if (count == 0) {
            return null;
        }
        Runner winner = runners[0];
        for (int i = 1; i < count; i++) {
            if (runners[i].getTime() < winner.getTime()) {
                winner = runners[i];
            }
        }
        return winner;
    }

    public Runner getOldestRunner() {
        if (count == 0) {
            return null;
        }
        Runner oldest = runners[0];
        for (int i = 1; i < count; i++) {
            if (runners[i].getAge() > oldest.getAge()) {
                oldest = runners[i];
            }
        }
        return oldest;
    }

    public Runner[] getRunnersUnderTime(double time) {
        int matchCount = 0;
        for (int i = 0; i < count; i++) {
            if (runners[i].getTime() < time) {
                matchCount++;
            }
        }
        
        Runner[] result = new Runner[matchCount];
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (runners[i].getTime() < time) {
                result[index] = runners[i];
                index++;
            }
        }
        return result;
    }

    public ArrayList<Runner> getRunnersByAge(int age) {
        ArrayList<Runner> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (runners[i].getAge() == age) {
                result.add(runners[i]);
            }
        }
        return result;
    }

    public Runner[] getRunners() {
        return runners;
    }
}
