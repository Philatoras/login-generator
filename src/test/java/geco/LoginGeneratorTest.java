package geco;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LoginGeneratorTest {
    private LoginGenerator loginGen;
    private LoginService loginService;

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
}
