package com.snoopy.console.core.utils;



import java.util.Random;
import java.util.UUID;

/**
 * 功能简述：主键生成器，调用java util生成32位的 字符串
 * 
 * @author 
 * @version
 * 
 */
public class IdGenerator {

    /**
     * 
     * @return 32位的uuid
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 功能简述：根据UUID生成10位订单号
     * 
     * @return
     */
    public static String getOrderIdByUUID() {
        int hashCode = UUID.randomUUID().toString().hashCode();
        if (hashCode < 0) {
            hashCode = -hashCode;
        }
        // 0-前面补充0；10 代表长度为10；d代表参数为正数
        return String.format("%010d", hashCode);
    }

    // 生成4位提取码
    public static int getCode() {
        Random random = new Random();
        int num = random.nextInt(900);
        num = num + 100;
        return num;
    }

    // 16位订单流水号： 类型  + 时间戳 + 随机3位数
    public static String generateOrderNo(String type) {
        return type + System.currentTimeMillis() + getCode();
    }

    public static String[] chars = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0",
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H",
            "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y",
            "Z" };

    // 8位uuid
    public static String generateShortUuid() {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            shortBuffer.append(chars[x % 0x3E]);
        }
        return shortBuffer.toString();
    }

}