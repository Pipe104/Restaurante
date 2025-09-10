/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.logic.menus;

//Importaciones para crear los objetos de cada alimento
import restaurante.logic.comidas.bebidas.Bebida;
import restaurante.logic.comidas.bebidas.BebidaColombiana;
import restaurante.logic.comidas.entradas.Entrada;
import restaurante.logic.comidas.entradas.EntradaColombiana;
import restaurante.logic.comidas.platoprincipal.PlatoPrincipal;
import restaurante.logic.comidas.platoprincipal.PlatoPrincipalColombiano;
import restaurante.logic.comidas.postre.Postre;
import restaurante.logic.comidas.postre.PostreColombiano;

public class MenuColombiano extends AbsFabricaMenu {
    
    @Override
    public Bebida traerBebida() {
        return new BebidaColombiana();
    }
    
    @Override
    public Entrada traerEntrada() {
        return new EntradaColombiana();
    }
    
    @Override
    public PlatoPrincipal traerPlatoPrincipal(){
     return new PlatoPrincipalColombiano();
}
    
    
    @Override
    public Postre traerPostre() {
        return new PostreColombiano();
    }
}
