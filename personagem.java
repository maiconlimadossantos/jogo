public class personagem {
    public String Tipo;
    
    public personagem(String Tipo) {
        this.Tipo = Tipo;
    }

    // CORREÇÃO: Tipo de retorno alterado de String para void.
    // O nome do método também foi corrigido para 'adicionarTipoEspecialidade' (camelCase e ortografia).
    public void adicionarTipoEspecialidade(String Tipo) {
        if (Tipo.equalsIgnoreCase("tanque")) {
            System.out.println("Tipo escolhido: Tanque");
        } else if (Tipo.equalsIgnoreCase("Ataque")) {
            System.out.println("Tipo escolhido: Ataque");
        } else if (Tipo.equalsIgnoreCase("Especialista")) {
            System.out.println("Tipo escolhido: Especialista");
        } else if (Tipo.equalsIgnoreCase("Suporte")) {
            System.out.println("Tipo escolhido: Suporte");
        } else {
            System.out.println("Tipo inválido.");
        }
        // Não é necessário 'return' aqui.
    }
}