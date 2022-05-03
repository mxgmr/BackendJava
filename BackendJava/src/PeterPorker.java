public class PeterPorker extends Spiderman implements PeterPorkerHab {
    public PeterPorker(String nombre, String universo, String descripcion, String especie) {
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
        s.showImage("/Users/marco/IdeaProjects/BackendJava/src/PPo.jpg");
        s.setBounds(200,100, 1100,900);
    }

    @Override
    public void pequeño(Screen s) {
        s.cls();
        s.repaint();
        s.out("Habilidad 1: Ta chikito"+"\n");
        s.out("Aqui iria la descripcion pero no encontre informacion x82839671382746237895682345698234"+"\n");
    }

    @Override
    public void portales(Screen s) {
        s.cls();
        s.repaint();
        s.out("Habilidad 2: tira portales o algo asi, no vi la pelicula completa"+"\n");
        s.out("Aqui iria la descripcion pero no encontre informacion x234891836587123456823765984123692057823480657891326490172"+"\n");
    }

    @Override
    public void hibrido(Screen s) {
        s.cls();
        s.repaint();
        s.out("Habilidad 3: Hibrido"+"\n");
        s.out("Mitad araña mitad puerco radioactivo :D"+"\n");

    }
}
