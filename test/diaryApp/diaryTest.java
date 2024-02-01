package diaryApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class diaryTest {
    private Diary diary;
    @Test
    public void test_That_Diary_Can_Collect_UserName_And_Password_Test(){
        diary = new Diary("Danny", "1234");
        diary = new Diary(diary.getName(), diary.getPassword());
        Diaries diaries = new Diaries();
        diaries.add(diary.getName(), diary.getPassword());
        assertEquals(1, diaries.count());
    }
    @Test
    public void test_That_Diary_Can_Find_By_UserName_Test(){
        diary = new Diary("Danny", "1234");
        diary = new Diary(diary.getName(), diary.getPassword());
        Diaries diaries = new Diaries();
        diaries.add(diary.getName(), diary.getPassword());
        assertEquals(1, diaries.count());
        Diary newUserName = diaries.findByUserName("Danny");
        assertEquals("Danny", newUserName.generateUserName());
    }

    @Test
    public void test_That_Diary_Can_Unlock_Diary_Test(){
        diary = new Diary("Danny", "1234");
        diary = new Diary(diary.getName(), diary.getPassword());
        Diaries diaries = new Diaries();
        diaries.add(diary.getName(), diary.getPassword());
        assertEquals(1, diaries.count());
        Diary newUserName = diaries.findByUserName("Danny");
        assertEquals("Danny", newUserName.generateUserName());
        diary.lockDiary();
        diary.unlockDiary("1234");
        assertFalse(diary.isLocked());
    }

    @Test
    public void test_That_Diary_Can_lock_Diary_Test(){
        diary = new Diary("Danny", "1234");
        diary = new Diary(diary.getName(), diary.getPassword());
        Diaries diaries = new Diaries();
        diaries.add(diary.getName(), diary.getPassword());
        assertEquals(1, diaries.count());
        Diary newUserName = diaries.findByUserName("Danny");
        assertEquals("Danny", newUserName.generateUserName());

        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

//    @Test
//    public void test_That_Diary_Can_Delete_UserName_Test(){
//        diary = new Diary("Danny", "1234");
//        diary = new Diary(diary.getName(), diary.getPassword());
//        Diaries diaries = new Diaries();
//        diaries.add(diary.getName(), diary.getPassword());
//        assertEquals(1, diaries.count());
//        Diary newUserName = diaries.findByUserName("Danny");
//        assertEquals("Danny", newUserName.generateUserName());
//        diaries.delete("Danny", "1234");
//        assertEquals(0, diaries.count());
//    }
}
