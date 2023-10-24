package com.example.soapPhone.service;



import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@WebService(targetNamespace = "http://service.ws.sample/", name = "PhoneService")
public interface PhoneService {


    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(
            localName = "addRecord",
            targetNamespace = "http://service.ws.sample/",
            className = "sample.ws.service.RequestAddRecord")
    @WebMethod(action = "urn:addRecord")
    @ResponseWrapper(
            localName = "addRecordResponse",
            targetNamespace = "http://service.ws.sample/",
            className = "sample.ws.service.addRecordResponse")
    void addRecord(@WebParam(name = "initials", targetNamespace = "") String initials,
                   @WebParam(name = "phone", targetNamespace = "") String phone);


    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(
            localName = "getInitials",
            targetNamespace = "http://service.ws.sample/",
            className = "sample.ws.service.RequestGetInitials")
    @WebMethod(action = "urn:getInitials")
    @ResponseWrapper(
            localName = "getInitialsResponce",
            targetNamespace = "http://service.ws.sample/",
            className = "sample.ws.service.GetInitialsResponse")
    String getInitials(@WebParam(name = "phone", targetNamespace = "") String phone);

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(
            localName = "getPhone",
            targetNamespace = "http://service.ws.sample/",
            className = "sample.ws.service.RequestGetPhone")
    @WebMethod(action = "urn:getPhone")
    @ResponseWrapper(
            localName = "getPhoneResponce",
            targetNamespace = "http://service.ws.sample/",
            className = "sample.ws.service.getPhoneResponse")
    Set<String> getPhone(@WebParam(name = "initials", targetNamespace = "") String initials);
}
