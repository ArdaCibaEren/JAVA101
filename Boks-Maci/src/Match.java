import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    String start;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        int a = 0;
        Random r = new Random();
        int choice = r.nextInt(2);
        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("*****YENİ ROUND*****");
                if (a == 0) {
                    if (choice == 0) {
                        f2.health = f1.hit(f2);
                        if (isWin()) {
                            break;
                        }
                        f1.health = f2.hit(f1);
                        if (isWin()) {
                            break;
                        }
                        printScore();
                    } else {
                        f1.health = f2.hit(f1);
                        if (isWin()) {
                            break;
                        }
                        f2.health = f1.hit(f2);
                        if (isWin()) {
                            break;
                        }
                        printScore();
                    }
                    a = 555;
                } else {
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçi kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Maçı kazanan : " + f1.name);
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("-------------");
        System.out.println(f1.name + "Kalan can \t:" + f1.health);
        System.out.println(f2.name + "Kalan can \t:" + f2.health);
    }
}


//public int getRandom(int lower, int upper) {
//        Random random = new Random();
//        return random.nextInt((upper - lower) + 1) + lower;
//    }
//
//
//        int chance = getRandom(0, 100);
//        if (chance < 10) {
//            Start(f1)
//        } else {
//            Start(f2)
//        }