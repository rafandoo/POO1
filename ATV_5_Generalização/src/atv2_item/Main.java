package atv2_item;

public class Main {

	public static void main(String[] args) {
		
		//LIVRO
		Livro lv = new Livro();
		lv.setCodigo(1);
		lv.setDescricao("Estudos sobre computação quântica");
		lv.setAutor("Max Wold");
		System.out.println(lv);
		
		Livro lv2 = new Livro(2,"Tecnicas de invasão e proteção");
		lv2.setAutor("Wilson José");
		System.out.println(lv2);
		
		Livro lv3 = new Livro(3, "Processadores: construção", "Intel Corp.");
		System.out.println(lv3);
		
		System.out.println("\n");
		
		//CD
		CD cd1 = new CD();
		cd1.setCodigo(4);
		cd1.setDescricao("CD - Top musicas GAGA");
		cd1.setGravadora("Def Jam");
		cd1.setDuracao(70.24f);
		cd1.setFaixas(13);
		cd1.setArtista("Lady Gaga");
		cd1.setAlbum("The Fame Monster");
		System.out.println(cd1);
		
		CD cd2 = new CD(5, "CD - O Rei do Rock");
		cd2.setGravadora("Sun Records");
		cd2.setDuracao(42.12f);
		cd2.setFaixas(8);
		cd2.setArtista("Elvis Presley");
		cd2.setAlbum("Raised on Rock");
		System.out.println(cd2);
		
		CD cd3 = new CD(6, "CD - Hollywood's Bleeding deluxe", "Republic", 50.00f);
		cd3.setFaixas(17);
		cd3.setArtista("Post Malone");
		cd3.setAlbum("Hollywood's Bleeding");
		System.out.println(cd3);
		
		CD cd4 = new CD(7, "CD - This Is Acting (Deluxe Version)", "Atlantic Records", 60.14f, 19, "SIA", "This Is Acting");
		System.out.println(cd4);
		
		System.out.println("\n");
		
		//VHS
		VHS vhs1 = new VHS();
		vhs1.setCodigo(8);
		vhs1.setDescricao("Filme sobre a terra em seus primordios");
		vhs1.setGravadora("Universal Studios");
		vhs1.setDuracao(90.55f);
		vhs1.setTitulo("Jurassic Earth");
		System.out.println(vhs1);
		
		VHS vhs2 = new VHS(9, "Filme sobre invasão extraterrestre");
		vhs2.setGravadora("Warner Inc.");
		vhs2.setDuracao(120.60f);
		vhs2.setTitulo("UFO a invasão");
		System.out.println(vhs2);
		
		VHS vhs3 = new VHS(10, "Filme sobre um futuro distopico", "Fox company", 106.08f);
		vhs3.setTitulo("Futurama - o filme");
		System.out.println(vhs3);
		
		VHS vhs4 = new VHS(11, "Filme sobre uma familia atrapalhada", "Pixar", 62.75f, "Divertida Familia");
		System.out.println(vhs4);
	}
}
