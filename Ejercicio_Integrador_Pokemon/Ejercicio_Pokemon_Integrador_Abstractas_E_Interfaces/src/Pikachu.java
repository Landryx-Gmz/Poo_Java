public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola, soy Picachu y estoy atacando con Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola, soy Picachu y estoy atacando con PunioTrueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Hola, soy Picachu y estoy atacando con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Hola, soy Picachu y estoy atacando con RayoCarga");
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Hola, soy Picachu y estoy atacando con Placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola, soy Picachu y estoy atacando con Araniazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola, soy Picachu y estoy atacando con Mordisco");
    }
}
