package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int half = 0;
        int blank = 0;
        boolean even = false;
        if (height % 2 == 0) {
            half = height / 2;
            even = true;
        }
        else {
            half = (height / 2) + 1;
            even = false;
        }

        for (int y = 1; y <= height; y++) {
            if (y > half) {
                if (even == true) {
                    blank += 1;
                    even = false;
                }
                blank -= 1;
            }
            for (int x = 1; x <= height; x++) {
                if (y <= half) {
                    blank = y - 1;

                    if (x > blank && x <= (height - blank)) {
                        System.out.print(8);
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else {
                    if (x > blank && x <= (height - blank)) {
                        System.out.print(8);
                    }
                    else {
                        System.out.print(" ");
                    }

                }
            }
            System.out.println();
        }
    }
}
