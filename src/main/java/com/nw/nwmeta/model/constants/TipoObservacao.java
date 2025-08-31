package com.nw.nwmeta.model.constants;

public enum TipoObservacao {

    TIPO_1(1, "TIPO_1");

    private int code;
    private String descricao;

    private TipoObservacao(int code, String descricao) {
        this.code = code;
        this.descricao = descricao;
    }

    public int getCode() {
        return code;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoObservacao toEnum(Integer code) {
        if (code == null) {
            return null;
        } else {
            for (TipoObservacao tipoObservacao :  TipoObservacao.values()) {
                if (code.equals(tipoObservacao.getCode())) {
                    return tipoObservacao;
                }
            }
        }

        throw new IllegalArgumentException("Invalid Id: " + code);
    }
}
