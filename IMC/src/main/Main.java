package main;
import model.ModelImc;
import view.ViewImc;
import controller.ControllerImc;
public class Main 
{
    private static ViewImc viewImc;
    private static ModelImc modelImc;
    private static ControllerImc controllerImc;
    
    public static void main(String[] args) 
    {
        viewImc = new ViewImc();
        modelImc = new ModelImc();
        controllerImc= new ControllerImc(viewImc, modelImc);
    }   
}
