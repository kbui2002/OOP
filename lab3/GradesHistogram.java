package lab3;

import java.util.Scanner;
/**
 * 2.12 grade histogram
 */
public class GradesHistogram {
    public static void horizontal(int[] grade) {
        int[] range = counts(grade);
        for (int i = 0; i < range.length; i++) {
            if (range[i] != 0) {
                if (i == 0) {
                    System.out.printf("%2d-%2d: ", 0, 9);
                } else if (i == 1) {
                    System.out.printf("10-%3d: ", 19);
                } else if (i == 2) {
                    System.out.printf("20-%3d: ", 29);
                } else if (i == 3) {
                    System.out.printf("30-%3d: ", 39);
                } else if (i == 4) {
                    System.out.printf("40-%3d: ", 49);
                } else if (i == 5) {
                    System.out.printf("50-%3d: ", 59);
                } else if (i == 6) {
                    System.out.printf("60-%3d: ", 69);
                } else if (i == 7) {
                    System.out.printf("70-%3d: ", 79);
                } else if (i == 8) {
                    System.out.printf("80-%3d: ", 89);
                } else {
                    System.out.print("90-100: ");
                }
                for (int j = 0; j < range[i]; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                if (i == 0) {
                    System.out.printf("%2d-%3d: ", 0, 9);
                } else if (i == 1) {
                    System.out.printf("10-%3d: ", 19);
                } else if (i == 2) {
                    System.out.printf("20-%3d: ", 29);
                } else if (i == 3) {
                    System.out.printf("30-%3d: ", 39);
                } else if (i == 4) {
                    System.out.printf("40-%3d: ", 49);
                } else if (i == 5) {
                    System.out.printf("50-%3d: ", 59);
                } else if (i == 6) {
                    System.out.printf("60-%3d: ", 69);
                } else if (i == 7) {
                    System.out.printf("70-%3d: ", 79);
                } else if (i == 8) {
                    System.out.printf("80-%3d: ", 89);
                } else {
                    System.out.print("90-100: ");
                }
                System.out.println();
            }
        }
    }

    public static int[] counts(int[] grade) {
        int[] range = new int[10];
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] >= 0 && grade[i] <= 9) {
                range[0]++;
            } else if (grade[i] >= 10 && grade[i] <= 19) {
                range[1]++;
            } else if (grade[i] >= 20 && grade[i] <= 29) {
                range[2]++;
            } else if (grade[i] >= 30 && grade[i] <= 39) {
                range[3]++;
            } else if (grade[i] >= 40 && grade[i] <= 49) {
                range[4]++;
            } else if (grade[i] >= 50 && grade[i] <= 59) {
                range[5]++;
            } else if (grade[i] >= 60 && grade[i] <= 69) {
                range[6]++;
            } else if (grade[i] >= 70 && grade[i] <= 79) {
                range[7]++;
            } else if (grade[i] >= 80 && grade[i] <= 89) {
                range[8]++;
            } else if (grade[i] >= 90 && grade[i] <= 100) {
                range[9]++;
            }
        }
        return range;

    }

    public static void verticals(int[] grade) {
        int[] range = counts(grade);
        int max = range[0];
        for (int i = 0; i < range.length; i++) {
            if (max < range[i])
                max = range[i];
        }
        for (int row = 0; row <= max; row++) {
            for (int col = 0; col < range.length; col++) {
                if (row == max) {
                    if (col == 0) {
                        System.out.printf("%2d-%2d ", 0, 9);
                    } else if (col == 1) {
                        System.out.print("10-19 ");
                    } else if (col == 2) {
                        System.out.print("20-29 ");
                    } else if (col == 3) {
                        System.out.print("30-39 ");
                    } else if (col == 4) {
                        System.out.print("40-49 ");
                    } else if (col == 5) {
                        System.out.print("50-59 ");
                    } else if (col == 6) {
                        System.out.print("60-69 ");
                    } else if (col == 7) {
                        System.out.print("70-79 ");
                    } else if (col == 8) {
                        System.out.print("80-89 ");
                    } else {
                        System.out.print("90-100 ");
                    }
                } else {
                    if (max - range[col] - 1 < row) {
                        System.out.print("  *   ");
                    } else {
                        System.out.print("      ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int num_item = sc.nextInt();
        int[] item = new int[num_item];
        int input;
        for (int i = 0; i < item.length; i++) {
            System.out.printf("Enter the grade for student %d: ", i + 1);
            input = sc.nextInt();
            if (input >= 0 && input <= 100) {
                item[i] = input;
            } else {
                i--;
                System.out.print("Error input");
            }
        }
        horizontal(item);
        System.out.println();
        verticals(item);
    }
}
