package j;

import java.util.Scanner;

public class Algo1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    int count = scanner.nextInt();  // 입력 받은 줄 세기
    System.out.println("Hello "+ resolve(count)); // Hello 이후에 하나씩 출력
    scanner.close();
}
  public static String resolve(int count) {
    String nameAll = "";  //출력할 문자열
    Scanner scanner = new Scanner(System.in); //scanner
    for (int i = 0; i < count; i++) {   // count 하나씩 크면서
      String name = scanner.next();   
      if (i < count -1) { // 마지막 하나 전까지는 뒤에 ,를 사용
        nameAll += name + ",";
      } else {  //마지막 것에는 뒤에 .을 붙이기
        nameAll += name + ".";
      }
    }
    scanner.close();
    return nameAll;
  }

}
