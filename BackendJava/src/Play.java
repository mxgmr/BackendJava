import javax.print.attribute.standard.RequestingUserName;

public class Play {
    public static void main(String[] args) throws InterruptedException {
    crear();

    }
    public static void crear() throws InterruptedException {
        Runnable ex = new Runnable() {
            @Override
            public void run()  {

                Screen a = new Screen();
                a.setVisible(true);

                GwenStacy gs = new GwenStacy("Gwen Stacy","Tierra-TRN702","Gwendolyn \"Gwen\" Stacy vivió una vida similar a su contraparte de la Tierra-65 hasta el momento en el que fue transportada a una realidad alternativa mientras se enfrentaba a Doctor Octopus. Al darse cuenta de dónde estaba, Gwen se vio obligada a ir de encubierta y asistir a la Academia Visions en Brooklyn.","Humano Mutado");
                PeterParker pp = new PeterParker("Peter Parker","Tierra-TRN700","Peter Parker fue un joven rubio de veintiséis años que durante su adolescencia fue mordido por una araña radiactiva que le otorgó habilidades similares a la de una araña.","Humano Mutado");
                PeterPorker ppo = new PeterPorker("Peter Porker","Tierra-TRN705","Peter Porker fue, en un principio, una araña, que más tarde fue mordida por un cerdo radiactivo. Presumiblemente, él vivió una vida similar a la de su contraparte de la Tierra-8311, siendo un reportero del Daily Beagle, hasta el momento en el que fue transportado a una realidad alternativa donde los humanos eran la especie dominante.","Araña mordida por un cerdo radioactivo");
               try{
                   //peter parker
                   pp.descripcion(a);
                   Thread.sleep(8000);
                   pp.superFuerza(a);
                   Thread.sleep(4000);
                   pp.superReflejos(a);
                   Thread.sleep(4000);
                   pp.treparParedes(a);
                   Thread.sleep(4000);
                   //gwen stacy
                   gs.descripcion(a);
                   Thread.sleep(8000);
                   gs.superAgilidad(a);
                   Thread.sleep(4000);
                   gs.sigilo(a);
                   Thread.sleep(4000);
                   gs.velocidad(a);
                   Thread.sleep(4000);
                   //Peter porker
                   ppo.descripcion(a);
                   Thread.sleep(8000);
                   ppo.pequeño(a);
                   Thread.sleep(4000);
                   ppo.portales(a);
                   Thread.sleep(4000);
                   ppo.hibrido(a);
                   Thread.sleep(4000);
               }catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }

            }
        };
        Thread ejec = new Thread(ex);
        ejec.start();
    }

}
