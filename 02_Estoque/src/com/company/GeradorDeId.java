package com.company;

public class GeradorDeId {
    private int idEstoque = 1;
    private int idProduto = 1000;
    public static final GeradorDeId INSTANCE = new GeradorDeId();
    private GeradorDeId(){};

    public int nextIdEstoque(){
        return idEstoque++;
    }
    public int nextIdProduto(){
        return idProduto++;
    }

}

