package steps;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.testng.asserts.SoftAssert;
    import io.cucumber.java.en.And;
    import io.cucumber.java.en.Given;
    import io.cucumber.java.en.Then;
    import io.cucumber.java.en.When;
    import pages.Login.RegistroUsuario;
    import pages.Login.InicioSesion;
    import pages.Profile.ModificarUsuario;
    import pages.Profile.ModificarContrasena;
    import pages.Home.CrearTareas;
    import pages.Home.EditarTareas;
    import pages.Home.OrdenarTareas;

public class PruebaSeleniumSteps {
    RegistroUsuario RegistroNuevo = new RegistroUsuario();
    InicioSesion LoginNuevo = new InicioSesion();
    ModificarUsuario UsuarioModificado = new ModificarUsuario();
    ModificarContrasena ContrasenaModificada = new ModificarContrasena();
    CrearTareas CreaTarea = new CrearTareas();
    EditarTareas EditarTarea = new EditarTareas();
    OrdenarTareas OrdenarTarea = new OrdenarTareas();

    // =============================== Registro Usuario ===============================
    @Given("estoy en la pagina de login")
    public void iEnterToTestPage() {
        RegistroNuevo.enterToTestPage();
    }
    @When("oprimo el botón CREAR NUEVO USUARIO")
    public void iPressBtnCreateUser(){
        RegistroNuevo.pressBtnCreateUser();
    }
    @Then("introduzco nombre, apellido, email, contraseña, repito contraseña incorrecta")
    public void iPutIncorrectData(){
        RegistroNuevo.putInCorrectData();
    }
    @Then("oprimo el botón REGISTRAR USUARIO con credenciales incorrectas")
    public void iPressBtnRegisterUserIncorrectData(){
        RegistroNuevo.pressBtnRegisterUser();
    }
    @Then("observo mensaje de creación no exitoso")
    public void iValidateErrorCreationMessage(){
        RegistroNuevo.validateErrorCreationMessage();
    }
    @Then("oprimo el botón CANCELAR")
    public void iPressBtnCancel(){
        RegistroNuevo.pressBtnCancel();
    }
    @Then("oprimo el botón CREAR NUEVO USUARIO nuevamente")
    public void iPressBtnCreateUserNew(){
        RegistroNuevo.pressBtnCreateUser();
    }
    @Then("introduzco nombre, apellido, email, contraseña, repito contraseña")
    public void iPutCorrectData(){
        RegistroNuevo.putCorrectData();
    }
    @Then("oprimo el botón REGISTRAR USUARIO")
    public void iPressBtnRegisterUser(){
        RegistroNuevo.pressBtnRegisterUser();
    }
    @And("observo mensaje de creación exitoso")
    public void iValidateCreationMessage(){
        RegistroNuevo.validateCreationMessage();
    }
    // =============================== Inicio Sesion ===============================
    // @Given("estoy en la pagina de login")
    // public void iEnterToTestPage() {
    //     LoginNuevo.enterToTestPage();
    // }
    @When("introduzco el email y la contraseña incorrecta")
    public void iWriteCredentials(){
        LoginNuevo.writeIncorrectCredentials();
    }
    @Then("oprimo el botón INGRESAR")
    public void iPressBtnSumbit(){
        LoginNuevo.pressBtnSumbit();
    }
    @Then("observo mensaje de ingreso no exitoso")
    public void iValidateErrorLoginMessage(){
        LoginNuevo.validateErrorLoginMessage();
    }
    @Then("introduzco el email y la contraseña correcta")
    public void iWriteCorrectCredentials(){
        LoginNuevo.writeCorrectCredentials();
    }
    @Then("oprimo nuevamente el botón INGRESAR")
    public void iPressBtnSumbitNew(){
        LoginNuevo.pressBtnSumbit();
    }
    @And("observo ingreso correcto")
    public void iValidateEntryLogin(){
        LoginNuevo.validateEntryLogin();
    }
    // =============================== Modificar información de usuario ===============================
    // @Given("estoy en la pagina de login")
    // public void iEnterToTestPage() {
    //     UsuarioModificado.enterToTaskSentraPage();
    // }
    // @When("introduzco el email y la contraseña")
    // public void iWriteCredentials(){
    //     UsuarioModificado.writeCredentials();
    // }
    // @Then("oprimo el botón INGRESAR")
    // public void iPressBtnSumbit(){
    //     UsuarioModificado.pressBtnSumbit();
    // }
    @And("oprimo el botón Perfil")
    public void iPressBtnProfile(){
        UsuarioModificado.pressBtnProfile();
    }
    @When("oprimo el botón EDITAR DATOS USUARIO")
    public void iPressBtnEditUser(){
        UsuarioModificado.pressBtnEditUser();
    }
    @Then("oprimo el botón CANCELAR del formulario de modificación")
    public void iPressBtnCancelMod(){
        UsuarioModificado.pressBtnCancelMod();
    }
    @Then("oprimo el botón EDITAR DATOS USUARIO nuevamente")
    public void iPressBtnEditUserNuevo(){
        UsuarioModificado.pressBtnEditUser();
    }
    @Then("introduzco nombre, apellido, email")
    public void iPutCorrectDataMod(){
        UsuarioModificado.putCorrectDataMod();
    }
    @Then("oprimo el botón MODIFICAR USUARIO")
    public void iPressBtnModifyUser(){
        UsuarioModificado.pressBtnModifyUser();
    }
    @Then("observo mensaje de modificación exitoso")
    public void iValidateModificationMessage(){
        UsuarioModificado.validateModificationMessage();
    }
    @And("observo nombre, apellido y mail cambiados")
    public void iValidateModificationInfo(){
        UsuarioModificado.validateModificationInfo();
    }
    // =============================== Modificar contraseña del usuario ===============================
    // @Given("estoy en la pagina de login")
    // public void iEnterToTestPage() {
    //     ContrasenaModificada.enterToTaskSentraPage();
    // }
    // @When("introduzco el email y la contraseña")
    // public void iWriteCredentials(){
    //     ContrasenaModificada.writeCredentials();
    // }
    // @Then("oprimo el botón INGRESAR")
    // public void iPressBtnSumbit(){
    //     ContrasenaModificada.pressBtnSumbit();
    // }
    // @And("oprimo el botón Perfil")
    // public void iPressBtnProfile(){
    //     ContrasenaModificada.pressBtnProfile();
    // }
    @When("oprimo el botón CAMBIAR CONTRASEÑA")
    public void iPressBtnEditPassword(){
        ContrasenaModificada.pressBtnEditPassword();
    }
    @Then("oprimo el botón CANCELAR del formulario de modificación de contraseña")
    public void iPressBtnCancelModPass(){
        ContrasenaModificada.pressBtnCancelModPass();
    }
    @Then("oprimo nuevamente el botón CAMBIAR CONTRASEÑA")
    public void iPressBtnEditPasswordNew(){
        ContrasenaModificada.pressBtnEditPassword();
    }
    @Then("introduzco contraseña y la repetición de la contraseña")
    public void iPutCorrectDataModPass(){
        ContrasenaModificada.putCorrectDataModPass();
    }
    @Then("oprimo el botón CAMBIAR CONTRASEÑA del formulario")
    public void iPressBtnEditPasswordForm(){
        ContrasenaModificada.pressBtnEditPasswordForm();
    }
    @And("observo mensaje de modificación de contraseña exitoso")
    public void iValidateModificationPasswordMessage(){
        ContrasenaModificada.validateModificationPasswordMessage();
    }
    // =============================== Crear nueva tarea ===============================
    // @Given("estoy en la pagina de login")
    // public void iEnterToTestPage() {
    //     CreaTarea.enterToTestPage();
    // }
    // @When("introduzco el email y la contraseña")
    // public void iWriteCredentials(){
    //     CreaTarea.writeCredentials();
    // }
    // @Then("oprimo el botón INGRESAR")
    // public void iPressBtnSumbit(){
    //     CreaTarea.pressBtnSumbit();
    // }
    // @And("oprimo el botón Home")
    // public void iPressBtnHome(){
    //     CreaTarea.pressBtnHome();
    // }
    // @When("oprimo el botón NUEVA TAREA")
    // public void iPressBtnNewTask(){
    //     CreaTarea.pressBtnNewTask();
    // }
    // @Then("oprimo el botón CANCELAR")
    // public void iPressBtnCancelTask(){
    //     CreaTarea.pressBtnCancelTask();
    // }
    // @Then("oprimo nuevamente el botón NUEVA TAREA")
    // public void iPressBtnNewTaskNew(){
    //     CreaTarea.pressBtnNewTask();
    // }
    // @Then("introduzco el titulo, la descripción, la fecha de vencimiento y la prioridad")
    // public void iWriteInfoTask(){
    //     CreaTarea.writeInfoTask();
    // }
    // @Then("oprimo el botón CREAR TAREA")
    // public void iPressBtnCreateTask(){
    //     CreaTarea.pressBtnCreateTask();
    // }
    // =============================== Editar Tarea ===============================
    // @Given("estoy en la pagina de login")
    // public void iEnterToTestPage() {
    //     EditarTarea.enterToTestPage();
    // }
    // @When("introduzco el email y la contraseña")
    // public void iWriteCredentials(){
    //     EditarTarea.writeCredentials();
    // }
    // @Then("oprimo el botón INGRESAR")
    // public void iPressBtnSumbit(){
    //     EditarTarea.pressBtnSumbit();
    // }
    // @And("oprimo el botón Home")
    // public void iPressBtnHome(){
    //     EditarTarea.pressBtnHome();
    // }
    // @When("selecciono una tarea creada")
    // public void iPressBtnSelectTask(){
    //     EditarTarea.pressBtnSelectTask();
    // }
    // @Then("oprimo el botón EDITAR TAREA")
    // public void iPressBtnEditTask(){
    //     EditarTarea.pressBtnEditTask();
    // } 
    // @Then("oprimo el botón CANCELAR")
    // public void iPressBtnCancelTask(){
    //     EditarTarea.pressBtnCancelTask();
    // } 
    // @Then("oprimo nuevamente el botón EDITAR TAREA")
    // public void iPressBtnEditTaskNew(){
    //     EditarTarea.pressBtnEditTask();
    // } 
    // @Then("introduzco el titulo, la descripción, la fecha de vencimiento y la prioridad")
    // public void iWriteInfoTask(){
    //     EditarTarea.writeInfoTask();
    // } 
    // @Then("oprimo el botón MODIFICAR TAREA")
    // public void iPressBtnModifyTask(){
    //     EditarTarea.pressBtnModifyTask();
    // }
    // =============================== Ordenar tareas por titulo ===============================
    // @Given("estoy en la pagina de login")
    // public void iEnterToTestPage() {
    //     OrdenarTarea.enterToTestPage();
    // }
    // @When("introduzco el email y la contraseña")
    // public void iWriteCredentials(){
    //     OrdenarTarea.writeCredentials();
    // }
    // @Then("oprimo el botón INGRESAR")
    // public void iPressBtnSumbit(){
    //     OrdenarTarea.pressBtnSumbit();
    // }
    // @And("oprimo el botón Home")
    // public void iPressBtnHome(){
    //     OrdenarTarea.pressBtnHome();
    // }
    // @Then("oprimo el botón para ordenar ascendentemente por titulo la tarea")
    // public void iPressBtnOrderByTitleAscending(){
    //     OrdenarTarea.pressBtnOrderByTitleAscending();
    // } 
    // @Then("oprimo el botón para ordenar descendentemente por titulo la tarea")
    // public void iPressBtnOrderByTitleDescending(){
    //     OrdenarTarea.pressBtnOrderByTitleDescending();
    // } 
    // @Then("oprimo el botón para ordenar ascendentemente por fecha de vencimiento la tarea")
    // public void iPressBtnOrderByExpireDateAscending(){
    //     OrdenarTarea.pressBtnOrderByExpireDateAscending();
    // }
    // @Then("oprimo el botón para ordenar descendentemente por fecha de vencimiento la tarea")
    // public void iPressBtnOrderByExpireDateDescending(){
    //     OrdenarTarea.pressBtnOrderByExpireDateDescending();
    // }
    // @Then("oprimo el botón para ordenar ascendentemente por prioridad la tarea")
    // public void iPressBtnOrderByPriorityAscending(){
    //     OrdenarTarea.pressBtnOrderByPriorityAscending();
    // }
    // @Then("oprimo el botón para ordenar descendentemente por prioridad la tarea")
    // public void iPressBtnOrderByPriorityDescending(){
    //     OrdenarTarea.pressBtnOrderByPriorityDescending();
    // }
}