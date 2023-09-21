package AssigmentNdClassWork;

public enum School {

    PENDING(500),
    UNASSIGNED(1000),
    ASSIGNED(200),
    COMPLETED(200);

    private int state;
    private School(int state){
        this.state = state;
    }

    public static School getSchool() {
        return null;
    }


}
