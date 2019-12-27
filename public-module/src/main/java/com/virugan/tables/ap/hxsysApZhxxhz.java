package com.virugan.tables.ap;

import com.virugan.interfac.myComponent;
import java.math.BigDecimal;
import java.util.LinkedHashMap;

public class hxsysApZhxxhz extends myComponent {
    /** 客户账号类型 **/
    private String kehuzhlx;

    /** 系统账号 **/
    private String xtzhangh;

    /** 模块 **/
    private String mokuaiii;

    /** 开户机构 **/
    private String kaihjigo;

    /** 客户号 **/
    private String kehuhaoo;

    /** 法人代码 **/
    private BigDecimal shijchuo;

    /** 法人代码 **/
    private String farendma;

    /** 客户账号 **/
    private String kehuzhao;

    /** 子账户序号 **/
    private String zhhaoxuh;

    public String getKehuzhlx() {
        return kehuzhlx;
    }

    public void setKehuzhlx(String kehuzhlx) {
        this.kehuzhlx = kehuzhlx == null ? null : kehuzhlx.trim();
    }

    public String getXtzhangh() {
        return xtzhangh;
    }

    public void setXtzhangh(String xtzhangh) {
        this.xtzhangh = xtzhangh == null ? null : xtzhangh.trim();
    }

    public String getMokuaiii() {
        return mokuaiii;
    }

    public void setMokuaiii(String mokuaiii) {
        this.mokuaiii = mokuaiii == null ? null : mokuaiii.trim();
    }

    public String getKaihjigo() {
        return kaihjigo;
    }

    public void setKaihjigo(String kaihjigo) {
        this.kaihjigo = kaihjigo == null ? null : kaihjigo.trim();
    }

    public String getKehuhaoo() {
        return kehuhaoo;
    }

    public void setKehuhaoo(String kehuhaoo) {
        this.kehuhaoo = kehuhaoo == null ? null : kehuhaoo.trim();
    }

    public BigDecimal getShijchuo() {
        return shijchuo;
    }

    public void setShijchuo(BigDecimal shijchuo) {
        this.shijchuo = shijchuo;
    }

    public String getFarendma() {
        return farendma;
    }

    public void setFarendma(String farendma) {
        this.farendma = farendma == null ? null : farendma.trim();
    }

    public String getKehuzhao() {
        return kehuzhao;
    }

    public void setKehuzhao(String kehuzhao) {
        this.kehuzhao = kehuzhao == null ? null : kehuzhao.trim();
    }

    public String getZhhaoxuh() {
        return zhhaoxuh;
    }

    public void setZhhaoxuh(String zhhaoxuh) {
        this.zhhaoxuh = zhhaoxuh == null ? null : zhhaoxuh.trim();
    }

    public LinkedHashMap getPrimaryKey() {
        if(primkeyMap==null){
               primkeyMap=new LinkedHashMap<String,Object>();
        }
        primkeyMap.put("farendma",this.farendma);
        primkeyMap.put("kehuzhao",this.kehuzhao);
        primkeyMap.put("zhhaoxuh",this.zhhaoxuh);
        return primkeyMap;
    }

    public String getTableName() {
        return "hxsys_ap_zhxxhz";
    }
}