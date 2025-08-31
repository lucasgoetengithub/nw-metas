package com.nw.nwmeta.model.constants;

public enum Categoria {
    PVP(1, "PVP");

    private int code;
    private String descricao;

    private Categoria(int code, String descricao) {
        this.code = code;
        this.descricao = descricao;
    }

    public int getCode() {
        return code;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Categoria toEnum(Integer code) {
        if (code == null) {
            return null;
        } else {
            for (Categoria categoria :  Categoria.values()) {
                if (code.equals(categoria.getCode())) {
                    return categoria;
                }
            }
        }

        throw new IllegalArgumentException("Invalid Id: " + code);
    }
}
