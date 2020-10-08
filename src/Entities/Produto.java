package Entities;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private int codigo;
    private String descricao;
    private float precoVenda;

    private float aliquotaICMS;
    private boolean vendido = false;



    public Produto(int codigo, String descricao, float precoVenda){
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.aliquotaICMS = calcularICMS();
        confirmarVenda();
    }

    public float getAliquotaICMS() {
        return aliquotaICMS;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public float calcularICMS(){
        return (float) (precoVenda * 0.12);
    }

    public void confirmarVenda(){
        this.vendido = true;
    }

    @Override
    public String toString() {
        return "\nCódigo: "
                + codigo
                + ", descricao: "
                + descricao
                + ", Preço sem Imposto: "
                + precoVenda
                + ", Aliquota ICMS: "
                + aliquotaICMS
                + ", Status Venda: "
                + vendido;
    }
}
