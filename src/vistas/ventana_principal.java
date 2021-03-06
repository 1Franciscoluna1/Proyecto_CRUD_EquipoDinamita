
package vistas;
import logica.Articulo;
import basedatos.bd;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ventana_principal extends javax.swing.JFrame {
    
    bd bd = null;//instanciamos el objeto de la base de datos en null
    carrito vtncarrito = null;//instanciamos la ventana del carrito en null
    Articulo articulos = new Articulo();//instanciamos la clase articulo en null
    int cont=0, ID_Compra ; //estas seran variables que se usaran mas delante para el control de la ventana
    String pedido="";//En una fase previa del proyecto el pedido se mostraba con un string, ***en des-uso***
    DefaultTableModel modeloTicket=null;//instanciamos el modelo de la tabla en null
    double total=0;//variable de la ventana para mostrar el total
    
    public ventana_principal() {//Inicio del constructor de la ventana principal
        bd = new bd();      //se asigna el new de la base de datos
        modeloTicket = new DefaultTableModel(); //se asigna el new al modelo ticket
        initComponents();      //inicializa los componentes de la ventana
        bd.abrir_conexion();    //abre la conexxion con la base de datos
        crear_modelo_Ticket();  //Crea un modelo vacia solamente con el nombre de las columnas
        table_ticket.setModel(modeloTicket);    //le asigna el modelo creado a la tabla de la ventana
        ID_Compra = bd.obtener_ID();    //Va y busca el numero de tiket mayor en la base de datos, si ya fue cerrado brinca al siguiente
                                        //si no se queda en el maximo para seguir comprando
        bd.cerrar_conexion();      //cierra la conexion con la base de datos
        ver_pedido();       //en base al numero de ticket, muestra en la tabla los articulos que estan relacionados con ese ticket
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carrito = new javax.swing.JButton();
        opciones = new javax.swing.JTabbedPane();
        ScrollPane_inicio = new javax.swing.JScrollPane();
        inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ScrollPanequesos = new javax.swing.JScrollPane();
        Quesos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblQuesoSinLactosa = new javax.swing.JLabel();
        lblPrecioQuesoSinLactosa = new javax.swing.JLabel();
        btnA??adirQuesoSNL = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cbQuesoSNL = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbq2 = new javax.swing.JComboBox<>();
        bq2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbq3 = new javax.swing.JComboBox<>();
        bq3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbq4 = new javax.swing.JComboBox<>();
        bq4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtQuesoSinLactosa = new javax.swing.JTextArea();
        lblTituloQuesoSinLactosa = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        ScrollPaneaccesorios = new javax.swing.JScrollPane();
        accesorios = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        cbacc2 = new javax.swing.JComboBox<>();
        bacc1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        cbacc1 = new javax.swing.JComboBox<>();
        bacc2 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        cbacc3 = new javax.swing.JComboBox<>();
        bacc3 = new javax.swing.JButton();
        bacc4 = new javax.swing.JButton();
        cbacc4 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        ScrollPane_alacena = new javax.swing.JScrollPane();
        alacena = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ba1 = new javax.swing.JButton();
        cba1 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        cba2 = new javax.swing.JComboBox<>();
        ba2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        cba3 = new javax.swing.JComboBox<>();
        ba3 = new javax.swing.JButton();
        ba4 = new javax.swing.JButton();
        cba4 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        lblQuesabor = new javax.swing.JLabel();
        Lbltotal = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ticket = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        carrito.setBackground(new java.awt.Color(245, 242, 242));
        carrito.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        carrito.setForeground(new java.awt.Color(102, 102, 0));
        carrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compras.jpg"))); // NOI18N
        carrito.setText("Shopping bag");
        carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritoActionPerformed(evt);
            }
        });

        inicio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 0));
        jLabel1.setText("QUE SABOR.");

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 3, 36)); // NOI18N
        jLabel2.setText("De mazamitla a tu casa.");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicio.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de pantalla 2022-05-22 184455.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/a.jpg"))); // NOI18N

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel2))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(39, 39, 39))
        );

        ScrollPane_inicio.setViewportView(inicio);

        opciones.addTab("Inicio", ScrollPane_inicio);

        Quesos.setBackground(new java.awt.Color(255, 255, 255));

        lblQuesoSinLactosa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.jpg"))); // NOI18N

        lblPrecioQuesoSinLactosa.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblPrecioQuesoSinLactosa.setForeground(new java.awt.Color(153, 153, 0));
        lblPrecioQuesoSinLactosa.setText("$176.00 MX");

        btnA??adirQuesoSNL.setBackground(new java.awt.Color(153, 153, 0));
        btnA??adirQuesoSNL.setForeground(new java.awt.Color(255, 255, 255));
        btnA??adirQuesoSNL.setText("A??adir");
        btnA??adirQuesoSNL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA??adirQuesoSNLActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.jpg"))); // NOI18N

        cbQuesoSNL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 0));
        jLabel10.setText("$184.00 MX");

        cbq2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        bq2.setBackground(new java.awt.Color(153, 153, 0));
        bq2.setForeground(new java.awt.Color(255, 255, 255));
        bq2.setText("A??adir");
        bq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bq2ActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3.jpg"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 0));
        jLabel12.setText("$90.00 MX");

        cbq3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        bq3.setBackground(new java.awt.Color(153, 153, 0));
        bq3.setForeground(new java.awt.Color(255, 255, 255));
        bq3.setText("A??adir");
        bq3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bq3ActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4.jpg"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 0));
        jLabel14.setText("$144.00 MX");

        cbq4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbq4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbq4ActionPerformed(evt);
            }
        });

        bq4.setBackground(new java.awt.Color(153, 153, 0));
        bq4.setForeground(new java.awt.Color(255, 255, 255));
        bq4.setText("A??adir");
        bq4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bq4ActionPerformed(evt);
            }
        });

        txtQuesoSinLactosa.setColumns(20);
        txtQuesoSinLactosa.setRows(5);
        txtQuesoSinLactosa.setText("Perfecto para intolerantes  a la lactosa que le gustan los \nquesos suaves,pero con sabor. Se enviara un regalo, \nuna quesea reutilizable en todo los pedidos que \ncontengan un producto sin lactosa");
        txtQuesoSinLactosa.setBorder(null);
        jScrollPane2.setViewportView(txtQuesoSinLactosa);

        lblTituloQuesoSinLactosa.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblTituloQuesoSinLactosa.setText("Queso de Oveja tierno sin lactosa ");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Queso  tierno con leche pasteurizada y sin lactosa .  \nTotalmente natural y con todo el sabor .Se enviara un \nregalo, una quesea reutilizable en todo los pedidos que \ncontengan un producto sin lactosa");
        jScrollPane3.setViewportView(jTextArea1);

        jLabel8.setText("Queso de oveja tierno sin lactosa con pimienta rosa");

        jLabel29.setText("Requeson");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Quien iba a decir que el suero resultante del queso \npodria salir de esta delicia??\nel requeson se deriva del suero lactico y solo podemos \ndecir una cosa , Esta buenisimo!!.\nsin nungun tipo de procesado ,sin conservantes , \nsin secretos , es un requeso natural , como el de toda la \nvida  ");
        jScrollPane4.setViewportView(jTextArea2);

        jLabel7.setText("Queso de Oveja tierno en Aceite Quesalado");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Date un capricho con este tarro de queso tierno cortado \n en dados con acite de oliva virgen extra??a. Cien gramos \nde queso pensados para comerlos en familia y amigos \n,envasadi en el tarro de cristal. \nSin complicaciones, solo abrir y servir.\nDura 2 meses ,Formato de 100g ");
        jScrollPane5.setViewportView(jTextArea3);

        javax.swing.GroupLayout QuesosLayout = new javax.swing.GroupLayout(Quesos);
        Quesos.setLayout(QuesosLayout);
        QuesosLayout.setHorizontalGroup(
            QuesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuesosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(QuesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuesosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(986, Short.MAX_VALUE))
                    .addGroup(QuesosLayout.createSequentialGroup()
                        .addGroup(QuesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, QuesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(QuesosLayout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(lblQuesoSinLactosa, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(QuesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(QuesosLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane2))
                                        .addGroup(QuesosLayout.createSequentialGroup()
                                            .addGap(19, 19, 19)
                                            .addComponent(lblTituloQuesoSinLactosa, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(QuesosLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(QuesosLayout.createSequentialGroup()
                                .addGroup(QuesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(QuesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(QuesosLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(QuesosLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(QuesosLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(QuesosLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(QuesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrecioQuesoSinLactosa)
                            .addComponent(cbQuesoSNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(cbq2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(cbq4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bq4)
                            .addComponent(btnA??adirQuesoSNL)
                            .addComponent(bq2)
                            .addGroup(QuesosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbq3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12)
                            .addComponent(bq3))
                        .addGap(402, 402, Short.MAX_VALUE))))
        );
        QuesosLayout.setVerticalGroup(
            QuesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuesosLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel6)
                .addGroup(QuesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(QuesosLayout.createSequentialGroup()
                        .addGroup(QuesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(QuesosLayout.createSequentialGroup()
                                .addGroup(QuesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(QuesosLayout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(lblPrecioQuesoSinLactosa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbQuesoSNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(btnA??adirQuesoSNL))
                                    .addGroup(QuesosLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(lblTituloQuesoSinLactosa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(75, 75, 75)
                                .addComponent(jLabel8)
                                .addGroup(QuesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(QuesosLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbq2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bq2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuesosLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(QuesosLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lblQuesoSinLactosa)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel9)))
                        .addGroup(QuesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(QuesosLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel11))
                            .addGroup(QuesosLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbq3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(bq3))))
                    .addGroup(QuesosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(QuesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuesosLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuesosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(QuesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuesosLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuesosLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbq4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bq4)
                                .addGap(33, 33, 33)))))
                .addGap(102, 102, 102))
        );

        ScrollPanequesos.setViewportView(Quesos);

        opciones.addTab("Quesos", ScrollPanequesos);

        accesorios.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ACC.jpg"))); // NOI18N

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/8.jpg"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 0));
        jLabel25.setText("$200.00 MXN");

        cbacc2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        bacc1.setBackground(new java.awt.Color(153, 153, 0));
        bacc1.setForeground(new java.awt.Color(255, 255, 255));
        bacc1.setText("A??adir");
        bacc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bacc1ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 0));
        jLabel26.setText("$638.00 MXN");

        cbacc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        bacc2.setBackground(new java.awt.Color(153, 153, 0));
        bacc2.setForeground(new java.awt.Color(255, 255, 255));
        bacc2.setText("A??adir");
        bacc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bacc2ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 153, 0));
        jLabel27.setText("$398.00 MXN");

        cbacc3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        bacc3.setBackground(new java.awt.Color(153, 153, 0));
        bacc3.setForeground(new java.awt.Color(255, 255, 255));
        bacc3.setText("A??adir");
        bacc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bacc3ActionPerformed(evt);
            }
        });

        bacc4.setBackground(new java.awt.Color(153, 153, 0));
        bacc4.setForeground(new java.awt.Color(255, 255, 255));
        bacc4.setText("A??adir");
        bacc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bacc4ActionPerformed(evt);
            }
        });

        cbacc4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel28.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(153, 153, 0));
        jLabel28.setText("$298.00 MXN");

        jLabel31.setText("Botella de cristal Summun 2020-educion Limitada");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("Un grito a los recuerdos a la historia de una infancia. \nEso es lo que significa Summum 2002");
        jScrollPane6.setViewportView(jTextArea4);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("Fondue para queso ,preparada una cena para tus amigos ,\n para chuparte los dedos.");
        jScrollPane7.setViewportView(jTextArea5);

        jLabel32.setText("Founde para queso Boska set Non-Stick");

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setText("Founde para dos .");
        jScrollPane8.setViewportView(jTextArea6);

        jLabel33.setText("Founde para quesos tapas Grey");

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jTextArea7.setText("Founde tapas Gouda\n");
        jScrollPane9.setViewportView(jTextArea7);

        jLabel34.setText("Founde tapas Gouda");

        javax.swing.GroupLayout accesoriosLayout = new javax.swing.GroupLayout(accesorios);
        accesorios.setLayout(accesoriosLayout);
        accesoriosLayout.setHorizontalGroup(
            accesoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accesoriosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel23)
                .addGap(256, 256, 256))
            .addGroup(accesoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accesoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accesoriosLayout.createSequentialGroup()
                        .addGroup(accesoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7)
                            .addComponent(jScrollPane8)
                            .addGroup(accesoriosLayout.createSequentialGroup()
                                .addGroup(accesoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 154, Short.MAX_VALUE))
                            .addComponent(jScrollPane9)
                            .addComponent(jScrollPane6))
                        .addGroup(accesoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(accesoriosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(accesoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(cbacc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bacc1)))
                            .addGroup(accesoriosLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel26))
                            .addGroup(accesoriosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(accesoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bacc2)
                                    .addComponent(cbacc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27)
                                    .addComponent(cbacc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bacc3)
                                    .addComponent(bacc4)
                                    .addComponent(cbacc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28))))
                        .addGap(287, 287, 287))
                    .addGroup(accesoriosLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        accesoriosLayout.setVerticalGroup(
            accesoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accesoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGroup(accesoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(accesoriosLayout.createSequentialGroup()
                        .addGroup(accesoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accesoriosLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel25)
                                .addGap(27, 27, 27)
                                .addComponent(cbacc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bacc1))
                            .addGroup(accesoriosLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel31)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(accesoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(accesoriosLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(accesoriosLayout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbacc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bacc2)))
                        .addGap(81, 81, 81)
                        .addGroup(accesoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(accesoriosLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(accesoriosLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addComponent(cbacc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bacc3)))
                        .addGap(113, 113, 113)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(accesoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(accesoriosLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(13, 13, 13)
                                .addComponent(cbacc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bacc4))
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(accesoriosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        ScrollPaneaccesorios.setViewportView(accesorios);

        opciones.addTab("Accesorios", ScrollPaneaccesorios);

        alacena.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ala.jpg"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5.jpg"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/6.jpg"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/7.jpg"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 0));
        jLabel19.setText("$80.00MXN");

        ba1.setBackground(new java.awt.Color(153, 153, 0));
        ba1.setForeground(new java.awt.Color(255, 255, 255));
        ba1.setText("Agregar");
        ba1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ba1ActionPerformed(evt);
            }
        });

        cba1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 0));
        jLabel20.setText("$70.00MXN");

        cba2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));

        ba2.setBackground(new java.awt.Color(153, 153, 0));
        ba2.setForeground(new java.awt.Color(255, 255, 255));
        ba2.setText("Agregar");
        ba2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ba2ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 0));
        jLabel21.setText("$33.80MXN");

        cba3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));

        ba3.setBackground(new java.awt.Color(153, 153, 0));
        ba3.setForeground(new java.awt.Color(255, 255, 255));
        ba3.setText("Agregar");
        ba3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ba3ActionPerformed(evt);
            }
        });

        ba4.setBackground(new java.awt.Color(153, 153, 0));
        ba4.setForeground(new java.awt.Color(255, 255, 255));
        ba4.setText("Agregar");
        ba4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ba4ActionPerformed(evt);
            }
        });

        cba4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 0));
        jLabel22.setText("$33.80MXN");

        jLabel35.setText("Chocolate artesano con queso");

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jTextArea8.setText("Una mezcla explosiva, chocolate y queso ");
        jScrollPane10.setViewportView(jTextArea8);

        jLabel36.setText("Chocolate negro 70%  ");

        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jTextArea9.setText("Chocolate 70% cacao con  yogurt y frambuesa ");
        jScrollPane11.setViewportView(jTextArea9);

        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);
        jTextArea10.setText("Salsa para quesos de manzana Golden caramelizada con \npistachos tiernos de Turquia y canela de sri Lanka");
        jScrollPane12.setViewportView(jTextArea10);

        jLabel37.setText("Salsa para queso de manzana Golden ");

        jLabel38.setText("Salsa para queso de melocoton y albaricoque");

        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);
        jTextArea11.setText("Salsa para quesos de melocoton y albaricoque con bayas\n de goji y cardamomo de Guatemala.");
        jScrollPane13.setViewportView(jTextArea11);

        javax.swing.GroupLayout alacenaLayout = new javax.swing.GroupLayout(alacena);
        alacena.setLayout(alacenaLayout);
        alacenaLayout.setHorizontalGroup(
            alacenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alacenaLayout.createSequentialGroup()
                .addGroup(alacenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alacenaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(alacenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(alacenaLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(alacenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(alacenaLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(alacenaLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(alacenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(99, 99, 99)
                                        .addGroup(alacenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(cba3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ba3)))))))
                    .addGroup(alacenaLayout.createSequentialGroup()
                        .addGroup(alacenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(alacenaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, alacenaLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(alacenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(alacenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane11))))
                        .addGap(45, 45, 45)
                        .addGroup(alacenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ba2)
                            .addComponent(ba4)
                            .addGroup(alacenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(alacenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ba1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cba2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel19))
                            .addComponent(jLabel22)
                            .addComponent(cba4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cba1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(390, Short.MAX_VALUE))
        );
        alacenaLayout.setVerticalGroup(
            alacenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alacenaLayout.createSequentialGroup()
                .addGroup(alacenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alacenaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel16)
                        .addGroup(alacenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alacenaLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel15))
                            .addGroup(alacenaLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel35)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(alacenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alacenaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17))
                            .addGroup(alacenaLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel36)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(alacenaLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cba1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ba1)
                        .addGap(150, 150, 150)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cba2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ba2)))
                .addGap(56, 56, 56)
                .addGroup(alacenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alacenaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addGroup(alacenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18)
                    .addGroup(alacenaLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(cba3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ba3)
                        .addGap(163, 163, 163)
                        .addComponent(cba4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ba4)))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        ScrollPane_alacena.setViewportView(alacena);

        opciones.addTab("Alacena", ScrollPane_alacena);

        lblQuesabor.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        lblQuesabor.setForeground(new java.awt.Color(153, 153, 0));
        lblQuesabor.setText("QUE SABOR.");

        Lbltotal.setBackground(new java.awt.Color(153, 153, 0));
        Lbltotal.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        Lbltotal.setForeground(new java.awt.Color(255, 255, 255));
        Lbltotal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel30.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 153, 0));
        jLabel30.setText("Total:");

        table_ticket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_ticket.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(table_ticket);
        if (table_ticket.getColumnModel().getColumnCount() > 0) {
            table_ticket.getColumnModel().getColumn(0).setPreferredWidth(60);
            table_ticket.getColumnModel().getColumn(1).setPreferredWidth(205);
            table_ticket.getColumnModel().getColumn(2).setPreferredWidth(60);
            table_ticket.getColumnModel().getColumn(3).setPreferredWidth(60);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQuesabor, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 183, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(carrito)
                                .addGap(35, 35, 35))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuesabor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(carrito)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(Lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnA??adirQuesoSNLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA??adirQuesoSNLActionPerformed
        bd.abrir_conexion();    //abrimos conexion con la base de datos
        setear_art(cbQuesoSNL.getSelectedIndex()+1,1);  //dentro de nuestro objeto articulo guardamos lo seleccionado en el combo
                                                            //box como la cantidad y mandamos el codigo del articulo, en este caso 1
        bd.instertar_art(articulos,1);//insertamos dentro de la base de datos nuestro objeto articulo y la clave del articulo
        bd.cerrar_conexion();           //cerramos conexion
        ver_pedido();           //actualizamos la vista de nuestra tabla para que se vea en la misma el nuevo articulo que acabamos de agregar
    }//GEN-LAST:event_btnA??adirQuesoSNLActionPerformed

    private void bq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bq2ActionPerformed
        bd.abrir_conexion();
        setear_art(cbq2.getSelectedIndex()+1,2);
        bd.instertar_art(articulos,2);
        bd.cerrar_conexion();
        ver_pedido();
    }//GEN-LAST:event_bq2ActionPerformed

    private void bq3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bq3ActionPerformed
        bd.abrir_conexion();
        setear_art(cbq3.getSelectedIndex()+1,3);
        bd.instertar_art(articulos,3);
        bd.cerrar_conexion();
        ver_pedido();
    }//GEN-LAST:event_bq3ActionPerformed

    private void bq4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bq4ActionPerformed
        bd.abrir_conexion();
        setear_art(cbq4.getSelectedIndex()+1,4);
        bd.instertar_art(articulos,4);
        bd.cerrar_conexion();
        ver_pedido();
    }//GEN-LAST:event_bq4ActionPerformed

    private void carritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carritoActionPerformed
        if(vtncarrito==null){               //Si la ventana no ha sido instanciada la instancia
            vtncarrito = new carrito(this,modeloTicket,total,ID_Compra);
        }
        vtncarrito.setVisible(true);    //hace visible la ventana carrito
        this.setVisible(false);         //setea en no visible la ventana principal
    }//GEN-LAST:event_carritoActionPerformed

    private void cbq4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbq4ActionPerformed

    }//GEN-LAST:event_cbq4ActionPerformed

    private void bacc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bacc1ActionPerformed
        bd.abrir_conexion();
        setear_art(cbacc1.getSelectedIndex()+1,5);
        bd.instertar_art(articulos,5);
        bd.cerrar_conexion();
        ver_pedido();
    }//GEN-LAST:event_bacc1ActionPerformed

    private void bacc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bacc2ActionPerformed
        bd.abrir_conexion();
        setear_art(cbacc2.getSelectedIndex()+1,6);
        bd.instertar_art(articulos,6);
        bd.cerrar_conexion();
        ver_pedido();
    }//GEN-LAST:event_bacc2ActionPerformed

    private void bacc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bacc3ActionPerformed
        bd.abrir_conexion();
        setear_art(cbacc3.getSelectedIndex()+1,7);
        bd.instertar_art(articulos,7);
        bd.cerrar_conexion();
        ver_pedido();
    }//GEN-LAST:event_bacc3ActionPerformed

    private void bacc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bacc4ActionPerformed
        bd.abrir_conexion();
        setear_art(cbacc4.getSelectedIndex()+1,8);
        bd.instertar_art(articulos,8);
        bd.cerrar_conexion();
        ver_pedido();
    }//GEN-LAST:event_bacc4ActionPerformed

    private void ba1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ba1ActionPerformed
        bd.abrir_conexion();
        setear_art(cba1.getSelectedIndex()+1,9);
        bd.instertar_art(articulos,9);
        bd.cerrar_conexion();
        ver_pedido();
    }//GEN-LAST:event_ba1ActionPerformed

    private void ba2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ba2ActionPerformed
        bd.abrir_conexion();
        setear_art(cba2.getSelectedIndex()+1,10);
        bd.instertar_art(articulos,10);
        bd.cerrar_conexion();
        ver_pedido();
    }//GEN-LAST:event_ba2ActionPerformed

    private void ba3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ba3ActionPerformed
        bd.abrir_conexion();
        setear_art(cba3.getSelectedIndex()+1,11);
        bd.instertar_art(articulos,11);
        bd.cerrar_conexion();
        ver_pedido();
    }//GEN-LAST:event_ba3ActionPerformed

    private void ba4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ba4ActionPerformed
        bd.abrir_conexion();
        setear_art(cba4.getSelectedIndex()+1,12);
        bd.instertar_art(articulos,12);
        bd.cerrar_conexion();
        ver_pedido();
    }//GEN-LAST:event_ba4ActionPerformed

    public void setear_art(int cantidad, int clave){    //Se seteara un articulo mandando por referencia la cantidad de un combobox 
                                                        //y la clave del articulo a setear
        articulos = bd.set_art(clave);          //va y busca en la base de datos dentro de nuestro catalogo de articulos el articulo con
                                                //referencia a nuestra clave de articulo y setea dentro de articulos la clave, el precio
                                                //y la descripcion
        articulos.setCantidad(cantidad);//Setea dentro de articulos la cantidad mandada como referencia del combobox
        articulos.setSubtotal();    //setea el subtotal multiplicando la cantidad por el precio unitario
        articulos.setId(ID_Compra);//le coloca la etiqueta del numero de ticket al que se le esta a??adiendo este articulo
    }
    
    public void ver_pedido(){
        bd.abrir_conexion();        //abrimos la conexion con la bd
        modeloTicket = bd.consultar_Ticket(ID_Compra);  //mandamos a buscar dentro de la base de datos todos los articulos
                                                             //que esten referenciados al numero de ticket
        System.out.println(modeloTicket.getRowCount());
        
        if(modeloTicket.getRowCount()!= 0){                 //si la cantidad de filas no es igual a 0
          table_ticket.setModel(modeloTicket);      //seteamos el modelo de nuetra tabla
            for (int i = 0; i < 4; i++) {
                if(i!=1&&i!=3){                             //como son 4 columnas, las que no sean ni la 1 ni la 3
                    table_ticket.getColumnModel().getColumn(i).setMaxWidth(40);}//seran seteadas con un ancho max de 40
            }
          
            table_ticket.getColumnModel().getColumn(3).setMaxWidth(45);//la columna 3 sera seteada con un ancho de 45
        }
        total = bd.obtener_total(ID_Compra); //va a la base de datos y hace la suma de todos los subtotales con referencia a
                                                   // que tengan el mismo numero de ticket que estamos manejando
        Lbltotal.setText("$"+total);       //imprime en la etiqueta el total que llevamos hasta el momento
        bd.cerrar_conexion();       //cierra la conexion
    }
    
    public void crear_modelo_Ticket(){      //Se crea el modelo del ticket
	modeloTicket.addColumn("Cant");         //Se le coloca le nombre de CANT a la primer columna
        modeloTicket.addColumn("Descripcion");  //Se le coloca le nombre de CANT a la primer columna
        modeloTicket.addColumn("Precio");       //Se le coloca le nombre de CANT a la primer columna
        modeloTicket.addColumn("Importe");      //Se le coloca le nombre de CANT a la primer columna
        
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbltotal;
    private javax.swing.JPanel Quesos;
    private javax.swing.JScrollPane ScrollPane_alacena;
    private javax.swing.JScrollPane ScrollPane_inicio;
    private javax.swing.JScrollPane ScrollPaneaccesorios;
    private javax.swing.JScrollPane ScrollPanequesos;
    private javax.swing.JPanel accesorios;
    private javax.swing.JPanel alacena;
    private javax.swing.JButton ba1;
    private javax.swing.JButton ba2;
    private javax.swing.JButton ba3;
    private javax.swing.JButton ba4;
    private javax.swing.JButton bacc1;
    private javax.swing.JButton bacc2;
    private javax.swing.JButton bacc3;
    private javax.swing.JButton bacc4;
    private javax.swing.JButton bq2;
    private javax.swing.JButton bq3;
    private javax.swing.JButton bq4;
    private javax.swing.JButton btnA??adirQuesoSNL;
    private javax.swing.JButton carrito;
    private javax.swing.JComboBox<String> cbQuesoSNL;
    private javax.swing.JComboBox<String> cba1;
    private javax.swing.JComboBox<String> cba2;
    private javax.swing.JComboBox<String> cba3;
    private javax.swing.JComboBox<String> cba4;
    private javax.swing.JComboBox<String> cbacc1;
    private javax.swing.JComboBox<String> cbacc2;
    private javax.swing.JComboBox<String> cbacc3;
    private javax.swing.JComboBox<String> cbacc4;
    private javax.swing.JComboBox<String> cbq2;
    private javax.swing.JComboBox<String> cbq3;
    private javax.swing.JComboBox<String> cbq4;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JLabel lblPrecioQuesoSinLactosa;
    private javax.swing.JLabel lblQuesabor;
    private javax.swing.JLabel lblQuesoSinLactosa;
    private javax.swing.JLabel lblTituloQuesoSinLactosa;
    private javax.swing.JTabbedPane opciones;
    private javax.swing.JTable table_ticket;
    private javax.swing.JTextArea txtQuesoSinLactosa;
    // End of variables declaration//GEN-END:variables
}
