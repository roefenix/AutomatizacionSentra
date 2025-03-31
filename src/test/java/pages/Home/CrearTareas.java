package pages.Home;

import pages.BasePage;
import org.openqa.selenium.Keys;

public class CrearTareas extends BasePage{
    //Conexion
    private String Conexion = "http://192.168.80.43:10600/";

    //Credenciales correctas
    public String correctEmail = "abreytmann@sentra.cl";
    public String correctPassword = "Sentra2025";
    public String correctTitle = "Titulo1";
    public String correctDescription = "Descripcion1";
    public String correctExpirationDate = "07:03:2025" + Keys.ARROW_RIGHT + "23:59";
    public String correctPriority = "1";

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

    //Se oprime boton CREAR TAREA
    public void pressBtnCreateTask() {
        clickElement(btnCreateTask);
    }

    //Se oprime boton CANCELAR
    public void pressBtnCancelTask() {
        clickElement(btnCancelTask);
    }
}
