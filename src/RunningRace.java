import java.util.ArrayList;

public class RunningRace {
    private Runner[] Runners;
    private int Count;

    public RunningRace(int Capacity) {
        this.Runners = new Runner[Capacity];
        this.Count = 0;
    }

    public void addRunner(Runner Runner) {
        Runners[Count] = Runner;
        Count++;
    }

    public void printAllRunners() {
        for (int I = 0; I < Count; I++) {
            System.out.println(Runners[I]);
     }
    }
    public Runner getWinner() {
        Runner Winner = Runners[0];
        for (int I = 1; I < Count; I++) {
            if (Runners[I].getTime() < Winner.getTime()) {
                Winner = Runners[I];
            }
        }
         return Winner;
    }

    public Runner getOldestRunner() {
        Runner Oldest = Runners[0];
        for (int I = 1; I < Count; I++) {
            if (Runners[I].getAge() > Oldest.getAge()) {
                Oldest = Runners[I];
            }
        }
         return Oldest;
    }

     public Runner[] getRunnersUnderTime(double Time) {
        int MatchCount = 0;
        for (int I = 0; I < Count; I++) {
            if (Runners[I].getTime() < Time) {
                MatchCount++;
            }
        }
        
        Runner[] Result = new Runner[MatchCount];
        int Index = 0;
        for (int I = 0; I < Count; I++) {
            if (Runners[I].getTime() < Time) {
                Result[Index] = Runners[I];
                Index++;
            }
        }
        return Result;
    }
    public ArrayList<Runner> getRunnersByAge(int Age) {
        ArrayList<Runner> Result = new ArrayList<>();
        for (int I = 0; I < Count; I++) {
            if (Runners[I].getAge() == Age) {
                Result.add(Runners[I]);
            }
        }
        return Result;
      }

    public Runner[] getRunners() {
        return Runners;
    }
}
