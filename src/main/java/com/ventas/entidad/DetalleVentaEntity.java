package com.ventas.entidad;

import javax.persistence.*;

@Entity(name = "DetalleVenta")
@NamedQuery(name = "DetalleVentafindByidDetalleVenta", query = "SELECT DetalleVenta FROM DetalleVenta DetalleVenta WHERE DetalleVenta.idDetalleVenta = :idDetalleVenta")
public class DetalleVentaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idDetalleVenta;
	
	@Column(nullable = false)
	private Long idVenta;
	
	@Column(nullable = false)
	private Long idProducto;
	
	
	public Long getIdDetalleVenta() {
		return idDetalleVenta;
	}

	public void setIdDetalleVenta(Long idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}

	public Long getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

}
