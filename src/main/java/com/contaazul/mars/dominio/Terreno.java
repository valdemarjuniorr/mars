package com.contaazul.mars.dominio;

public interface Terreno {
	
	/** Define o tamanho da área que o robo vai poder percorrer
	 * 
	 * @return
	 */
	public String[][] area();
	
	public static String[][] criarEspaco(Integer horizontal, Integer vertical) {
		String [][] area = new String[horizontal][vertical];
		--vertical;
		Integer horizontalMax = --horizontal;
		for (int i = 0; i <= horizontal; i++) {
			for (int j = 0; j <= vertical; j++) {
				area[j][i] = j + ", " + horizontalMax;
			}
			horizontalMax--;
		}
		return area;
	}
}