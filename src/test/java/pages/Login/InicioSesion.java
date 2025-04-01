package pages.Login;

import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class InicioSesion extends BasePage{
    //Conexion
    private String Conexion = "http://192.168.80.43:10600/";

    //Credenciales correctas
    public String correctEmail = "email1@gmail.com";
    public String correctPassword = "Password1";

    //Credenciales incorrectas
    public String incorrectPassword = "Password2";

    //XPATH
    public String email = "//input[@id='email']";
    public String password = "//input[@id='password']";
    public String btnSubmit = "//button[@type='submit']";
    public String MessageNotOK = "//div[@class='MuiAlert-message css-1xsto0d' and text()='Usuario o password incorrecto']";

    SoftAssert soft = new SoftAssert();

    public InicioSesion(){
        super(driver);
    }

    //Entrar a página de tareas Sentra
    public void enterToTestPage() {
        driver.manage().window().maximize();
        navigateTo(Conexion);
    }

    //Ingreso de los campos Email y Contrasena correctos
    public void writeCorrectCredentials() {
        write(email, correctEmail);
        write(password, correctPassword);
    }

    //Ingreso de los campos Email y Contrasena incorrectos
    public void writeIncorrectCredentials() {
        write(email, correctEmail);
        write(password, incorrectPassword);
    }

    //Se oprime boton INGRESAR
    public void pressBtnSumbit() {
        clickElement(btnSubmit);
    }

    //Se valida mensaje de error en la creación
    public void validateErrorLoginMessage(){
        try { 
            Thread.sleep(2000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        soft.assertEquals("Usuario o password incorrecto",obtenerTextoDeDiv(MessageNotOK));
    }

    //Se valida ingreso a la pagina post Login
    public void validateEntryLogin(){
        try { 
            Thread.sleep(2000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        soft.assertEquals("http://192.168.80.43:10600/dashboard",obtenerUrlActual());
    }
}
// //XPATH
// public String email = "//input[@id='email']";
// public String password = "//input[@id='password']";
// public String btnSubmit = "//button[@type='submit']";
// public String btnHome = "//span[contains(.,'Home')]";
// public String btnProfile = "//span[contains(.,'Perfil')]";
// public String btnQuit = "//span[contains(.,'Salir')]";