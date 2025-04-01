Feature: FeaturesProfile

#Descomentar si se quieren probar los escenarios por separado
# Background: Usuario ingreso a la página y al perfil
# Given estoy en la pagina de login
# When introduzco el email y la contraseña
# Then oprimo el botón INGRESAR
# And oprimo el botón Perfil

Scenario: Usuario modifica su informacion
    #Comentar si se quiere probar los escenarios por separado hasta el primer "And"
    # Given estoy en la pagina de login
    # When introduzco el email y la contraseña
    # Then oprimo el botón INGRESAR
    And oprimo el botón Perfil
    When oprimo el botón EDITAR DATOS USUARIO
    Then oprimo el botón CANCELAR del formulario de modificación
    Then oprimo el botón EDITAR DATOS USUARIO nuevamente
    Then introduzco nombre, apellido, email
    Then oprimo el botón MODIFICAR USUARIO
    Then observo mensaje de modificación exitoso
    And observo nombre, apellido y mail cambiados

Scenario: Usuario modifica su contrasena
    When oprimo el botón CAMBIAR CONTRASEÑA
    Then oprimo el botón CANCELAR del formulario de modificación de contraseña
    Then oprimo nuevamente el botón CAMBIAR CONTRASEÑA
    Then introduzco contraseña y la repetición de la contraseña
    Then oprimo el botón CAMBIAR CONTRASEÑA del formulario
    And observo mensaje de modificación de contraseña exitoso