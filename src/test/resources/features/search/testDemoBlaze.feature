Feature: Validacion de login en la pagina Demo Blaze

  @Login
  Scenario Outline: Ingreso de Login
    Given John quiere ingresar a Demo Blaze
    When John realiza el registro con el correo <correo> y la contrasena <pass>
    Then John puede iniciar sesion con el correo <correo> y la contrasena <pass>
    And puede ver su <correo> en el inicio
    Examples:
      | correo                        | pass           |  |
      | testAutomation001@yopmail.com | automation123* |  |