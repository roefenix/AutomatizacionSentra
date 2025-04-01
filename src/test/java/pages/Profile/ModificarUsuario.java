package pages.Profile;

import org.testng.asserts.SoftAssert;

import pages.BasePage;

public class ModificarUsuario extends BasePage{
    //Conexion
    private String Conexion = "http://192.168.80.43:10600/";

    //Credenciales correctas
    public String correctEmail = "email1@gmail.com";
    public String correctPassword = "Password1";
    public String correctNameModificado = "Nombre1Mod";
    public String correctLastNameModificado = "Apellido1Mod";
    public String correctEmailMoficado = "email1@gmailMod.com";

    //XPATH
    public String email = "//input[@id='email']";
    public String password = "//input[@id='password']";
    public String btnSubmit = "//button[@type='submit']";
    public String btnProfile = "//span[normalize-space()='Perfil']";
    public String btnEditUser = "//button[normalize-space()='Editar Datos Usuario']";
    public String btnCancel = "//button[contains(.,'Cancelar')]";
    public String btnModifyUser = "//button[contains(.,'Modificar Usuario')]";
    public String txtEmail = "//input[@id='email']";
    public String txtFirstName = "//input[@id='firstname']";
    public String txtLastName = "//input[@id='lastname']";
    public String modificationMessageOK = "//div[@class='MuiAlert-message css-1xsto0d' and text()='Datos de usuario modificados correctamente']";
    public String firstNameInfo= "/html/body/div[1]/div/main/div[2]/table/tbody/tr[1]/td[2]";
    public String lastNameInfo= "/html/body/div[1]/div/main/div[2]/table/tbody/tr[2]/td[2]";
    public String emailInfo= "/html/body/div[1]/div/main/div[2]/table/tbody/tr[3]/td[2]";

    SoftAssert soft = new SoftAssert();

    public ModificarUsuario(){
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
    public void pressBtnCancelMod(){
        clickElement(btnCancel);
    }

    //Se oprime boton EDITAR DATOS USUARIO
    public void pressBtnEditUser(){
        clickElement(btnEditUser);
    }
    
    //Ingreso de los campos Nombre, Apellido Email
    public void putCorrectDataMod(){
        write(txtFirstName, correctNameModificado);
        write(txtLastName, correctLastNameModificado);
        write(txtEmail, correctEmailMoficado);
    }

    //Se oprime boton Modificar
    public void pressBtnModifyUser(){
        clickElement(btnModifyUser);
    }

    //Se valida mensaje de modificación
    public void validateModificationMessage(){
        try { 
            Thread.sleep(2000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        soft.assertEquals("Datos de usuario modificados correctamente",obtenerTextoDeDiv(modificationMessageOK));
    }

    //Se valida cambio de nombre, apellido y mail
    public void validateModificationInfo(){
        try { 
            Thread.sleep(2000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        soft.assertEquals(correctNameModificado,obtenerTextoDeDiv(firstNameInfo));
        soft.assertEquals(correctLastNameModificado,obtenerTextoDeDiv(lastNameInfo));
        soft.assertEquals(correctEmailMoficado,obtenerTextoDeDiv(emailInfo));
    }
}
