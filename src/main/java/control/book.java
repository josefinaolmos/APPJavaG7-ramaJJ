package control;

import com.mycompany.APP2G7.Root;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class book {

    //METODO BUSCAR LIBRO
    public ArrayList<String> buscar(){
        Root root = new Root();
        String path = root.path;
        //crear instancia para abrir el archivo
        File file=new File(path);
        //array para los libros
        ArrayList<String> book = new ArrayList<String>();
        String txt;
        try{
            // leemos el archivo csv
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((txt = br.readLine()) != null) {
                // separar por coma
                String[] libro = txt.split(",");
                if (!libro[1].contains("\"")) {
                    book.add(String.valueOf(libro[0]));
                    book.add(String.valueOf(libro[1]));
                    book.add(String.valueOf(libro[2]));
                    book.add(String.valueOf(libro[3]));
                    book.add(String.valueOf(libro[4]));
                    book.add(String.valueOf(libro[5]));
                    book.add(String.valueOf(libro[6]));
                    book.add(String.valueOf(libro[7]));
                } else {
                    book.add(libro[0] + "," + libro[1]);
                    book.add(String.valueOf(libro[2]));
                    book.add(String.valueOf(libro[3]));
                    book.add(String.valueOf(libro[4]));
                    book.add(String.valueOf(libro[5]));
                    book.add(String.valueOf(libro[6]));
                    book.add(String.valueOf(libro[7]));
                    book.add(String.valueOf(libro[8]));
                }
            }
            br.close();
                       
                 
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error con el archivo de registro.");
        }
        //regresar la lista resultante
        return book;
    }
    
    //METODO VALIDACION DE DATOS VACIOS
    public Boolean valid(String titulo, String author, int anio, int est_num, String est_sec, int piso, String edificio, String sede){
        boolean x;
        if(!titulo.isEmpty() && !author.isEmpty() && anio!=0 && est_num!=0 && !est_sec.isEmpty() && piso!=0 && !edificio.isEmpty() && !sede.isEmpty()) {
            x = true;
        }else {
            x = false;
        }
        return x;
    }
    
    //METODO GUARDAR DATOS
    public void save(String titulo, String author, int anio, int est_num, String est_sec, int piso, String edificio, String sede){
        Root root = new Root();
        String path = root.path;
        try{
            File file=new File(path);
            if(!file.createNewFile()){
                //abrir el fichero en modo de sobreescritura si no se ha creado
                PrintWriter out=new PrintWriter(new FileWriter(file,true));
                out.close();
            }
            try{
                //abrir el fichero en modo de sobreescritura
                PrintWriter out=new PrintWriter(new FileWriter(file,true));
                //Da formato a la fecha con el año solamente
                //escribir en el fichero
                ArrayList<String> books=buscar();
                if (books.contains(titulo)) {
                    JOptionPane.showMessageDialog(null,"El libro ya existe.");
                }else {
                    out.println(titulo + "," + author + "," + anio + "," + est_num + "," + est_sec + "," + piso + "," + edificio + "," + sede);
                    JOptionPane.showMessageDialog(null,"Haz guardado: " + titulo);
                }

                //cerrar el fichero
                out.close();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Error al guardar el libro");
                }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error con el archivo de registro.");
        }
    }
    
    //METODO UPDATE PARA REEMPLAZAR VALORES
    public void update(String titulo, String author, int anio, int est_num, String est_sec, int piso, String edificio, String sede){
        Root root = new Root();
        String path = root.path;
        try{
            //Obtener una lista con los libros y sus datos
            ArrayList<String> libros=buscar();
            File file=new File(path);
            try{
                //el archivo se abrirá en modo de reescribir
                PrintWriter out=new PrintWriter(new FileWriter(file));
                //formatear la fecha en año
                //actualizar datos de la lista con los datos del libro modificado
                if (libros.contains(titulo)){
                    String libro = titulo+","+author+","+anio+","+est_num+","+est_sec+","+piso+","+edificio+","+sede;
                    libros.set(libros.indexOf(titulo), libro);
                    //guardando los datos actualizados en el fichero
                    for (int i=0; i<libros.size();i+=8)
                        out.println(libros.get(i)+","+libros.get(i+1)+","+libros.get(i+2)+","+libros.get(i+3)+","+libros.get(i+4)+","+libros.get(i+5)+","+libros.get(i+6)+","+libros.get(i+7));

                    //cerrar el fichero
                    out.close();
                    JOptionPane.showMessageDialog(null,"Haz actualizado: "+titulo);
                }
                else
                    JOptionPane.showMessageDialog(null,"Este libro no existe, verifique que el titulo este bien escrito o agrege el libro");
                
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Error al Actualizar el libro");
                }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error con el archivo de registro.");
        }
    }
    
    //METODO IMPRIMIR TODOS LOS LIBROS
     public String printall(){
        String t="";
        //Obtener una lista con los libros y sus datos
        ArrayList<String> books=buscar();
        //recorrer la lista asignando todos los libros de manera organizada
        for(int i=0; i<books.size(); i+=8){
            t+="---------------------------------\n";
            t+="Titulo: "+books.get(i)+"\n";
            t+="Autor: "+books.get(i+1)+"\n";
            t+="Año: "+books.get(i+2)+"\n";
            t+="Estante: "+books.get(i+3)+"\n";
            t+="Seccion: "+books.get(i+4)+"\n";
            t+="Piso: "+books.get(i+5)+"\n";
            t+="Edificio: "+books.get(i+6)+"\n";
            t+="Sede: "+books.get(i+7)+"\n";
        }
        return t;
    }
     
    //METODO ELIMINAR
    public void delete(String titulo){
        Root root = new Root();
        String path = root.path;
        try{
            //Obtener una lista con los libros y sus datos
            ArrayList<String> libros=buscar();
            File file=new File(path);
            try{
                //Si el titulo que se obtuvo del formulario existe en la lista de libros
                if (libros.contains(titulo)){
                    //el archivo se abrirá en modo de reescribir
                    PrintWriter out=new PrintWriter(new FileWriter(file));
                    //Obtener posicion del libro buscado
                    int pos=libros.indexOf(titulo);
                    //mostrar libros
                    //remover los datos del libro
                    //guardando los datos actualizados en el fichero
                    for (int i=0; i<libros.size();i+=8){
                        if (i!=pos) {
                            out.println(libros.get(i) + "," + libros.get(i + 1) + "," + libros.get(i + 2) + "," + libros.get(i + 3) + "," + libros.get(i + 4) + "," + libros.get(i + 5) + "," + libros.get(i + 6) + "," + libros.get(i + 7));
                        }
                    }
                    out.close();
                    JOptionPane.showMessageDialog(null,"Haz eliminado: "+ titulo);
                }
                else
                    JOptionPane.showMessageDialog(null,"El libro ya no existe");
                
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Error al eliminar el libro");
                }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error con el archivo de registro.");
        }
    }

}
