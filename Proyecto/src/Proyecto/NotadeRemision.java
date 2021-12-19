
package Proyecto;
/**
 *
 * @author Ale
 */ 
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;
import java.net.URL;

public class NotadeRemision extends JFrame implements Printable {
   DefaultTableModel modelo = new DefaultTableModel();
   public Productos ventana = new Productos(this, true);
   public Modificar ventanita = new Modificar(this, true);
   public static JComboBox<String> ComboPlazo;
   private JLabel LjFondo;
   public static JTable Tabla;
   private JButton btnagregar;
   private JButton btnborrar;
   private JButton btnimprimir;
   private JButton btnmodificar;
   private JButton btnsalir;
   private ButtonGroup buttonGroup1;
   protected static transient JComboBox<String> comobocomprador;
   private JLabel jLabel1;
   private JLabel jLabel10;
   private JLabel jLabel11;
   private JLabel jLabel12;
   private JLabel jLabel13;
   private JLabel jLabel15;
   private JLabel jLabel16;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JLabel jLabel4;
   private JLabel jLabel5;
   private JLabel jLabel6;
   private JLabel jLabel7;
   private JLabel jLabel8;
   protected static JRadioButton jRadioButton1;
   public static JRadioButton jRadioButton2;
   private JScrollPane jScrollPane1;
   public static JTextField jTextField1;
   protected static JTextField jTextField2;
   private JLabel lbfoto1;
   public static JFormattedTextField txtFecha;
   public static JTextField txtIVA;
   protected static JFormattedTextField txtRFC;
   public static JTextField txtcuota;
   protected static JTextField txtmeses;
   protected static JTextField txtsubtotal;
   protected static JFormattedTextField txttelefono;
   public static JTextField txttotal;


   private void initComponents() {
      this.buttonGroup1 = new ButtonGroup();
      this.jLabel2 = new JLabel();
      this.jLabel3 = new JLabel();
      this.jLabel4 = new JLabel();
      this.jLabel6 = new JLabel();
      this.jLabel8 = new JLabel();
      this.jLabel5 = new JLabel();
      this.jLabel7 = new JLabel();
      this.jLabel10 = new JLabel();
      this.jLabel1 = new JLabel();
      jTextField1 = new JTextField();
      comobocomprador = new JComboBox();
      jTextField2 = new JTextField();
      txtRFC = new JFormattedTextField();
      txttelefono = new JFormattedTextField();
      txtFecha = new JFormattedTextField();
      ComboPlazo = new JComboBox();
      this.lbfoto1 = new JLabel();
      this.btnagregar = new JButton();
      this.btnmodificar = new JButton();
      this.btnborrar = new JButton();
      this.btnimprimir = new JButton();
      this.btnsalir = new JButton();
      jRadioButton1 = new JRadioButton();
      jRadioButton2 = new JRadioButton();
      txtmeses = new JTextField();
      txtcuota = new JTextField();
      txtsubtotal = new JTextField();
      txtIVA = new JTextField();
      txttotal = new JTextField();
      this.jLabel15 = new JLabel();
      this.jLabel16 = new JLabel();
      this.jLabel11 = new JLabel();
      this.jLabel12 = new JLabel();
      this.jLabel13 = new JLabel();
      this.jScrollPane1 = new JScrollPane();
      Tabla = new JTable();
      this.LjFondo = new JLabel();
      this.setDefaultCloseOperation(3);
      this.setTitle("Bazar JABP ");
      this.setMaximumSize(new Dimension(1300, 670));
      this.setMinimumSize(new Dimension(1300, 670));
      this.setPreferredSize(new Dimension(1300, 670));
      this.setResizable(false);
      this.getContentPane().setLayout((LayoutManager)null);
      this.jLabel2.setFont(new Font("Comic Sans MS", 1, 16));
      this.jLabel2.setText("Número de Nota:");
      this.getContentPane().add(this.jLabel2);
      this.jLabel2.setBounds(924, 10, 150, 46);
      this.jLabel3.setFont(new Font("Comic Sans MS", 1, 15));
      this.jLabel3.setText("Nombre del la tienda:");
      this.getContentPane().add(this.jLabel3);
      this.jLabel3.setBounds(15, 60, 300, 312);
      this.jLabel4.setFont(new Font("Comic Sans MS", 1, 15));
      this.jLabel4.setText("Dirección:");
      this.getContentPane().add(this.jLabel4);
      this.jLabel4.setBounds(54, 65, 100, 20);
      this.jLabel6.setFont(new Font("Comic Sans MS", 1, 15));
      this.jLabel6.setText("RFC:");
      this.getContentPane().add(this.jLabel6);
      this.jLabel6.setBounds(370, 95, 50, 30);
      this.jLabel8.setFont(new Font("Comic Sans MS", 1, 15));
      this.jLabel8.setText("Condiciones: ");
      this.getContentPane().add(this.jLabel8);
      this.jLabel8.setBounds(785, 110, 100, 30);
      this.jLabel5.setFont(new Font("Comic Sans MS", 1, 15));
      this.jLabel5.setText("Telefono:");
      this.getContentPane().add(this.jLabel5);
      this.jLabel5.setBounds(60, 146, 105, 20);
      this.jLabel7.setFont(new Font("Comic Sans MS", 1, 15));
      this.jLabel7.setText("Fecha (DD/MM/AAAA):");
      this.getContentPane().add(this.jLabel7);
      this.jLabel7.setBounds(20, 300, 240, 30);
      this.jLabel10.setFont(new Font("Comic Sans MS", 1, 15));
      this.jLabel10.setText("Credito:");
      this.getContentPane().add(this.jLabel10);
      this.jLabel10.setBounds(9996, 70, 90, 30);
      this.jLabel1.setFont(new Font("Impact", 0, 28));
      this.jLabel1.setText("NOTA DE REMISIÓN ");
      this.getContentPane().add(this.jLabel1);
      this.jLabel1.setBounds(528, 10, 250, 40);
      jTextField1.setFont(new Font("Comic Sans MS", 0, 15));
      this.getContentPane().add(jTextField1);
      jTextField1.setBounds(1060, 20, 90, 30);
      comobocomprador.setFont(new Font("Comic Sans MS", 0, 15));
      comobocomprador.setModel(new DefaultComboBoxModel(new String[]{"Escoja la tienda ", "Cuidado con el perro", "Bershka", "Zara", "Lefties", "H&M", " ", " "}));
      comobocomprador.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            NotadeRemision.this.comobocompradorActionPerformed(evt);
         }
      });
      this.getContentPane().add(comobocomprador);
      comobocomprador.setBounds(111, 229, 180, 30);
      jTextField2.setFont(new Font("Comic Sans MS", 0, 12));
      this.getContentPane().add(jTextField2);
      jTextField2.setBounds(126, 58, 180, 30);

      try {
         txtRFC.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("AAAA#######H#")));
      } catch (ParseException var4) {
         var4.printStackTrace();
      }

      txtRFC.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            NotadeRemision.this.txtRFCActionPerformed(evt);
         }
      });
      this.getContentPane().add(txtRFC);
      txtRFC.setBounds(405, 96, 180, 30);

      try {
         txttelefono.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("(##)-##-####-####")));
      } catch (ParseException var3) {
         var3.printStackTrace();
      }

      txttelefono.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            NotadeRemision.this.txttelefonoActionPerformed(evt);
         }
      });
      this.getContentPane().add(txttelefono);
      txttelefono.setBounds(125, 140, 180, 30);

      try {
         txtFecha.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##/####")));
      } catch (ParseException var2) {
         var2.printStackTrace();
      }

      txtFecha.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            NotadeRemision.this.txtFechaActionPerformed(evt);
         }
      });
      this.getContentPane().add(txtFecha);
      txtFecha.setBounds(111, 330, 180, 30);
      ComboPlazo.setFont(new Font("Comic Sans MS", 0, 12));
      ComboPlazo.setModel(new DefaultComboBoxModel(new String[]{"Elija los meses ", "4 meses", "8 meses", "12 meses"}));
      ComboPlazo.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            NotadeRemision.this.ComboPlazoActionPerformed(evt);
         }
      });
      this.getContentPane().add(ComboPlazo);
      ComboPlazo.setBounds(1050, 70, 180, 30);
      this.lbfoto1.setBorder(BorderFactory.createBevelBorder(0));
      this.getContentPane().add(this.lbfoto1);
      this.lbfoto1.setBounds(300, 200, 255, 180);
      this.btnagregar.setBackground(new Color(175, 255, 255));
      this.btnagregar.setFont(new Font("Comic Sans MS", 0, 12));
      this.btnagregar.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/agregar.png")));
      this.btnagregar.setText("Agregar ");
      this.btnagregar.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            NotadeRemision.this.btnagregarActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.btnagregar);
      this.btnagregar.setBounds(100, 540, 135, 70);
      this.btnmodificar.setBackground(new Color(175, 255, 255));
      this.btnmodificar.setFont(new Font("Comic Sans MS", 0, 12));
      this.btnmodificar.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/modificar.png")));
      this.btnmodificar.setText("Modificar ");
      this.btnmodificar.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            NotadeRemision.this.btnmodificarActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.btnmodificar);
      this.btnmodificar.setBounds(337, 540, 135, 70);
      this.btnborrar.setBackground(new Color(175, 255, 255));
      this.btnborrar.setFont(new Font("Comic Sans MS", 0, 12));
      this.btnborrar.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/borrar.png")));
      this.btnborrar.setText("Borrar");
      this.btnborrar.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            NotadeRemision.this.btnborrarActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.btnborrar);
      this.btnborrar.setBounds(580, 540, 135, 70);
      this.btnimprimir.setBackground(new Color(175, 255, 255));
      this.btnimprimir.setFont(new Font("Comic Sans MS", 0, 12));
      this.btnimprimir.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/imprimir.png")));
      this.btnimprimir.setText("Imprimir ");
      this.btnimprimir.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            NotadeRemision.this.btnimprimirActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.btnimprimir);
      this.btnimprimir.setBounds(817, 540, 135, 70);
      this.btnsalir.setBackground(new Color(175, 255, 255));
      this.btnsalir.setFont(new Font("Comic Sans MS", 0, 12));
      this.btnsalir.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/salir.png")));
      this.btnsalir.setText("Salir ");
      this.btnsalir.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            NotadeRemision.this.btnsalirActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.btnsalir);
      this.btnsalir.setBounds(1050, 540, 135, 70);
      this.buttonGroup1.add(jRadioButton1);
      jRadioButton1.setFont(new Font("Comic Sans MS", 0, 12));
      jRadioButton1.setText("Contado");
      jRadioButton1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            NotadeRemision.this.jRadioButton1ActionPerformed(evt);
         }
      });
      this.getContentPane().add(jRadioButton1);
      jRadioButton1.setBounds(885, 144, 90, 25);
      this.buttonGroup1.add(jRadioButton2);
      jRadioButton2.setFont(new Font("Comic Sans MS", 0, 12));
      jRadioButton2.setText("Credito");
      jRadioButton2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            NotadeRemision.this.jRadioButton2ActionPerformed(evt);
         }
      });
      this.getContentPane().add(jRadioButton2);
      jRadioButton2.setBounds(775, 144, 80, 25);
      txtmeses.setEditable(false);
      txtmeses.setFont(new Font("Comic Sans MS", 0, 12));
      txtmeses.setText("0");
      txtmeses.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            NotadeRemision.this.txtmesesActionPerformed(evt);
         }
      });
      this.getContentPane().add(txtmeses);
      txtmeses.setBounds(210, 480, 130, 30);
      txtcuota.setEditable(false);
      txtcuota.setFont(new Font("Comic Sans MS", 0, 12));
      this.getContentPane().add(txtcuota);
      txtcuota.setBounds(490, 480, 100, 30);
      txtsubtotal.setEditable(false);
      txtsubtotal.setFont(new Font("Comic Sans MS", 0, 12));
      this.getContentPane().add(txtsubtotal);
      txtsubtotal.setBounds(921, 480, 100, 30);
      txtIVA.setEditable(false);
      txtIVA.setFont(new Font("Comic Sans MS", 0, 12));
      this.getContentPane().add(txtIVA);
      txtIVA.setBounds(700, 480, 100, 30);
      txttotal.setEditable(false);
      txttotal.setFont(new Font("Comic Sans MS", 0, 12));
      txttotal.setText("0");
      txttotal.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            NotadeRemision.this.txttotalActionPerformed(evt);
         }
      });
      this.getContentPane().add(txttotal);
      txttotal.setBounds(1111, 480, 100, 30);
      this.jLabel15.setFont(new Font("Comic Sans MS", 1, 12));
      this.jLabel15.setText("Meses Seleccionados: ");
      this.getContentPane().add(this.jLabel15);
      this.jLabel15.setBounds(70, 480, 140, 30);
      this.jLabel16.setFont(new Font("Comic Sans MS", 1, 12));
      this.jLabel16.setText("Cuota por mes: ");
      this.getContentPane().add(this.jLabel16);
      this.jLabel16.setBounds(390, 480, 100, 30);
      this.jLabel11.setFont(new Font("Comic Sans MS", 1, 12));
      this.jLabel11.setText("Subtotal:");
      this.getContentPane().add(this.jLabel11);
      this.jLabel11.setBounds(860, 480, 70, 30);
      this.jLabel12.setFont(new Font("Comic Sans MS", 1, 12));
      this.jLabel12.setText("IVA 16%:");
      this.getContentPane().add(this.jLabel12);
      this.jLabel12.setBounds(637, 480, 100, 30);
      this.jLabel13.setFont(new Font("Comic Sans MS", 1, 12));
      this.jLabel13.setText("Total: ");
      this.getContentPane().add(this.jLabel13);
      this.jLabel13.setBounds(1072, 480, 50, 30);
      Tabla.setFont(new Font("Impact", 0, 12));
      Tabla.setModel(this.modelo);
      this.jScrollPane1.setViewportView(Tabla);
      this.getContentPane().add(this.jScrollPane1);
      this.jScrollPane1.setBounds(558, 195, 722, 270);
      this.LjFondo.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/fondo.jpg")));
      this.getContentPane().add(this.LjFondo);
      this.LjFondo.setBounds(0, 0, 1400, 630);
      this.pack();
   }
   public NotadeRemision() {
      this.initComponents();
      ComboPlazo.disable();
      this.setIconImage((new ImageIcon(this.getClass().getResource("/Imagenes/icono1.jpg"))).getImage());
      this.setLocationRelativeTo((Component)null);
      Tabla.setModel(this.modelo);
      this.modelo.addColumn("Codigo del Articulo ");
      this.modelo.addColumn("Descripción del Articulo");
      this.modelo.addColumn("Cantidad");
      this.modelo.addColumn("Precio Unitario");
      this.modelo.addColumn("Unidad de Medida");
      this.modelo.addColumn("Importe");
   }
   private void comobocompradorActionPerformed(ActionEvent evt) {
      String comprador = "/Imagenes/01";
      comprador = comprador + comobocomprador.getSelectedIndex() + ".png";
      int x = comobocomprador.getSelectedItem().toString().length();
      URL url = this.getClass().getResource(comprador);

      try {
         Image img = ImageIO.read(url);
         this.lbfoto1.setIcon(new ImageIcon(img));
      } catch (IOException var6) {
         var6.printStackTrace();
      }

   }

   private void txtRFCActionPerformed(ActionEvent evt) {
   }

   private void txttelefonoActionPerformed(ActionEvent evt) {
   }

   private void txtFechaActionPerformed(ActionEvent evt) {
   }

   private void btnagregarActionPerformed(ActionEvent evt) {
      this.ventana.setVisible(true);
   }

   private void btnmodificarActionPerformed(ActionEvent evt) {
      DefaultTableModel modelo = (DefaultTableModel)Tabla.getModel();
      int x = Tabla.getSelectedRow();
      if (x < 0) {
         JOptionPane.showMessageDialog((Component)null, "Escoja la fila a modificar");
      } else {
         this.ventanita.setVisible(true);
      }

   }

   private void btnborrarActionPerformed(ActionEvent evt) {
      DefaultTableModel modelo = (DefaultTableModel)Tabla.getModel();
      int x = Tabla.getSelectedRow();
      if (x < 0) {
         JOptionPane.showMessageDialog((Component)null, "Seleccione la fila a eliminar");
      } else {
         modelo.removeRow(x);
      }

   }

   private void btnimprimirActionPerformed(ActionEvent evt) {
      PrinterJob job = PrinterJob.getPrinterJob();
      job.setPrintable(this);
      if (job.printDialog()) {
         try {
            job.print();
         } catch (PrinterException var4) {
         }
      } else {
         JOptionPane.showMessageDialog(this, "Se a cancelado la impresión");
      }

   }

   private void btnCalActionPerformed(ActionEvent evt) {
   }

   private void btnsalirActionPerformed(ActionEvent evt) {
      this.dispose();
   }

   private void txttotalActionPerformed(ActionEvent evt) {
   }

   private void jRadioButton2ActionPerformed(ActionEvent evt) {
      if (jRadioButton2.isSelected()) {
         ComboPlazo.enable();
      }

   }

   private void ComboPlazoActionPerformed(ActionEvent evt) {
      int indice = ComboPlazo.getSelectedIndex();
      if (indice == 1) {
         txtmeses.setText("4");
      } else if (indice == 2) {
         txtmeses.setText("8");
      } else if (indice == 3) {
         txtmeses.setText("12");
      } else if (indice == 0) {
         txtmeses.setText("No a seleccionado ningún mes");
      }

   }

   private void jRadioButton1ActionPerformed(ActionEvent evt) {
      if (jRadioButton1.isSelected()) {
         ComboPlazo.disable();
      }

   }

   private void txtmesesActionPerformed(ActionEvent evt) {
   }

   public static void main(String[] args) { 
      try {
         LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            LookAndFeelInfo info = var1[var3];
            if ("Nimbus".equals(info.getName())) {
               UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException var5) {
         Logger.getLogger(NotadeRemision.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(NotadeRemision.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(NotadeRemision.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(NotadeRemision.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            (new NotadeRemision()).setVisible(true);
         }
      });
   }

   public int print(Graphics grphcs, PageFormat pf, int pageIndex) throws PrinterException {
      if (pageIndex == 0) {
         Graphics2D graphics2d = (Graphics2D)grphcs;
         graphics2d.translate(pf.getImageableX(), pf.getImageableY());
         this.printAll(graphics2d);
         return 0;
      } else {
         return 1;
      }
   }
}
