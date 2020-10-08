package Entities;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Carrinho {

    private int id;
    private LocalDateTime data;
    static public List<Produto> itensCarrinho = new ArrayList<Produto>();
    private int numDeItens;
    private float valorICMS;
    private float valorVenda;
    private String status;
    private float valorTotal;

    public Carrinho(int id, List<Produto> itens){
        this.id = id;
        this.data = LocalDateTime.now();
        this.numDeItens = itens.size();
        this.valorICMS = calcularIcmsTotal();
        this.valorVenda = valorTotalvenda();
        valorTotal = this.valorICMS + this.valorVenda;
        confirmarCompra();
    }

    DecimalFormat df = new DecimalFormat("0.##");

    public float calcularIcmsTotal(){
        float icmsTotal = 0;
        for (var x = 0; x < itensCarrinho.size(); x++){
            icmsTotal += itensCarrinho.get(x).getAliquotaICMS();
        }
        return  icmsTotal;
    }

    public float valorTotalvenda(){
        float valorTotal = 0;
        for (var x = 0; x < itensCarrinho.size(); x++){
            valorTotal += itensCarrinho.get(x).getPrecoVenda();
        }
        return valorTotal;
    }

    static public void insereItem(Produto produto){
        itensCarrinho.add(produto);
    }

    public void confirmarCompra(){
        this.status = "Compra Confirmada";
    }

    @Override
    public String toString() {
        return "Código Venda: "
                + id
                + ", Data: "
                + data
                + ", Número de Itens: "
                + numDeItens
                + ", Valor ICMS: R$"
                + valorICMS
                + ", Valor Venda sem Impostos: R$"
                + valorVenda
                + ", Status: "
                + status
                + ", Valor Total: R$"
                + valorTotal;
    }
}
