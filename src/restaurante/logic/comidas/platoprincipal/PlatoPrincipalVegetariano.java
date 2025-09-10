/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.logic.comidas.platoprincipal;

/**
 *
 * @author laver
 */
public class PlatoPrincipalVegetariano extends PlatoPrincipal {
    
    private String platoPrincipal;
    
    @Override
    public String prepararPlatoPrincipal(){
        
        platoPrincipal = "Curry de garbanzos con arroz basmati\n";
        return platoPrincipal;
    }
}
