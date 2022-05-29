package visual;
import control.book;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;


public class eliminar extends javax.swing.JDialog {
    book Book=new book();

    public eliminar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ArrayList<String> lista =Book.buscar();
        ArrayList<String> tit=new ArrayList<String>();
        for(int i=0; i<lista.size();i++){
            if (i%8==0) {
                tit.add(lista.get(i));
            }
        }
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new Vector<String>(tit)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel1.setText("Eliminar libro");

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Elija un titulo a eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String cmb=(String)jComboBox1.getSelectedItem(), text="Esta seguro de que desara eliminar el titulo "+cmb+" de forma permanente?";
        int r=JOptionPane.showConfirmDialog(null, text,"Confirmación",JOptionPane.YES_NO_OPTION);
        if(r==JOptionPane.YES_OPTION){
            Book.delete(cmb);
            ArrayList<String> lista =Book.buscar();
            ArrayList<String> tit=new ArrayList<String>();
            for(int i=0; i<lista.size();i++){
                if (i%8==0 && lista.get(i)!=cmb) {
                    tit.add(lista.get(i));
                }
            }
            // actualizar combo
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new Vector<String>(tit)));
        }
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;

}
