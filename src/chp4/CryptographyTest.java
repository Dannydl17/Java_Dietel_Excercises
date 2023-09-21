package chp4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CryptographyTest {
    @Test
    public void testThatNumbersCanBeEncryptedTest(){
       Cryptography cryptography = new Cryptography();
       int encryptNumber = Integer.parseInt(cryptography.encryptNumber(2345));
       assertEquals(1290, encryptNumber);
    }

    @Test
    public void testThatNumbersCanBeDecryptedTest(){
        Cryptography cryptography = new Cryptography();
        int decryptNum = Integer.parseInt(cryptography.decryptNumber(1290));
        assertEquals(2345, decryptNum);
    }

    @Test
    public void testThatNumbersCanBeEncryptedAndDecryptedTest(){
        Cryptography cryptography = new Cryptography();
        int encryptNumber = Integer.parseInt(cryptography.encryptNumber(2345));
        assertEquals(1290, encryptNumber);

        int decryptNum = Integer.parseInt(cryptography.decryptNumber(1290));
        assertEquals(2345, decryptNum);
    }
}
