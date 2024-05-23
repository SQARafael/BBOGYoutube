package com.youtube.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.youtube.UI.HomeSearchUI.INPUT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeSearchTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(INPUT_SEARCH),
                Enter.theValue("desapacito").into(INPUT_SEARCH).thenHit(Keys.ENTER)
        );
    }

    public static HomeSearchTask searchSong(){
        return instrumented(HomeSearchTask.class);
    }


}
