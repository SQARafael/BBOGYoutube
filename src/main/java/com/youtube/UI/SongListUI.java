package com.youtube.UI;

import net.serenitybdd.screenplay.targets.Target;

public class SongListUI {
    public static Target LIST_SONGS=Target.the("Lista de canciones")
            .locatedBy("//a/yt-formatted-string[@class='style-scope ytd-video-renderer']");
}
