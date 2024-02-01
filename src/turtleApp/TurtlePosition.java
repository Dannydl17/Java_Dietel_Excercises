package turtleApp;

public class TurtlePosition {

    private int rowPosition;
    private int columnPosition;
    public TurtlePosition(int rowPosition, int columnPosition) {
      this.rowPosition = rowPosition;
      this.columnPosition = columnPosition;
    }

    @Override
    public String toString(){
        return columnPosition + " " + rowPosition;
    }

    @Override
    public boolean equals(Object object){
        if(this.getClass() != object.getClass())return false;
        TurtlePosition comparedPosition = (TurtlePosition)object;
        if (this.rowPosition == comparedPosition.rowPosition &&
            this.columnPosition == comparedPosition.columnPosition) {
            return super.equals(object);}
        return false;
    }
}
