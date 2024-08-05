package com.diam.app.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(namespace = "http://schemas.xmlsoap.org/soap/envelope/",name = "Body")
public class Body {

	@XmlElement(name = "CMAddPayEvt",  namespace = "http://ouaf.oracle.com/webservices/cm/CMAddPayEvt")
	private CMAddPayEvt cmAddPayEvt;

	public CMAddPayEvt getCmAddPayEvt() {
		return cmAddPayEvt;
	}

	public void setCmAddPayEvt(CMAddPayEvt cmAddPayEvt) {
		this.cmAddPayEvt = cmAddPayEvt;
	}

}
