/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TipoMatricula tipos = new TipoMatricula();
        
        MatriculaCampamento mcamp = new MatriculaCampamento();   
        MatriculaColegio mcolegio = new MatriculaColegio();
        MatriculaEscuela mescuela = new MatriculaEscuela();
        MatriculaJardin mjardin = new MatriculaJardin();
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        
        ArrayList<Matricula> lis=new ArrayList<>();
        lis.add(mcamp);
        lis.add(mcolegio);
        lis.add(mescuela);
        lis.add(mjardin);
        lis.add(mmaternal);
        lis.add(mmaternal2);
        for (Matricula li : lis) {
            li.establecerTarifa();
        }
        tipos.establecerLista(lis);
        tipos.establecerPromedioTarifas();
        System.out.printf("%.2f\n", tipos.obtenerPromedioTarifas());
    }
}
