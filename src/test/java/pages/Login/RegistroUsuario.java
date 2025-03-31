package pages.Login;

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

    //XPATH
    public String btnCreateUser = "//button[@type='button']";
    public String txtFirstName = "//input[@id='firstname']";
    public String txtLastName = "//input[@id='lastname']";
    public String txtEmail = "(//input[@id='email'])[2]";
    public String txtPassword = "(//input[@id='password'])[2]";
    public String txtRepeatPassword = "//input[@id='repeat_password']";
    public String btnRegisterUser = "//button[contains(.,'Registrar Usuario')]";
    public String btnCancel = "//button[contains(.,'Cancelar')]";

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

    //Se oprime botón REGISTRAR USUARIO
    public void pressBtnRegisterUser() {
        clickElement(btnRegisterUser);
    }
}