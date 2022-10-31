package com.eerror.AsciiCharSequence;

import java.nio.charset.StandardCharsets;

public class AsciiCharSequence implements CharSequence {
    //Твой код здесь
    byte[] input;

    public AsciiCharSequence(byte[] input) {
        this.input = input;
    }

    public int length() {
        return input.length;
    }

    @Override
    public char charAt(int index) {
        return (char) input[index];
    }

    @Override
    public CharSequence subSequence(final int start, final int end) {
        byte[] result = new byte[end - start];
        if (end - start >= 0) System.arraycopy(input, start, result, 0, end - start);
        return new AsciiCharSequence(result);
    }

    public String toString() {
        return new String(input, StandardCharsets.UTF_8);
    }
}
