package com.iwy.wsdl.wcf;
//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.10.3.0
//
// Created by Quasar Development 
//
//----------------------------------------------------



import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class DCQcreateTempMTAOutput extends AttributeContainer implements KvmSerializable
{

    
    private transient java.lang.Object __source;    
    
    private String idError;
    
    private String errorStr;
    
    public String getIdError()
    {
        return this.idError;
    }
    
    public void setIdError(String value)
    {
        this.idError = value;     
    }
    
    public String getErrorStr()
    {
        return this.errorStr;
    }
    
    public void setErrorStr(String value)
    {
        this.errorStr = value;     
    }


    
    
    public void loadFromSoap(java.lang.Object paramObj,DCQExtendedSoapSerializationEnvelope __envelope)
    {
        if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;
        __source=inObj; 
        
        if(inObj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                PropertyInfo info=soapObject.getPropertyInfo(i0);
                if(!loadProperty(info,soapObject,__envelope))
                {
                }
            } 
        }



    }

    
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,DCQExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("idError"))
        {
            if(obj!=null)
            {
                if (obj instanceof SoapPrimitive)
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.idError = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.idError = (String)obj;
                }
                else{
                    this.idError = "";
                }
            }
            return true;
        }
        if (info.name.equals("errorStr"))
        {
            if(obj!=null)
            {
                if (obj instanceof SoapPrimitive)
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.errorStr = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.errorStr = (String)obj;
                }
                else{
                    this.errorStr = "";
                }
            }
            return true;
        }
        return false;
    }
    
    public java.lang.Object getOriginalXmlSource()
    {
        return __source;
    }    
    

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.idError;
        }
        else if(propertyIndex==1)
        {
            return this.errorStr;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 2;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "idError";
            info.namespace= "";
        }
        else if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "errorStr";
            info.namespace= "";
        }
    }

    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
