/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Json;

/**
 *
 * @author J.D.
 */

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class json1{
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("Class", "CIT360");
        obj.put("Year", new Integer(2017));
        JSONArray list = new JSONArray();
        list.add("This is for the class and should be basic enough.");
        list.add("Pretty Sure it's basic and covers it.");
        obj.put("messages", list);
        try (FileWriter file = new FileWriter("C:\\Users\\Matthew\\Documents\\NetBeansProjects\\JavaLibrary1\\src\\Json\\tester.json")) {
            file.write(obj.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print(obj);
    }
}