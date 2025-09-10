/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.logic.menus;

import restaurante.logic.comidas.bebidas.Bebida;

import restaurante.logic.comidas.entradas.Entrada;

import restaurante.logic.comidas.platoprincipal.PlatoPrincipal;

import restaurante.logic.comidas.postre.Postre;

/**
 *
 * @author laver
 */
public abstract class AbsFabricaMenu {

    public abstract Bebida traerBebida();
    public abstract Entrada traerEntrada();
    public abstract PlatoPrincipal traerPlatoPrincipal();
    public abstract Postre traerPostre();
    
}
