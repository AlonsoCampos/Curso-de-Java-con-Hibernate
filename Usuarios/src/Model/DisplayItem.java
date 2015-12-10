/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author usuario
 */
public class DisplayItem {
    private String texto;
    private int valor;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public DisplayItem(String texto, int valor) {
        this.texto = texto;
        this.valor = valor;
    }

    @Override
    // ontener una representacion textual de un objeto
    public String toString() {
        return this.texto;
    }
    
}
