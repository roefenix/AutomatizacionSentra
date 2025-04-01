package pages.Home;

import org.testng.asserts.SoftAssert;

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
    public String btnSalir = "//span[normalize-space()='Salir']";
    public String btnOrderByTitleAscending = "//span[contains(.,'Títulosorted ascending')]";
    public String btnOrderByTitleDescending = "//span[contains(.,'Títulosorted descending')]";
    public String btnOrderByPriorityAscending = "//span[contains(@class, 'MuiButtonBase-root') and contains(@class, 'MuiTableSortLabel-root') and text()='Prioridad']";
    public String btnOrderByPriorityDescending = "//span[contains(.,'Prioridadsorted ascending')]";
    public String btnOrderByExpireDateAscending = "//span[contains(@class, 'MuiButtonBase-root') and contains(@class, 'MuiTableSortLabel-root') and text()='Fecha Vencimiento']";
    public String btnOrderByExpireDateDescending = "//span[contains(.,'Fecha Vencimientosorted ascending')]";
    public String titleSpace1 = "/html/body/div[1]/div/main/div[2]/div/div/div[1]/table/tbody/a[1]/td[1]";
    public String titleSpace2 = "/html/body/div[1]/div/main/div[2]/div/div/div[1]/table/tbody/a[2]/td[1]";
    public String titleSpace3 = "/html/body/div[1]/div/main/div[2]/div/div/div[1]/table/tbody/a[3]/td[1]";
    public String titleSpace4 = "/html/body/div[1]/div/main/div[2]/div/div/div[1]/table/tbody/a[4]/td[1]";
    public String dateSpace1 = "/html/body/div[1]/div/main/div[2]/div/div/div[1]/table/tbody/a[1]/td[3]";
    public String dateSpace2 = "/html/body/div[1]/div/main/div[2]/div/div/div[1]/table/tbody/a[2]/td[3]";
    public String dateSpace3 = "/html/body/div[1]/div/main/div[2]/div/div/div[1]/table/tbody/a[3]/td[3]";
    public String dateSpace4 = "/html/body/div[1]/div/main/div[2]/div/div/div[1]/table/tbody/a[4]/td[3]";
    public String prioritySpace1 = "/html/body/div[1]/div/main/div[2]/div/div/div[1]/table/tbody/a[1]/td[4]";
    public String prioritySpace2 = "/html/body/div[1]/div/main/div[2]/div/div/div[1]/table/tbody/a[2]/td[4]";
    public String prioritySpace3 = "/html/body/div[1]/div/main/div[2]/div/div/div[1]/table/tbody/a[3]/td[4]";
    public String prioritySpace4 = "/html/body/div[1]/div/main/div[2]/div/div/div[1]/table/tbody/a[4]/td[4]";

    SoftAssert soft = new SoftAssert();
    
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

    //Se oprime boton Salir
    public void pressBtnSalir() {
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

    //Se valida ordeniamiento ascendente por titulo
    public void validateAscTitleInfo(){
        try { 
            Thread.sleep(500);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        soft.assertEquals("Z",obtenerTextoDeDiv(titleSpace1));
        soft.assertEquals("X",obtenerTextoDeDiv(titleSpace2));
        soft.assertEquals("M",obtenerTextoDeDiv(titleSpace3));
        soft.assertEquals("B",obtenerTextoDeDiv(titleSpace4));
        soft.assertAll();
    }
    //Se valida ordeniamiento descendente por titulo
    public void validateDescTitleInfo(){
        try { 
            Thread.sleep(500);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        soft.assertEquals("B",obtenerTextoDeDiv(titleSpace1));
        soft.assertEquals("M",obtenerTextoDeDiv(titleSpace2));
        soft.assertEquals("X",obtenerTextoDeDiv(titleSpace3));
        soft.assertEquals("Z",obtenerTextoDeDiv(titleSpace4));
        soft.assertAll();
    }
    //Se valida ordeniamiento ascendente por fecha vencimiento
    public void validateAscDateInfo(){
        try { 
            Thread.sleep(500);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        soft.assertEquals("2025-04-01T05:45:06",obtenerTextoDeDiv(dateSpace1));
        soft.assertEquals("2026-04-01T05:45:06",obtenerTextoDeDiv(dateSpace2));
        soft.assertEquals("2027-04-01T05:45:06",obtenerTextoDeDiv(dateSpace3));
        soft.assertEquals("2028-04-01T05:42:45",obtenerTextoDeDiv(dateSpace4));
        soft.assertAll();
    }
    //Se valida ordeniamiento descendente por fecha vencimiento
    public void validateDescDateInfo(){
        try { 
            Thread.sleep(500);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        soft.assertEquals("2028-04-01T05:42:45",obtenerTextoDeDiv(dateSpace1));
        soft.assertEquals("2027-04-01T05:45:06",obtenerTextoDeDiv(dateSpace2));
        soft.assertEquals("2026-04-01T05:45:06",obtenerTextoDeDiv(dateSpace3));
        soft.assertEquals("2025-04-01T05:45:06",obtenerTextoDeDiv(dateSpace4));
        soft.assertAll();
    }
    //Se valida ordeniamiento ascendente por prioridad
    public void validateAscPriorityInfo(){
        try { 
            Thread.sleep(500);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        soft.assertEquals("0",obtenerTextoDeDiv(prioritySpace1));
        soft.assertEquals("1",obtenerTextoDeDiv(prioritySpace2));
        soft.assertEquals("3",obtenerTextoDeDiv(prioritySpace3));
        soft.assertEquals("4",obtenerTextoDeDiv(prioritySpace4));
        soft.assertAll();
    }
    //Se valida ordeniamiento descendente por prioridad
    public void validateDescPriorityInfo(){
        try { 
            Thread.sleep(500);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        soft.assertEquals("4",obtenerTextoDeDiv(prioritySpace1));
        soft.assertEquals("3",obtenerTextoDeDiv(prioritySpace2));
        soft.assertEquals("1",obtenerTextoDeDiv(prioritySpace3));
        soft.assertEquals("0",obtenerTextoDeDiv(prioritySpace4));
        soft.assertAll();
    }
}