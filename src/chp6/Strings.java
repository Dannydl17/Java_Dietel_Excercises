package chp6;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String beautifiedString = beautifyString(input);
        System.out.println("Beautified String: " + beautifiedString);
    }

          public static String addFullStopIfNeeded(String str) {
                if (!str.endsWith(".")) {
                    str += ".";
                }
                return str;
          }

            public static String capitalizeFirstLetterIfNeeded(String str) {
                if (!str.isEmpty() && Character.isLowerCase(str.charAt(0))) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
                return str;
            }

              public static String beautifyString(String str) {
                str = addFullStopIfNeeded(str);
                str = capitalizeFirstLetterIfNeeded(str);
                return str;
            }
        }

