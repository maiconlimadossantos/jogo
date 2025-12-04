public class generos extends genero {
    public String nome;
    public int numero;
    
    // Atributos base para o personagem (adicionados para que o código seja funcional)
    public int forca;
    public int agilidade;
    public int inteligencia;
    public int percepcao;
    public int destreza;
    public int resistencia;
    public int constituicao;
    
    public generos(String nome, String Feminino, String Masculino, String SemGenero, String Tribal, String Experimento, String Orfao) {
        super(Feminino, Masculino, SemGenero, Tribal, Experimento, Orfao);
        this.nome = nome;
        // Inicializa atributos com 0 ou valor base
        this.forca = 0;
        this.agilidade = 0;
        this.inteligencia = 0;
        this.percepcao = 0;
        this.destreza = 0;
        this.resistencia = 0;
        this.constituicao = 0;
    }

    public void selecionarGenero() {
        System.out.println("Gênero selecionado: " + nome);
        adicionarAtributos(nome);
    }

    private void adicionarAtributos(String nomeGenero) {
        if (nomeGenero.equalsIgnoreCase("Masculino")) {
            System.out.println(getMasculino());
            this.forca += 15;
            System.out.println("Atributos adicionados: +15 Força (Total: " + this.forca + ")");

        } else if (nomeGenero.equalsIgnoreCase("Feminino")) {
            System.out.println(getFeminino());
            this.agilidade += 15;
            System.out.println("Atributos adicionados: +15 Agilidade (Total: " + this.agilidade + ")");

        } else if (nomeGenero.equalsIgnoreCase("SemGenero")) {
            System.out.println(getSemGenero());
            this.forca += 15;
            this.agilidade += 15;
            this.inteligencia += 15;
            this.percepcao += 15;
            this.destreza += 15;
            this.resistencia += 15;
            this.constituicao += 15;
            System.out.println("Atributos adicionados: +15 em todos os 7 atributos.");

        } else if (nomeGenero.equalsIgnoreCase("Tribal")) {
            System.out.println(getTribal());
            this.destreza += 15;
            System.out.println("Atributos adicionados: +15 Destreza (Total: " + this.destreza + ")");

        } else if (nomeGenero.equalsIgnoreCase("Experimento")) {
            System.out.println(getExperimento());
            this.percepcao += 15;
            System.out.println("Atributos adicionados: +15 Percepção (Total: " + this.percepcao + ")");

        } else if (nomeGenero.equalsIgnoreCase("Orfao")) {
            System.out.println(getOrfao());
            this.inteligencia += 15;
            System.out.println("Atributos adicionados: +15 Inteligência (Total: " + this.inteligencia + ")");

        } else {
            System.out.println("Gênero não encontrado");
        }
    }
    
    public int adicionaratributos(){
        return forca + agilidade + inteligencia + percepcao + destreza + resistencia + constituicao;
    }
    
    // CORREÇÃO APLICADA AQUI: Estrutura if/else if unificada.
    public String aparencia(){
        if(nome.equalsIgnoreCase("SemGenero") || 
           nome.equalsIgnoreCase("Tribal") || 
           nome.equalsIgnoreCase("Experimento") || 
           nome.equalsIgnoreCase("Orfao")) 
        {
            // Assumindo que se não for "Feminino", a aparência é "Masculina"
            // Você pode ajustar esta lógica se houver mais casos.
            return "Aparência Masculina";
        } else if(nome.equalsIgnoreCase("Feminino")) {
            return "Aparência Feminina";
        } else {
            // Caso o nome não corresponda a nenhum dos gêneros conhecidos
            return "Aparência Desconhecida";
        }
    }
}