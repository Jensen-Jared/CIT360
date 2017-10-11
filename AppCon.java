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
public class AppCon {
    private Dispatcher dispatcher;
    public AppCon(){
        dispatcher = new Dispatcher();
    }
    private boolean isAuthenticUser(){
        System.out.println("Synopsis:");
        return true;
    }
    private void trackReq(String request){
        System.out.println(" " + request);
    }
    public void dispatchReq (String request){
        trackReq(request);
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}