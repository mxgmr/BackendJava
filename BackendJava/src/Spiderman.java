

public class Spiderman {
     private String nombre, universo,descripcion,especie;

    public String getNombre() {
        return nombre;
    }

    public boolean setNombre(String nombre) {
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else return false;
    }

    public String getUniverso() {
        return universo;
    }

    public boolean setUniverso(String universo) {
        if (!universo.isEmpty()){
            this.universo = universo;
            return true;
        } else return false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean setDescripcion(String descripcion) {
        if (!descripcion.isEmpty()){
            this.descripcion = descripcion;
            return true;
        } else return false;
    }


    public String getEspecie() {
        return especie;
    }

    public boolean  setEspecie(String especie) {
        if (!especie.isEmpty()){
            this.especie = especie;
            return true;
        } else return false;
    }

    public Spiderman(String nombre, String universo, String descripcion, String especie) {
        setNombre(nombre);
        setUniverso(universo);
        setDescripcion(descripcion);
        setEspecie(especie);
    }


    public String showStatus() {
        return "Spiderman{" +
                "nombre='" + nombre + '\'' +
                ", universo='" + universo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }
}
