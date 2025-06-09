
package local.kaline.garagem.DTO;

import local.kaline.garagem.entities.Veiculo;

/**
 *
 * @author ppjata
 */
public class VeiculoDTO {
 private long id;
 private String marca;
 private String modelo;
 private String cor;
 private long ano;
 private long km;
 
 
    public VeiculoDTO() {
    }
    public VeiculoDTO(Veiculo veiculo) {
        this.id = veiculo.getId();
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.cor = veiculo.getCor();
        this.ano = veiculo.getAno();
        this.km = veiculo.getKm();
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

    public long getAno() {
        return ano;
    }

    public long getKm() {
        return km;
    }
}


