Feature: FeaturesHome

#Descomentar si se quieren probar los escenarios por separado
# Background: Usuario ingreso a la página y a la home
# Given estoy en la pagina de login
# When introduzco el email y la contraseña
# Then oprimo el botón INGRESAR
# And oprimo el botón Home

Scenario: Usuario Crea nueva tarea
    # Comentar si se quiere probar los escenarios por separado hasta el primer "And"
    # Given estoy en la pagina de login para crear una tarea nueva
    # When introduzco el email y la contraseña para crear una tarea nueva
    # Then oprimo el botón INGRESAR para crear una tarea nueva
    Then oprimo el botón Home
    When oprimo el botón NUEVA TAREA
    Then oprimo el botón CANCELAR para crear tarea
    Then oprimo el botón NUEVA TAREA para crear erroneamente la tarea
    Then introduzco el titulo, la descripción, la fecha de vencimiento y la prioridad para crear erroneamente la tarea en la creación
    Then oprimo el botón CREAR TAREA erroneamente
    Then oprimo nuevamente el botón NUEVA TAREA
    Then introduzco el titulo, la descripción, la fecha de vencimiento y la prioridad en la creación
    Then oprimo el botón CREAR TAREA
    And observo mensaje de creación de tarea exitoso

Scenario: Usuario Edita una tarea creada
    When selecciono una tarea creada
    Then oprimo el botón EDITAR TAREA
    Then oprimo el botón CANCELAR para editar tarea
    Then oprimo el botón EDITAR TAREA para modificar erroneamente la tarea
    Then introduzco el titulo, la descripción, la fecha de vencimiento y la prioridad para modificar erroneamente la tarea en la edición
    Then oprimo el botón MODIFICAR TAREA erroneamente
    Then oprimo nuevamente el botón EDITAR TAREA
    Then introduzco el titulo, la descripción, la fecha de vencimiento y la prioridad en la edición
    Then oprimo el botón MODIFICAR TAREA
    And observo mensaje de modificación de tarea exitoso

Scenario: Usuario Ordena tareas creadas
    Then oprimo el botón Salir
    When introduzco el email y la contraseña de usuario para ordenar tareas
    Then oprimo el botón INGRESAR para ordenar tareas
    And oprimo el botón Home para ordenar tareas
    Then oprimo el botón para ordenar ascendentemente por titulo la tarea
    Then valido el orden ascendente por titulo
    Then oprimo el botón para ordenar descendentemente por titulo la tarea
    Then valido el orden descendente por titulo
    Then oprimo el botón para ordenar ascendentemente por fecha de vencimiento la tarea
    Then valido el orden ascendente por fecha vencimiento
    Then oprimo el botón para ordenar descendentemente por fecha de vencimiento la tarea
    Then valido el orden descendente por fecha vencimiento
    Then oprimo el botón para ordenar ascendentemente por prioridad la tarea
    Then valido el orden ascendente por prioridad
    Then oprimo el botón para ordenar descendentemente por prioridad la tarea
    Then valido el orden descendente por prioridad