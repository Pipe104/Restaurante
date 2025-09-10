/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.logic.comidas.postre;

/**
 *
 * @author laver
 */
public class PostreColombiano extends Postre {

    private String postre;
    
    @Override
    public String prepararPostre(){
        postre = "Arroz con leche (con canela y pasas)\n";
        return postre;
    }
}
