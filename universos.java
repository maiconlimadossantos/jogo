public class universos extends universo  {
    public String NomeUniverso;
    public String NomePlaneta;
    public String NomeSistema;
    public String NomePovo;
    public universos(String Uniao, String Trevas, String Luz, String Fogo, String Agua, String Terra, String Ar, String Fumaca, String Lava, String Areia, String Gelo, String Tempo, String Veneno, String Energia, String Fantasma, String Hibrido, String Realidade, String Espaco, String Cosmica, String CorpoCelestial, String Lunar, String Solar, String Plasma, String Explosao, String tecnologia, String Som, String Silencio, String Quimica, String Magia, String AntiMagia, String MortoVivo, String Alquimia, String Vidro, String Magnética, String Eletricidade, String Plantas, String Bolhas, String Vapor, String Térmica, String Calor, String Frio, String Neve, String Gravidade, String Mental, String Almas, String Mana, String ForcaVital, String Imaterial, String Material, String Irrealidade, String Armas, String Insetos, String Animais, String Genética, String Corrupção, String Purificação, String Platina, String Ouro, String Prata, String Bronze, String Metal, String Nuclear, String NanoRobo, String Karma, String Sistema, String ArtesMarciais, String Jogador, String Summer, String PoderAntigo, String Aco, String Relâmpago, String Sangue) {
        super(Uniao, Trevas, Luz, Fogo, Agua, Terra, Ar, Fumaca, Lava, Areia, Gelo, Tempo, Veneno, Energia, Fantasma, Hibrido, Realidade, Espaco, Cosmica, CorpoCelestial, Lunar, Solar, Plasma, Explosao, tecnologia, Som, Silencio, Quimica, Magia, AntiMagia, MortoVivo, Alquimia, Vidro, Magnética, Eletricidade, Plantas, Bolhas, Vapor, Térmica, Calor, Frio, Neve, Gravidade, Mental, Almas, Mana, ForcaVital, Imaterial, Material, Irrealidade, Armas, Insetos, Animais, Genética, Corrupção, Purificação, Platina, Ouro, Prata, Bronze, Metal, Nuclear, NanoRobo, Karma, Sistema, ArtesMarciais, Jogador, Summer, PoderAntigo, Aco, Relâmpago, Sangue);
    }
    public void selecionarUniverso() {
        if (NomeUniverso == null ) {
            System.out.println("Por favor, defina o NomeUniverso, NomePlaneta, NomeSistema e NomePovo antes de selecionar o universo.");
            return;
        }else if (NomeUniverso.equalsIgnoreCase("União")) {
            System.out.println("Você escolheu o universo: " + NomeUniverso);
        } else if (NomeUniverso.equalsIgnoreCase("Trevas")) {
            System.out.println("Você escolheu o universo: " + NomeUniverso);
        } else if (NomeUniverso.equalsIgnoreCase("Luz")) {
            System.out.println("Você escolheu o universo: " + NomeUniverso);
            
        }
    }
    public void definirDetalhesUniverso(String nomeUniverso, String nomePlaneta, String nomeSistema, String nomePovo) {
        this.NomeUniverso = nomeUniverso;
        this.NomePlaneta = nomePlaneta;
        this.NomeSistema = nomeSistema;
        this.NomePovo = nomePovo;
    }
    public  void SelecionarPlaneta(){
        if (NomePlaneta == null ) {
            System.out.println("Por favor, defina o NomePlaneta antes de selecionar o planeta.");
            return;
        } 
        System.out.println("Planeta escolhido: " + NomePlaneta);
    }
    
}
