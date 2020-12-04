package stepsDefinitions;

import core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends DriverFactory {

    @Before
    public void instanciaDriver()
    {
        iniciarDriver();
    }

    @After
    public void finalizaDriver(){
        pegaDriver().quit();
    }

}
