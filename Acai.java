public class Acai implements Adicional {
    @Override
    public String getDescricao() {
        return "Açaí Simples";
    }

    @Override
    public double custo() {
        return 10.00; // Preço base do Açaí
    }
}