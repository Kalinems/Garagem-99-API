
package local.kaline.garagem.DTO;

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
 private String linkimagem;
 private String avarias;

    public VeiculoDTO() {
    }
    public VeiculoDTO(long id, String marca, String modelo, String cor, long ano, long km, String linkimagem, String avarias) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.km = km;
        this.linkimagem = linkimagem;
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

    public long getAno() {
        return ano;
    }

    public long getKm() {
        return km;
    }

    public String getLinkimagem() {
        return linkimagem;
    }

    public String getAvarias() {
        return avarias;
    }
 
}

