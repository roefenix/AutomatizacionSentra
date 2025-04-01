Feature: FeaturesLogin

Background: Usuario en el Login
Given estoy en la pagina de login

@RegistroUsuario
Scenario: Usuario crea sus credenciales para poder ingresar
    When oprimo el botón CREAR NUEVO USUARIO
    Then introduzco nombre, apellido, email, contraseña, repito contraseña incorrecta
    Then oprimo el botón REGISTRAR USUARIO con credenciales incorrectas
    Then observo mensaje de creación no exitoso
    Then oprimo el botón CANCELAR
    Then oprimo el botón CREAR NUEVO USUARIO nuevamente
    Then introduzco nombre, apellido, email, contraseña, repito contraseña
    Then oprimo el botón REGISTRAR USUARIO
    And observo mensaje de creación exitoso

# @InicioSesion
# Scenario: Usuario registado inicia sesion
#     When introduzco el email y la contraseña
#     Then oprimo el botón INGRESAR

# @InicioSesionError
# Scenario: Usuario registado inicia sesion
#     When introduzco el email y la contraseña erroneos
#     Then oprimo el botón INGRESAR para que salga error
#     And vizualizo mensaje de error