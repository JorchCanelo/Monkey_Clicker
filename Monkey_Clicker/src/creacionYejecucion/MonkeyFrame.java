package creacionYejecucion;
import recursos.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MonkeyFrame extends JFrame{
	Timer cronometro;
	public MonkeyFrame(){
		crearIU(new MonkeyPanel(), new MonkeyBuffsPanel(), new CounterPanel(new JLabel(), new JLabel()), new MonkeyButton(),
				new BuffButton(), new BuffButton(), new BuffButton(), new BuffButton(), new PanelDescription(new TextDescription()));
	}
	
	public void empezarCronometro(CounterPanel panel){
		cronometro = new Timer(panel.getVelocidadCronometro(), new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setLinesContador((panel.getLinesContador()) + 1);
				panel.getLineas().setText(" " + panel.getLinesContador() + " l�neas");
			}
		});
	}
	
	public void actualizarCronometro(CounterPanel panel) {
		if(panel.isCronometroOn() == false) {
			panel.setCronometroOn(true);
		} else if(panel.isCronometroOn() == true) {
			cronometro.stop();
		}
		
		double velocidad = 1 / panel.getPorSegundoLineas() * 1000;
		panel.setVelocidadCronometro((int)Math.round(velocidad));
		
		String s = String.format("%.1f", panel.getPorSegundoLineas());
		panel.getPorSegundo().setText("           " + s + " por segundo");
		
		empezarCronometro(panel);
		cronometro.start();
		
	}
	
	public void crearIU(MonkeyPanel panel, MonkeyBuffsPanel panelBuffs, CounterPanel counter, MonkeyButton boton,
			BuffButton abstraccion, BuffButton modularidad, BuffButton mono, BuffButton sucursal, PanelDescription descripciones){
		
		class MonkeyHandler implements ActionListener{
			public void actionPerformed(ActionEvent event) {
				counter.setLinesContador(counter.getLinesContador() + 1);
				counter.getLineas().setText(" " + counter.getLinesContador() + " l�neas");
				
			}
		}
		
		
		
		class AbstraccionHandler implements ActionListener{
			public void actionPerformed(ActionEvent event) {
				try{
					if(counter.getAbstraccionNumero()>98) {
						throw new ExcepcionLimite("No puedes seguir mejorando esto.");
					} else
					
				if(counter.getLinesContador() >= counter.getAbstraccionPrecio()) {
					counter.setLinesContador(counter.getLinesContador() - counter.getAbstraccionPrecio());
					counter.setAbstraccionPrecio(counter.getAbstraccionPrecio() + 5);
					
					counter.getLineas().setText(" " + counter.getLinesContador() + " l�neas");
					
					counter.setAbstraccionNumero(counter.getAbstraccionNumero() + 1);
					abstraccion.setText("Abstracci�n (" + counter.getAbstraccionNumero() + ")");
					
					counter.setPorSegundoLineas(counter.getPorSegundoLineas() + 0.1);
					actualizarCronometro(counter);
				} else if(counter.getLinesContador() < counter.getAbstraccionPrecio()) {
					descripciones.getTexto().setText("�Necesitas codificar m�s l�neas!");
				}
				if(counter.isModularidadDesbloqueada() == false) {
					if(counter.getAbstraccionNumero() >= 10) {
						counter.setModularidadDesbloqueada(true);
						modularidad.setText("M�dulos");
					}
				}
				
				} catch(ExcepcionLimite excep1) {
					JOptionPane.showMessageDialog(null, "No puedes seguir mejorando esto.");
				}
				
			}
		}
		
		class ModularidadHandler implements ActionListener{
			public void actionPerformed(ActionEvent event) {
				try{
					if(counter.getModularidadNumero()>98) {
						throw new ExcepcionLimite("No puedes seguir mejorando esto.");
					} else
				if(counter.getLinesContador() >= counter.getModularidadPrecio()) {
					counter.setLinesContador(counter.getLinesContador() - counter.getModularidadPrecio());
					counter.setModularidadPrecio(counter.getModularidadPrecio() + 25);
					
					counter.getLineas().setText(" " + counter.getLinesContador() + " l�neas");
					
					counter.setModularidadNumero(counter.getModularidadNumero() + 1);
					modularidad.setText("M�dulos (" + counter.getModularidadNumero() + ")");
					
					counter.setPorSegundoLineas(counter.getPorSegundoLineas() + 1);
					actualizarCronometro(counter);
				} else if(counter.getLinesContador() < counter.getAbstraccionPrecio()) {
					descripciones.getTexto().setText("�Necesitas codificar m�s l�neas!");
				}
				
				if(counter.isMonoDesbloqueado() == false) {
					if(counter.getModularidadNumero() >= 10) {
						counter.setMonoDesbloqueado(true);
						mono.setText("Monos");
					}
				
				}
				} catch(ExcepcionLimite excep1) {
					JOptionPane.showMessageDialog(null, "No puedes seguir mejorando esto.");
				}
			}
		}
		
		class MonoHandler implements ActionListener{
			public void actionPerformed(ActionEvent event) {
				try{
					if(counter.getMonoNumero()>98) {
						throw new ExcepcionLimite("No puedes seguir mejorando esto.");
					} else
				if(counter.getLinesContador() >= counter.getMonoPrecio()) {
					counter.setLinesContador(counter.getLinesContador() - counter.getMonoPrecio());
					counter.setMonoPrecio(counter.getMonoPrecio() + 250);
					
					counter.getLineas().setText(" " + counter.getLinesContador() + " l�neas");
					
					counter.setMonoNumero(counter.getMonoNumero() + 1);
					mono.setText("Monos (" + counter.getMonoNumero() + ")");
					
					counter.setPorSegundoLineas(counter.getPorSegundoLineas() + 10);
					actualizarCronometro(counter);
				} else if(counter.getLinesContador() < counter.getMonoPrecio()) {
					descripciones.getTexto().setText("�Necesitas codificar m�s l�neas!");
				}
				
				if(counter.isSucursalDesbloqueado() == false) {
					if(counter.getMonoNumero() >= 10) {
						counter.setSucursalDesbloqueado(true);
						sucursal.setText("Sucursal");
					}
				}
				} catch(ExcepcionLimite excep1) {
					JOptionPane.showMessageDialog(null, "No puedes seguir mejorando esto.");
				}
	
			}
		}
		
		class SucursalHandler implements ActionListener{
			public void actionPerformed(ActionEvent event) {
				try{
					if(counter.getSucrusalNumero()>98) {
						throw new ExcepcionLimite("No puedes seguir mejorando esto.");
					} else
				if(counter.getLinesContador() >= counter.getSucursalPrecio()) {
					counter.setLinesContador(counter.getLinesContador() - counter.getSucursalPrecio());
					counter.setSucursalPrecio(counter.getSucursalPrecio() + 2500);
					
					counter.getLineas().setText(" " + counter.getLinesContador() + " l�neas");
					
					counter.setSucrusalNumero(counter.getSucrusalNumero() + 1);
					sucursal.setText("Sucursales (" + counter.getSucrusalNumero() + ")");
					
					counter.setPorSegundoLineas(counter.getPorSegundoLineas() + 100);
					actualizarCronometro(counter);
				} else if(counter.getLinesContador() < counter.getSucursalPrecio()) {
					descripciones.getTexto().setText("�Necesitas codificar m�s l�neas!");
				}
				} catch(ExcepcionLimite excep1) {
					JOptionPane.showMessageDialog(null, "No puedes seguir mejorando esto.");
				}
				/*
				if(counter.isUADYDesbloqueado() == false) {
					if(counter.getSucrusalNumero() >= 10) {
						counter.setUADYDesbloqueado(true);
						UADY.setText("UADY LIS");
					}
				}
				*/
	
			}
		}
		
		class MouseHandler implements MouseListener{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				BuffButton boton = (BuffButton)e.getSource();
				
				if(boton == abstraccion) {
					descripciones.getTexto().setText("Abstracci�n\n[Costo: " + counter.getAbstraccionPrecio() + "]\n"
							+ "Al realizar abstracci�n se codifica 1 l�nea cada 10 segundos.");
				}
				
				if(boton == modularidad && counter.isModularidadDesbloqueada() == false) {
					descripciones.getTexto().setText("�Necesitas mejorar tus otras habilidades!");
					/*descripciones.getTexto().setText("M�dulos\n[Costo: " + counter.getModularidadPrecio() + "]\n"
							+ "Con modularidad se codifica 1 l�nea cada segundo.");
							*/
				} else if(boton == modularidad && counter.isModularidadDesbloqueada()) {
					descripciones.getTexto().setText("M�dulos\n[Costo: " + counter.getModularidadPrecio() + "]\n"
							+ "Con modularidad se codifica 1 l�nea cada segundo.");
				}
				
				if(boton == mono && counter.isMonoDesbloqueado() == false) {
					descripciones.getTexto().setText("�Necesitas mejorar tus otras habilidades!");
					/*descripciones.getTexto().setText("M�dulos\n[Costo: " + counter.getModularidadPrecio() + "]\n"
							+ "Con modularidad se codifica 1 l�nea cada segundo.");
							*/
				} else if(boton == mono && counter.isMonoDesbloqueado()) {
					descripciones.getTexto().setText("Monos\n[Costo: " + counter.getMonoPrecio() + "]\n"
							+ "Con otro mono se codifican 10 l�neas por segundo.");
				}
				
				if(boton == sucursal && counter.isSucursalDesbloqueado() == false) {
					descripciones.getTexto().setText("�Necesitas mejorar tus otras habilidades!");
					/*descripciones.getTexto().setText("M�dulos\n[Costo: " + counter.getModularidadPrecio() + "]\n"
							+ "Con modularidad se codifica 1 l�nea cada segundo.");
							*/
				} else if(boton == sucursal && counter.isSucursalDesbloqueado()) {
					descripciones.getTexto().setText("Sucursal\n[Costo: " + counter.getSucursalPrecio() + "]\n"
							+ "Cada sucursal otorga 100 l�neas por segundo.");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
					descripciones.getTexto().setText(null);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
			}
		}
		
		MonkeyHandler mHandler = new MonkeyHandler();
		MouseHandler mListener = new MouseHandler();
		AbstraccionHandler aHandler = new AbstraccionHandler();
		ModularidadHandler modHandler = new ModularidadHandler();
		MonoHandler monoHandler = new MonoHandler();
		SucursalHandler succHandler = new SucursalHandler();
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.BLACK);
		setLayout(null);
		setTitle("Monkey Clicker");
		
		abstraccion.setText("Abstracci�n");
		modularidad.setText("?");
		mono.setText("?");
		sucursal.setText("?");
		abstraccion.addActionListener(aHandler);
		abstraccion.addMouseListener(mListener);
		modularidad.addActionListener(modHandler);
		modularidad.addMouseListener(mListener);
		mono.addActionListener(monoHandler);
		mono.addMouseListener(mListener);
		sucursal.addActionListener(succHandler);
		sucursal.addMouseListener(mListener);
		panelBuffs.add(abstraccion);
		panelBuffs.add(modularidad);
		panelBuffs.add(mono);
		panelBuffs.add(sucursal);
		
		add(panel);
		add(descripciones);
		add(panelBuffs);
		add(counter);
		boton.addActionListener(mHandler);
		panel.add(boton);
		
		
		setVisible(true);
		setResizable(false);
	}
	
	
}
