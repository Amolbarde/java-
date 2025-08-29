import java.util.*;

class CricketPlayer {
    String name;
    int noi, non, totr, batav;

    // Constructor
    CricketPlayer(String name, int noi, int non, int totr) {
        this.name = name;
        this.noi = noi;
        this.non = non;
        this.totr = totr;
    }

    // Batting average
    int batavg() {
        if (noi - non != 0) {
            batav = totr / (noi - non);
        } else {
            batav = 0; // avoid divide by zero
        }
        return batav;
    }

    // Sorting function
    static void sortPlayers(CricketPlayer cp[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (cp[i].batav > cp[j].batav) {
                    CricketPlayer t = cp[i];
                    cp[i] = cp[j];
                    cp[j] = t;
                }
            }
        }
    }

    // Display function
    void disp() {
        System.out.println("Name = " + name + 
                           ", No of Innings = " + noi + 
                           ", No of Not Out = " + non + 
                           ", Total Runs = " + totr + 
                           ", Batting Average = " + batav);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of cricket players: ");
        int n = sc.nextInt();

        CricketPlayer cp[] = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of player " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter no of innings: ");
            int noi = sc.nextInt();

            System.out.print("Enter no of not out: ");
            int non = sc.nextInt();

            System.out.print("Enter total runs: ");
            int totr = sc.nextInt();

            cp[i] = new CricketPlayer(name, noi, non, totr);
            cp[i].batavg(); // calculate average
        }

        System.out.println("\n--- Player details before sorting ---");
        for (int i = 0; i < n; i++) {
            cp[i].disp();
        }

        CricketPlayer.sortPlayers(cp, n);

        System.out.println("\n--- Player details after sorting (by average) ---");
        for (int i = 0; i < n; i++) {
            cp[i].disp();
        }
    }
}