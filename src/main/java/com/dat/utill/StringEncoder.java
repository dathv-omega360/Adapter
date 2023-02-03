package com.dat.utill;

public interface StringEncoder {

    String encode(byte[] input) throws Exception;

    byte[] decode(String input) throws Exception;
}
