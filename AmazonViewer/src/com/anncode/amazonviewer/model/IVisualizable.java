package com.anncode.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {
	
	/**
	 * Este método captura el tiempo de inicio de visualización.
	 * 
	 * @param dateI
	 * @return Devuelve la fecha y hora capturada.
	 */
	Date startToSee(Date dateI);
	
	/**
	 * 
	 * @param dateI
	 * @param dateF
	 */
	void stopToSee(Date dateI, Date dateF);
	
}
