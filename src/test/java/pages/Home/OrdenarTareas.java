package pages.Home;

import pages.BasePage;

public class OrdenarTareas extends BasePage{
    //Conexion
    private String Conexion = "http://192.168.80.43:10600/";

    //Credenciales correctas
    public String correctEmail = "abreytmann@sentra.cl";
    public String correctPassword = "Sentra2025";

    //XPATH
    public String email = "//input[@id='email']";
    public String password = "//input[@id='password']";
    public String btnSubmit = "//button[@type='submit']";
    public String btnHome = "//span[normalize-space()='Home']";
    public String btnOrderByTitleAscending = "//span[contains(.,'Títulosorted ascending')]";
    public String btnOrderByTitleDescending = "//span[contains(.,'Títulosorted descending')]";
    public String btnOrderByPriorityAscending = "//span[contains(.,'Prioridad')]";
    public String btnOrderByPriorityDescending = "//span[contains(.,'Prioridad')]";
    public String btnOrderByExpireDateAscending = "(//span[@class='MuiButtonBase-root MuiTableSortLabel-root css-7fdmwy'])[3]";
    public String btnOrderByExpireDateDescending = "(//span[@role='button'])[3]";

    public OrdenarTareas(){
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

    //Se oprime botón de ordenamiento ascendiente de titulo
    public void pressBtnOrderByTitleAscending() {
        clickElement(btnOrderByTitleAscending);
    }

    //Se oprime botón de ordenamiento descendiente de titulo
    public void pressBtnOrderByTitleDescending() {
        clickElement(btnOrderByTitleDescending);
    }

    //Se oprime botón de ordenamiento ascendiente de fecha de vencimiento
    public void pressBtnOrderByExpireDateAscending() {
        clickElement(btnOrderByExpireDateAscending);
    }

    //Se oprime botón de ordenamiento descendiente de fecha de vencimiento
    public void pressBtnOrderByExpireDateDescending() {
        clickElement(btnOrderByExpireDateDescending);
    }

    //Se oprime botón de ordenamiento ascendiente de prioridad
    public void pressBtnOrderByPriorityAscending() {
        clickElement(btnOrderByPriorityAscending);
    }

    //Se oprime botón de ordenamiento Descendiente de prioridad
    public void pressBtnOrderByPriorityDescending() {
        clickElement(btnOrderByPriorityDescending);
    }
}