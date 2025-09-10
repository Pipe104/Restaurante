/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.logic.comidas.postre;

/**
 *
 * @author laver
 */
public class PostreItaliano extends Postre{
    
    private String postre;
    
    @Override
    public String prepararPostre(){
        
        postre = "Tiramisu clasico\n";
        return postre;
    }
}
