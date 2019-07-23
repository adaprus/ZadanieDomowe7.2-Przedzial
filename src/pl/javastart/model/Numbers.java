package pl.javastart.model;

public class Numbers {

    public void showNumbers(){
        int i = 0;
        double number = 0;
        while(number < 3.1){
            System.out.printf("%.1f ", number);
            i++;
            number += 0.1;
        }
    }

    public void showNumbers2(){
        int i = 0;
        double number = 0;

        do {
            System.out.printf("%.1f ", number);
            i++;
            number += 0.1;
        } while (number < 3.1);
    }
}
