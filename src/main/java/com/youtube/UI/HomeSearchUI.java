package com.youtube.UI;

import net.serenitybdd.screenplay.targets.Target;

public class HomeSearchUI {

    public static Target INPUT_SEARCH=Target.the("campo de busqueda")
            .locatedBy("//input[@id='search']");
}
