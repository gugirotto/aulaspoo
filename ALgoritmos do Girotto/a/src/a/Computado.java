package a;

public class Computado {
 String modelo;
 String processador;
 int memoria;
 public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getProcessador() {
	return processador;
}
public void setProcessador(String processador) {
	this.processador = processador;
}
public int getMemoria() {
	return memoria;
}
public void setMemoria(int memoria) {
	this.memoria = memoria;
}
public int getDisco() {
	return disco;
}
public void setDisco(int disco) {
	this.disco = disco;
}
int disco;
public Computado(String modelo, String processador, int memoria, int disco) {
	super();
	this.modelo = modelo;
	this.processador = processador;
	this.memoria = memoria;
	this.disco = disco;
}
public void dados() {
	System.out.println("");
	
}
public Computado() {
	// TODO Auto-generated constructor stub
}


}
