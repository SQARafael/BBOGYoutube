Feature: Reproducir canción
  @playSong
  Scenario: Reproducción exitosa de una canción
    Given que el usuario abre la url de youtube
    When el usuario busque una canción y seleccione aleatoreamente una canción
    Then el usuario podrá ver el titulo de la canción