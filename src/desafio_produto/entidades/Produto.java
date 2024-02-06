package desafio_produto.entidades;

public class Produto {
    private String nomeProduto;
    private Double precoProduto;
    private Integer quantidadeComprada;
    private Double valorTotal;



    public Produto(String nomeProduto, Double precoProduto, Integer quantidadeComprada) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeComprada = quantidadeComprada;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Integer getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(Integer quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public Double getValorTotal() {
        if(getQuantidadeComprada()<=10){
            valorTotal = getPrecoProduto()*getQuantidadeComprada();
        } else if (getQuantidadeComprada() > 10 && getQuantidadeComprada()<=20) {
            valorTotal = (getPrecoProduto() * getQuantidadeComprada())*0.9;
        } else if (getQuantidadeComprada()>20 && getQuantidadeComprada()<= 50) {
            valorTotal = (getPrecoProduto() * getQuantidadeComprada())*0.8;
        }else{
            valorTotal = (getPrecoProduto() * getQuantidadeComprada())*0.75;
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return
                "Nome do Produto=" + getNomeProduto() +
                "\n Preco do Produto=" + getPrecoProduto() +
                "\n Quantidade Comprada= " + getQuantidadeComprada() +
                "\n Valor Total=" + getValorTotal()
                ;
    }
}
