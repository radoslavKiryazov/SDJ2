package model;


public interface RadiatorState extends PropertyChangeSubject
{
  public void turnUp(Radiator radiator);
  public void turnDown(Radiator radiator);
  public String getPower();
}
