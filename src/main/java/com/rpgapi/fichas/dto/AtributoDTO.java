package com.rpgapi.fichas.dto;


public record AtributoDTO (String nome, Integer valor, Integer modificador){

    public AtributoDTO (String nome, Integer valor){
        this(nome, valor ,(int) (double) ((valor - 10) / 2));
    }
}