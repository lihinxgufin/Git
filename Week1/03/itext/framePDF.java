/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itext;

/**
 *
 * @author MS96
 */
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.io.*;
import javax.swing.table.*;
import java.awt.event.*;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;

@SuppressWarnings("serial")
public class framePDF extends JFrame 
{
	private JPanel contentPane;
	private JTable tabel;
	private JButton btnConvert;
	DefaultTableModel tabelModel;
	String movie[] = {"ID Film","Judul","Kategori"};
	Object dataMovie[][] = {{"001","Doraemon","Anak - anak"},
            {"002","Shoot Aoki Densetsu","Semua Umur"},
            {"003","Toy Story 2","Remaja"},
            {"004","Final Fantasy","Remaja"},
            {"005","Captain Tsubasa","Remaja"},
            {"006","Detective Conan","Remaja"},
            {"007","Dragon Ball","Semua Umur"},
            {"008","Go","Anak - anak"}};
	private JLabel lblBg;
	
	public framePDF() 
	{
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 12, 435, 188);
		contentPane.add(scrollPane);
		
		tabelModel = new DefaultTableModel(dataMovie,movie);
		tabel = new JTable();
		tabel.setModel(tabelModel);
		scrollPane.setViewportView(tabel);
		
		btnConvert = new JButton("Simpan sebagai PDF");
		btnConvert.setIcon(new ImageIcon("C:/Users/lenovo/Documents/NetBeansProjects/JavaApplication1/src/image/cetak.png"));
		btnConvert.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent act) 
			{
				try
				{
					int count = tabel.getRowCount();
					Document doc=new Document();
					PdfWriter.getInstance(doc, new FileOutputStream("C:/Users/lenovo/Downloads/Data.pdf"));
					doc.open();
					PdfPTable pdfTable = new PdfPTable(3);
					pdfTable.addCell("ID Film");
					pdfTable.addCell("Judul Film");
					pdfTable.addCell("Kategori");
					for (int a=0;a<count;a++)
					{
						Object obj_0 = getObject(tabel, a, 0);
						Object obj_1 = getObject(tabel, a, 1);
						Object obj_2 = getObject(tabel, a, 2);
						
						String i = obj_0.toString();
						String j = obj_1.toString();
						String k = obj_2.toString();
						
						pdfTable.addCell(i);
						pdfTable.addCell(j);
						pdfTable.addCell(k);
					}
					doc.add(pdfTable);
					doc.close();
					JOptionPane.showMessageDialog(null,"Data berhasil disimpan ke PDF ","Pesan",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("C:/Users/lenovo/Documents/NetBeansProjects/JavaApplication1/src/image/iconDoc.png"));
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
			}
		});
		btnConvert.setBounds(153, 224, 187, 48);
		contentPane.add(btnConvert);
		
		lblBg = new JLabel("");
		lblBg.setIcon(new ImageIcon("C:/Users/lenovo/Documents/NetBeansProjects/JavaApplication1/src/image/bg.jpg"));
		lblBg.setBounds(0, 0, 634, 301);
		contentPane.add(lblBg);
		setLocationRelativeTo(null);
	}
	
	public Object getObject(JTable tabel,int idx_baris,int idx_kolom)
	{
		return tabel.getModel().getValueAt(idx_baris, idx_kolom);
	}

	public static void main(String[] ar) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
					framePDF frame = new framePDF();
					frame.setVisible(true);
				} 
				catch (UnsupportedLookAndFeelException e) {
				} 
				catch (ClassNotFoundException e){
				} 
				catch (InstantiationException e) {
				} 
				catch (IllegalAccessException e) {
				}
			}
		});
	}
}
