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

public class DCQactivateADSLInput extends AttributeContainer implements KvmSerializable
{

    
    private transient java.lang.Object __source;    
    
    private String activationCode;
    
    private String username;
    
    private String password;
    
    public String getActivationCode()
    {
        return this.activationCode;
    }
    
    public void setActivationCode(String value)
    {
        this.activationCode = value;     
    }
    
    public String getUsername()
    {
        return this.username;
    }
    
    public void setUsername(String value)
    {
        this.username = value;     
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    public void setPassword(String value)
    {
        this.password = value;     
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
        if (info.name.equals("activationCode"))
        {
            if(obj!=null)
            {
                if (obj instanceof SoapPrimitive)
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.activationCode = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.activationCode = (String)obj;
                }
                else{
                    this.activationCode = "";
                }
            }
            return true;
        }
        if (info.name.equals("username"))
        {
            if(obj!=null)
            {
                if (obj instanceof SoapPrimitive)
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.username = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.username = (String)obj;
                }
                else{
                    this.username = "";
                }
            }
            return true;
        }
        if (info.name.equals("password"))
        {
            if(obj!=null)
            {
                if (obj instanceof SoapPrimitive)
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.password = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.password = (String)obj;
                }
                else{
                    this.password = "";
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
            return this.activationCode;
        }
        else if(propertyIndex==1)
        {
            return this.username;
        }
        else if(propertyIndex==2)
        {
            return this.password;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "activationCode";
            info.namespace= "";
        }
        else if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "username";
            info.namespace= "";
        }
        else if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "password";
            info.namespace= "";
        }
    }

    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
