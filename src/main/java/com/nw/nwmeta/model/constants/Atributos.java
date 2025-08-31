package com.nw.nwmeta.model.constants;

public enum Atributos {
    FORCA(1, "FORCA");

    private int code;
    private String descricao;

    private Atributos(int code, String descricao) {
        this.code = code;
        this.descricao = descricao;
    }

    public int getCode() {
        return code;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Atributos toEnum(Integer code) {
        if (code == null) {
            return null;
        } else {
            for (Atributos atributos :  Atributos.values()) {
                if (code.equals(atributos.getCode())) {
                    return atributos;
                }
            }
        }

        throw new IllegalArgumentException("Invalid Id: " + code);
    }
}
