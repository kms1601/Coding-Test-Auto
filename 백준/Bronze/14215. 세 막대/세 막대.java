import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String[] str = s.nextLine().split(" ");
    int[] length = new int[3];

    for (int i = 0; i < 3; i++) {
      length[i] = Integer.parseInt(str[i]);
    }
    Arrays.sort(length);

    if (length[0] + length[1] <= length[2]) {
      length[2] = length[0] + length[1] - 1;
    }
    System.out.println(length[0] + length[1] + length[2]);
  }
}