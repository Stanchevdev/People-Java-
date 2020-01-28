import java.util.Scanner;

public class Test {
    static People people = new People();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Show the stats firstly? Type 'list' if you want to see it");
            System.out.println("If you want to see specific stats type 'spec'");
            System.out.println("Type 'no' to continue");
            String stat = input.nextLine();
            switch (stat) {
                case "list":
                case "ist":
                case "lit":
                case "lis":
                case "lst":
                    people.showStats();
                    break;
                case "spec":
                case "spe":
                case "pec":
                case "sec":
                case "spc":
                    System.out.println("To see how much Students(1), Rich Students(2) or Professors(3) this list has, type 1, 2 or 3:");
                    byte whichType;
                    while (true) {
                        whichType = input.nextByte();
                        if (whichType < 1 || whichType > 3) {
                            System.out.println("Try again!");
                        } else {
                            people.showSpecs(whichType);
                            break;
                        }
                    }
                    break;
                case "no":
                case "n":
                case "o":

                    break;
            }

            byte type;
            System.out.println("For STUDENT press 1, for RICH STUDENT press 2, for PROFESSOR press 3");

            while (true) {
                type = input.nextByte();
                if (type < 1 || type > 3) {
                    System.out.println("Try again!");
                } else {
                    break;
                }
            }

            String name;
            System.out.println("Name: ");

            while (true) {
                name = input.nextLine();
                if (name.equals("") || name.matches(".*\\d.*")) {
                    System.out.println("Write Your Name: ");
                } else {
                    break;
                }
            }

            String fam;
            System.out.println("Family Name: ");
            while (true) {
                fam = input.nextLine();
                if (fam.equals("") || fam.matches(".*\\d.*")) {
                    System.out.println("Write Your Family Name: ");
                } else {
                    break;
                }
            }

            System.out.println("Age: ");
            short age;
            while (true) {
                age = input.nextShort();
                if (age < 15 || age > 140) {
                    System.out.println("I think that you are lying for your age! Write it again:  ");
                } else {
                    break;
                }
            }
            people.setPerson(type, name, fam, age);
        }while (!input.nextLine().equals("stop"));
    }
}
