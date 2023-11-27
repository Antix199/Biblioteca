package Modelo;

public class Prestamo {
    private int idUsuario;
    private String nombreUsuario;
    private String correoUsuario;
    private int idMaterial;
    private String tituloMaterial;

    public int getIdMaterial() {
        return idMaterial;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public Prestamo(int idUsuario, String nombreUsuario, String correoUsuario,
                    int idMaterial, String tituloMaterial) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.correoUsuario = correoUsuario;
        this.idMaterial = idMaterial;
        this.tituloMaterial = tituloMaterial;
    }

    public String toString(){
        return "ID usuario:"+ idUsuario + ", Nombre usuario: " + nombreUsuario +
                ", Correo: "+ correoUsuario + ", ID material"+ idMaterial + ",Titulo: "+ tituloMaterial;
    }

}

