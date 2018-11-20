package geco;

import org.junit.Before;
import org.junit.Test;
import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LoginServiceTest {

    private LoginService loginTest;

    @Before
    public void setup(){

        String[] login = {"loginTest"};

        loginTest = new LoginService(login);

    }

    @Test
    public void loginExists() {
        assertEquals( true, loginTest.loginExists("loginTest"));
        assertEquals( false, loginTest.loginExists("loginTess"));
    }

    @Test
    public void addLogin() {
        loginTest.addLogin("myLogin");
        assertEquals(true, loginTest.loginExists("myLogin"));
    }

    @Test
    public void findAllLoginsStartingWith() {
        loginTest.addLogin("loginSup");
        List <String> resultat = loginTest.findAllLoginsStartingWith("l");
        assertEquals("[loginTest, loginSup]",resultat.toString() );
        resultat = loginTest.findAllLoginsStartingWith("v");
        assertEquals("[]", resultat.toString());

    }

    @Test
    public void findAllLogins() {
        List <String> allLoginsTest = Arrays.asList("loginTest", "myLogin");
        loginTest.addLogin("myLogin");
        assertEquals(loginTest.findAllLogins().toString(), allLoginsTest.toString());
    }
}