package com.iwy.wsdl.wcf;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.10.3.0
//
// Created by Quasar Development 
//
//----------------------------------------------------




import org.ksoap2.serialization.*;
import java.util.Vector;
import java.util.Hashtable;


public class DCQArrayOfLeasesObj extends Vector<DCQleasesObj> implements KvmSerializable,HasAttributes
{
    private transient java.lang.Object __source;

    public DCQArrayOfLeasesObj()
    {
    }

    public DCQArrayOfLeasesObj(int initialCapactiy)
    {
        super(initialCapactiy);
    }

    public DCQArrayOfLeasesObj(java.util.Collection< DCQleasesObj> initialCapactiy)
    {
        super(initialCapactiy);
    }

    public void loadFromSoap(java.lang.Object inObj,DCQExtendedSoapSerializationEnvelope __envelope)
    {
        if (inObj == null)
            return;
        __source=inObj;

        if(inObj instanceof Vector)
        {
            Vector list=(Vector)inObj;
            for (int i0=0;i0< list.size();i0++)
            {
                java.lang.Object j = list.get(i0);
                if (j!=null )
                {
                    DCQleasesObj j1= (DCQleasesObj)__envelope.get(j,DCQleasesObj.class,false);
                    add(j1);
                }
            }
        }
        else
        {
                    SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                java.lang.Object obj = soapObject.getProperty(i0);
                if (obj!=null && obj instanceof AttributeContainer)
                {
                    AttributeContainer j =(AttributeContainer) soapObject.getProperty(i0);
                    DCQleasesObj j1= (DCQleasesObj)__envelope.get(j,DCQleasesObj.class,false);
                    add(j1);
                    
                }
            }
        }
    }

    public java.lang.Object getSourceObject()
    {
        return __source;
    }
    
    @Override
    public java.lang.Object getProperty(int arg0) {
        return this.get(arg0)!=null?this.get(arg0):SoapPrimitive.NullNilElement;
    }
    
    @Override
    public int getPropertyCount() {
        return this.size();
    }
    
    @Override
    public void getPropertyInfo(int index, Hashtable arg1, PropertyInfo info) {
        info.name = "leasesObj";
        info.type = DCQleasesObj.class;
    	info.namespace= "urn:IntrawayWSDL";
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1) {
    }


    @Override    
    public int getAttributeCount() {
        return 4;
    }

    @Override
    public void getAttributeInfo(int index, AttributeInfo info) {
        if(index==0)
        {
            info.name = "type";
            info.namespace= "http://www.w3.org/2001/XMLSchema-instance";
            info.setValue("xx2:ArrayOfLeasesObj");
        }
        if(index==1)
        {
            info.name = "arrayType";
            info.namespace= "http://schemas.xmlsoap.org/soap/encoding/";
            info.setValue("xx1:leasesObj[]");
        }
        if(index==2)
        {
            info.name = "xmlns:xx1";
            info.namespace= "";
            info.setValue("urn:IntrawayWSDL");
        }
        if(index==3)
        {
            info.name = "xmlns:xx2";
            info.namespace= "";
            info.setValue("urn:IntrawayWSDL");
        }
    }

    @Override
    public void getAttribute(int i, AttributeInfo attributeInfo) {

    }

    @Override
    public void setAttribute(AttributeInfo attributeInfo) {

    }    
}