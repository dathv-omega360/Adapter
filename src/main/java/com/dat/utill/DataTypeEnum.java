package com.dat.utill;

import org.webjars.NotFoundException;

public enum DataTypeEnum {
    HEX("hex"), BASE64("base64");

    private String code;

    DataTypeEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public StringEncoder getEncoder() throws NotFoundException {
        switch (code) {
            case "hex":
                return new HexEncoder();
            case "base64":
                return new Base64Encoder();
            default:
        }
        throw new NotFoundException("Encoder not found!");
    }

}
