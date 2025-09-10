/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.logic.comidas.platoprincipal;

/**
 *
 * @author laver
 */
public class PlatoPrincipalItaliano extends PlatoPrincipal{
    
    private String platoPrincipal;
    
    @Override
    public String prepararPlatoPrincipal(){
        
        platoPrincipal = "Pasta Carbonara\n";
        return platoPrincipal;
    }
}
