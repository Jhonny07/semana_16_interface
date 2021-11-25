public class Principal {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setBase(10);
        retangulo.setAltura(5);
        retangulo.setLado1(6);
        retangulo.setLado2(4);
        System.out.println(retangulo.getPerimetro());
        System.out.println(retangulo.getArea());
        System.out.println(retangulo.getNomeFigura());
    }

}