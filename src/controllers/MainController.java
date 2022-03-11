package controllers;

import models.Aplicatie;
import models.Utilizator;
import views.MainView;
import views.SecondView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController {

    private MainView mainView;
    private SecondView secondView;
    private Aplicatie aplicatie;


    public MainController(MainView mainView, Aplicatie aplicatie,SecondView secondView)
    {
        this.mainView=mainView;
        this.aplicatie=aplicatie;
        this.secondView=secondView;
        this.mainView.addInscriereListener(new InscriereListener());
        this.mainView.addVeziPacientiListener(new VeziPacientiListener());

        this.secondView.addBackButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondView.setVisible(false);
                mainView.setVisible(true);
            }
        });

        this.secondView.addInscriere(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try
                {
                    String nume=secondView.getNumeField();

                    try
                    {
                        Double.parseDouble(nume);
                        throw new Exception("nu e nume");
                    }catch (Exception exceptie2)
                    {
                        if(exceptie2.getMessage().equals("nu e nume"))
                            throw new Exception("nu e nume");
                    }

                    int varsta=secondView.getVarstaField();
                    String ocupatie=secondView.getComboBox();
                    Utilizator utilizator=new Utilizator(nume,varsta,ocupatie);
                    aplicatie.getUtilizatori().add(utilizator);
                }
                catch (Exception exceptie)
                {
                    secondView.showMessage("Bad input");
                }


            }
        });

        this.secondView.addVeziEtapa(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int varsta=secondView.getVarstaField();
                String ocupatie=secondView.getComboBox();

                if(ocupatie.equals("Doctor"))
                {
                    secondView.setTextAreaVfEtapa(1);
                }
                if(ocupatie.equals("Profesor") && varsta>65)
                {
                    secondView.setTextAreaVfEtapa(2);
                }
                if(ocupatie.equals("Profesor") && varsta<65)
                {
                    secondView.showMessage("Profesorul are o varsta sub 65 ani");
                }
                if(ocupatie.equals("Elev"))
                {
                    secondView.setTextAreaVfEtapa(3);
                }
            }
        });


    }

    class InscriereListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            secondView.setVisible(true);
            mainView.setVisible(false);
        }
    }

    class VeziPacientiListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            String doctor="";
            String profesor="";
            String elev="";

            try{
                for(int i=0;i<aplicatie.getUtilizatori().size();i++)
                {
                    if(aplicatie.getUtilizatori().get(i).getOcupatie()=="Doctor")
                        doctor=doctor+" "+aplicatie.getUtilizatori().get(i).toString()+",";

                    if(aplicatie.getUtilizatori().get(i).getOcupatie()=="Profesor")
                        profesor=profesor+" "+aplicatie.getUtilizatori().get(i).toString()+",";

                    if(aplicatie.getUtilizatori().get(i).getOcupatie()=="Elev")
                        elev=elev+" "+aplicatie.getUtilizatori().get(i).toString()+",";

                }

                if(mainView.getEtapaField()==1)
                {
                    mainView.showPacienti(doctor);
                }
                if(mainView.getEtapaField()==2)
                {
                    mainView.showPacienti(profesor);
                }

                if(mainView.getEtapaField()==3)
                {
                    mainView.showPacienti(elev);
                }
            }catch (Exception exception)
            {
                mainView.showMessage("Introduceti un numar");
            }
        }
    }
}
