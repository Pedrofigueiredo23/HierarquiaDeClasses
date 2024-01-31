public class Veiculo {
    protected String marca; // atributo protegido
    protected int anoFabrico; // atributo protegido

    public Veiculo (String marca, int anoFabrico){ //construtor
        this.marca = marca;
        this.anoFabrico = anoFabrico;
    }

    public void apresentar(){ //método "apresentar"
        System.out.println("Marca: "+ marca);
        System.out.println("Ano de Fabríco: " + anoFabrico);
    }
}

    class Carro extends Veiculo {  //subclass Carro
        int nrPortas;
        public Carro (String marca, int anoFabrico, int nrPortas){
            super(marca, anoFabrico);
            this.nrPortas = nrPortas;
        }

        public void apresentar(){
            super.apresentar();
            System.out.println("Número de portas: " + nrPortas);
        }
    }
    class Moto extends Veiculo { // subclasse Moto
        String tipoMoto;
        public Moto (String marca, int ano, String tipoMoto){
            super(marca, ano);
            this.tipoMoto = tipoMoto;
        }

        public void apresentar(){
            super.apresentar();
            System.out.println("Tipo de moto: " + tipoMoto);
        }
}


