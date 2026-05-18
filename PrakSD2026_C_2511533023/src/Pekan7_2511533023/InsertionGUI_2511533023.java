package Pekan7_2511533023;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InsertionGUI_2511533023 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array_3023;
	private JLabel[] labelArray_3023;
	JButton stepButton_3023;
	private JButton resetButton_3023;
	JButton setButton_3023;
	private JTextField inputField_3023;
	private JPanel panelArray_3023;
	private JTextArea stepArea_3023;
	
	private int i_3023 = 1, j_3023;
	private boolean sorting_3023 =false;
	private int stepCount_3023 = 1;
	

	

	/**
	 * Create the frame.
	 */
	public InsertionGUI_2511533023() {
		setTitle("Isertion Sort Langakh per Langkah");
		setSize(750,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		//panel input
		JPanel inputPanel_3023 = new JPanel(new FlowLayout());
        inputField_3023 = new JTextField(30);
        setButton_3023 = new JButton("Set Array");
        
        inputPanel_3023.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
        inputPanel_3023.add(inputField_3023);
        inputPanel_3023.add(setButton_3023);
        
     // Panel array visual
        panelArray_3023 = new JPanel();
        panelArray_3023.setLayout(new FlowLayout());
        
     // Panel kontrol
        JPanel controlPanel_3023 = new JPanel();
        stepButton_3023 = new JButton ("Langkah Selanjutnya ");
        resetButton_3023 = new JButton ("Reset");
        stepButton_3023.setEnabled(false);
        controlPanel_3023.add(stepButton_3023);
        controlPanel_3023.add(resetButton_3023);
        
     // Area teks untuk log langkah-langkah
        stepArea_3023 = new JTextArea(8, 60);
        stepArea_3023.setEditable(false);
        stepArea_3023.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(stepArea_3023);

        // Tambahkan panel ke frame
        add(inputPanel_3023, BorderLayout.NORTH);
        add(panelArray_3023, BorderLayout.CENTER);
        add(controlPanel_3023, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.EAST);

        // Event Set Array
        setButton_3023.addActionListener(e -> setArrayFromInput());
        stepButton_3023.addActionListener(e -> performStep());
        resetButton_3023.addActionListener(e -> reset());
       

	}
	private void setArrayFromInput() {
	    String text = inputField_3023.getText().trim();
	    if (text.isEmpty()) return;
	    String[] parts = text.split(",");
	    array_3023 = new int[parts.length];
	    try {
	        for (int k_3023 = 0; k_3023 < parts.length; k_3023++) {
	            array_3023[k_3023] = Integer.parseInt(parts[k_3023].trim());    }
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan "
	            + "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
	        return;    }
	    i_3023 = 1;
	    stepCount_3023 = 1;
	    sorting_3023 = true;
	    stepButton_3023.setEnabled(true);
	    stepArea_3023.setText("");
	    panelArray_3023.removeAll();
	    labelArray_3023 = new JLabel[array_3023.length];
	    for (int k_3023 = 0; k_3023 < array_3023.length; k_3023++) {
	        labelArray_3023[k_3023] = new JLabel(String.valueOf(array_3023[k_3023]));
	        labelArray_3023[k_3023].setFont(new Font("Arial", Font.BOLD, 24));
	        labelArray_3023[k_3023].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	        labelArray_3023[k_3023].setPreferredSize(new Dimension(50, 50));
	        labelArray_3023[k_3023].setHorizontalAlignment(SwingConstants.CENTER);
	        panelArray_3023.add(labelArray_3023[k_3023]);
	    }
	    panelArray_3023.revalidate();
	    panelArray_3023.repaint();
	}
	private void performStep() {
	    if (i_3023 < array_3023.length && sorting_3023) {
	        int key_3023 = array_3023[i_3023];
	        j_3023 = i_3023 - 1;

	        StringBuilder stepLog_3023 = new StringBuilder();
	        stepLog_3023.append("Langkah ").append(stepCount_3023).
	        append(": Memasukkan ").append(key_3023).append("\n");

	        while (j_3023 >= 0 && array_3023[j_3023] > key_3023) {
	            array_3023[j_3023 + 1] = array_3023[j_3023];
	            j_3023--;
	        }
	        array_3023[j_3023 + 1] = key_3023;

	        updateLabels();
	        stepLog_3023.append("Hasil: ").append(arrayToString(array_3023)).append("\n\n");
	        stepArea_3023.append(stepLog_3023.toString());

	        i_3023++;
	        stepCount_3023++;

	        if (i_3023 == array_3023.length) {
	            sorting_3023 = false;
	            stepButton_3023.setEnabled(false);
	            JOptionPane.showMessageDialog(this, "Sorting selesai!");
	        }
	    }
	}    
	        private void updateLabels() {
	            for (int k_3023 = 0; k_3023 < array_3023.length; k_3023++) {
	                labelArray_3023[k_3023].setText(String.valueOf(array_3023[k_3023]));
	            }
	        }

	        private void reset() {
	            inputField_3023.setText("");
	            panelArray_3023.removeAll();
	            panelArray_3023.revalidate();
	            panelArray_3023.repaint();
	            stepArea_3023.setText("");
	            stepButton_3023.setEnabled(false);
	            sorting_3023 = false;
	            i_3023 = 1;
	            stepCount_3023 = 1;
	        }

	        private String arrayToString(int[] arr) {
	            StringBuilder sb_3023 = new StringBuilder();
	            for (int k_3023 = 0; k_3023 < arr.length; k_3023++) {
	                sb_3023.append(arr[k_3023]);
	                if (k_3023 < arr.length - 1) sb_3023.append(", ");
	            }
	            return sb_3023.toString();
	        }
	    }
	



