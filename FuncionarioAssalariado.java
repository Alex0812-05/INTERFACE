public class FuncionarioAssalariado implements Funcionario {

    // Método para colocar o bonus fixo com um determinado valor
    public static final double BONUS_FIXO = 5500.00;

    // Utilização do método calcularBonus, retornando o valor do bônus fixo
    @Override
    public double calcularBonus() {
        return BONUS_FIXO;
    }
}
