package diaryApp;


import diaryApp.exception.InvalidUserName;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries = new ArrayList<>();

    public void add(String userName, String password) {
        String name = generateUserName(userName);
        String passW = generatePassWord(password);
        Diary diary = new Diary(name,passW);
        diaries.add(diary);
    }

    private String generateUserName(String userName) {
        return userName;
    }
    private String generatePassWord(String password) {
        return password;
    }

    public Diary findByUserName(String userName) {
        for (Diary diary : diaries){
            if (diary.generateUserName().equals(userName)) {
                return diary;
            }
        }
        throw new InvalidUserName("UserName not found");
    }

    public int count() {
        return diaries.size();
    }

//    public void delete(String userName, String password) {
//        for (Diary diary : diaries){
//            findByUserName(userName)
//        }
//    }
}
