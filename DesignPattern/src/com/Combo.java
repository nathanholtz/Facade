package com;

public class Combo {
    private Bebida bebida;
    private Sobremesa sobremesa;
    private Burguer burguer;

    public void criarCombo(int tipo){
        //mega combo
        if (tipo == 1){
            burguer = new Burguer();
            burguer.setDescricao("Double Cheeseburguer");
            burguer.setPreço(25.00);
            burguer.setGramas(300);

            sobremesa = new Sobremesa();
            sobremesa.setDescricao("Torta de Limão");
            sobremesa.setPreço(10.00);
            sobremesa.setTamanho("Grande");

            bebida = new Bebida();
            bebida.setDescricao("Refrigerante");
            bebida.setPreço(7.00);
            bebida.setMl(500);
        } else if (tipo == 2){
            //super combo
            burguer = new Burguer();
            burguer.setDescricao("Cheeseburguer");
            burguer.setPreço(18.00);
            burguer.setGramas(250);

            sobremesa = new Sobremesa();
            sobremesa.setDescricao("Brownie");
            sobremesa.setPreço(7.50);
            sobremesa.setTamanho("Médio");

            bebida = new Bebida();
            bebida.setDescricao("Suco de Laranja");
            bebida.setPreço(5.00);
            bebida.setMl(350);
        } else {
            System.out.println("opção invalida");
        }
    }

    public String getDescricaoCombo() {
        if (burguer == null || sobremesa == null || bebida == null) {
            return "Combo não foi criado!";
        }

        return "Itens do Combo:\n" +
                "Burguer: " + burguer.getDescricao() + "\n" +
                "Preço: R$" + burguer.getPreço() + "\n" +
                "Peso: " + burguer.getGramas() + "g\n\n" +
                "Sobremesa: " + sobremesa.getDescricao() + "\n" +
                "Preço: R$" + sobremesa.getPreço() + "\n" +
                "Tamanho: " + sobremesa.getTamanho() + "\n\n" +
                "Bebida: " + bebida.getDescricao() + "\n" +
                "Preço: R$" + bebida.getPreço() + "\n" +
                "Quantidade: " + bebida.getMl() + "ml\n";
    }
    
}
