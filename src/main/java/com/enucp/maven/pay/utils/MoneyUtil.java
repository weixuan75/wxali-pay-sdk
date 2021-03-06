package com.enucp.maven.pay.utils;

import java.math.BigDecimal;

/**
 * Created by weixuan
 * 2017-07-02 13:53
 */
public class MoneyUtil {

    /**
     * 元转分
     * @param yuan
     * @return
     */
    public static Integer Yuan2Fen(Double yuan) {
        return new BigDecimal(yuan).movePointRight(2).intValue();
    }

    /**
     * 分转元
     * @param fen
     * @return
     */
    public static Double Fen2Yuan(Integer fen) {
        return new BigDecimal(fen).movePointLeft(2).doubleValue();
    }
}
