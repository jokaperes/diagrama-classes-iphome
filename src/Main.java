// Interface para o Reprodutor Musical
interface ReprodutorMusicalInterface {
    void tocar();
    void pausar();
    void selecionarMusica();
}

// Interface para o Aparelho Telefonico
interface AparelhoTelefonicoInterface {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}

// Interface para o Navegador de Internet
interface NavegadorInternetInterface {
    void exibirPagina();
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe iPhone que implementa as interfaces
class iPhone implements ReprodutorMusicalInterface, AparelhoTelefonicoInterface, NavegadorInternetInterface {
    @Override
    public void tocar() {
        // Implementação para tocar música
    }

    @Override
    public void pausar() {
        // Implementação para pausar música
    }

    @Override
    public void selecionarMusica() {
        // Implementação para selecionar música
    }

    @Override
    public void ligar() {
        // Implementação para fazer uma ligação
    }

    @Override
    public void atender() {
        // Implementação para atender uma chamada
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação para iniciar o correio de voz
    }

    @Override
    public void exibirPagina() {
        // Implementação para exibir uma página da web
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação para adicionar uma nova aba
    }

    @Override
    public void atualizarPagina() {
        // Implementação para atualizar a página da web
    }
}
