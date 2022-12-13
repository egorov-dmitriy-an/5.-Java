import java.util.*;

class Seminar2Task1 {
    public static void main(String args[]) {
        tower(5, 1, 2, 3);
        System.out.println("Victory! All rings on the third rod.");
    }

    public static void tower(int index, int one, int two, int three) {
        if (index == 1) {
            System.out.println("Move the disk from the rod " + one + " on the rod " + three);
        } else {
            tower(index - 1, one, three, two);
            System.out.println("Move the disk from the rod " + one + " on the rod " + three);
            tower(index - 1, two, one, three);
        }
    }
}