import java.util.*;

public class a_loot_sharing {

    public static void main(String args[]) {

        int bicornPirates;
        int tricornPirates;
        int gold;

        Scanner sc = new Scanner(System.in);

        bicornPirates = sc.nextInt();

        tricornPirates = sc.nextInt();

        gold = sc.nextInt();

        if(tricornPirates * 3 >= gold) {

            System.out.println("RHUM!");
        } else {

            gold -= tricornPirates * 3;

            if(bicornPirates * 2 > gold) {

                System.out.println("RHUM!");
            } else {

                gold -= bicornPirates * 2;
                System.out.println("LOOT!");
            }
        }
    }
}
