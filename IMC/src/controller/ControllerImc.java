package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelImc;
import view.ViewImc;

public class ControllerImc implements ActionListener
{
    private final ModelImc modelImc;
    private final ViewImc viewImc;
    
    public ControllerImc(ViewImc viewImc, ModelImc modelImc)
    {
        this.viewImc = viewImc;
        this.modelImc = modelImc;
        viewImc.Jb_calcular.addActionListener(this);
        initView();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if(e.getSource()==viewImc.Jb_calcular)
       {
           modelImc.setMessage("IMC "+viewImc.Jb_calcular.getText());
           viewImc.Jl_txt.setText(modelImc.getMessage());
       }
    }

    private void initView() 
    {
        viewImc.setTitle("IMC MVC");
        viewImc.setLocationRelativeTo(null);
        viewImc.Jl_txt.setText(modelImc.getMessage());
        viewImc.setVisible(true);
    }

}