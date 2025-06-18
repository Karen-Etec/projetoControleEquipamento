package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author karen
 */
public class Equipamento {
    
    private int id;
    private String patrimonio;
    private String nome;
    private String descricao;
    private int quantidade;
    private String marca;
    private int sala;
    private String estadoConservacao;
    
    
    /* Encapsulamento*/

  
    public String getPatrimonio() {
        return patrimonio;
    }

  
    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the sala
     */
    public int getSala() {
        return sala;
    }

    /**
     * @param sala the sala to set
     */
    public void setSala(int sala) {
        this.sala = sala;
    }

    /**
     * @return the estado
     */
    public String getEstadoConservacao() {
        return estadoConservacao;
    }

    /**
     * @param estadoConservacao the estado to set
     */
    public void setEstadoConversavacao(String estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    
       
    
}
