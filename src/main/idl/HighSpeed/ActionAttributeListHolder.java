package HighSpeed;


/**
* HighSpeed/ActionAttributeListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from HighSpeedExt.idl
* Tuesday, December 6, 2016 9:17:28 PM IST
*/


// Action attribute list
public final class ActionAttributeListHolder implements org.omg.CORBA.portable.Streamable
{
  public HighSpeed.ActionAttribute value[] = null;

  public ActionAttributeListHolder ()
  {
  }

  public ActionAttributeListHolder (HighSpeed.ActionAttribute[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = HighSpeed.ActionAttributeListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    HighSpeed.ActionAttributeListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return HighSpeed.ActionAttributeListHelper.type ();
  }

}
