package org.jboss.ddoyle.howtojboss.paymentservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.12-patch-02
 * Thu Sep 27 08:23:21 CEST 2012
 * Generated source version: 2.2.12-patch-02
 * 
 */
 
@WebService(targetNamespace = "http://www.jboss.org/ddoyle/howtojboss/PaymentService/", name = "PaymentService")
@XmlSeeAlso({ObjectFactory.class})
public interface PaymentService {

    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "CheckPayment", targetNamespace = "http://www.jboss.org/ddoyle/howtojboss/PaymentService/", className = "org.jboss.ddoyle.howtojboss.paymentservice.CheckPaymentType")
    @WebMethod(operationName = "CheckPayment", action = "http://www.jboss.org/ddoyle/howtojboss/HelloService/CheckPayment")
    @ResponseWrapper(localName = "CheckPaymentResponse", targetNamespace = "http://www.jboss.org/ddoyle/howtojboss/PaymentService/", className = "org.jboss.ddoyle.howtojboss.paymentservice.CheckPaymentResponseType")
    public java.lang.String checkPayment(
        @WebParam(name = "in", targetNamespace = "")
        java.lang.String in
    );
}