package pages.Home;

import pages.BasePage;

public class OrdenarTareas extends BasePage{
    //Conexion
    private String Conexion = "http://192.168.80.43:10600/";

    //Credenciales correctas
    public String correctEmail = "orderman@gmail.com";
    public String correctPassword = "order";

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
    public String btnOrderByExpireDateDescending = "(//span[@class='MuiButtonBase-root MuiTableSortLabel-root css-7fdmwy'])[3]";

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
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        clickElement(btnOrderByTitleAscending);
    }

    //Se oprime botón de ordenamiento descendiente de titulo
    public void pressBtnOrderByTitleDescending() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        clickElement(btnOrderByTitleDescending);
    }

    //Se oprime botón de ordenamiento ascendiente de fecha de vencimiento
    public void pressBtnOrderByExpireDateAscending() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        clickElement(btnOrderByExpireDateAscending);
    }

    //Se oprime botón de ordenamiento descendiente de fecha de vencimiento
    public void pressBtnOrderByExpireDateDescending() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        clickElement(btnOrderByExpireDateDescending);
    }

    //Se oprime botón de ordenamiento ascendiente de prioridad
    public void pressBtnOrderByPriorityAscending() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        clickElement(btnOrderByPriorityAscending);
    }

    //Se oprime botón de ordenamiento descendiente de prioridad
    public void pressBtnOrderByPriorityDescending() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        clickElement(btnOrderByPriorityDescending);
    }
}