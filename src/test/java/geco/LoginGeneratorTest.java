package geco;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class LoginGeneratorTest {
    private LoginGenerator loginGen;

    @Before
    public void setup(){
        LoginService loginService = new LoginService(new String[] {"JROL",
                "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});

        loginGen = new LoginGenerator(loginService);
    }
    @Test
    public void testGenerateLoginForNomAndPrenom(){
        assertEquals("", "PDUR", loginGen.generateLoginForNomAndPrenom("Durand", "Paul"));
    }
    @Test
    public void testGenerateLoginExist2(){
        assertEquals("", "JRAL2", loginGen.generateLoginForNomAndPrenom("Ralling", "John"));
    }
    @Test
    public void testGenerateLoginExist1(){
        assertEquals("", "JROL1", loginGen.generateLoginForNomAndPrenom("Rolling", "Jean"));
    }
    @Test
    public void testGenerateLoginAccent(){
        assertEquals("", "PDUR", loginGen.generateLoginForNomAndPrenom("Dùrand", "Paul"));
    }
}
