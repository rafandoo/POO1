package atv1_pessoa;

public class Main {

	public static void main(String[] args) {
		
		//PESSOA FISICA
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("joao");
		pf.setEndereco("Lontras - SC");
		pf.setCpf("111.111.111-11");
		pf.setEstadoCivil("Casado");
		System.out.println(pf);
		
		PessoaFisica pf2 = new PessoaFisica("Paulo", "Rio do Oeste - SC");
		pf2.setCpf("222.222.222-22");
		pf2.setEstadoCivil("Solteiro");
		System.out.println(pf2);
		
		PessoaFisica pf3 = new PessoaFisica("Alfredo", "Joinvile - SC", "333.333.333-33", "Divorciado");
		System.out.println(pf3);
		
		System.out.println("\n");
		
		//PESSOA JURIDICA
		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("Lipox Serviços de Pintura");
		pj.setEndereco("Rio do Sul - SC");
		pj.setCnpj("11.111.111\\0001-01");
		pj.setTipoEmpresa("Limitada Simples Nacional");
		System.out.println(pj);
		
		PessoaJuridica pj2 = new PessoaJuridica("Luxpoli Comercio de Tintas", "Barra do Trombudo - SC");
		pj2.setCnpj("22.222.222\\0001-02");
		pj2.setTipoEmpresa("EIRELI");
		System.out.println(pj2);
		
		PessoaJuridica pj3 = new PessoaJuridica("RH Tech", "Lages - SC", "33.333.333\\0003-03", "MEI");
		System.out.println(pj3);
	}

}
