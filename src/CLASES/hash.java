/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Jennifer Portillo
 */
public class hash {
     /*Esta clase es para  retornar un hash mediante un tipo y un texto. TODO ESTO PARA HACER UN CIFRADO EN LAS CONTRASEÑAS */
    
    public static String getHash(String txt, String hasType) throws NoSuchAlgorithmException {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance(hasType);
            byte[] array = md.digest(txt.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    /*ACA RETORNA UN HASH MD5 A PARTIR DE UN TEXTO*/
    public static String md5(String txt) throws NoSuchAlgorithmException{
        return hash.getHash(txt, "MD5");
    }
    /*RETORNA UN HASH SHA1 A PARTIR DE UN TEXTO */
    public static String sha1(String txt) throws NoSuchAlgorithmException{
        return hash.getHash(txt, "SHA1");
    }
}
