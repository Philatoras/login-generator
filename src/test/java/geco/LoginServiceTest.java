package geco;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class LoginServiceTest {
    private LoginService loginService;
    private LoginService loginService2;

    @Before
    public void setup(){
        String[] logins;
        logins = new String[]{"tata","toto"};
        ;
        loginService = new LoginService(logins);
        loginService2 = new LoginService(logins);
    }

    @Test
    public void testLoginExistsTrue(){
        assertTrue("Toto existe", loginService.loginExists("toto") );
    }

    @Test
    public void testLoginExistsFalse(){
        assertFalse("Titi n'existe pas", loginService.loginExists("titi") );
    }

    @Test
    public void testLoginExistsAfterAdd(){
        loginService.addLogin("tutu");
        assertTrue("Tutu existe", loginService.loginExists("tutu") );
        assertFalse("Titi n'existe toujours pas", loginService.loginExists("titi") );
    }

    @Test
    public void testFindAllLogins(){
        String[] logins2;
        logins2 = new String[]{"tata","toto"};
        assertEquals("Toto, tata", Arrays.asList(logins2), loginService2.findAllLogins());

    }
    @Test
    public void testFindLoginStartingWith(){
        ArrayList liste = new ArrayList();
        liste.add("toto");
        assertEquals("Seul toto commence par to", liste, loginService.findAllLoginsStartingWith("to"));
    }


}