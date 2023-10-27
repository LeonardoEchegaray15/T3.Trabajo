/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

/**
 *
 * @author Leonardo
 */
public class RopaVaron implements Categoria{
     private String codigo;
    private String precio;

    public RopaVaron(String codigo, String precio) {
        this.codigo = codigo;
        this.precio = precio;
    }
    public RopaVaron(){
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    String GetTexto(){
        return "  N - "+this.codigo +"                                                                                                   VARON                                                                                               "+ "S/. "+this.precio;
    }
    
}
