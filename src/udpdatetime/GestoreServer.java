/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpdatetime;

/**
 *
 * @author CianettiMattia
 */
public class GestoreServer 
{
    public static void main(String[] args)
     {
        UDPServer s = new UDPServer();
        s.ascolto();
        s.scrivi();
        s.leggi();
    }
}
