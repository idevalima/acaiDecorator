public class Decorator {
    public static void main(String[] args) {
        Adicional acaiSimples = new Acai();
        System.out.println(acaiSimples.getDescricao() + " custa R$ " + acaiSimples.custo());

        Adicional acaiComMorango = new Morango(acaiSimples);
        System.out.println(acaiComMorango.getDescricao() + " custa R$ " + acaiComMorango.custo());

        Adicional acaiComMorangoLeiteBanana = new Banana(new LeiteCondensado(new Morango(acaiSimples)));
        System.out.println(acaiComMorangoLeiteBanana.getDescricao() + " custa R$ " + acaiComMorangoLeiteBanana.custo());
    }
}
