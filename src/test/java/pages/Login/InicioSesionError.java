package pages.Login;

import org.openqa.selenium.By;

import pages.BasePage;

public class InicioSesionError extends BasePage{
    //Conexion
    private String Conexion = "http://192.168.80.43:10600/";

    //Credenciales correctas
    public String correctEmail = "usuarioerroneo@sentra.cl";
    public String correctPassword = "contraerronea";

    //XPATH
    public String email = "//input[@id='email']";
    public String password = "//input[@id='password']";
    public String btnSubmit = "//button[@type='submit']";
    //public String errorMessage ="//div[contains(@class,'MuiAlert-message css-1xsto0d')]";
    private By errorMessage = By.xpath("//div[contains(@class,'MuiAlert-message css-1xsto0d')]");
    
    public InicioSesionError(){
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
}
