package pages.Home;

import org.testng.asserts.SoftAssert;

import pages.BasePage;
import org.openqa.selenium.Keys;

public class CrearTareas extends BasePage{
    //Conexion
    private String Conexion = "http://192.168.80.43:10600/";

    //Credenciales correctas
    public String correctEmail = "email1@gmail.com";
    public String correctPassword = "Password1";
    public String correctTitle = "Titulo1";
    public String correctDescription = "Descripcion1";
    public String correctExpirationDate = "07:03:2025" + Keys.ARROW_RIGHT + "23:59";
    public String correctPriority = "1";

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
    public String btnNewTask = "//button[normalize-space()='Nueva Tarea']";
    public String txtTitle = "//input[@id='title']";
    public String txtDescription = "//textarea[@id='title']";
    public String expirationDate = "//input[@type='datetime-local']";
    public String txtPriority = "//body/div[2]/div[3]/div[1]/div[1]/div[5]/div[1]/input[1]";
    public String btnCreateTask = "//body/div[2]/div[3]/div[1]/div[2]/button[2]";
    public String btnCancelTask = "//button[contains(.,'Cancelar')]";
    public String taskCreationMessageOK = "//div[@class='MuiAlert-message css-1xsto0d' and text()='Tarea creada correctamente']";

    SoftAssert soft = new SoftAssert();

    public CrearTareas(){
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

    //Se oprime boton NUEVA TAREA
    public void pressBtnNewTask() {
        clickElement(btnNewTask);
    }

    //Ingreso de los campos Titulo, Descripción, Fecha vencimiento, Prioridad
    public void writeInfoTask() {
        write(txtTitle, correctTitle);
        write(txtDescription, correctDescription);
        write(expirationDate, correctExpirationDate);
        write(txtPriority, correctPriority);
    }

    //Ingreso incorrecto de los campos Titulo, Descripción, Fecha vencimiento, Prioridad
    public void writeIncorrectInfoTask() {
        write(txtTitle, incorrectTitle);
        write(txtDescription, incorrectDescription);
        write(expirationDate, incorrectExpirationDate);
        write(txtPriority, incorrectPriority);
    }

    //Se oprime boton CREAR TAREA
    public void pressBtnCreateTask() {
        clickElement(btnCreateTask);
    }

    //Se oprime boton CANCELAR
    public void pressBtnCancelTask() {
        clickElement(btnCancelTask);
    }

    //Se valida mensaje creación de la tarea
    public void validateTaskCreationMessage(){
        try { 
            Thread.sleep(2000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        soft.assertEquals("Tarea creada correctamente",obtenerTextoDeDiv(taskCreationMessageOK));
        soft.assertAll();
    }
}
