package com.virugan.io.ac.ac2002;

import java.math.BigDecimal;

public class ac2002es {
    /** 科目名称 **/
    private String kemumnch;

    /** 上级科目 **/
    private String shjikemu;

    /** 科目类别 **/
    private String kemuleib;

    /** 科目级别 **/
    private BigDecimal kemujibi;

    /** 末层科目标志 **/
    private String mocekmbz;

    /** 余额性质 **/
    private String yuexingz;

    /** 表内表外标志 **/
    private String bnbwbioz;

    /** 时间戳 **/
    private BigDecimal shijchuo;

    /** 科目号 **/
    private String kemuhaoo;

    /** 法人代码 **/
    private String farendma;

    public String getKemumnch() {
        return kemumnch;
    }

    public void setKemumnch(String kemumnch) {
        this.kemumnch = kemumnch == null ? null : kemumnch.trim();
    }

    public String getShjikemu() {
        return shjikemu;
    }

    public void setShjikemu(String shjikemu) {
        this.shjikemu = shjikemu == null ? null : shjikemu.trim();
    }

    public String getKemuleib() {
        return kemuleib;
    }

    public void setKemuleib(String kemuleib) {
        this.kemuleib = kemuleib == null ? null : kemuleib.trim();
    }

    public BigDecimal getKemujibi() {
        return kemujibi;
    }

    public void setKemujibi(BigDecimal kemujibi) {
        this.kemujibi = kemujibi;
    }

    public String getMocekmbz() {
        return mocekmbz;
    }

    public void setMocekmbz(String mocekmbz) {
        this.mocekmbz = mocekmbz == null ? null : mocekmbz.trim();
    }

    public String getYuexingz() {
        return yuexingz;
    }

    public void setYuexingz(String yuexingz) {
        this.yuexingz = yuexingz == null ? null : yuexingz.trim();
    }

    public String getBnbwbioz() {
        return bnbwbioz;
    }

    public void setBnbwbioz(String bnbwbioz) {
        this.bnbwbioz = bnbwbioz == null ? null : bnbwbioz.trim();
    }

    public BigDecimal getShijchuo() {
        return shijchuo;
    }

    public void setShijchuo(BigDecimal shijchuo) {
        this.shijchuo = shijchuo;
    }

    public String getKemuhaoo() {
        return kemuhaoo;
    }

    public void setKemuhaoo(String kemuhaoo) {
        this.kemuhaoo = kemuhaoo == null ? null : kemuhaoo.trim();
    }

    public String getFarendma() {
        return farendma;
    }

}
