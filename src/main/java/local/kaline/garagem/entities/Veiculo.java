/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.kaline.garagem.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author ppjata
 */
    @Entity
@Table(name = "veiculos")
public class Veiculo {
        
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 private String marca;
 private String modelo;
 private String cor;
 private String ano;
 private String km; 
 
 @Column(name = "linkimagem")
 private String linkImagem;

 @Column(name = "descricaocompleta")
 private String descricaoCompleta;
 private String avarias;

    public Veiculo() {
    }

    public Veiculo(long id, String marca, String modelo, String cor, String ano, String km, String linkImagem, String descricaoCompleta, String avarias) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.km = km;
        this.linkImagem = linkImagem;
        this.descricaoCompleta = descricaoCompleta;
        this.avarias = avarias;
    }

    public long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getAno() {
        return ano;
    }

    public String getKm() {
        return km;
    }

    public String getLinkImagem() {
        return linkImagem;
    }

    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }

    public String getAvarias() {
        return avarias;
    }



}
