public class Matriz {
    public static int[][] createBlock(int sizeX, int sizeY) {
        int[][] blockTable = new int[sizeX][sizeY];
        for (int rows = 0; rows < sizeX; rows++) {
            for (int cols = 0; cols < sizeY; cols++) {
                blockTable[rows][cols] = 100;
            }
        }
        return blockTable;
    }

    public static void printBlock(int[][] blockTable, int sizeX, int sizeY) {
        for (int rows = 0; rows < sizeX; rows++) {
            for (int cols = 0; cols < sizeY; cols++) {
                System.out.print(blockTable[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}
