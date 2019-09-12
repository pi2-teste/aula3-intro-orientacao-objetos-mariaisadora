/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula3;

/**
 *
 * @author fernando.fernandes
 */
public class Carro {
    private static String fabricante;
    
    private String[] rodas;
    private String cor;
    private String modelo;
    private int velocidadeAtual;
    private int gasolina;
    private int max_gasolina;
    
    
    public Carro(){
    this.max_gasolina = 40;
    this.gasolina = 20;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String[] getRodas() {
        return rodas;
    }

    public void setRodas(String[] rodas) {
        this.rodas = rodas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public int getMax_gasolina() {
        return max_gasolina;
    }

    public void setMax_gasolina(int max_gasolina) {
        this.max_gasolina = max_gasolina;
    }
    
    
    public String descreve(){
        if (this.modelo == null)  
            return "Um Carro";
        if (this.cor == null)
            return "Um Corsa";
        else
            return "Um " + this.modelo + " na cor " + this.cor;
    }
    
    public void abastece(int quanto){
     this.gasolina =this.gasolina + quanto;
     if(this.gasolina>=this.max_gasolina)
         this.gasolina=this.max_gasolina;
     }
        
    
}            
