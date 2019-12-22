package com.virugan.tables.as;

import com.virugan.interfac.myComponent;
import java.math.BigDecimal;
import java.util.LinkedHashMap;

public class hxsysAsZjywbm extends myComponent {
    /** 法人代码 **/
    private String farendma;

    /** 账户业务种类 **/
    private String zhhuywzl;

    /** 业务编码 **/
    private String yewubima;

    /** 业务编码说明 **/
    private String ywbimasm;

    /** 核算代码 **/
    private String hesuandm;

    /** 资金余额性质 **/
    private String zszfywzl;

    /** 时间戳 **/
    private BigDecimal shijchuo;

    public String getFarendma() {
        return farendma;
    }

    public void setFarendma(String farendma) {
        this.farendma = farendma == null ? null : farendma.trim();
    }

    public String getZhhuywzl() {
        return zhhuywzl;
    }

    public void setZhhuywzl(String zhhuywzl) {
        this.zhhuywzl = zhhuywzl == null ? null : zhhuywzl.trim();
    }

    public String getYewubima() {
        return yewubima;
    }

    public void setYewubima(String yewubima) {
        this.yewubima = yewubima == null ? null : yewubima.trim();
    }

    public String getYwbimasm() {
        return ywbimasm;
    }

    public void setYwbimasm(String ywbimasm) {
        this.ywbimasm = ywbimasm == null ? null : ywbimasm.trim();
    }

    public String getHesuandm() {
        return hesuandm;
    }

    public void setHesuandm(String hesuandm) {
        this.hesuandm = hesuandm == null ? null : hesuandm.trim();
    }

    public String getZszfywzl() {
        return zszfywzl;
    }

    public void setZszfywzl(String zszfywzl) {
        this.zszfywzl = zszfywzl == null ? null : zszfywzl.trim();
    }

    public BigDecimal getShijchuo() {
        return shijchuo;
    }

    public void setShijchuo(BigDecimal shijchuo) {
        this.shijchuo = shijchuo;
    }

    public LinkedHashMap getPrimaryKey() {
        return primkeyMap;
    }

    public String getTableName() {
        return "hxsys_as_zjywbm";
    }
}