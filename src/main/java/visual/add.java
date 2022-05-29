package visual;

import control.book;
import java.util.Date;



public class add extends javax.swing.JDialog {

    book Book=new book();
    public add(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        datepublic = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        autor = new javax.swing.JTextField();
        author = new javax.swing.JTextField();
        anio = new javax.swing.JTextField();
        est_num = new javax.swing.JTextField();
        est_sec = new javax.swing.JTextField();
        piso = new javax.swing.JTextField();
        edificio = new javax.swing.JTextField();
        sede = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18));
        jLabel1.setText("Agregar libro");

        jLabel2.setText("Titulo");

        jLabel3.setText("Año de publicación");

        jLabel4.setText("Autor");

        jLabel55.setText("Numero de estante");

        jLabel66.setText("Sección");

        jLabel77.setText("Piso");

        jLabel88.setText("Edificio");

        jLabel99.setText("Sede");

        autor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                autorKeyTyped(evt);
            }
        });

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(registrar)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2))
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel88, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel99, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titulo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(datepublic, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(author, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(est_num, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(est_sec, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(piso, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(edificio, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sede, javax.swing.GroupLayout.Alignment.LEADING)
                    ))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datepublic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)
                .addComponent(est_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66)
                .addComponent(est_sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77)
                .addComponent(piso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88)
                .addComponent(edificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99)
                .addComponent(sede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(registrar)
                .addComponent(jButton2))
                .addGap(35, 35, 35))
        );

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {
        String Titulo=titulo.getText().trim(); String Autor = (String) author.getText().trim(); int Est_num= Integer.parseInt((String)est_num.getText().trim()); String Est_sec=(String)est_sec.getText().trim(); int Piso= Integer.parseInt(piso.getText().trim()); String Edificio=(String)edificio.getText().trim(); String Sede=(String)sede.getText().trim();
        int Anio= Integer.parseInt((String)datepublic.getText().trim());
        if(Book.valid(Titulo, Autor, Anio, Est_num, Est_sec, Piso, Edificio, Sede)){
            Book.save(Titulo, Autor, Anio, Est_num, Est_sec, Piso, Edificio, Sede);
        }
        titulo.setText("");
        autor.setText("");
        author.setText("");
        datepublic.setText("");
        est_num.setText("");
        est_sec.setText("");
        piso.setText("");
        edificio.setText("");
        sede.setText("");
    }

    private void tituloKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
        }else{
            evt.consume();
        }
    }

    private void autorKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
        }else{
            evt.consume();
        }
    }

    private javax.swing.JTextField autor;
    private javax.swing.JTextField titulo;
    private javax.swing.JTextField author;
    private javax.swing.JTextField est_num;
    private javax.swing.JTextField anio;
    private javax.swing.JTextField est_sec;
    private javax.swing.JTextField piso;
    private javax.swing.JTextField edificio;
    private javax.swing.JTextField sede;
    private javax.swing.JTextField datepublic;

    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JButton registrar;

}
