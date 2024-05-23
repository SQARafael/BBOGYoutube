package com.youtube.UI;

import net.serenitybdd.screenplay.targets.Target;

public class SongDetailsUI {
    public static Target LBL_NAMESONG=Target.the("titulo de la canción")
            .locatedBy("//h1/yt-formatted-string[@class='style-scope ytd-watch-metadata']");
}
