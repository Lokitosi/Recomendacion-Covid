package coronavirusapp;


import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Coronavirus extends JFrame implements ActionListener {

    JButton teclado[];
    int[] contador = new int[6];
    char tipo;
    JButton estadisticas;
    JButton recomendaciones;
    //Crear Ventana
    public Coronavirus() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setBounds(200, 200, 700, 300);
        this.setTitle("recomendaciones Coronavirus");

        JLabel a = new JLabel("¿De que pais viene?");
        a.setBounds(100, 10, 500, 42);
        a.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
        this.add(a);
        // BOTONES
        JPanel panelTeclado = new JPanel();
        panelTeclado.setBounds(10, 80, 660, 100);
        panelTeclado.setLayout(new GridLayout(1, 6));
        teclado = new JButton[6];
        String etiquetas[] = {"China", "Italia", "España", "Francia", "EEUU", "Otro"};

        for (int i = 0; i < teclado.length; i++) {
            teclado[i] = new JButton(etiquetas[i]);
            teclado[i].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
            teclado[i].addActionListener(this);
            panelTeclado.add(teclado[i]);
        }
        this.add(panelTeclado);
        // Botones especiales
        recomendaciones = new JButton("ver recomendaciones");
        recomendaciones.addActionListener(this);
        recomendaciones.setBounds(60, 200, 200, 30);
        this.add(recomendaciones);

        estadisticas = new JButton("Estadisticas");
        estadisticas.addActionListener(this);
        estadisticas.setBounds(420, 200, 200, 30);
        this.add(estadisticas);
    }
    //Ver recomendaciones
    public void verRecomendaciones(char pais) {
        if (pais == '1'){
            String mensajeTodos = "Se debe: \n"
                + "-Lavarse las manos cada 3 horas \n"
                + "-Permanecer aislamiento para no contagiar a los demás\n"
                + "-No tener contacto físico con otras personas\n"
                + "-Utilizar tapabocas\n";
            JOptionPane.showMessageDialog(null, mensajeTodos);
        }else{
            String mensajeOtros = "Se recomienda: "
                + "-Solo salir una persona por núcleo familiar a hacer compras\n"
                + "-Lavarse las manos cada 3 horas\n"
                + "-Sólo salir si es necesario\n"
                + "-Utilizar tapabocas";
            JOptionPane.showMessageDialog(null, mensajeOtros);
        }
    }
    // Ver estadisticas
    public void verEstadisticas(){
        String estadistica = "visitantes de cada pais:\n"
                +"China: "+ contador[0]+"\n"
                +"Italia: "+ contador[1]+"\n"
                +"España: "+ contador[2]+"\n"
                +"Francia: "+ contador[3]+"\n"
                +"EEUU: "+ contador[4]+"\n"
                +"Otros: "+ contador[5]+"\n";
        JOptionPane.showMessageDialog(null, estadistica);
    
    }
    // apartado botones y recolectar usuarios 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(teclado[0])) {
            tipo = '1';
            contador[0] += 1;
            verRecomendaciones(tipo);
            
        }
        if (e.getSource().equals(teclado[1])) {
            tipo = '1';
            contador[1] += 1;
            verRecomendaciones(tipo);
            
        }
        if (e.getSource().equals(teclado[2])) {
            tipo = '1';
            contador[2] += 1;
            verRecomendaciones(tipo);
        }
        if (e.getSource().equals(teclado[3])) {
            tipo = '1';
            contador[3] += 1;
            verRecomendaciones(tipo);
            
        }
        if (e.getSource().equals(teclado[4])) {
            tipo = '1';
            contador[4] += 1;
            verRecomendaciones(tipo);
            
        }
        if (e.getSource().equals(teclado[5])) {
            tipo = '2';
            contador[5] += 1;
            verRecomendaciones(tipo);
            
        }
        if (e.getSource().equals(estadisticas)) {
            verEstadisticas();
        }
        if (e.getSource().equals(recomendaciones)) {
            verRecomendaciones(tipo);
        }
    }
}
