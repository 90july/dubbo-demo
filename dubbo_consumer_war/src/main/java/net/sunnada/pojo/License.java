package net.sunnada.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class License {
    private BigDecimal id;

    private String name;

    private BigDecimal ownertype;

    private String tablename;

    private String code;

    private String serialnumberformat;

    private String serialnumberformatregex;

    private BigDecimal category;

    private String organizationid;

    private String printpageindexs;

    private String versions;

    private String creater;

    private String updateuser;

    private BigDecimal autoserialnumber;

    private BigDecimal transparentseal;

    private Date createtime;

    private Date updatetime;

    private String organizationname;

    private String remark;

    private BigDecimal flags;

    private Object oldxsd;

    private BigDecimal modeltype;

    private BigDecimal sealprint;

    private BigDecimal legalcall;

    private String mintypeid;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getOwnertype() {
        return ownertype;
    }

    public void setOwnertype(BigDecimal ownertype) {
        this.ownertype = ownertype;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename == null ? null : tablename.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getSerialnumberformat() {
        return serialnumberformat;
    }

    public void setSerialnumberformat(String serialnumberformat) {
        this.serialnumberformat = serialnumberformat == null ? null : serialnumberformat.trim();
    }

    public String getSerialnumberformatregex() {
        return serialnumberformatregex;
    }

    public void setSerialnumberformatregex(String serialnumberformatregex) {
        this.serialnumberformatregex = serialnumberformatregex == null ? null : serialnumberformatregex.trim();
    }

    public BigDecimal getCategory() {
        return category;
    }

    public void setCategory(BigDecimal category) {
        this.category = category;
    }

    public String getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid == null ? null : organizationid.trim();
    }

    public String getPrintpageindexs() {
        return printpageindexs;
    }

    public void setPrintpageindexs(String printpageindexs) {
        this.printpageindexs = printpageindexs == null ? null : printpageindexs.trim();
    }

    public String getVersions() {
        return versions;
    }

    public void setVersions(String versions) {
        this.versions = versions == null ? null : versions.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }

    public BigDecimal getAutoserialnumber() {
        return autoserialnumber;
    }

    public void setAutoserialnumber(BigDecimal autoserialnumber) {
        this.autoserialnumber = autoserialnumber;
    }

    public BigDecimal getTransparentseal() {
        return transparentseal;
    }

    public void setTransparentseal(BigDecimal transparentseal) {
        this.transparentseal = transparentseal;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getOrganizationname() {
        return organizationname;
    }

    public void setOrganizationname(String organizationname) {
        this.organizationname = organizationname == null ? null : organizationname.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getFlags() {
        return flags;
    }

    public void setFlags(BigDecimal flags) {
        this.flags = flags;
    }

    public Object getOldxsd() {
        return oldxsd;
    }

    public void setOldxsd(Object oldxsd) {
        this.oldxsd = oldxsd;
    }

    public BigDecimal getModeltype() {
        return modeltype;
    }

    public void setModeltype(BigDecimal modeltype) {
        this.modeltype = modeltype;
    }

    public BigDecimal getSealprint() {
        return sealprint;
    }

    public void setSealprint(BigDecimal sealprint) {
        this.sealprint = sealprint;
    }

    public BigDecimal getLegalcall() {
        return legalcall;
    }

    public void setLegalcall(BigDecimal legalcall) {
        this.legalcall = legalcall;
    }

    public String getMintypeid() {
        return mintypeid;
    }

    public void setMintypeid(String mintypeid) {
        this.mintypeid = mintypeid == null ? null : mintypeid.trim();
    }
}