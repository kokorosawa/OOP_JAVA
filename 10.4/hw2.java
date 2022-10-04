/**
 * This is Hw2 class.
 */

public class Hw2 {
  /**
   * This is method main.
   *
   *  @param args input value
   */
  public static void main(String[] args) {
    String school  = "Feng Chia University";
    String department = "Information Engineering and Computer Science";
    String sentence = department + " of " + school;
    System.out.println("length : " + sentence.length());
    System.out.println("index of last 'n' : " + sentence.lastIndexOf("n"));
    System.out.println(sentence.substring(28,36));
    System.out.println(sentence.replace('e','1'));
    // 印出department of school
  }
}
