package AssigmentNdClassWork;

public class Practices4 {
    public static void main(String[] args) {
        int row = 1;

        while ( row <= 8 ) {
             int column = 1;

             if ( row % 2 == 0 )
                 System.out.print( " " );

             while ( column <= 8 ) {
                 System.out.print( "* " );
                 column++;
                 }

             System.out.println();
             row++;
             }
         }
       }

