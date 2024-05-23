package com.youtube.stepDefinitions;

import com.youtube.questions.ValidateSong;
import com.youtube.tasks.HomeSearchTask;
import com.youtube.tasks.OpenYoutubeTask;
import com.youtube.tasks.SelectSongTask;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterEach;


import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PlaySongStepDef {
    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().clearDriverCache().setup();
        setTheStage(new OnlineCast());
    }



    @Given("que el usuario abre la url de youtube")
    public void queElUsuarioAbreLaUrlDeYoutube() {
        theActorCalled("user").wasAbleTo(
                OpenYoutubeTask.openBrowser()
        );
    }
    @When("el usuario busque una canción y seleccione aleatoreamente una canción")
    public void elUsuarioBusqueUnaCanciónYSeleccioneAleatoreamenteUnaCanción() {
    theActorInTheSpotlight().attemptsTo(
            HomeSearchTask.searchSong(),
            SelectSongTask.selectSong()
    );

    }
    @Then("el usuario podrá ver el titulo de la canción")
    public void elUsuarioPodráVerElTituloDeLaCanción() {
        theActorInTheSpotlight().should(
                seeThat(
                        "La respuesta fue: ",
                        ValidateSong.assertion(),
                        Matchers.equalTo(true)
                )
        );

    }

    @After
    public void cloreBrowser(){
        if(driver !=null){
            driver.quit();
        }
    }
}
