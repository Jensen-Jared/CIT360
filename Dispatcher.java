/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppConPat;

/**
 *
 * @author J.D.
 */
public class Dispatcher {
    private LukeSkywalkerBio LukeSkywalker;
    private HanSoloBio HanSolo;
    private PrincessLeiaBio PrincessLeia;
    private errorMes errorM;
    public Dispatcher(){
        LukeSkywalker = new LukeSkywalkerBio();
        HanSolo = new HanSoloBio();
        PrincessLeia = new PrincessLeiaBio();
        errorM = new errorMes();
    }
    public void dispatch(String request){
        if(request.equalsIgnoreCase("LukeSkywalker")){
            LukeSkywalker.show();
        }else if(request.equalsIgnoreCase("HanSolo")){
            HanSolo.show();
        }else if(request.equalsIgnoreCase("PrincessLeia")){
            PrincessLeia.show();
        }else{
            errorM.show();
        }
    }
}