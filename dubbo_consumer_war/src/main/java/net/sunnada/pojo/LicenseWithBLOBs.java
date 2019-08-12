package net.sunnada.pojo;

public class LicenseWithBLOBs extends License {
    private String xsd;

    private String xmlsample;

    public String getXsd() {
        return xsd;
    }

    public void setXsd(String xsd) {
        this.xsd = xsd == null ? null : xsd.trim();
    }

    public String getXmlsample() {
        return xmlsample;
    }

    public void setXmlsample(String xmlsample) {
        this.xmlsample = xmlsample == null ? null : xmlsample.trim();
    }
}