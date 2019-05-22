/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author USUARIO
 */
public class Operaciones {
  
    private float a,b;
    private float resultado;
    Suma s=new Suma();
    Resta r=new Resta();
    Multiplicacion m=new Multiplicacion();
    Division d=new Division();
    

    public Operaciones(){
          
        
    }

    public float geta() {
        return a;
    }

    public void seta(String A) {
        this.a = Float.parseFloat(A);
    }

    public float getb() {
        return b;
    }

    public void setB(String B) {
        this.b = Float.parseFloat(B);
    }



    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public void Reset(){
        this.a = 0;
        this.b = 0;
        this.resultado = 0;
    }

    public float CambioSigno(String Valor){
        float ops=Float.parseFloat(Valor);
        ops=ops*-1;
        return ops;
    }
    
    public void Porcentaje(){
        this.resultado=((this.b*this.a)/100);
    }
    
     public void Suma(){
    
    this.resultado=s.sumar(this.a,this.b);
    
     }
    public void Resta(){
    
    this.resultado=r.restar(this.a,this.b);
    
    }
    public void Multiplicacion(){
    
    this.resultado=m.multiplicar(this.a,this.b);

    }
    public void Division(){
    
    this.resultado=d.dividir(this.a,this.b);
        
    }

}

