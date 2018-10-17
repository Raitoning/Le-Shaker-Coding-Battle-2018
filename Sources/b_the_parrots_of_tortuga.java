import java.util.*;

public class b_the_parrots_of_tortuga {

    b_the_parrots_of_tortuga() {

        String goldAndTrainers;
        int gold;
        int numberOfTrainers;
        int max = 0;
        int bestTrainer = -1;

        Scanner sc = new Scanner(System.in);

        goldAndTrainers = sc.nextLine();

        String[] splited = goldAndTrainers.split("\\s+");

        gold = Integer.parseInt(splited[0]);

        numberOfTrainers = Integer.parseInt(splited[1]);

        String[] trainersName = new String[numberOfTrainers];
        int[] trainersPrice = new int[numberOfTrainers];
        int[] trainersCommission = new int[numberOfTrainers];

        for (int i = 0; i < numberOfTrainers; i++) {

            String tmp = sc.nextLine();
            String[] splits = tmp.split("\\s+");

            trainersName[i] = splits[0];
            trainersPrice[i] = Integer.parseInt(splits[1]);
            trainersCommission[i] = Integer.parseInt(splits[2]);
        }

        for (int i = 0; i < numberOfTrainers; i++) {

            int tmp = max;
            while(trainersPrice[i] * tmp + trainersCommission[i] <= gold) {

                if(max < tmp) {
                    max = tmp;
                    bestTrainer = i;
                }

                tmp++;
            }
        }

        if (bestTrainer != -1) {

            System.out.println(max);
            System.out.println(trainersName[bestTrainer]);
        } else {

            System.out.println("Impossible");
        }
    }

    public static void main(String[] args) {

        new b_the_parrots_of_tortuga();
    }
}
