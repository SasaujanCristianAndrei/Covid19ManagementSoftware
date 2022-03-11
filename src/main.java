import controllers.MainController;
import models.Aplicatie;
import models.Ocupatie;
import models.Utilizator;
import views.MainView;
import views.SecondView;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Aplicatie aplicatie1=new Aplicatie("COVID");
        MainView paginaPrincipalaView1=new MainView();
        SecondView secondView=new SecondView();
        MainController controller1=new MainController(paginaPrincipalaView1,aplicatie1,secondView);



    }
}
