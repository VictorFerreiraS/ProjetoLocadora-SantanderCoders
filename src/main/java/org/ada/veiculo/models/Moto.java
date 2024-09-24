package org.ada.veiculo.models;

public class Moto extends Veiculo {
    public Moto(String placa, String marca, String modelo, String ano) {
        super(placa, marca, modelo, ano, TipoVeiculo.MOTO);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "uuid='" + getUuid() + '\'' +
                ", createdDate='" + getCreatedAt() + '\'' +
                "placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", ano='" + getAno() + '\'' +
                ", DIARIA=" + getValorDiaria() +
                '}';
    }
}
