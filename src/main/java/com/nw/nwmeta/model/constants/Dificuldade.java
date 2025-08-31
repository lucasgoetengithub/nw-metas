package com.nw.nwmeta.model.constants;

public enum Dificuldade {

    EASY(1, "EASY");

    private int code;
    private String descricao;

    private Dificuldade(int code, String descricao) {
        this.code = code;
        this.descricao = descricao;
    }

    public int getCode() {
        return code;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Dificuldade toEnum(Integer code) {
        if (code == null) {
            return null;
        } else {
            for (Dificuldade dificuldade :  Dificuldade.values()) {
                if (code.equals(dificuldade.getCode())) {
                    return dificuldade;
                }
            }
        }

        throw new IllegalArgumentException("Invalid Id: " + code);
    }
}
