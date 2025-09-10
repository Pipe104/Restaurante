/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.logic.comidas.platoprincipal;

/**
 *
 * @author laver
 */
public class PlatoPrincipalColombiano extends PlatoPrincipal {
    
    private String platoPrincipal;
    
    @Override
    public String prepararPlatoPrincipal(){
        
        platoPrincipal = "Bandeja paisa (arroz, fríjoles, carne molida, chicharrón, huevo frito, plátano maduro, aguacate y arepa)\n";
        return platoPrincipal;
    }
}
