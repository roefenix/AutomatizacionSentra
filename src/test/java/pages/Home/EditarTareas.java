package pages.Home;

import org.testng.asserts.SoftAssert;

import pages.BasePage;
import org.openqa.selenium.Keys;

public class EditarTareas extends BasePage{
    //Conexion
    private String Conexion = "http://192.168.80.43:10600/";

    //Credenciales correctas
    public String correctEmail = "email1@gmail.com";
    public String correctPassword = "Password1";
    public String correctTitle = "TituloMod";
    public String correctDescription = "DescripcionMod";
    public String correctExpirationDate = "01:01:2026" + Keys.ARROW_RIGHT + "23:59";
    public String correctPriority = "2";

    //Credenciales incorrectas
    public String incorrectTitle = "";
    public String incorrectDescription = "";
    public String incorrectExpirationDate = "dd:mm:aaaa" + Keys.ARROW_RIGHT + "--:--";
    public String incorrectPriority = "";

    //XPATH
    public String email = "//input[@id='email']";
    public String password = "//input[@id='password']";
    public String btnSubmit = "//button[@type='submit']";
    public String btnHome = "//span[normalize-space()='Home']";
    public String btnSelectTask = "(//td[contains(.,'1')])[1]";
    public String btnEditTask = "//button[normalize-space()='Editar Tarea']";
    public String editTitle = "//input[@id='title']";
    public String editDescription = "//textarea[@id='title']";
    public String editExpirationDate = "//input[@type='datetime-local']";
    public String editPriority = "//input[@type='number']";
    public String btnModifyTask = "//button[contains(.,'Modificar Tarea')]";
    public String btnCancelTask = "//button[contains(.,'Cancelar')]"; ;
    public String taskEditMessageOK = "//div[@class='MuiAlert-message css-1xsto0d' and text()='Tarea modificada correctamente']";

    SoftAssert soft = new SoftAssert();

    public EditarTareas(){
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

    //Se oprime boton Home
    public void pressBtnHome() {
        clickElement(btnHome);
    }

    //Se selecciona una tarea a editar
    public void pressBtnSelectTask() {
        clickElement(btnSelectTask);
    }

    //Se oprime boton EDITAR TAREA
    public void pressBtnEditTask() {
        clickElement(btnEditTask);
    }

    //Ingreso de los campos Titulo, Descripción, Fecha vencimiento, Prioridad
    public void writeInfoEditTask() {
        write(editTitle, correctTitle);
        write(editDescription, correctDescription);
        write(editExpirationDate, correctExpirationDate);
        write(editPriority, correctPriority);
    }

    //Ingreso incorrecto de los campos Titulo, Descripción, Fecha vencimiento, Prioridad
    public void writeIncorrectInfoEditTask() {
        write(editTitle, incorrectTitle);
        write(editDescription, incorrectDescription);
        write(editExpirationDate, incorrectExpirationDate);
        write(editPriority, correctPriority);
    }

    //Se oprime boton MODIFICAR TAREA
    public void pressBtnModifyTask() {
        clickElement(btnModifyTask);
    }

    //Se oprime boton CANCELAR
    public void pressBtnCancelTask() {
        clickElement(btnCancelTask);
    }

    //Se valida mensaje edición de la tarea
    public void validateTaskEditMessage(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        soft.assertEquals("Tarea modificada correctamente",obtenerTextoDeDiv(taskEditMessageOK));
    }
}