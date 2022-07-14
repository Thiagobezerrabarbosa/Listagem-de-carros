package carro;

import java.util.Objects;

public class Carro {
    private String cor;
    private String modelo;
    private Integer tanque;




    public Carro() {
    }

    public Carro(String cor, String modelo, Integer tanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.tanque = tanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(Integer tanque) {
        this.tanque = tanque;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return tanque == carro.tanque && Objects.equals(cor, carro.cor) && Objects.equals(modelo, carro.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor, modelo, tanque);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tanque=" + tanque +
                '}';
    }
}
