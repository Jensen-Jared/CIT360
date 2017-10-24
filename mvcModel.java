/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author J.D.
 */
public class Model {
    private int x;
        public Model(){
        x = 1;
        }
        public Model(int x){
            this.x = x;
        }
        public void incX(){
            x = x * 2;
        }
        public int getX(){
            return x;
        }
}