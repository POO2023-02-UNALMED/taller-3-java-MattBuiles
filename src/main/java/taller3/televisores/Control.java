package taller3.televisores;

public class Control {
  TV tv;
  public void turnOn(){tv.turnOn();}
  public void turnOff(){tv.turnOff();}
  public void canalUp(){tv.canalUp();}
  public void canalDown(){tv.canalDown();}
  public void volumenUp(){tv.volumeUp();}
  public void volumenDown(){tv.volumeDown();}
  public void setCanal(int value){tv.setCanal(value);}
  public void setVolumen(int value){tv.setVolumen(value);}

  public void enlazar(TV tele){
    this.tv=tele;
    tele.setControl(this);
  }

  public TV getTV(){return tv;}
  public void setTV(TV tv){this.tv=tv;}
}
