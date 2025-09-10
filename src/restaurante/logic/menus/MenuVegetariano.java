/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.logic.menus;

import restaurante.logic.comidas.bebidas.Bebida;
import restaurante.logic.comidas.bebidas.BebidaVegetariana;
import restaurante.logic.comidas.entradas.Entrada;
import restaurante.logic.comidas.entradas.EntradaVegetariana;
import restaurante.logic.comidas.platoprincipal.PlatoPrincipal;
import restaurante.logic.comidas.platoprincipal.PlatoPrincipalVegetariano;
import restaurante.logic.comidas.postre.Postre;
import restaurante.logic.comidas.postre.PostreVegetariano;

/**
 *
 * @author laver
 */
public class MenuVegetariano extends AbsFabricaMenu {
    
    @Override
    public Bebida traerBebida() {
        return new BebidaVegetariana();
    }
    
    @Override
    public Entrada traerEntrada() {
        return new EntradaVegetariana();
    }
    
    @Override
    public PlatoPrincipal traerPlatoPrincipal() {
        return new PlatoPrincipalVegetariano();
    }
    
    @Override
    public Postre traerPostre() {
        return new PostreVegetariano();
    }
}
