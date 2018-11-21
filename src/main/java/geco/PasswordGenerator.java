package geco;


import org.apache.commons.lang3.RandomStringUtils;

public class PasswordGenerator {

    public String getRandomPassword(){

        int length = 8;
        boolean numbers = false;
        boolean letters = true;

        return RandomStringUtils.random(length, letters, numbers);

    }


}
