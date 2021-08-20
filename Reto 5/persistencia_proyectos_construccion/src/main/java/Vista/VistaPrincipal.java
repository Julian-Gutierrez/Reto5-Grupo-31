package Vista;

import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.*;


public class VistaPrincipal extends JFrame implements ActionListener{

    JButton botonUno = new JButton ("Consulta Uno");
    JButton botonDos = new JButton ("Consulta Dos");
    JButton botonTres = new JButton ("Consulta Tres");

    public VistaPrincipal() throws SQLException{
        initUI();
    }

    private void initUI() throws SQLException{

        setTitle("Proyectos de Construccion");

        JPanel panel = new JPanel();
        
        botonUno.addActionListener(this);
        botonDos.addActionListener(this);
        botonTres.addActionListener(this);

        botonUno.setToolTipText("Proyectos realizados en la ciudad de Bogotá, con ID del proyecto, ciudad,"+
                                "banco vinculado y constructora creadora del proyecto.");
        botonDos.setToolTipText("Lideres con nombre, primer apellido, cargo, ciudad de residencia y con un salario menor o igual a $310 000.");
        botonTres.setToolTipText("Compras No pagadas al proveedor Jumbo especificando la constructora que está relacionada.");
        
        panel.add(botonUno);
        panel.add(botonDos);
        panel.add(botonTres);

        getContentPane().add(panel, BorderLayout.WEST);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(370, 100);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
		if (e.getSource()==botonUno) {
			Requerimiento1 reque;
            try {
                reque = new Requerimiento1();
                reque.mostrar();
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
		}else if (e.getSource()==botonDos) {
			Requerimiento2 reque2;
            try {
                reque2 = new Requerimiento2();
                reque2.mostrar();
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
		}else if (e.getSource()==botonTres) {
			Requerimiento3 reque;
            try {
                reque = new Requerimiento3();
                reque.mostrar();
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
		}
	}
}
