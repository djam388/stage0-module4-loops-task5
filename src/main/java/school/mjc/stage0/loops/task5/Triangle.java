package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int y = 1; y <= cathetusLength; y++) {
            for (int x = 1; x <= y; x++) {
                    System.out.print(8);
            }
            System.out.println();
        }

    }
}
