/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

/**
 *
 * @author Irene
 */
public class Furgone extends Veicolo{
    private int capacità;

    public Furgone(int capacità, String marca, int anno, int cyl) {
        super(marca, anno, cyl);
        this.capacità = capacità;
    }

    public int getCapacità() {
        return capacità;
    }



    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public int getAnno() {
        return anno;
    }

    @Override
    public int getCyl() {
        return cyl;
    }
    
    @Override
    public String toString(){
        String st = getMarca() +"\n " + getAnno() + "\n " + getCyl() + "\n";
        st+= getCapacità();
        return st;
    }
    
    
}
