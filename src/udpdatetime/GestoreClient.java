/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpdatetime;

import java.net.InetAddress;

/**
 *
 * @author CianettiMattia
 */
public class GestoreClient 
{
    public static void main(String[] args) 
    {
            UDPClient c = new UDPClient();
             c.leggi();
             c.scrivi();

    }
}
