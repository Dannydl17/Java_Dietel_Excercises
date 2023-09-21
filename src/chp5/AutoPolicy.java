package chp5;

import java.util.Objects;

public class AutoPolicy {
        private int accountNumber;
        private String makeAndModel;
        private String state;

        public AutoPolicy(int accountNumber, String makeAndModel, String state) {
            this.accountNumber = accountNumber;
            this.makeAndModel = makeAndModel;
            this.state = state;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public void setMakeAndModel(String makeAndModel) {
            this.makeAndModel = makeAndModel;
        }

        public String getMakeAndModel() {
            return makeAndModel;
        }

        public void setState(String state) {
            if (Objects.equals(state, "CT") || Objects.equals(state, "MA") || Objects.equals(state, "ME") || Objects.equals(state, "NH") || Objects.equals(state, "NJ") || Objects.equals(state, "NY") || Objects.equals(state, "PA") || Objects.equals(state, "VT")){
                System.out.println("The code is incorrect");
            }else{
                System.out.println("An error message");
            }
            this.state = state;
        }

        public String getState() {
            return state;
        }

    public boolean isNoFaultState() {
        boolean noFaultState;

        switch (getState()) {
            case "CT": case "MA": case "ME": case "NH": case "NJ": case "NY": case "PA": case "VT":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }
}
