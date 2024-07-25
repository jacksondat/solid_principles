package org.formacion.srp;

import java.util.List;

import org.junit.Test;

import org.junit.Assert;

public class RecomendadorTest {

	@Test
	public void test() {
		Recomendador r = new Recomendador();
		
		List<Pelicula> recomendaciones = r.getRecomendadas(BBDD.JUAN);
		
		Assert.assertFalse(recomendaciones.contains(BBDD.ET));
	}
	
	@Test 
	public void test_formato() {
		Recomendador r = new Recomendador();
		
		String csv = new ExportadorCSV().exportar(r.getRecomendadas(BBDD.JUAN));
		
		String esperado = "Salvar al soldado Ryan,Spielberg,belico";
		
		Assert.assertEquals(esperado, csv);

	}

}
