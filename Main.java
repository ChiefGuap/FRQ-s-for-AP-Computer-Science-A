import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        for (;;) {
            System.out.println("Which FRQ would you like to view(Number 2 - 10): ");

            int choice = myObj.nextInt();
            System.out.println("Choice: " + choice);

            if (choice == 2) {
              class LightSequence {
              String sequence; //create sequence variable

              public LightSequence(String sequence) { //calls this.sequence to LightSequence
                this.sequence = sequence;
              }

              public String insertSegment(String segment, int ind) { // create new class insertSegment
                  StringBuilder sb = new StringBuilder(segment);
                sb.insert(ind, segment); //has str and int parameters
                return sb.toString();
              }

              public void changeSequence(String sequence) {
                  this.sequence = sequence; //sets this.sequence to sequence
              }

              public void display() {
                  System.out.println(sequence); //prints sequence
              }

          }
          LightSequence GradShow = new LightSequence("0101 0101 0101");

          GradShow.display();

          GradShow.changeSequence("0011 0011 0011");

          String resultSeq = GradShow.insertSegment("1111 1111", 4);

          System.out.println(resultSeq + "4");

          String oldSeq = "1100000111";
          String segment = "11";

          int index = oldSeq.indexOf(segment);

          String newSeq = oldSeq.substring(0, index) + oldSeq.substring(index + segment.length());
          System.out.println(newSeq + "11");

          int a = 4;
          int b = 5;
          double c = Math.sqrt((a * a) + (b * b));
          System.out.println(c);
              }

            else if (choice == 3) {
                System.out.println("3");
            }

            else if (choice == 4) {
                frq4 c = new frq4(10, 20);
                c.playGame();
            }

            else if (choice == 5) {
              System.out.println("Part 1");
              frq5 test = new frq5("1234 test ave");

              System.out.println(test.getHostName());

              test.setAddress("5678 testing ave");

              test.invite("Bob");

              System.out.println("Part 2");
              frq5_2 password1 = new frq5_2(4,"chs");
              System.out.println(password1.pwCount());
              System.out.println(password1.pwGen());
              System.out.println(password1.pwGen());
              System.out.println(password1.pwCount());
              frq5_2 pw2 = new frq5_2(6);
              System.out.println(pw2.pwCount());
              System.out.println(pw2.pwGen());
              System.out.println(pw2.pwCount());
              System.out.println(password1.pwCount());
            }

            else if (choice == 6) {
                String userWord;
                String userWord2;

                System.out.println("Enter any word (x2)");
                userWord = myObj.nextLine();
                userWord2 = myObj.nextLine();

                ArrayList<String> list = new ArrayList<String>();

                list.add(userWord);
                list.add(userWord2);
                list.add("Hellow");
                list.add("LeBron");
                list.add("Talking");
                list.add("Walking");
                list.add("Crying");
                list.add("tech-talking");

                for (String word : list) {
                    if (word.contains("ing")) {
                        System.out.println("The Words that end with -ing are " + word);
                    }
                }
            }

            else if (choice == 7) {
                ArrayList<String> possibleNames = new ArrayList<String>();
                possibleNames.add("test");
                possibleNames.add("test1");
                possibleNames.add("test2");
                possibleNames.add("test3");

                ArrayList<String> usedNames = new ArrayList<String>();
                usedNames.add("test2");

                frq7 test = new frq7(usedNames, possibleNames, "te", "st");
                test.setAvailableUserNames();

                System.out.println(test.getPossibleNames());
            }

            else if (choice == 8) {
                System.out.println("8");
                 System.out.println("false");
                 System.out.println("true");
                
            }

            else if (choice == 9) {
                frq9 book1 = new frq9("Frankenstein", "Mary Shelley");
                frq9 book2 = new frq9_sub("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");

                System.out.println(book1.printBookInfo());
                System.out.println(book2.printBookInfo());
            }

            else if (choice == 10) {
                System.out.println("First Int");
                int a = myObj.nextInt();
                System.out.println("Second Int");
                int b = myObj.nextInt();
                frq10 test = new frq10();
                System.out.println("GCF: " + test.gcf(a, b));
                System.out.print("Reduce Fraction: ");
                test.reduceFraction(30, 10);
            }

            else {
                System.out.println("Enter a Valid Number");
            }
        }
    }

}