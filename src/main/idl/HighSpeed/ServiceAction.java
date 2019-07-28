package HighSpeed;


/**
* HighSpeed/ServiceAction.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from HighSpeedExt.idl
* Tuesday, December 6, 2016 9:17:28 PM IST
*/

public final class ServiceAction implements org.omg.CORBA.portable.IDLEntity
{
  public String currentSoId = null;

  // Current Service Offering on Offer
  public String newSoId = null;

  // New Service Offering on Offer
  public String actionType = null;

  // Action To Be Taken. Create, Delete, Modify
  public String sid1 = null;

  // Service ID
  public String sid1Type = null;

  // Service ID Type
  public String sid2 = null;

  // Service ID
  public String sid2Type = null;

  // Service ID Type
  public String sid3 = null;

  // Service ID
  public String sid3Type = null;

  // Service ID Type
  public String sid4 = null;

  // Service ID
  public String sid4Type = null;

  public ServiceAction ()
  {
  } // ctor

  public ServiceAction (String _currentSoId, String _newSoId, String _actionType, String _sid1, String _sid1Type, String _sid2, String _sid2Type, String _sid3, String _sid3Type, String _sid4, String _sid4Type)
  {
    currentSoId = _currentSoId;
    newSoId = _newSoId;
    actionType = _actionType;
    sid1 = _sid1;
    sid1Type = _sid1Type;
    sid2 = _sid2;
    sid2Type = _sid2Type;
    sid3 = _sid3;
    sid3Type = _sid3Type;
    sid4 = _sid4;
    sid4Type = _sid4Type;
  } // ctor

} // class ServiceAction
