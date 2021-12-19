
package Proyecto;
/**
 *
 * @author Ale
 */
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Modificar extends JDialog {
   NotadeRemision parent;
   public static JComboBox<String> ComboRopa;
   public static JComboBox<String> ComboUnidadMedida;
   private JLabel IbFoto;
   private JButton btagregar;
   private JButton jButton2;
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JLabel jLabel4;
   private JLabel jLabel5;
   private JLabel jLabel6;
   private JLabel jLabel7;
   private JLabel jLabel9;
   public static JTextField txtImporte;
   public static JTextField txtcantidad;
   public static JTextField txtdescripcion;
   public static JTextField txtprecio;

   public Modificar(NotadeRemision parent, boolean modal) {
      super(parent, modal);
      this.parent = parent;
      this.initComponents();
      this.setIconImage((new ImageIcon(this.getClass().getResource("/Imagenes/icono2.png"))).getImage());
      this.setLocationRelativeTo((Component)null);
   }

   private void initComponents() {
      this.jLabel1 = new JLabel();
      this.jLabel2 = new JLabel();
      this.jLabel3 = new JLabel();
      this.jLabel4 = new JLabel();
      this.jLabel5 = new JLabel();
      this.jLabel6 = new JLabel();
      this.jLabel7 = new JLabel();
      ComboRopa = new JComboBox();
      txtdescripcion = new JTextField();
      txtcantidad = new JTextField();
      ComboUnidadMedida = new JComboBox();
      txtprecio = new JTextField();
      txtImporte = new JTextField();
      this.IbFoto = new JLabel();
      this.btagregar = new JButton();
      this.jButton2 = new JButton();
      this.jLabel9 = new JLabel();
      this.setDefaultCloseOperation(2);
      this.setTitle("Accesorios y vestimentas ");
      this.setMaximumSize(new Dimension(730, 500));
      this.setMinimumSize(new Dimension(730, 500));
      this.setPreferredSize(new Dimension(730, 500));
      this.setResizable(false);
      this.getContentPane().setLayout((LayoutManager)null);
      this.jLabel1.setFont(new Font("Impact", 0, 18));
      this.jLabel1.setText("Modifique las vestimenta ");
      this.getContentPane().add(this.jLabel1);
      this.jLabel1.setBounds(20, 18, 190, 30);
      this.jLabel2.setFont(new Font("Impact", 0, 14));
      this.jLabel2.setText("Clave del Articulo: ");
      this.getContentPane().add(this.jLabel2);
      this.jLabel2.setBounds(330, 60, 120, 30);
      this.jLabel3.setFont(new Font("Impact", 0, 14));
      this.jLabel3.setText("Descripción:");
      this.getContentPane().add(this.jLabel3);
      this.jLabel3.setBounds(330, 102, 120, 30);
      this.jLabel4.setFont(new Font("Impact", 0, 14));
      this.jLabel4.setText("Cantidad: ");
      this.getContentPane().add(this.jLabel4);
      this.jLabel4.setBounds(330, 144, 120, 30);
      this.jLabel5.setFont(new Font("Impact", 0, 14));
      this.jLabel5.setText("Precio Unitario:");
      this.getContentPane().add(this.jLabel5);
      this.jLabel5.setBounds(330, 186, 120, 30);
      this.jLabel6.setFont(new Font("Impact", 0, 14));
      this.jLabel6.setText("Unidad de medida:");
      this.getContentPane().add(this.jLabel6);
      this.jLabel6.setBounds(330, 228, 120, 30);
      this.jLabel7.setFont(new Font("Impact", 0, 14));
      this.jLabel7.setText("Importe:");
      this.getContentPane().add(this.jLabel7);
      this.jLabel7.setBounds(110, 380, 120, 30);
      ComboRopa.setFont(new Font("Comic Sans MS", 0, 12));
      ComboRopa.setModel(new DefaultComboBoxModel(new String[]{"Escoja la clave del Articulo ", "0001: Reloj Hilfiger ", "0002: Chaqueta Cafe ", "0003: Tenis Adidas", "0004: Mochila Negra ", "0005: Traje Negro", "0006: Cartera Café ", "0007: Sudadera blanco y negro ", "0008: Botas Negras ", "0009: Cinturón Negro ", "0010: Pans Negro "}));
      ComboRopa.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Modificar.this.ComboRopaActionPerformed(evt);
         }
      });
      this.getContentPane().add(ComboRopa);
      ComboRopa.setBounds(450, 60, 210, 30);
      txtdescripcion.setEditable(false);
      this.getContentPane().add(txtdescripcion);
      txtdescripcion.setBounds(450, 100, 170, 30);
      this.getContentPane().add(txtcantidad);
      txtcantidad.setBounds(450, 140, 170, 30);
      ComboUnidadMedida.setFont(new Font("Century Schoolbook", 0, 12));
      ComboUnidadMedida.setModel(new DefaultComboBoxModel(new String[]{"Seleccione la unidad de medida ", "Pieza", "Tonelada", "Kilogramos", " ", " "}));
      this.getContentPane().add(ComboUnidadMedida);
      ComboUnidadMedida.setBounds(450, 230, 210, 30);
      txtprecio.addFocusListener(new FocusAdapter() {
         public void focusLost(FocusEvent evt) {
            Modificar.this.txtprecioFocusLost(evt);
         }
      });
      txtprecio.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Modificar.this.txtprecioActionPerformed(evt);
         }
      });
      this.getContentPane().add(txtprecio);
      txtprecio.setBounds(450, 180, 170, 30);
      txtImporte.setEditable(false);
      txtImporte.addFocusListener(new FocusAdapter() {
         public void focusLost(FocusEvent evt) {
            Modificar.this.txtImporteFocusLost(evt);
         }
      });
      this.getContentPane().add(txtImporte);
      txtImporte.setBounds(160, 380, 160, 30);
      this.IbFoto.setBorder(BorderFactory.createBevelBorder(0));
      this.getContentPane().add(this.IbFoto);
      this.IbFoto.setBounds(30, 74, 250, 250);
      this.btagregar.setFont(new Font("Impact", 0, 14));
      this.btagregar.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/agregar.png")));
      this.btagregar.setText("Cambiar");
      this.btagregar.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Modificar.this.btagregarActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.btagregar);
      this.btagregar.setBounds(570, 335, 130, 50);
      this.jButton2.setFont(new Font("Impact", 0, 14));
      this.jButton2.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/atras.jpg")));
      this.jButton2.setText("Regresar ");
      this.jButton2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Modificar.this.jButton2ActionPerformed(evt);
         }
      });
      this.getContentPane().add(this.jButton2);
      this.jButton2.setBounds(570, 400, 130, 50);
      this.jLabel9.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/fondo1.jpg")));
      this.getContentPane().add(this.jLabel9);
      this.jLabel9.setBounds(0, 0, 790, 500);
      this.pack();
   }

   private void ComboRopaActionPerformed(ActionEvent evt) {
      String Ropa = "/Imagenes/00";
      Ropa = Ropa + ComboRopa.getSelectedIndex() + ".jpg";
      int x = ComboRopa.getSelectedItem().toString().length();
      URL url = this.getClass().getResource(Ropa);

      try {
         Image img = ImageIO.read(url);
         this.IbFoto.setIcon(new ImageIcon(img));
         txtdescripcion.setText(ComboRopa.getSelectedItem().toString().substring(6, x));
      } catch (IOException var6) {
         var6.printStackTrace();
      }

   }

   private void txtprecioFocusLost(FocusEvent evt) {
      try {
         double cantidad = Double.parseDouble(txtcantidad.getText());
         double precio = Double.parseDouble(txtprecio.getText());
         double importe = cantidad * precio;
         txtImporte.setText(importe + " ");
      } catch (Exception var9) {
         JOptionPane.showMessageDialog((Component)null, "Escriba solo números");
      }

   }

   private void txtImporteFocusLost(FocusEvent evt) {
   }

   private void btagregarActionPerformed(ActionEvent evt) {
      Object[] Ropa = new Object[]{ComboRopa.getSelectedItem(), txtdescripcion.getText(), txtcantidad.getText(), txtprecio.getText(), ComboUnidadMedida.getSelectedItem(), txtImporte.getText()};
      DefaultTableModel modelo = (DefaultTableModel)NotadeRemision.Tabla.getModel();
      int x = NotadeRemision.Tabla.getSelectedRow();
      NotadeRemision.Tabla.setModel(modelo);
      modelo.addRow(Ropa);
      modelo.removeRow(x);
      double meses = Double.parseDouble(NotadeRemision.txtmeses.getText());
      double Imp = Double.parseDouble(txtImporte.getText());
      double tot = Double.parseDouble(NotadeRemision.txttotal.getText());
      double Iva;
      double total=0;
      double Imp2;
      double Imp3;
      double Subtotal;
      if (meses >= 1.0D) {
         Imp2 = Double.parseDouble(NotadeRemision.txtsubtotal.getText());
         Imp3 = Imp2 + Imp;
         NotadeRemision.txtsubtotal.setText(Imp3 + " ");
         Subtotal = Imp3 / meses;
         NotadeRemision.txtcuota.setText(Subtotal + " ");
         Iva = Double.parseDouble(NotadeRemision.txtsubtotal.getText());
         total = Iva * 0.16D;
         NotadeRemision.txtIVA.setText(total + " ");
         total = total + Iva;
         NotadeRemision.txttotal.setText(total + "");
      } else if (meses == 0.0D) {
         Imp2 = Double.parseDouble(NotadeRemision.txtsubtotal.getText());
         Imp3 = Imp2 + Imp;
         NotadeRemision.txtsubtotal.setText(Imp3 + " ");
         Subtotal = Double.parseDouble(NotadeRemision.txtsubtotal.getText());
         Iva = Subtotal * 0.16D;
         NotadeRemision.txtIVA.setText(Iva + " ");
         total = Iva + Subtotal;
         NotadeRemision.txttotal.setText(total + "");
      }

      txtdescripcion.setText("");
      txtcantidad.setText("");
      txtdescripcion.setText("");
      txtcantidad.setText("");
      txtprecio.setText("");
      ComboUnidadMedida.setSelectedIndex(0);
      txtImporte.setText("");
   }

   private void jButton2ActionPerformed(ActionEvent evt) {
      this.setVisible(false);
   }

   private void txtprecioActionPerformed(ActionEvent evt) {
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
         Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            Productos dialog = new Productos(new NotadeRemision(), true);
            dialog.addWindowListener(new WindowAdapter() {
               public void windowClosing(WindowEvent e) {
                  System.exit(0);
               }
            });
            dialog.setVisible(true);
         }
      });
   }
}
