/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.models;

import java.io.IOException;
import org.json.JSONObject;

/**
 *
 * @author YasserOsama
 */
public abstract class GeneralController {
    abstract public void processMessage(JSONObject msg)throws IOException, ClassNotFoundException;
}
