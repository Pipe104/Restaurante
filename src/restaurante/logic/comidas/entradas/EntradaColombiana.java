/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.logic.comidas.entradas;

/**
 *
 * @author laver
 */
public class EntradaColombiana extends Entrada {
    
    private String entrada;
    
    @Override
    public String prepararEntrada(){
        entrada = "Empanadas de papa con aji casero\n";
        return entrada;
    }
}
