public class CalculoINSS {
    public static void main(String[] args) {
        // Definindo o nome do funcionário e o salário fixo 
        String nomeFuncionario = "Ronaldo Lopes";
        double salarioFixo = 4100.65;

        // Calculo do INSS
        double inss = 0;
        if (salarioFixo <= 1412.00) {
            inss = salarioFixo * 0.075;
        } else if (salarioFixo <= 2666.68) {
            inss = salarioFixo * 0.09;
        } else if (salarioFixo <= 4000.03) {
            inss = salarioFixo * 0.12;
        } else if (salarioFixo <= 7786.02) {
            inss = salarioFixo * 0.14;
        } else {
            // Caso o salário seja maior que o teto do INSS
            inss = 7786.02 * 0.14;
        }

        // Exibindo o resultado
        System.out.println("Funcionário: " + nomeFuncionario);
        System.out.println("Salário Fixo: R$ " + String.format("%.2f", salarioFixo));
        System.out.println("Contribuição do INSS: R$ " + String.format("%.2f", inss));
    }
}
