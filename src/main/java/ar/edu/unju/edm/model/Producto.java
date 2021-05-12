package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Producto {

	private int CodProducto;
	private String nombre;
	private double precio;
	private String marca;
	private int stock;
	
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}


	public int getCodProducto() {
		return CodProducto;
	}


	public void setCodProducto(int codProducto) {
		CodProducto = codProducto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
