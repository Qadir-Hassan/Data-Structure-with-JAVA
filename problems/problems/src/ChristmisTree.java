public class ChristmisTree {

    public static void main(String[] args) {
        int treeHeight = 5; // You can adjust the height of the tree

        for (int i = 0; i < treeHeight; i++) {
            // Print spaces before the stars
            for (int j = 0; j < treeHeight - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }

        // Print the tree trunk
        for (int i = 0; i < treeHeight - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("|");

    }
}

