

public class PeterParker extends Spiderman implements PeterParkerHab {
    public PeterParker(String nombre, String universo, String descripcion, String especie) {
        super(nombre, universo, descripcion, especie);
    }

    @Override
    public void descripcion(Screen s) {
        s.cls();
        s.repaint();
        s.out("Nombre: "+getNombre()+"\n","Helvetica",28, Colors.gray);
        s.out("Universo: "+getUniverso()+"\n","Helvetica",28, Colors.gray);
        s.out("Especie: "+getEspecie()+"\n","Helvetica",28, Colors.gray);
        s.out("Descripcion: "+getDescripcion()+"\n","Helvetica",28, Colors.gray);
        s.showImage("/Users/marco/IdeaProjects/BackendJava/src/PP.jpg");
        s.setBounds(200,100, 1100,900);
    }

    @Override
    public void superFuerza(Screen s) {
        s.cls();
        s.repaint();
        s.out("Habilidad 1: Super Fuerza"+"\n");
        s.out("La fuerza del Spider-Man es algo que se hace destacar cuando debe hacer esfuerzos manuales. Ha sido capaz de sostener un tren a toda velocidad con sus telarañas hasta hacerlo frenar, bloquear el lanzamiento de un auto en dirección suya con una sola mano, así como sujetar varios autos a punto de caerse con sus redes."+"\n");

    }

    @Override
    public void superReflejos(Screen s) {
        s.cls();
        s.repaint();
        s.out("Habilidad 2: Super Reflejos"+"\n");
        s.out("Sus reflejos y movimientos le permiten esquivar casi cualquier objeto que viaje a grandes velocidades: balas, proyectiles, rayos láser, etc. Su capacidad de movimiento y reflejos son tales que él es prácticamente intocable. Su extraordinaria agilidad, reflejos y velocidad le han permitido escapar de las Bombas-Calabaza de Green Goblin, de los golpes de Wilson Fisk y los tentáculos de la Doctora Octopus."+"\n");
    }

    @Override
    public void treparParedes(Screen s) {
        s.cls();
        s.repaint();
        s.out("Habilidad 3: Trepar Paredes"+"\n");
        s.out("No sería Spider-Man sin este poder, la araña radiactiva que pico a Spider-Man, produjo una mutación en el cerebelo de Peter, como consecuencia él puede controlar mentalmente el flujo de atracción interatómica (electrostática) entre el límite molecular de las superficies, así supera la repulsión normal de electrones y permite su increíble potencial de adhesión. Esta capacidad de afectar la atracción entre superficies está limitada hasta ahora al cuerpo de Spider-Man y especialmente concentrada en sus manos y pies. El poder que más caracteriza a Spider-Man es su habilidad para subir por las paredes, su poder de adhesión es tan grande que se necesitan varias toneladas de peso para desprenderlo."+"\n");
    }
}

