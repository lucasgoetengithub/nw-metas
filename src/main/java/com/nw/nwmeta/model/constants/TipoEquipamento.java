package com.nw.nwmeta.model.constants;

public enum TipoEquipamento {
    Headwear(1, "HEADWEAR");

    private int code;
    private String descricao;

    private TipoEquipamento(int code, String descricao) {
        this.code = code;
        this.descricao = descricao;
    }

    public int getCode() {
        return code;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoEquipamento toEnum(Integer code) {
        if (code == null) {
            return null;
        } else {
            for (TipoEquipamento tipoEquipamento :  TipoEquipamento.values()) {
                if (code.equals(tipoEquipamento.getCode())) {
                    return tipoEquipamento;
                }
            }
        }

        throw new IllegalArgumentException("Invalid Id: " + code);
    }
}
