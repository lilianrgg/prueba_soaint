package com.ventas.entidad;


import javax.persistence.*;

@Entity(name = "Producto")
@NamedQuery(name = "Producto.findByidProducto", query = "SELECT Producto FROM Producto Producto WHERE Producto.idProducto = :idProducto")
public class ProductoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProducto;
	
	@Column(nullable = false)
	private Double nombre;

	@Column(nullable = false)
	private String precio;	
	
	
	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Double getNombre() {
		return nombre;
	}

	public void setNombre(Double nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}



	
}
