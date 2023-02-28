public class Multiplicationtable {
    public static void main(String[] args)
    {
        System.out.println("\t 12X12 Multiplication Table\n");

        for(int row = 1; row <= 12; row++) {
            System.out.print("|");
            for (int col = 1; col <= 12; col++) {
                System.out.printf("%3d |", row * col);
            }
            System.out.println();
        }
    }
}
