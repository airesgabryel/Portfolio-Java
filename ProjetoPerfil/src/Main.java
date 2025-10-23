void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu nome completo: ");
    String nome = scanner.nextLine();

    System.out.println("Digite sua idade: ");
    int idade = scanner.nextInt();

    System.out.println("Digite sua altura (X,XX): ");
    double altura = scanner.nextDouble();

    System.out.println("\n--- Dados recebidos ---");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade + "anos");
    System.out.println("Altura: " + altura + "m");

    scanner.close();

}
