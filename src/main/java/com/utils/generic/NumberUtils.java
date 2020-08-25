package com.utils.generic;

import java.math.BigDecimal;
/**
 * Classe utils para operacoes referente a numeros.
 * @author Willian Rosa (williankeji05@gmail.com)
 */
public class NumberUtils {

	public static boolean isBigDecimal(String numero)  {
		try {
			BigDecimal decimal = new BigDecimal(numero);
			return true;
		} catch (Exception ex)  {
			return false;
		}
	}
	
}
