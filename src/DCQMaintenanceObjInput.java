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

public class DCQMaintenanceObjInput extends AttributeContainer implements KvmSerializable
{

    
    private transient java.lang.Object __source;    
    
    private String idEntradaCaller;
    
    private String idEmpresaCRM;
    
    private String idServicio;
    
    private String idVenta;
    
    private String idProducto;
    
    private String idPromotor;
    
    private String xmlEncoding;
    
    public String getIdEntradaCaller()
    {
        return this.idEntradaCaller;
    }
    
    public void setIdEntradaCaller(String value)
    {
        this.idEntradaCaller = value;     
    }
    
    public String getIdEmpresaCRM()
    {
        return this.idEmpresaCRM;
    }
    
    public void setIdEmpresaCRM(String value)
    {
        this.idEmpresaCRM = value;     
    }
    
    public String getIdServicio()
    {
        return this.idServicio;
    }
    
    public void setIdServicio(String value)
    {
        this.idServicio = value;     
    }
    
    public String getIdVenta()
    {
        return this.idVenta;
    }
    
    public void setIdVenta(String value)
    {
        this.idVenta = value;     
    }
    
    public String getIdProducto()
    {
        return this.idProducto;
    }
    
    public void setIdProducto(String value)
    {
        this.idProducto = value;     
    }
    
    public String getIdPromotor()
    {
        return this.idPromotor;
    }
    
    public void setIdPromotor(String value)
    {
        this.idPromotor = value;     
    }
    
    public String getXmlEncoding()
    {
        return this.xmlEncoding;
    }
    
    public void setXmlEncoding(String value)
    {
        this.xmlEncoding = value;     
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
        if (info.name.equals("idEntradaCaller"))
        {
            if(obj!=null)
            {
                if (obj instanceof SoapPrimitive)
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.idEntradaCaller = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.idEntradaCaller = (String)obj;
                }
                else{
                    this.idEntradaCaller = "";
                }
            }
            return true;
        }
        if (info.name.equals("idEmpresaCRM"))
        {
            if(obj!=null)
            {
                if (obj instanceof SoapPrimitive)
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.idEmpresaCRM = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.idEmpresaCRM = (String)obj;
                }
                else{
                    this.idEmpresaCRM = "";
                }
            }
            return true;
        }
        if (info.name.equals("idServicio"))
        {
            if(obj!=null)
            {
                if (obj instanceof SoapPrimitive)
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.idServicio = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.idServicio = (String)obj;
                }
                else{
                    this.idServicio = "";
                }
            }
            return true;
        }
        if (info.name.equals("idVenta"))
        {
            if(obj!=null)
            {
                if (obj instanceof SoapPrimitive)
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.idVenta = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.idVenta = (String)obj;
                }
                else{
                    this.idVenta = "";
                }
            }
            return true;
        }
        if (info.name.equals("idProducto"))
        {
            if(obj!=null)
            {
                if (obj instanceof SoapPrimitive)
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.idProducto = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.idProducto = (String)obj;
                }
                else{
                    this.idProducto = "";
                }
            }
            return true;
        }
        if (info.name.equals("idPromotor"))
        {
            if(obj!=null)
            {
                if (obj instanceof SoapPrimitive)
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.idPromotor = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.idPromotor = (String)obj;
                }
                else{
                    this.idPromotor = "";
                }
            }
            return true;
        }
        if (info.name.equals("xmlEncoding"))
        {
            if(obj!=null)
            {
                if (obj instanceof SoapPrimitive)
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.xmlEncoding = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.xmlEncoding = (String)obj;
                }
                else{
                    this.xmlEncoding = "";
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
            return this.idEntradaCaller;
        }
        else if(propertyIndex==1)
        {
            return this.idEmpresaCRM;
        }
        else if(propertyIndex==2)
        {
            return this.idServicio;
        }
        else if(propertyIndex==3)
        {
            return this.idVenta;
        }
        else if(propertyIndex==4)
        {
            return this.idProducto;
        }
        else if(propertyIndex==5)
        {
            return this.idPromotor!=null?this.idPromotor:SoapPrimitive.NullSkip;
        }
        else if(propertyIndex==6)
        {
            return this.xmlEncoding;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 7;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "idEntradaCaller";
            info.namespace= "";
        }
        else if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "idEmpresaCRM";
            info.namespace= "";
        }
        else if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "idServicio";
            info.namespace= "";
        }
        else if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "idVenta";
            info.namespace= "";
        }
        else if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "idProducto";
            info.namespace= "";
        }
        else if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "idPromotor";
            info.namespace= "";
        }
        else if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "xmlEncoding";
            info.namespace= "";
        }
    }

    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
