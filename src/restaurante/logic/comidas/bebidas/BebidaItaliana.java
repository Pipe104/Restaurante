/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.logic.comidas.bebidas;

/**
 *
 * @author laver
 */
public class BebidaItaliana extends Bebida {

    private String bebida;
    
    @Override
    public String prepararBebida(){
        bebida = "Vino Tinto\n";
        return bebida;
    }
}
