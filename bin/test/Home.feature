Feature: FeaturesProfile

#Descomentar si se quieren probar los escenarios por separado
Background: Usuario ingreso a la página y a la home
Given estoy en la pagina de login
When introduzco el email y la contraseña
Then oprimo el botón INGRESAR
And oprimo el botón Home

# Scenario: Usuario Crea nueva tarea
    #Comentar si se quiere probar los escenarios por separado hasta el primer "And"
    # Given estoy en la pagina de login
    # When introduzco el email y la contraseña
    # Then oprimo el botón INGRESAR
    # And oprimo el botón Home
    # When oprimo el botón NUEVA TAREA
    # Then oprimo el botón CANCELAR
    # Then oprimo el botón NUEVA TAREA para crear erroneamente la tarea
    # Then introduzco el titulo, la descripción, la fecha de vencimiento y la prioridad para crear erroneamente la tarea
    # Then oprimo el botón CREAR TAREA erroneamente
    # Then oprimo nuevamente el botón NUEVA TAREA
    # Then introduzco el titulo, la descripción, la fecha de vencimiento y la prioridad
    # Then oprimo el botón CREAR TAREA
    # And observo mensaje de creación de tarea exitoso

# Scenario: Usuario Edita una tarea creada
#     When selecciono una tarea creada
#     Then oprimo el botón EDITAR TAREA
#     Then oprimo el botón CANCELAR
    # Then oprimo el botón EDITAR TAREA para modificar erroneamente la tarea
    # Then introduzco el titulo, la descripción, la fecha de vencimiento y la prioridad para modificar erroneamente la tarea
    # Then oprimo el botón MODIFICAR TAREA erroneamente
#     Then oprimo nuevamente el botón EDITAR TAREA
#     Then introduzco el titulo, la descripción, la fecha de vencimiento y la prioridad
#     Then oprimo el botón MODIFICAR TAREA
#     And observo mensaje de modificación de tarea exitoso

Scenario: Usuario Ordena tareas creadas
    #Then oprimo el botón Salir

    Then oprimo el botón para ordenar ascendentemente por titulo la tarea
    Then oprimo el botón para ordenar descendentemente por titulo la tarea
    Then oprimo el botón para ordenar ascendentemente por fecha de vencimiento la tarea
    Then oprimo el botón para ordenar descendentemente por fecha de vencimiento la tarea
    Then oprimo el botón para ordenar ascendentemente por prioridad la tarea
    Then oprimo el botón para ordenar descendentemente por prioridad la tarea