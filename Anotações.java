Java NetBeans
// SEMPRE USAR PONTO E VIRGULA NO FINAL DE CADA LINHA;
// ao usar o alt insert, ele ira inserir varias funções como por exemplo getters e setters ou constructor.
// ao usar o ctrl space, ele vai auto preencher com o que ja sou possui no java ou no seu codigo.
// caso queira rodar o codigo aperta shift F6 ou se for um notebook diferente ou pc aperte fn shift F6;
  
// se voce segurar ctrl em cima do metodo ele mostra informações e caso clique ele irá ate esse metodo.
  
// o metodo constructor, em java, deve ser delcarado como public.
// NÃO DEVE IR RETORNO(nem void).
// Deve ter o mesmo nome EXATO da classe.
// nao existe a palavra constructor em java.
// ao usar o @override voce sobrescreve o metodo da classe pai

  // Cria um objeto Scanner para ler a entrada do usuario.
        Scanner sc = new Scanner(System.in);
   // Fecha o objeto Scanner para liberar os recursos utilizados
        sc.close();
 // Usar nextLine caso eu queira pedir para o usuario falar algo como por exemplo um nome
        System.out.println("Digite o seu nome:");
        nome = sc.nextLine();
         System.out.println("O nome do usuario é:" + nome);

// ao usar o static voce nao precisa instaciar o metodo pois ele vai pertencer a classe. exemplo: caso eu fizer uma variavel fora da classe, coloque static na frente da variavel
// se usar this.dispose ela irá fechar a tela.
// ao usar o setLocationRelativeTo faz a tela abrir centralizada com o monitor.
// 

