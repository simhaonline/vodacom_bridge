package HighSpeed;

/**
* HighSpeed/ActionAttributeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from HighSpeedExt.idl
* Tuesday, December 6, 2016 9:17:28 PM IST
*/

public final class ActionAttributeHolder implements org.omg.CORBA.portable.Streamable
{
  public HighSpeed.ActionAttribute value = null;

  public ActionAttributeHolder ()
  {
  }

  public ActionAttributeHolder (HighSpeed.ActionAttribute initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = HighSpeed.ActionAttributeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    HighSpeed.ActionAttributeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return HighSpeed.ActionAttributeHelper.type ();
  }

}
