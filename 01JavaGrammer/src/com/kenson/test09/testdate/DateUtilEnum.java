package com.kenson.test09.testdate;

/**
 * <p>Title: DateUtilsEnums.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月13日 22:27:00
 */
public enum DateUtilEnum {
    DATE_FMT_Y("yyyy"),
    DATE_FMT_Y_M("yyyy-MM"),
    DATE_FMT_Y_M_D("yyyy-MM-dd"),
    DATE_FMT_Y_M_D_H("yyyy-MM-dd HH"),
    DATE_FMT_Y_M_D_HM("yyyy-MM-dd HH:mm"),
    DATE_FMT_Y_M_D_HMS("yyyy-MM-dd HH:mm:ss"),
    DATE_FMT_Y_M_D_HMSSS("yyyy-MM-dd HH:mm:ss.SSS"),
    DATE_FMT_Y_CN("yyyy年"),
    DATE_FMT_Y_M_CN("yyyy年MM月"),
    DATE_FMT_Y_M_D_CN("yyyy年MM月dd日"),
    DATE_FMT_Y_M_D_H_CN("yyyy年MM月dd日HH时"),
    DATE_FMT_Y_M_D_HM_CN("yyyy年MM月dd日HH时mm分"),
    DATE_FMT_Y_M_D_HMS_CN("yyyy年MM月dd日HH时mm分ss秒"),
    DATE_FMT_Y_M_D_HMSSS_CN("yyyy年MM月dd日HH时mm分ss秒SSS毫秒"),
    DATE_FMT_YM("yyyyMM"),
    DATE_FMT_YMD("yyyyMMdd"),
    DATE_FMT_YMDH("yyyyMMddHH"),
    DATE_FMT_YMDHM("yyyyMMddHHmm"),
    DATE_FMT_YMDHMS("yyyyMMddHHmmss"),
    DATE_FMT_YMDHMSSSSS("yyyyMMddHHmmssSSS"),
    DATE_FMT_H("HH"),
    DATE_FMT_H_M("HH:mm"),
    DATE_FMT_H_M_S("HH:mm:ss"),
    DATE_FMT_H_M_S_SSS("HH:mm:ss.SSS"),
    DATE_FMT_H_CN("HH时"),
    DATE_FMT_H_M_CN("HH时mm分"),
    DATE_FMT_H_M_S_CN("HH时mm分ss秒"),
    DATE_FMT_H_M_S_SSS_CN("HH时mm分ss秒SSS毫秒"),
    DATE_FMT_HM("HHmm"),
    DATE_FMT_HMS("HHmmss"),
    DATE_SHORT_FMT_YM("yyMM"),
    DATE_SHORT_FMT_YMD("yyMMdd"),
    DATE_SHORT_FMT_YMDH("yyMMddHH"),
    DATE_SHORT_FMT_YMDHM("yyMMddHHmm"),
    DATE_SHORT_FMT_YMDHMS("yyMMddHHmmss"),
    DATE_FMT_SLASH_MDY("MM/dd/yyyy"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_YYYY("yyyy"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_YYYYMM("yyyy-MM"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_YYYYMMDD("yyyy-MM-dd"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_YYYYMMDD_HH("yyyy-MM-dd HH"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_YYYYMMDD_HHMI("yyyy-MM-dd HH:mm"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_YYYYMMDD_HHMISS("yyyy-MM-dd HH:mm:ss"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_YYYYMMDD_HHMISS_SSS("yyyy-MM-dd HH:mm:ss.SSS"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_YYYY_CN("yyyy年"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_YYYYMM_CN("yyyy年MM月"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_YYYYMMDD_CN("yyyy年MM月dd日"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_YYYYMMDD_HH_CN("yyyy年MM月dd日 HH时"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_YYYYMMDD_HHMI_CN("yyyy年MM月dd日 HH时mm分"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_YYYYMMDD_HHMISS_CN("yyyy年MM月dd日 HH时mm分ss秒"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_YYYYMMDD_HHMISS_SSS_CN("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_YYMMDD("yyMMdd"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_HH("HH"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_HHMI("HH:mm"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_HHMISS("HH:mm:ss"),
    /**
     * @deprecated
     */
    @Deprecated
    FORMAT_HHMISS_CN("HH时mm分ss秒");

    private String value;

    private DateUtilEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}