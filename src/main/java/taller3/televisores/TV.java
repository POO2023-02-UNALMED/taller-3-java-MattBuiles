package taller3.televisores;

public class TV {
  Marca marca;
  int canal=1;
  int precio=500;
  boolean estado;
  int volumen=1;
  Control control;
  static int numTV;

  public TV(Marca marca, boolean estado){this.marca = marca;this.estado = estado;}
  public Marca getMarca(){return marca;}
  public void setMarca(Marca marca){this.marca = marca;}
  public int getCanal() {return canal;}
  public void setCanal(int canal) {if(canal<=120&&canal>=1){this.canal = canal;}}
  public int getPrecio() {return precio;}
  public void setPrecio(int precio) {this.precio=precio;}
  public int getVolumen() {return volumen;}
  public void setVolumen(int volumen) {if(volumen<=7&&volumen>=0){this.volumen=volumen;}}
  public Control getcontrol() {return control;}
  public void setControl(Control control) {this.control=control;}
  
  public void numTV(int num){numTV++;}

  public void turnOn(){this.estado=true;}
  public void turnOff(){this.estado=false;}
  public boolean getEstado(){return estado;}

  public void canalUp(){if(estado==true){if (canal<120) {canal++;}}}
  public void canalDown(){if(estado==true){if (canal>1) {canal--;}}}
  public void volumeUp(){if(estado==true){if (volumen<7) {volumen++;}}}
  public void volumeDown(){if(estado==true){if (volumen>0) {volumen--;}}}
}