import java.io.File;

public class RenombrarDirectorios {
    public void renombrarDirectorios(String path){
       File directorio  = new File(path);
       if(!directorio.exists() || !directorio.isDirectory()){
        System.out.println("La ruta path no es un directorio valido");
        return;
    }
    //ACA vamos a cambiar los nombres
    System.out.println("La ruta path es valida");
    renombrarDirectoriosInternos(directorio);
    }
    public void renombrarDirectoriosInternos(File directorio){
        //Listar todos los archivos y/o carpetas hijas
        File[] diretorioArchivosInternos = directorio.listFiles();
        if(diretorioArchivosInternos == null){
            return;
        }
        //Iterar sobre los archivos y/o carpetas
        for(File directorioArchivo : diretorioArchivosInternos){
            if(directorioArchivo.isDirectory()){
                //Si es una carpeta, renombrarla
                String nombreOriginal = directorioArchivo.getName();
                String nombreNuevo = "Carpeta_" + nombreOriginal;
                File nuevoDirectorio = new File(directorioArchivo.getParent(),nombreNuevo);
                if(directorioArchivo.renameTo(nuevoDirectorio)){
                    renombrarDirectoriosInternos(nuevoDirectorio);
                    
                }
            }            
    }
}
}
