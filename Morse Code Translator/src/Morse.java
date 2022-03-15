import java.io.*;
import java.util.StringTokenizer;

public class Morse {


    public String mensaje = "";
    File archivo = new File("Mensaje.txt");

    public void traductor(String caracter) {

        switch (caracter) {
            case ".-":
                mensaje += "A";
                break;
            case "-...":
                mensaje += "B";
                break;
            case "-.-.":
                mensaje += "C";
                break;
            case "-..":
                mensaje += "D";
                break;
            case ".":
                mensaje += "E";
                break;
            case "..-.":
                mensaje += "F";
                break;
            case "--.":
                mensaje += "G";
                break;
            case "....":
                mensaje += "H";
                break;
            case "..":
                mensaje += "I";
                break;
            case ".---":
                mensaje += "J";
                break;
            case "-.-":
                mensaje += "K";
                break;
            case ".-..":
                mensaje += "L";
                break;
            case "--":
                mensaje += "M";
                break;
            case "-.":
                mensaje += "N";
                break;
            case "---":
                mensaje += "O";
                break;
            case ".--.":
                mensaje += "P";
                break;
            case "--.-":
                mensaje += "Q";
                break;
            case ".-.":
                mensaje += "R";
                break;
            case "...":
                mensaje += "S";
                break;
            case "-":
                mensaje += "T";
                break;
            case "..-":
                mensaje += "U";
                break;
            case "...-":
                mensaje += "V";
                break;
            case ".--":
                mensaje += "W";
                break;
            case "-..-":
                mensaje += "X";
                break;
            case "-.--":
                mensaje += "Y";
                break;
            case "--..":
                mensaje += "Z";
                break;
            case "--..--":
                mensaje += ",";
            case "----....":
                mensaje += " ";

        }

    }

    public void leerArchivo() {
        String caracter;
        try {
            String lineaActual;
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            while ((lineaActual = entrada.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(lineaActual, " ");
                while (tokens.hasMoreTokens()) {
                    caracter = tokens.nextToken();
                    traductor(caracter);
                }
                System.out.println("La traducción del texto es: " + mensaje);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

    }

    public static void main(String[] args) {
        Morse p = new Morse();
        p.leerArchivo();
    }

}
