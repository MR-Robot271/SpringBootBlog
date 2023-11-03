package com.wip.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Tools {

    private Tools() {}

    private static final Random random = new Random();


    /**
    * @Description: 用来进行 AES（Advanced Encryption Standard）加密的方法，它将输入的数据使用指定的密钥进行加密，并返回加密后的结果
    * @Param: [data, key]
    * @return: String
    * @Date: 2023/11/3
    */
    public static String enAes(String data, String key) throws Exception {
        // 获取了一个 AES 加密算法的 Cipher 对象。Cipher 是 Java 中用于进行加密和解密操作的类。
        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8),"ASE");
        // 初始化了 Cipher 对象，设置其模式为加密模式 (Cipher.ENCRYPT_MODE)，并传入密钥规范对象 secretKeySpec 作为加密所需的密钥
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        // 使用初始化后的 Cipher 对象对输入的 data 进行加密
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
        // 使用 Base64 编码转换成字符串
        return new BASE64Encoder().encode(encryptedBytes);
    }

    /**
    * @Description: 进行 AES（Advanced Encryption Standard）解密的方法，它接受一个加密后的数据和密钥，然后对数据进行解密，并返回解密后的原始数据
    * @Param: [data, key]
    * @return: String
    * @Date: 2023/11/3
    */
    public static String deAes(String data, String key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        byte[] cipherTextBytes = new BASE64Decoder().decodeBuffer(data);
        byte[] decValue = cipher.doFinal(cipherTextBytes);
        return new String(decValue);
    }

    /**
    * @Description: 判断字符串是否为数字和有正确的值
    * @Param: [str]
    * @return: boolean
    * @Date: 2023/11/3
    */
    public static boolean isNumber(String str) {
        if (null != str && 0 != str.trim().length() && str.matches("\\d*")) {
            return true;
        }
        return false;
    }

    /**
    * @Description: 随机数
    * @Param: [min, max]
    * @return: int
    * @Date: 2023/11/3
    */
    public static int rand(int min, int max) {
        return random.nextInt(max) % (max - min + 1) + min;
    }



}
