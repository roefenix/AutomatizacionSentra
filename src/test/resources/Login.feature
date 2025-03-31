Feature: FeaturesLogin

Background: Usuario en el Login
Given estoy en la pagina de login

@RegistroUsuario
Scenario: Usuario crea sus credenciales para poder ingresar
    When oprimo el botón CREAR NUEVO USUARIO
    Then oprimo el botón CANCELAR
    Then oprimo el botón CREAR NUEVO USUARIO nuevamente
    Then introduzco nombre, apellido, email, contraseña, repito contraseña
    And oprimo el botón REGISTRAR USUARIO

@InicioSesion
Scenario: Usuario registado inicia sesion
    When introduzco el email y la contraseña
    Then oprimo el botón INGRESAR

# @InicioSesionError
# Scenario: Usuario registado inicia sesion
#     When introduzco el email y la contraseña erroneos
#     Then oprimo el botón INGRESAR para que salga error
#     And vizualizo mensaje de error