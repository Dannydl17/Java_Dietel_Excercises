package task;

public class CharacterArray {
    public static void main(String[] args) {
      printCharacter();
    }

    public static void printCharacter(){
        char[][] characters = new char[3][3];
        characters[0][0] = 'x';
        characters[0][1] = 'o';
        characters[0][2] = 'x';
        characters[1][0] = 'x';
        characters[1][1] = 'x';
        characters[1][2] = 'o';
        characters[2][0] = 'o';
        characters[2][1] = 'x';
        characters[2][2] = 'x';
        for (int index = 0; index < characters.length; index++) {
            printInnerColumn(characters, index);
        }
    }

    public static void printInnerColumn(char[][] characters, int index){
        for (int innerColumn = index; innerColumn > 0; innerColumn--) {
            System.out.print(characters[index][innerColumn] + "  ");
        }
        System.out.println();

    }

}
