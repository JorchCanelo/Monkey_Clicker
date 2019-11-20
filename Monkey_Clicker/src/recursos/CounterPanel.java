package recursos;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CounterPanel extends JPanel{
	
	private long lineasContador, abstraccionNumero, abstraccionPrecio, modularidadNumero, modularidadPrecio, monoNumero, monoPrecio,
	sucrusalNumero, sucursalPrecio;
	private int velocidadCronometro;
	private double porSegundoLineas;
	private boolean cronometroOn, modularidadDesbloqueada, monoDesbloqueado, sucursalDesbloqueado;
	private JLabel lineas;
	private JLabel porSegundo;
	
	public CounterPanel(JLabel lineas, JLabel porSegundo) {
		super();
		this.lineasContador = 0;
		this.porSegundoLineas = 0;
		this.lineas = lineas;
		this.porSegundo = porSegundo;
		this.velocidadCronometro = 0;
		this.cronometroOn = false;
		
		this.abstraccionNumero = 0;
		this.abstraccionPrecio = 5;
		this.modularidadNumero = 0;
		this.modularidadPrecio = 50;
		this.monoNumero = 0;
		this.monoPrecio = 500;
		this.sucrusalNumero = 0;
		this.sucursalPrecio = 5000;
		
		this.modularidadDesbloqueada = false;
		this.monoDesbloqueado = false;
		
		Font fuente1 = new Font("Comic Sans MS", Font.PLAIN, 32);
		Font fuente2 = new Font("Comic Sans MS", Font.PLAIN, 15);
		setBounds(100, 100, 200, 100);
		setBackground(Color.BLACK);
		setLayout(new GridLayout(2, 1));
		lineas.setForeground(Color.WHITE);
		lineas.setFont(fuente1);
		porSegundo.setForeground(Color.WHITE);
		porSegundo.setFont(fuente2);
		add(this.lineas);
		add(this.porSegundo);
		this.lineas.setText(" " + this.lineasContador + " lineas");
		add(this.porSegundo);
	}
	
	public long getLinesContador() {
		return lineasContador;
	}
	public void setLinesContador(long linesContador) {
		this.lineasContador = linesContador;
	}
	public JLabel getLineas() {
		return lineas;
	}
	public void setLineas(JLabel lineas) {
		this.lineas = lineas;
	}
	public JLabel getPorSegundo() {
		return porSegundo;
	}
	public void setPorSegundo(JLabel porSegundo) {
		this.porSegundo = porSegundo;
	}

	public int getVelocidadCronometro() {
		return velocidadCronometro;
	}

	public void setVelocidadCronometro(int velocidadCronometro) {
		this.velocidadCronometro = velocidadCronometro;
	}

	public boolean isCronometroOn() {
		return cronometroOn;
	}

	public void setCronometroOn(boolean cronometroOn) {
		this.cronometroOn = cronometroOn;
	}

	public long getLineasContador() {
		return lineasContador;
	}

	public void setLineasContador(long lineasContador) {
		this.lineasContador = lineasContador;
	}

	public double getPorSegundoLineas() {
		return porSegundoLineas;
	}

	public void setPorSegundoLineas(double porSegundoLineas) {
		this.porSegundoLineas = porSegundoLineas;
	}

	public long getAbstraccionNumero() {
		return abstraccionNumero;
	}

	public void setAbstraccionNumero(long abstraccionNumero) {
		this.abstraccionNumero = abstraccionNumero;
	}

	public long getAbstraccionPrecio() {
		return abstraccionPrecio;
	}

	public void setAbstraccionPrecio(long abstraccionPrecio) {
		this.abstraccionPrecio = abstraccionPrecio;
	}

	public long getModularidadNumero() {
		return modularidadNumero;
	}

	public void setModularidadNumero(long modularidadNumero) {
		this.modularidadNumero = modularidadNumero;
	}

	public long getModularidadPrecio() {
		return modularidadPrecio;
	}

	public void setModularidadPrecio(long modularidadPrecio) {
		this.modularidadPrecio = modularidadPrecio;
	}

	public boolean isModularidadDesbloqueada() {
		return modularidadDesbloqueada;
	}

	public void setModularidadDesbloqueada(boolean modularidadDesbloqueada) {
		this.modularidadDesbloqueada = modularidadDesbloqueada;
	}

	public boolean isMonoDesbloqueado() {
		return monoDesbloqueado;
	}

	public void setMonoDesbloqueado(boolean monoDesbloqueado) {
		this.monoDesbloqueado = monoDesbloqueado;
	}

	public boolean isSucursalDesbloqueado() {
		return sucursalDesbloqueado;
	}

	public void setSucursalDesbloqueado(boolean sucursalDesbloqueado) {
		this.sucursalDesbloqueado = sucursalDesbloqueado;
	}

	public long getMonoNumero() {
		return monoNumero;
	}

	public void setMonoNumero(long monoNumero) {
		this.monoNumero = monoNumero;
	}

	public long getMonoPrecio() {
		return monoPrecio;
	}

	public void setMonoPrecio(long monoPrecio) {
		this.monoPrecio = monoPrecio;
	}

	public long getSucrusalNumero() {
		return sucrusalNumero;
	}

	public void setSucrusalNumero(long sucrusalNumero) {
		this.sucrusalNumero = sucrusalNumero;
	}

	public long getSucursalPrecio() {
		return sucursalPrecio;
	}

	public void setSucursalPrecio(long sucursalPrecio) {
		this.sucursalPrecio = sucursalPrecio;
	}
	
	
	
}
