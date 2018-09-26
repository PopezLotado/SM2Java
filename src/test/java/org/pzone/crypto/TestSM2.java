package org.pzone.crypto;

import org.bouncycastle.math.ec.ECPoint;

import java.math.BigInteger;

public class TestSM2 {

    public static void main(String[] args) {
        SM2 x = new SM2();
        SM2KeyPair keys = x.generateKeyPair();
        ECPoint pubKey = keys.getPublicKey();
        BigInteger privKey = keys.getPrivateKey();
        byte[] data = x.encrypt("Hello World", pubKey);
        System.out.println("encrypt: " + data);
        String origin = x.decrypt(data, privKey);
        System.out.println("decrypt: " + origin);
    }
}
