package HighSpeed;

/**
* HighSpeed/PartyContactHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from HighSpeedExt.idl
* Tuesday, December 6, 2016 9:17:28 PM IST
*/

public final class PartyContactHolder implements org.omg.CORBA.portable.Streamable
{
  public HighSpeed.PartyContact value = null;

  public PartyContactHolder ()
  {
  }

  public PartyContactHolder (HighSpeed.PartyContact initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = HighSpeed.PartyContactHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    HighSpeed.PartyContactHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return HighSpeed.PartyContactHelper.type ();
  }

}
