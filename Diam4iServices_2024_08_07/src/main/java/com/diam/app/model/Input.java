package com.diam.app.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Input {
	
	@XmlElement(name = "paymentEvent",  namespace = "http://ouaf.oracle.com/webservices/cm/CMAddPayEvt")
	private PaymentEvent paymentEvent;

	public PaymentEvent getPaymentEvent() {
		return paymentEvent;
	}

	public void setPaymentEvent(PaymentEvent paymentEvent) {
		this.paymentEvent = paymentEvent;
	}
	
}
