public class GwenStacy extends Spiderman implements GwenStacyHab{
    public GwenStacy(String nombre, String universo, String descripcion, String especie) {
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
        s.showImage("/Users/marco/IdeaProjects/BackendJava/src/GS.jpg");
        s.setBounds(200,100, 1100,900);
    }

    @Override
    public void superAgilidad(Screen s) {
        s.cls();
        s.repaint();
        s.out("Habilidad 1: Super Agilidad"+"\n");
        s.out("Aqui iria la descripcion pero no encontre informacion"+"\n");
    }

    @Override
    public void sigilo(Screen s) {
        s.cls();
        s.repaint();
        s.out("Habilidad 2: sigilo"+"\n");
        s.out("Aqui iria la descripcion pero no encontre informacion x2"+"\n");
    }

    @Override
    public void velocidad(Screen s) {
        s.cls();
        s.repaint();
        s.out("Habilidad 1: Velocidad"+"\n");
        s.out("Aqui iria la descripcion pero no encontre informacion x23235 24563463456635"+"\n");
    }
}
