package com.youtube.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.youtube.UI.SongDetailsUI.LBL_NAMESONG;

public class ValidateSong implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade elementTitulo = LBL_NAMESONG.resolveFor(actor);
        String titulo = String.valueOf(elementTitulo.getText());
        String cancion= actor.recall("song");

        return cancion.equals(titulo);
    }

    public static Question<Boolean> assertion(){
        return  new ValidateSong();
    }
}
