package com.nw.nwmeta.model.constants;

public enum Armas {
    SNS(1, "SWORD_N_SHIELD");

    private int code;
    private String descricao;

    private Armas(int code, String descricao) {
        this.code = code;
        this.descricao = descricao;
    }

    public int getCode() {
        return code;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Armas toEnum(Integer code) {
        if (code == null) {
            return null;
        } else {
            for (Armas arma :  Armas.values()) {
                if (code.equals(arma.getCode())) {
                    return arma;
                }
            }
        }

        throw new IllegalArgumentException("Invalid Id: " + code);
    }
}
