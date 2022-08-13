public class Main {
    public static void main(String[] args) {
        //задача 1
        int[] first = new int[]{1, 2, 3};
        double[] sekond = {1.57, 7.654, 9.986};
        int[] third = new int[3];
        third[0] = 4;
        third[1] = 15;
        third[2] = 20;

        //Задача 2
        int i;
        for (i = 0; i < first.length; i++) {
            if (i == first.length - 1) {
                System.out.print(first[i]);
            } else {
                System.out.print(first[i] + ",");
            }
        }
        System.out.println();
        i=0;
        for (i = 0; i < sekond.length; i++) {

                if (i == sekond.length - 1) {
                    System.out.print(sekond[i]);
                } else {
                    System.out.print(sekond[i] + ",");
                }
            }
            System.out.println();
        i=0;
        for (i = 0; i < third.length; i++) {

            if (i == third.length - 1) {
                System.out.print(third[i]);
            } else {
                System.out.print(third[i] + ",");
            }
        }
        System.out.println();

        // Задача 3

        for (i = first.length-1; i>=0; i--) {
            if (i == 0) {
                System.out.print(first[i]);
            } else {
                System.out.print(first[i] + ",");
            }
        }

        System.out.println();
        for (i = sekond.length-1; i>=0; i--) {
            if (i == 0) {
                System.out.print(sekond[i]);
            } else {
                System.out.print(sekond[i] + ",");
            }
        }
        System.out.println();
        for (i = third.length-1; i>=0; i--) {
            if (i == 0) {
                System.out.print(third[i]);
            } else {
                System.out.print(third[i] + ",");
            }
        }
        System.out.println();

        // Задача 4

        for (i = 0; i < first.length; i++) {
           if (first[i]%2!=0) {first[i]++;}
            System.out.print(first[i] + ",");
        }
        System.out.println();

        }
    }
