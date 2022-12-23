import java.util.ArrayList;

// Сколько существует вариантов превратить число a в b используя две команды;
// увеличить значение на 1 или в 2 раза.
// a и b - натуральные числа <= 25000
// a <= b
// Не использовать рекурсию

class Seminar4Task1 {

    public static void main(String[] args) {
        F(2, 25000);
    }

    static void F(int a, int b) {
        int index = a;
        long variant = 0;
        ArrayList<Long> result = new ArrayList<>();
        while (index <= b) {
            if (index == a) {
                variant = 1;
                result.add(variant);
            } else if (index % 2 != 0) {
                result.add(variant);
            } else if (index % 2 == 0 & index / 2 >= a) {
                variant = variant + result.get((index - a) / 2 - 1);
                result.add(variant);
            } else {
                result.add(variant);
            }
            index++;
        }
        System.out.print("variants = " + result.get(result.size() - 1));
    }
}