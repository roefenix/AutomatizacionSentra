# Prueba Selenium
Este proyecto consiste en automatizar la página "Sentra Tasks" con el fin de poder revisar de forma eficiente y rapida reportes de errores y así poder mejorarla en caso de ser necesario.
## Sentra Tasks
Sentra Tasks es una página que permite a los usuarios poder asignarse
tareas a ellos mismos, ordenarlas y organizarlas, y finalmente completarlas.
## Installation
Para este proyecto se utilizaron los siguientes componentes
* Java 17+
* Selenium WebDriver
* Cucumber (BDD)
* TestNG
* Maven

## Estructura
src
└── test
    ├── java
    │   └── pages
    │       ├── Home
    │       │   ├── CrearTareas.java
    │       │   ├── EditarTareas.java
    │       │   └── OrdenarTareas.java
    │       ├── Login
    │       │   ├── InicioSesion.java
    │       │   ├── InicioSesionError.java
    │       │   └── RegistroUsuario.java
    │       ├── Profile
    │       │   ├── ModificarContrasena.java
    │       │   ├── ModificarUsuario.java
    │       │   └── BasePage.java
    │       ├── runner
    │       │   └── TestRunner.java
    │       └── steps
    │           └── PruebaSeleniumSteps.java
    └── resources
        ├── Home.feature
        ├── Login.feature
        └── Profile.feature
## 📦 Descripción de carpetas
- **pages/**: Contiene las clases que representan las páginas del sistema bajo prueba, separadas por módulo (Home, Login, Profile).
- **runner/**: Contiene la clase `TestRunner` que ejecuta los escenarios de Cucumber.
- **steps/**: Clases con la implementación de los pasos (`@Given`, `@When`, `@Then`) definidos en los archivos `.feature`.
- **resources/**: Archivos `.feature` que contienen los escenarios escritos en Gherkin.
## Ejecución del proyecto
Para poder ejecutar el proyecto se requieren los siguiente comandos:
```sh
gradle clean
gradle build
gradle test
```
Todos estos comandos deben ser ejecutados apuntando a donde se encuentre la carpeta del mismo proyecto.
## Repositorio GIT
https://github.com/roefenix/AutomatizacionSentra
