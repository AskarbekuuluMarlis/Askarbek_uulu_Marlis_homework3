//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] numbers = {3, 19, -3, 10, 5, 7, -9, -1, -20, 15, 11, -19, 40, -16, 31};

        boolean flag = false;
        int vol = 0;
        int sum = 0;

        for (double number : numbers) {
            if (number < 0) {
                flag = true;
            }
            if (flag == true && number > 0) {
                vol += 1;
                sum += number;
            }

        }
        System.out.println(sum / vol);

    }
}

