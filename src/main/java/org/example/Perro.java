package org.example;
public class Perro extends Mascota {
	private String nombre;
	private String color;

	public void ladrar() {
		System.out.println("¡Guau guau!");
	}

	public void comer() {
		System.out.println("El perro está comiendo.");
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}