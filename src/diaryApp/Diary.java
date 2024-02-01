package diaryApp;

import diaryApp.exception.WrongPinException;

import java.util.ArrayList;
import java.util.List;

public class Diary {

    private String userName;
    private String password;
    private boolean isLocked;
    private List<Entry> entries = new ArrayList<>();

    public Diary(String userName, String password){
         this.userName = userName;
         this.password = password;
    }
    public boolean isLocked() {
        return isLocked;
    }

    public void lockDiary() {
        isLocked = true;
    }

    public String getName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String generateUserName() {
        return userName;
    }

    public void unlockDiary(String password) {
        validatePassword(password);
        isLocked = false;
    }

    private void validatePassword(String password) {
        if(!this.password.equals(password)) {
            throw new WrongPinException("Incorrect Password");
        }
    }
}
