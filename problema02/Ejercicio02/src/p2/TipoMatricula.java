/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.Matricula;

/**
 *
 * @author reroes
 */
public class TipoMatricula {
    private double promedioMatriculas;
  private ArrayList<Matricula> lista;

    public void establecerLista(ArrayList<Matricula> lis) {
        lista = lis;
    }

    public void establecerPromedioTarifas(){
       double aux=0;
        for (int i = 0; i < lista.size(); i++) {
            aux=aux+lista.get(i).obtenerTarifa();
        }
        promedioMatriculas=aux/lista.size();
    }
    
    public double obtenerPromedioTarifas(){
        return promedioMatriculas;
    }
    
    
}
