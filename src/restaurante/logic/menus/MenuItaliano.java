/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.logic.menus;

import restaurante.logic.comidas.bebidas.Bebida;
import restaurante.logic.comidas.bebidas.BebidaItaliana;
import restaurante.logic.comidas.entradas.Entrada;
import restaurante.logic.comidas.entradas.EntradaItaliana;
import restaurante.logic.comidas.platoprincipal.PlatoPrincipal;
import restaurante.logic.comidas.platoprincipal.PlatoPrincipalItaliano;
import restaurante.logic.comidas.postre.Postre;
import restaurante.logic.comidas.postre.PostreItaliano;

/**
 *
 * @author laver
 */
public class MenuItaliano extends AbsFabricaMenu {
    
    @Override
    public Bebida traerBebida() {
        return new BebidaItaliana();
    }
    
    @Override
    public Entrada traerEntrada() {
        return new EntradaItaliana();
    }
    
    @Override
    public PlatoPrincipal traerPlatoPrincipal() {
        return new PlatoPrincipalItaliano();
    }
    
    @Override
    public Postre traerPostre() {
        return new PostreItaliano();
    }
}
