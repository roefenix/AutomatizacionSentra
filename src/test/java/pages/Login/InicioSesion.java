package pages.Login;

import pages.BasePage;

public class InicioSesion extends BasePage{
    //Conexion
    private String Conexion = "http://192.168.80.43:10600/";

    //Credenciales correctas
    public String correctEmail = "abreytmann@sentra.cl"; //TIENES QUE CAMBIARLO DESPUES POR LA QUE CREASTE
    public String correctPassword = "Sentra2025";

    //XPATH
    public String email = "//input[@id='email']";
    public String password = "//input[@id='password']";
    public String btnSubmit = "//button[@type='submit']";

    public InicioSesion(){
        super(driver);
    }

    //Entrar a página de tareas Sentra
    public void enterToTestPage() {
        driver.manage().window().maximize();
        navigateTo(Conexion);
    }

    //Ingreso de los campos Email y Contrasena
    public void writeCredentials() {
        write(email, correctEmail);
        write(password, correctPassword);
    }

    //Se oprime boton INGRESAR
    public void pressBtnSumbit() {
        clickElement(btnSubmit);
    }
}
// //XPATH
// public String email = "//input[@id='email']";
// public String password = "//input[@id='password']";
// public String btnSubmit = "//button[@type='submit']";
// public String btnHome = "//span[contains(.,'Home')]";
// public String btnProfile = "//span[contains(.,'Perfil')]";
// public String btnQuit = "//span[contains(.,'Salir')]";