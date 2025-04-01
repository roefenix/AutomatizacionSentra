package pages.Profile;

import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class ModificarContrasena extends BasePage{
    //Conexion
    private String Conexion = "http://192.168.80.43:10600/";

    //Credenciales correctas
    public String correctEmail = "email1@gmail.com";
    public String correctPassword = "Password1";
    public String correctPasswordModificado = "123";
    public String correctPasswordModificado2 = "123";

    //Credenciales incorrectas
    public String incorrectPasswordModificado = "";
    public String incorrectPasswordModificado2 = "";

    //XPATH
    public String email = "//input[@id='email']";
    public String password = "//input[@id='password']";
    public String btnSubmit = "//button[@type='submit']";
    public String btnProfile = "//span[normalize-space()='Perfil']";
    public String btnEditPassword = "//button[normalize-space()='Cambiar Contraseña']";
    public String btnCancel = "//button[contains(.,'Cancelar')]";
    public String btnEditPasswordForm = "//body/div[2]/div[3]/div/div[2]/button[2]";
    public String txtPassword = "//input[@id='password']";
    public String txtRepeatPassword = "//input[@id='repeat_password']";
    public String modificationPasswordMessageOK = "//div[@class='MuiAlert-message css-1xsto0d' and text()='Contraseña cambiada correctamente']";
    
    SoftAssert soft = new SoftAssert();

    public ModificarContrasena(){
        super(driver);
    }

    //Entrar a página de tareas Sentra
    public void enterToTaskSentraPage() {
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

    //Se oprime boton Profile
    public void pressBtnProfile(){
        clickElement(btnProfile);
    }

    //Se oprime boton CANCELAR
    public void pressBtnCancelModPass(){
        clickElement(btnCancel);
    }

    //Se oprime boton CAMBIAR CONTRASEÑA
    public void pressBtnEditPassword(){
        clickElement(btnEditPassword);
    }
    
    //Ingreso de los campos Contraseña, Repetir Contraseña
    public void putCorrectDataModPass(){
        write(txtPassword, correctPasswordModificado);
        write(txtRepeatPassword, correctPasswordModificado2);
    }

    //Ingreso incorrecto de los campos Contraseña, Repetir Contraseña
    public void putIncorrectDataModPass(){
        write(txtPassword, incorrectPasswordModificado);
        write(txtRepeatPassword, incorrectPasswordModificado2);
    }

    //Se oprime boton CAMBIAR CONTRASEÑA del formulario
    public void pressBtnEditPasswordForm(){
        clickElement(btnEditPasswordForm);
    }

    //Se valida mensaje de modificación de contraseña
    public void validateModificationPasswordMessage(){
        try { 
            Thread.sleep(2000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        soft.assertEquals("Contraseña cambiada correctamente",obtenerTextoDeDiv(modificationPasswordMessageOK));
    }
}
