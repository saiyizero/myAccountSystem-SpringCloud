package com.virugan.tables.as;

import com.virugan.interfac.myComponent;
import java.math.BigDecimal;
import java.util.LinkedHashMap;

public class hxsysAsNbfhzh extends myComponent {
    /** 账号 **/
    private String zhanghao;

    /** 法人代码 **/
    private String farendma;

    /** 账户业务种类 **/
    private String zhhuywzl;

    /** 账户名称 **/
    private String zhanghmc;

    /** 业务编码 **/
    private String yewubima;

    /** 核算代码 **/
    private String hesuandm;

    /** 账户营业机构 **/
    private String zhyngyjg;

    /** 货币代号 **/
    private String huobdaih;

    /** 余额性质 **/
    private String yuexingz;

    /** 账户余额 **/
    private BigDecimal zhanghye;

    /** 余额方向 **/
    private String yuefangx;

    /** 余额更新模式 **/
    private String yegenxms;

    /** 账户状态 **/
    private String zhanghzt;

    /** 时间戳 **/
    private BigDecimal shijchuo;

    public String getZhanghao() {
        return zhanghao;
    }

    public void setZhanghao(String zhanghao) {
        this.zhanghao = zhanghao == null ? null : zhanghao.trim();
    }

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

    public String getZhanghmc() {
        return zhanghmc;
    }

    public void setZhanghmc(String zhanghmc) {
        this.zhanghmc = zhanghmc == null ? null : zhanghmc.trim();
    }

    public String getYewubima() {
        return yewubima;
    }

    public void setYewubima(String yewubima) {
        this.yewubima = yewubima == null ? null : yewubima.trim();
    }

    public String getHesuandm() {
        return hesuandm;
    }

    public void setHesuandm(String hesuandm) {
        this.hesuandm = hesuandm == null ? null : hesuandm.trim();
    }

    public String getZhyngyjg() {
        return zhyngyjg;
    }

    public void setZhyngyjg(String zhyngyjg) {
        this.zhyngyjg = zhyngyjg == null ? null : zhyngyjg.trim();
    }

    public String getHuobdaih() {
        return huobdaih;
    }

    public void setHuobdaih(String huobdaih) {
        this.huobdaih = huobdaih == null ? null : huobdaih.trim();
    }

    public String getYuexingz() {
        return yuexingz;
    }

    public void setYuexingz(String yuexingz) {
        this.yuexingz = yuexingz == null ? null : yuexingz.trim();
    }

    public BigDecimal getZhanghye() {
        return zhanghye;
    }

    public void setZhanghye(BigDecimal zhanghye) {
        this.zhanghye = zhanghye;
    }

    public String getYuefangx() {
        return yuefangx;
    }

    public void setYuefangx(String yuefangx) {
        this.yuefangx = yuefangx == null ? null : yuefangx.trim();
    }

    public String getYegenxms() {
        return yegenxms;
    }

    public void setYegenxms(String yegenxms) {
        this.yegenxms = yegenxms == null ? null : yegenxms.trim();
    }

    public String getZhanghzt() {
        return zhanghzt;
    }

    public void setZhanghzt(String zhanghzt) {
        this.zhanghzt = zhanghzt == null ? null : zhanghzt.trim();
    }

    public BigDecimal getShijchuo() {
        return shijchuo;
    }

    public void setShijchuo(BigDecimal shijchuo) {
        this.shijchuo = shijchuo;
    }

    public LinkedHashMap getPrimaryKey() {
        if(primkeyMap==null){
               primkeyMap=new LinkedHashMap<String,Object>();
        }
        primkeyMap.put("zhanghao",this.zhanghao);
        return primkeyMap;
    }

    public String getTableName() {
        return "hxsys_as_nbfhzh";
    }
}