import java.io.*;
import java.util.*;

public class SerializarEstudantes<Estudante> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> listaEstudantes) {
        try {
            FileOutputStream fileOut = new FileOutputStream(this.nomeArquivo);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(listaEstudantes);
            objectOut.close();

        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<Estudante> desserializar() {
        try {
            FileInputStream fileInp = new FileInputStream(this.nomeArquivo);
            ObjectInputStream objectInp = new ObjectInputStream(fileInp);

            return (List<Estudante>) objectInp.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");
        }

        return null;
    }
}
