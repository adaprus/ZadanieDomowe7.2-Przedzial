package pl.javastart.model;

public class Numbers {

    public void showNumbers() {
        double number = 0;

        while (number < 3) {
            System.out.printf("%.1f, ", number);
            number += 0.1;
        }
        System.out.printf("%.1f", number);
    }

    public void showNumbers2() {
        double number = 0;

        do {
            System.out.printf("%.1f, ", number);
            number += 0.1;
        } while (number < 3);
        System.out.printf("%.1f", number);
    }
}
