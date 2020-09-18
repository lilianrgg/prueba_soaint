package com.ventas.entidad;

import java.util.Date;

import javax.persistence.*;

@Entity(name = "Venta")
@NamedQuery(name = "Venta.findByidVenta", query = "SELECT Venta FROM Venta Venta WHERE Venta.idVenta = :idVenta")
public class VentaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idVenta;
	
	@Column(nullable = false)
	private Long idCliente;
	
	@Column(nullable = false)
	private Date fecha;
	
	
	public Long getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	

	
}
