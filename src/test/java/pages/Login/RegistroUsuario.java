package pages.Login;

import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class RegistroUsuario extends BasePage {
    //Conexion
    private String Conexion = "http://192.168.80.43:10600/";

    //Credenciales correctas
    public String correctName = "Nombre1";
    public String correctLastName = "Apellido1";
    public String correctEmail = "email1@gmail.com";
    public String correctPassword = "Password1";
    public String correctRepeatPassword = "Password1";

    //Credencial incorrecta
    public String incorrectRepeatPassword = "Password2";

    //XPATH
    public String btnCreateUser = "//button[@type='button']";
    public String txtFirstName = "//input[@id='firstname']";
    public String txtLastName = "//input[@id='lastname']";
    public String txtEmail = "(//input[@id='email'])[2]";
    public String txtPassword = "(//input[@id='password'])[2]";
    public String txtRepeatPassword = "//input[@id='repeat_password']";
    public String btnRegisterUser = "//button[contains(.,'Registrar Usuario')]";
    public String btnCancel = "//button[contains(.,'Cancelar')]";
    public String creationMessageOK = "//div[@class='MuiAlert-message css-1xsto0d' and text()='Usuario creado correctamente']";
    public String creationMessageNotOK = "//div[@class='MuiAlert-message css-1xsto0d' and text()='Contraseñas no coinciden']";

    SoftAssert soft = new SoftAssert();
    
    public RegistroUsuario(){
        super(driver);
    }

    //Entrar a página de tareas Sentra
    public void enterToTestPage() {
        driver.manage().window().maximize();
        navigateTo(Conexion);
    }

    //Se oprime botón CREAR USUARIO
    public void pressBtnCreateUser() {
        clickElement(btnCreateUser);
    }

    //Se oprime botón CANCELAR
    public void pressBtnCancel() {
        clickElement(btnCancel);
    }

    //Se ingresa datos correctos en formulario
    public void putCorrectData() {
        write(txtFirstName, correctName);
        write(txtLastName, correctLastName);
        write(txtEmail, correctEmail);
        write(txtPassword, correctPassword);
        write(txtRepeatPassword, correctRepeatPassword);
    }

    //Se ingresa contraseña incorrecta en formulario
    public void putInCorrectData() {
        write(txtFirstName, correctName);
        write(txtLastName, correctLastName);
        write(txtEmail, correctEmail);
        write(txtPassword, correctPassword);
        write(txtRepeatPassword, incorrectRepeatPassword);
    }

    //Se oprime botón REGISTRAR USUARIO
    public void pressBtnRegisterUser() {
        clickElement(btnRegisterUser);
    }

    //Se valida mensaje de error en la creación
    public void validateErrorCreationMessage(){
        try { 
            Thread.sleep(2000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        soft.assertEquals("Contraseñas no coinciden",obtenerTextoDeDiv(creationMessageNotOK));
    }

    //Se valida mensaje de creación
    public void validateCreationMessage(){
        try { 
            Thread.sleep(2000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        soft.assertEquals("Usuario creado correctamente",obtenerTextoDeDiv(creationMessageOK));
    }
}