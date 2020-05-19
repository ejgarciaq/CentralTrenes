package centraltrenes;

import Ciudad.Ciudades;
import Trenes.Tren;
import Grafo.ContructorGrafo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class CentralTrenes extends JFrame implements ActionListener {
    ContructorGrafo grafito = new ContructorGrafo(20, 10);
    ArrayList<Ciudades> Ciudad = new ArrayList<Ciudades>();
    ArrayList<Tren> Trenes = new ArrayList<Tren>();
   /* private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;*/
    int contador = 0,sleep = 0;
    private JComboBox destino, origen;
    private JButton btnsiguiente,Aleatorio;  
    private JCheckBox btnWinnipeg01,btnWinnipeg02,btnWinnipeg03,btnWinnipeg04,btnWinnipeg05;
    private JCheckBox btnVictoria01,btnVictoria02,btnVictoria03,btnVictoria04,btnVictoria05;
    private JCheckBox btnYellowknife01,btnYellowknife02,btnYellowknife03,btnYellowknife04,btnYellowknife05;
    private JCheckBox btnAlgonquin01,btnAlgonquin02,btnAlgonquin03,btnAlgonquin04,btnAlgonquin05;
    private JCheckBox btnWhitehorse01,btnWhitehorse02,btnWhitehorse03,btnWhitehorse04,btnWhitehorse05;
    private JCheckBox btnDawson01,btnDawson02,btnDawson03,btnDawson04,btnDawson05;
    private JCheckBox btnChurchill01,btnChurchill02,btnChurchill03,btnChurchill04,btnChurchill05;
    private JCheckBox btnStjohns01,btnStjohns02,btnStjohns03,btnStjohns04,btnStjohns05;
    private JCheckBox btnOttawa01,btnOttawa02,btnOttawa03,btnOttawa04,btnOttawa05;
    private JCheckBox btnToronto01,btnToronto02,btnToronto03,btnToronto04,btnToronto05;
    private JLabel imgWinnipeg, imgVictoria, imgYellowknife, imgalgonquin, imgWhitehorse, imgDawson, imgChurchill, imgStjohns, imgOttawa, imgToronto, imgMapa;
    private JLabel etEstaciones, etWinnipeg, etVictoria, etYellowknife, etAlgonquin, etWhitehorse, etDawson, etChurchill, etStjhons, etOttawa, etToronto;
    private JLabel etDposible, etDestino01, etDestino02, etDestino03, etDestino04, etDestino05, etDestino06, etDestino07, etDestino08, etDestino09, etDestino10, etTrenestacion;

    public CentralTrenes() {   
        //usamos el contructor de la clase padre JFrame   
        
        
        this.setTitle("Central de Trenes Canadá");                     // colocamos el titulo de la ventana   
        this.setLocationRelativeTo(null);                       // centramos la ventana
        this.setExtendedState(MAXIMIZED_BOTH);                  // Maximizar vetana
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/tren.png"));
        setIconImage(icon);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // al cierre la ventana termina todo proceso
        componentes();
        this.setVisible(true);
        CargaLogica();       
        
    }
    private void CargaLogica()
    {    
        CargaMatrizYListas();
        CargadorChecks();
        this.grafito.impgrafitoMatriz();
        
    }
    public void CargadorChecks()
    {
        int id,cantmaximo,cantactual;
        String nombre="";
        
        btnWinnipeg01.setSelected(true);
        btnVictoria01.setSelected(true);
        btnYellowknife01.setSelected(true);
        btnAlgonquin01.setSelected(true);
        btnWhitehorse01.setSelected(true);
        btnDawson01.setSelected(true);
        btnChurchill01.setSelected(true);
        btnStjohns01.setSelected(true);
        btnOttawa01.setSelected(true);
        btnToronto01.setSelected(true);
        
         btnWinnipeg01.setEnabled(false);
        btnVictoria01.setEnabled(false);
        btnYellowknife01.setEnabled(false);
        btnAlgonquin01.setEnabled(false);
        btnWhitehorse01.setEnabled(false);
        btnDawson01.setEnabled(false);
        btnChurchill01.setEnabled(false);
        btnStjohns01.setEnabled(false);
        btnOttawa01.setEnabled(false);
        btnToronto01.setEnabled(false);
        
        btnWinnipeg02.setSelected(true);
        btnVictoria02.setSelected(true);
        btnYellowknife02.setSelected(true);
        btnAlgonquin02.setSelected(true);
        btnWhitehorse02.setSelected(true);
        btnDawson02.setSelected(true);
        btnChurchill02.setSelected(true);
        btnStjohns02.setSelected(true);
        btnOttawa02.setSelected(true);
        btnToronto02.setSelected(true);
        
        btnWinnipeg02.setEnabled(false);
        btnVictoria02.setEnabled(false);
        btnYellowknife02.setEnabled(false);
        btnAlgonquin02.setEnabled(false);
        btnWhitehorse02.setEnabled(false);
        btnDawson02.setEnabled(false);
        btnChurchill02.setEnabled(false);
        btnStjohns02.setEnabled(false);
        btnOttawa02.setEnabled(false);
        btnToronto02.setEnabled(false);
        
        btnWinnipeg03.setSelected(true);
        btnVictoria03.setSelected(true);
        btnYellowknife03.setSelected(true);
        btnAlgonquin03.setSelected(true);
        btnWhitehorse03.setSelected(true);
        btnDawson03.setSelected(true);
        btnChurchill03.setSelected(true);
        btnStjohns03.setSelected(true);
        btnOttawa03.setSelected(true);
        btnToronto03.setSelected(true);
        
        btnWinnipeg03.setEnabled(false);
        btnVictoria03.setEnabled(false);
        btnYellowknife03.setEnabled(false);
        btnAlgonquin03.setEnabled(false);
        btnWhitehorse03.setEnabled(false);
        btnDawson03.setEnabled(false);
        btnChurchill03.setEnabled(false);
        btnStjohns03.setEnabled(false);
        btnOttawa03.setEnabled(false);
        btnToronto03.setEnabled(false);
        
        btnWinnipeg04.setEnabled(false);
        btnVictoria04.setEnabled(false);
        btnYellowknife04.setEnabled(false);
        btnAlgonquin04.setEnabled(false);
        btnWhitehorse04.setEnabled(false);
        btnDawson04.setEnabled(false);
        btnChurchill04.setEnabled(false);
        btnStjohns04.setEnabled(false);
        btnOttawa04.setEnabled(false);
        btnToronto04.setEnabled(false);
        
        btnWinnipeg05.setEnabled(false);
        btnVictoria05.setEnabled(false);
        btnYellowknife05.setEnabled(false);
        btnAlgonquin05.setEnabled(false);
        btnWhitehorse05.setEnabled(false);
        btnDawson05.setEnabled(false);
        btnChurchill05.setEnabled(false);
        btnStjohns05.setEnabled(false);
        btnOttawa05.setEnabled(false);
        btnToronto05.setEnabled(false);
    }
         
    public void CargaMatrizYListas()
    {
        origen.removeAllItems();
        destino.removeAllItems();
        try
        {
        int count=0,type = 0;
        String nombre = "";
       for(int i =0;i<=9;i++)
       {
       if(i == 0)
       {
       nombre = "Winnipeg";
       destino.addItem(nombre);
       origen.addItem(nombre);
       }
       if(i == 1)
       {
       nombre = "Victoria";
       destino.addItem(nombre);
       origen.addItem(nombre);
       }
       if(i == 2)
       {
       nombre = "Yellowknife";
       destino.addItem(nombre);
       origen.addItem(nombre);
       }
       if(i == 3)
       {
       nombre = "Algonquin";
       destino.addItem(nombre);
       origen.addItem(nombre);
       }
       if(i == 4)
       {
       nombre = "Whitehorse";
       destino.addItem(nombre);
       origen.addItem(nombre);
       }
       if(i == 5)
       {
       nombre = "Dawson";
       destino.addItem(nombre);
       origen.addItem(nombre);
       }
       if(i == 6)
       {
       nombre = "Churchill";
       destino.addItem(nombre);
       origen.addItem(nombre);
       }
       if(i == 7)
       {
       nombre = "St Jhons";
       destino.addItem(nombre);
       origen.addItem(nombre);
       }
       if(i == 8)
       {
       nombre = "Ottawa";
       destino.addItem(nombre);
       origen.addItem(nombre);
       }
       if(i == 9)
       {
       nombre = "Toronto";
       destino.addItem(nombre);
       origen.addItem(nombre);
       }
                          
       Ciudades city = new Ciudades();
       city.setId(i);
       city.setCantrenes(3);
       city.setNombre(nombre);
       Ciudad.add(city);      
       }
       for(int x = 0;x<=30;x++)
       {
           Tren Trencito = new Tren();
       
           if(count > 9)
               count = 0;
           
           if (type > 2)
               type = 0;
          
           if(count == 0)
           {                   
             
             Trencito.setId(x);
             Trencito.setCuidadactual("Winnipeg");
             Trencito.setTipo(type);
             Trenes.add(Trencito);
           }
            if(count == 1)
           {                   
             Trencito.setId(x);
             Trencito.setCuidadactual("Victoria");
             Trencito.setTipo(type);
             Trenes.add(Trencito);
           }   
             if(count == 2)
           {                   
             Trencito.setId(x);
             Trencito.setCuidadactual("Yellowknife");
             Trencito.setTipo(type);
             Trenes.add(Trencito);
           }     
              if(count == 3)
           {                   
             Trencito.setId(x);
             Trencito.setCuidadactual("Algonquin");
             Trencito.setTipo(type);
             Trenes.add(Trencito);
           } 
           if(count == 4)
           {                   
             Trencito.setId(x);
             Trencito.setCuidadactual("Whitehorse");
             Trencito.setTipo(type);
             Trenes.add(Trencito);
           } 
            if(count == 5)
           {                   
             Trencito.setId(x);
             Trencito.setCuidadactual("Dawson");
             Trencito.setTipo(type);
             Trenes.add(Trencito);
           } 
             if(count == 6)
           {                   
             Trencito.setId(x);
             Trencito.setCuidadactual("Churchill");
             Trencito.setTipo(type);
             Trenes.add(Trencito);
           }
               if(count == 7)
           {                   
             Trencito.setId(x);
             Trencito.setCuidadactual("St Jhons");
             Trencito.setTipo(type);
             Trenes.add(Trencito);
           }
           if(count == 8)
           {                   
             Trencito.setId(x);
             Trencito.setCuidadactual("Ottawa");
             Trencito.setTipo(type);
             Trenes.add(Trencito);
           }
            if(count == 9)
           {                   
             Trencito.setId(x);
             Trencito.setCuidadactual("Toronto");
             Trencito.setTipo(type);
             Trenes.add(Trencito);
           }      
            count ++;
            type++;
       }
               
       grafito.insertaArista(0,1, 1200);
       grafito.insertaArista(0,6, 368);
       grafito.insertaArista(0,2, 1500);
       grafito.insertaArista(0,3, 2153); 
       grafito.insertaArista(1,0, 1200);
       grafito.insertaArista(1,9, 8000);
       grafito.insertaArista(1,4, 1200);
       grafito.insertaArista(2,0, 1500);
       grafito.insertaArista(2,5, 3000);
       grafito.insertaArista(2,4, 550);
       grafito.insertaArista(3,0, 2153); 
       grafito.insertaArista(3,6, 550);
       grafito.insertaArista(3,7, 5000); 
       grafito.insertaArista(3,8, 953);
       grafito.insertaArista(4,1, 1200);
       grafito.insertaArista(4,5, 800); 
       grafito.insertaArista(4,2, 550);
       grafito.insertaArista(5,2, 3000);
       grafito.insertaArista(5,4, 800);
       grafito.insertaArista(5,6, 1652);
       grafito.insertaArista(6,0, 368);
       grafito.insertaArista(6,5,1652);
       grafito.insertaArista(6,3,550);
       grafito.insertaArista(7,3,5000);
       grafito.insertaArista(7,8,350);
       grafito.insertaArista(7,9,620);
       grafito.insertaArista(8,7,350);
       grafito.insertaArista(8,9,250);
       grafito.insertaArista(8,3,953);
       grafito.insertaArista(9,1,8000);
       grafito.insertaArista(9,7,620);
       grafito.insertaArista(9,8,250);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,"Error al cargar datos principales de la ciudad, excepcion: "+ex, "error!",JOptionPane.ERROR_MESSAGE, null);
        }       
    }

    private void componentes() {

        fondo panel = new fondo();
        panel.setImage("/img/canback.jpg");
        setContentPane(panel);
        panel.setLayout(null);

        //Etiquetas de imagen
        imgWinnipeg = new JLabel(new ImageIcon(getClass().getResource("/img/winnipeg.jpg")));
        imgWinnipeg.setBounds(30, 75, 50, 50);
        panel.add(imgWinnipeg);

        imgVictoria = new JLabel(new ImageIcon(getClass().getResource("/img/victoria.jpg")));
        imgVictoria.setBounds(30, 135, 50, 50);
        panel.add(imgVictoria);

        imgYellowknife = new JLabel(new ImageIcon(getClass().getResource("/img/yellowknife.jpg")));
        imgYellowknife.setBounds(30, 195, 50, 50);
        panel.add(imgYellowknife);

        imgalgonquin = new JLabel(new ImageIcon(getClass().getResource("/img/algonquin.jpg")));
        imgalgonquin.setBounds(30, 255, 50, 50);
        panel.add(imgalgonquin);

        imgWhitehorse = new JLabel(new ImageIcon(getClass().getResource("/img/whitehourse.jpg")));
        imgWhitehorse.setBounds(30, 315, 50, 50);
        panel.add(imgWhitehorse);

        imgDawson = new JLabel(new ImageIcon(getClass().getResource("/img/dawson.jpg")));
        imgDawson.setBounds(30, 375, 50, 50);
        panel.add(imgDawson);

        imgChurchill = new JLabel(new ImageIcon(getClass().getResource("/img/churchill.jpg")));
        imgChurchill.setBounds(30, 435, 50, 50);
        panel.add(imgChurchill);

        imgStjohns = new JLabel(new ImageIcon(getClass().getResource("/img/stjohns.jpg")));
        imgStjohns.setBounds(30, 495, 50, 50);
        panel.add(imgStjohns);

        imgOttawa = new JLabel(new ImageIcon(getClass().getResource("/img/ottawa.jpg")));
        imgOttawa.setBounds(30, 555, 50, 50);
        panel.add(imgOttawa);

        imgToronto = new JLabel(new ImageIcon(getClass().getResource("/img/toronto.jpg")));
        imgToronto.setBounds(30, 615, 50, 50);
        panel.add(imgToronto);

        imgMapa = new JLabel(new ImageIcon(getClass().getResource("/img/mapa.jpg")));
        imgMapa.setBounds(750, 315, 600, 355);
        panel.add(imgMapa);
//Etiquetas de texto Salida y Destino y boton
        origen = new JComboBox();
        origen.setBounds(850, 50, 300, 20);
        panel.add(origen);
        origen.addItem("");

        destino = new JComboBox();
        destino.setBounds(850, 80, 300, 20);
        panel.add(destino);

        btnsiguiente = new JButton("Siguiente");
        btnsiguiente.setBounds(850, 110, 90, 20);
        btnsiguiente.setHorizontalAlignment(SwingConstants.CENTER);
        btnsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteEVT(evt);
            }
        }); 
        
        Aleatorio = new JButton("Aleatorio");
        Aleatorio.setBounds(850, 150, 90, 20);
        Aleatorio.setHorizontalAlignment(SwingConstants.CENTER);
         Aleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAleatorioEVT(evt);
            }
        });
        panel.add(Aleatorio);
        
        panel.add(btnsiguiente);

//Etiquetas para estaciones
        etEstaciones = new JLabel("Estaciones");
        etEstaciones.setBounds(30, 0, 300, 100);
        etEstaciones.setHorizontalAlignment(SwingConstants.CENTER);
        etEstaciones.setFont(new Font("Baskerville old face", Font.BOLD, 16));
        panel.add(etEstaciones);

        etWinnipeg = new JLabel("Winnipeg");
        etWinnipeg.setBounds(150, 50, 300, 100); //Ubicacion de la etiqueta en el panel va de 60 en 60
        etWinnipeg.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        panel.add(etWinnipeg); //agrega la etiqueta al panel

        etVictoria = new JLabel("Victoria");
        etVictoria.setBounds(150, 110, 300, 100);
        etVictoria.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        panel.add(etVictoria);

        etYellowknife = new JLabel("Yellowknife");
        etYellowknife.setBounds(150, 170, 300, 100);
        etYellowknife.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        panel.add(etYellowknife);

        etAlgonquin = new JLabel("Algonquin");
        etAlgonquin.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        etAlgonquin.setBounds(150, 230, 300, 100);
        panel.add(etAlgonquin);

        JLabel etWhitehorse = new JLabel("Whitehorse");
        etWhitehorse.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        etWhitehorse.setBounds(150, 290, 300, 100);
        panel.add(etWhitehorse);

        etDawson = new JLabel("Dawson");
        etDawson.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        etDawson.setBounds(150, 350, 300, 100);
        panel.add(etDawson);

        etChurchill = new JLabel("Churchill");
        etChurchill.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        etChurchill.setBounds(150, 410, 300, 100);
        panel.add(etChurchill);

        JLabel etStjhons = new JLabel("St Jhon´s");
        etStjhons.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        etStjhons.setBounds(150, 470, 300, 100);
        panel.add(etStjhons);

        JLabel etOttawa = new JLabel("Ottawa");
        etOttawa.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        etOttawa.setBounds(150, 530, 300, 100);
        panel.add(etOttawa);

        etToronto = new JLabel("Toronto");
        etToronto.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        etToronto.setBounds(150, 590, 300, 100);
        panel.add(etToronto);

//etiquetas para Destinos Posibles
        etDposible = new JLabel("Destinos mas cercanos por ciudad");
        etDposible.setFont(new Font("Baskerville old face", Font.BOLD, 16));
        etDposible.setBounds(270, 0, 300, 100);
        panel.add(etDposible);

        etDestino01 = new JLabel("Victoria, Yellowknife, Churchill");
        etDestino01.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        etDestino01.setBounds(290, 50, 300, 100); //Ubicacion de la etiqueta en el panel va de 60 en 60
        panel.add(etDestino01); //agrega la etiqueta al panel

        etDestino02 = new JLabel("Whitehorse, Winnipeg, Toronto");
        etDestino02.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        etDestino02.setBounds(290, 110, 300, 100);
        panel.add(etDestino02);

        etDestino03 = new JLabel("Dawson, Whitehorse, Winnipeg");
        etDestino03.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        etDestino03.setBounds(290, 170, 300, 100);
        panel.add(etDestino03);

        etDestino04 = new JLabel("Churchill, St John´s, Ottawa");
        etDestino04.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        etDestino04.setBounds(290, 230, 300, 100);
        panel.add(etDestino04);

        etDestino05 = new JLabel("Dawson, Yellowknife, Victoria");
        etDestino05.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        etDestino05.setBounds(290, 290, 300, 100);
        panel.add(etDestino05);

        etDestino06 = new JLabel();
        etDestino06.setText("Whitehorse, Yellowknife, Churchill");
        etDestino06.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        etDestino06.setBounds(290, 350, 300, 100);
        panel.add(etDestino06);

        etDestino07 = new JLabel("Dawson, Winnipeg, Algonquin");
        etDestino07.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        etDestino07.setBounds(290, 410, 300, 100);
        panel.add(etDestino07);

        etDestino08 = new JLabel("Algonquin, Toronto, Ottawa");
        etDestino08.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        etDestino08.setBounds(290, 470, 300, 100);
        panel.add(etDestino08);

        etDestino09 = new JLabel("St John´s, Algonquin, Toronto");
        etDestino09.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        etDestino09.setBounds(290, 530, 300, 100);
        panel.add(etDestino09);

        etDestino10 = new JLabel("Victoria, St John´s, Ottawa");
        etDestino10.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        etDestino10.setBounds(290, 590, 300, 100);
        panel.add(etDestino10);

        etTrenestacion = new JLabel("Trenes en estación");
        etTrenestacion.setFont(new Font("Baskerville old face", Font.BOLD, 16));
        etTrenestacion.setBounds(580, 0, 300, 100);
        panel.add(etTrenestacion);

        btnWinnipeg01 = new JCheckBox();
        btnWinnipeg01.setBounds(595, 90, 20, 20);
        panel.add(btnWinnipeg01);
        
        btnWinnipeg02 = new JCheckBox();
        btnWinnipeg02.setBounds(620, 90, 20, 20);
        panel.add(btnWinnipeg02);
        
        btnWinnipeg03 = new JCheckBox();
        btnWinnipeg03.setBounds(645, 90, 20, 20);
        panel.add(btnWinnipeg03);
        
        btnWinnipeg04 = new JCheckBox();
        btnWinnipeg04.setBounds(670, 90, 20, 20);
        panel.add(btnWinnipeg04);
        
        btnWinnipeg05 = new JCheckBox();
        btnWinnipeg05.setBounds(695, 90, 20, 20);
        panel.add(btnWinnipeg05);
        
        btnVictoria01 = new JCheckBox();
        btnVictoria01.setBounds(595, 150, 20, 20);
        panel.add(btnVictoria01);
        
        btnVictoria02 = new JCheckBox();
        btnVictoria02.setBounds(620, 150, 20, 20);
        panel.add(btnVictoria02);
        
        btnVictoria03 = new JCheckBox();
        btnVictoria03.setBounds(645, 150, 20, 20);
        panel.add(btnVictoria03);
        
        btnVictoria04 = new JCheckBox();
        btnVictoria04.setBounds(670, 150, 20, 20);
//        btnVictoria04.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent evt) {
//                btnWinnipeg01ActionPerformed(evt);
//            }
//        });
        panel.add(btnVictoria04);
        
        btnVictoria05 = new JCheckBox();
        btnVictoria05.setBounds(695, 150, 20, 20);
        panel.add(btnVictoria05);
        
        btnYellowknife01 = new JCheckBox();
        btnYellowknife01.setBounds(595, 210, 20, 20);
        panel.add(btnYellowknife01);
        
        btnYellowknife02 = new JCheckBox();
        btnYellowknife02.setBounds(620, 210, 20, 20);
        panel.add(btnYellowknife02);
        
        btnYellowknife03 = new JCheckBox();
        btnYellowknife03.setBounds(645, 210, 20, 20);
        panel.add(btnYellowknife03);
        
        btnYellowknife04 = new JCheckBox();
        btnYellowknife04.setBounds(670, 210, 20, 20);
        panel.add(btnYellowknife04);
        
        btnYellowknife05 = new JCheckBox();
        btnYellowknife05.setBounds(695, 210, 20, 20);
        panel.add(btnYellowknife05);
        
        btnAlgonquin01 = new JCheckBox();
        btnAlgonquin01.setBounds(595, 270, 20, 20);
        panel.add(btnAlgonquin01);
        
        btnAlgonquin02 = new JCheckBox();
        btnAlgonquin02.setBounds(620, 270, 20, 20);
        panel.add(btnAlgonquin02);
        
        btnAlgonquin03 = new JCheckBox();
        btnAlgonquin03.setBounds(645, 270, 20, 20);
        panel.add(btnAlgonquin03);
        
        btnAlgonquin04 = new JCheckBox();
        btnAlgonquin04.setBounds(670, 270, 20, 20);
        panel.add(btnAlgonquin04);
        
        btnAlgonquin05 = new JCheckBox();
        btnAlgonquin05.setBounds(695, 270, 20, 20);
        panel.add(btnAlgonquin05);
        
        btnWhitehorse01 = new JCheckBox();
        btnWhitehorse01.setBounds(595, 330, 20, 20);
        panel.add(btnWhitehorse01);
        
        btnWhitehorse02 = new JCheckBox();
        btnWhitehorse02.setBounds(620, 330, 20, 20);
        panel.add(btnWhitehorse02);
        
        btnWhitehorse03 = new JCheckBox();
        btnWhitehorse03.setBounds(645, 330, 20, 20);
        panel.add(btnWhitehorse03);
        
        btnWhitehorse04 = new JCheckBox();
        btnWhitehorse04.setBounds(670, 330, 20, 20);
        panel.add(btnWhitehorse04);
        
        btnWhitehorse05 = new JCheckBox();
        btnWhitehorse05.setBounds(695, 330, 20, 20);
        panel.add(btnWhitehorse05);
        
        btnDawson01 = new JCheckBox();
        btnDawson01.setBounds(595, 390, 20, 20);
        panel.add(btnDawson01);
        
        btnDawson02 = new JCheckBox();
        btnDawson02.setBounds(620, 390, 20, 20);
        panel.add(btnDawson02);
        
        btnDawson03 = new JCheckBox();
        btnDawson03.setBounds(645, 390, 20, 20);
        panel.add(btnDawson03);
        
        btnDawson04 = new JCheckBox();
        btnDawson04.setBounds(670, 390, 20, 20);
        panel.add(btnDawson04);
        
        btnDawson05 = new JCheckBox();
        btnDawson05.setBounds(695, 390, 20, 20);
        panel.add(btnDawson05);
        
        btnChurchill01 = new JCheckBox();
        btnChurchill01.setBounds(595, 450, 20, 20);
        panel.add(btnChurchill01);
        
        btnChurchill02 = new JCheckBox();
        btnChurchill02.setBounds(620, 450, 20, 20);
        panel.add(btnChurchill02);
        
        btnChurchill03 = new JCheckBox();
        btnChurchill03.setBounds(645, 450, 20, 20);
        panel.add(btnChurchill03);
        
        btnChurchill04 = new JCheckBox();
        btnChurchill04.setBounds(670, 450, 20, 20);
        panel.add(btnChurchill04);
        
        btnChurchill05 = new JCheckBox();
        btnChurchill05.setBounds(695, 450, 20, 20);
        panel.add(btnChurchill05);
        
        btnStjohns01 = new JCheckBox();
        btnStjohns01.setBounds(595, 510, 20, 20);
        panel.add(btnStjohns01);
        
        btnStjohns02 = new JCheckBox();
        btnStjohns02.setBounds(620, 510, 20, 20);
        panel.add(btnStjohns02);
        
        btnStjohns03 = new JCheckBox();
        btnStjohns03.setBounds(645, 510, 20, 20);
        panel.add(btnStjohns03);
        
        btnStjohns04 = new JCheckBox();
        btnStjohns04.setBounds(670, 510, 20, 20);
        panel.add(btnStjohns04);
        
        btnStjohns05 = new JCheckBox();
        btnStjohns05.setBounds(695, 510, 20, 20);
        panel.add(btnStjohns05);
        
        btnOttawa01 = new JCheckBox();
        btnOttawa01.setBounds(595, 570, 20, 20);
        panel.add(btnOttawa01);
        
        btnOttawa02 = new JCheckBox();
        btnOttawa02.setBounds(620, 570, 20, 20);
        panel.add(btnOttawa02);
        
        btnOttawa03 = new JCheckBox();
        btnOttawa03.setBounds(645, 570, 20, 20);
        panel.add(btnOttawa03);
        
        btnOttawa04 = new JCheckBox();
        btnOttawa04.setBounds(670, 570, 20, 20);
        panel.add(btnOttawa04);
        
        btnOttawa05 = new JCheckBox();
        btnOttawa05.setBounds(695, 570, 20, 20);
        panel.add(btnOttawa05);
        
        btnToronto01 = new JCheckBox();
        btnToronto01.setBounds(595, 630, 20, 20);
        panel.add(btnToronto01);
        
        btnToronto02 = new JCheckBox();
        btnToronto02.setBounds(620, 630, 20, 20);
        panel.add(btnToronto02);
        
        btnToronto03 = new JCheckBox();
        btnToronto03.setBounds(645, 630, 20, 20);
        panel.add(btnToronto03);
        
        btnToronto04 = new JCheckBox();
        btnToronto04.setBounds(670, 630, 20, 20);
        panel.add(btnToronto04);
        
        btnToronto05 = new JCheckBox();
        btnToronto05.setBounds(695, 630, 20, 20);
        panel.add(btnToronto05);
    }

    public static void main(String[] args) {
        new CentralTrenes();      // creamos una ventana
    }
    
   private void BtnAleatorioEVT(java.awt.event.ActionEvent evt) 
   {
       int contadorwhile=0;
      int evaluador = 0;
      int reply = JOptionPane.showConfirmDialog(null,"¿Desea Generar todos los movimientos Aleatorios de los trenes?", "Movimiento Total", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
          origen.enable(false);
          destino.enable(false);
        while(evaluador == 0)
        {
     int range = 9 - 1;
     int origenid;
     int destinoid;
    origenid=(int)(Math.random() * range) + 1;
    destinoid= (int)(Math.random() * range) + 1;
    String dataComboOrigen = ObtenerCiudadnom(origenid);
    String dataComboDestino = ObtenerCiudadnom(destinoid);
            
    int kilometros;
    
    if(dataComboOrigen.equals(dataComboDestino))
    {
         JOptionPane.showMessageDialog(this,"La Ciudad de Destino y Origen no puede ser igual, favor coloque correctamente", "Viaje a la misma ciudad!",JOptionPane.ERROR_MESSAGE, null);
    }
    else
    {
      String nombreO ="";
      String nombreD="";
      Boolean verificador = false;
      int ido = ObtenerCiudadId(dataComboOrigen);;
      int idd = ObtenerCiudadId(dataComboDestino);
      int cantTrenes;
      int proximo;
      int velocidad=0;
      int distancia;
      for(Ciudades pivote : Ciudad)   
      {
         if(pivote.getNombre().equals(dataComboOrigen))
          {
              if(pivote.getCantrenes() == 0)
              {
              JOptionPane.showMessageDialog(this,"No hay Trenes en esta ciudad para enviar, favor seleccione otra ciudad...", "No hay trenes en ciudad...!",JOptionPane.ERROR_MESSAGE, null);    
              break;
              }
              nombreO = dataComboOrigen;
          }
      }
      
      for(Ciudades pivote2 : Ciudad)   
      {
       if(pivote2.getNombre().equals(dataComboDestino) && nombreO != "")
          {
             nombreD = pivote2.getNombre();
             verificador = VerificaAndenLibre(idd);
              if(verificador == false)
              {
                   JOptionPane.showMessageDialog(this,"No hay andenes libres en esta ciudad "+ObtenerCiudadnom(idd)+", se buscara la mas cercana con espacio libre", "No hay anden libre...!",JOptionPane.ERROR_MESSAGE, null);
                   proximo = -1;
                   while(proximo== -1)
                   {
                   proximo = grafito.proxAdy(idd, idd);
                   if(proximo == -1)
                   {
                   JOptionPane.showMessageDialog(this,"No hay andenes libres en las salidas proximas, favor seleccione otra ciudad...", "No hay anden libre...!",JOptionPane.ERROR_MESSAGE, null);   
                   break;
                   }
                   else
                   {
                kilometros= grafito.llamadoFloyd(ido,proximo);
                velocidad = CambiarTrenDeCiudad(nombreO,nombreD);
                restartrenesaciudad(ido);
                sumartrenesaciudad(proximo);
                VerificadordeChecksColocar(proximo);
                VerificadordeChecksQuitar(ido);     
                double tiempo = kilometros/velocidad;
                JOptionPane.showMessageDialog(this," Se encontro otro anden en la ciudad de :"+ObtenerCiudadnom(proximo)+",el tren a llegado a su dstino recorriendo: "+kilometros+"Km a una velocidad de: "+velocidad+"km/h en un tiempo de:"+tiempo+"h", "¡LLegada Exitosa!",JOptionPane.INFORMATION_MESSAGE, null);  
                   }
                   //verificador = VerificaAndenLibre(proximo);
                   }
              }
             if(verificador ==true)
             {
                kilometros= grafito.llamadoFloyd(ido,idd);
                velocidad = CambiarTrenDeCiudad(nombreO,nombreD);
                restartrenesaciudad(ido);
                sumartrenesaciudad(idd);
                VerificadordeChecksColocar(idd);
                VerificadordeChecksQuitar(ido);     
                double tiempo = kilometros/velocidad;
                JOptionPane.showMessageDialog(this,"El tren a llegado a su dstino recorriendo: "+kilometros+"Km a una velocidad de: "+velocidad+"km/h en un tiempo de:"+tiempo+"h", "¡LLegada Exitosa!",JOptionPane.INFORMATION_MESSAGE, null); 
            }  
          }
        } 
      if(nombreO.equals(""))
          JOptionPane.showMessageDialog(this,"Dato no encontrado contacte a su administrador", "dato no encontradoe!",JOptionPane.ERROR_MESSAGE, null);    
    }
    if(contadorwhile == 10)
    {
    int reply2 = JOptionPane.showConfirmDialog(null,"¿Desea continuar con los recorridos de los trenes?", "Recorrido Total", JOptionPane.YES_NO_OPTION);
        if (reply2 == JOptionPane.NO_OPTION) 
        { 
          evaluador = 1;
          JOptionPane.showMessageDialog(this,"Finalzacion del recorrido Aleatorio", "Trenes detenidos!",JOptionPane.INFORMATION_MESSAGE , null);
          origen.enable(true);
          destino.enable(true);
        }
        else
        {
          contadorwhile=0;  
        }
    }
    contadorwhile ++;
   }
  }
}
  
     
   private void BtnSiguienteEVT(java.awt.event.ActionEvent evt) 
   {                                           
    String dataComboOrigen = origen.getSelectedItem().toString();
    String dataComboDestino = destino.getSelectedItem().toString();
    int kilometros;
    
    if(dataComboOrigen.equals(dataComboDestino))
    {
         JOptionPane.showMessageDialog(this,"La Ciudad de Destino y Origen no puede ser igual, favor coloque correctamente", "Viaje a la misma ciudad!",JOptionPane.ERROR_MESSAGE, null);
    }
    else
    {
      String nombreO ="";
      String nombreD="";
      Boolean verificador = false;
      int ido = ObtenerCiudadId(dataComboOrigen);;
      int idd = ObtenerCiudadId(dataComboDestino);
      int cantTrenes;
      int proximo;
      int velocidad=0;
      int distancia;
      for(Ciudades pivote : Ciudad)   
      {
         if(pivote.getNombre().equals(dataComboOrigen))
          {
              if(pivote.getCantrenes() == 0)
              {
              JOptionPane.showMessageDialog(this,"No hay Trenes en esta ciudad para enviar, favor seleccione otra ciudad...", "No hay trenes en ciudad...!",JOptionPane.ERROR_MESSAGE, null);    
              break;
              }
              nombreO = dataComboOrigen;
          }
      }
      
      for(Ciudades pivote2 : Ciudad)   
      {
       if(pivote2.getNombre().equals(dataComboDestino) && nombreO != "")
          {
             nombreD = pivote2.getNombre();
             verificador = VerificaAndenLibre(idd);
              if(verificador == false)
              {
                   JOptionPane.showMessageDialog(this,"No hay andenes libres en esta ciudad, se buscara la mas cercana con espacio libre", "No hay anden libre...!",JOptionPane.ERROR_MESSAGE, null);
                   proximo = -1;
                   while(proximo== -1)
                   {
                   proximo = grafito.proxAdy(idd, idd);
                   if(proximo == -1)
                   {
                   JOptionPane.showMessageDialog(this,"No hay andenes libres en las salidas proximas, favor seleccione otra ciudad...", "No hay anden libre...!",JOptionPane.ERROR_MESSAGE, null);   
                   break;
                   }
                   else
                   {
                kilometros= grafito.llamadoFloyd(ido,proximo);
                velocidad = CambiarTrenDeCiudad(nombreO,nombreD);
                restartrenesaciudad(ido);
                sumartrenesaciudad(proximo);
                VerificadordeChecksColocar(proximo);
                VerificadordeChecksQuitar(ido);     
                double tiempo = kilometros/velocidad;
                JOptionPane.showMessageDialog(this," Se encontro otro anden en la ciudad de :"+ObtenerCiudadnom(proximo)+",el tren a llegado a su dstino recorriendo: "+kilometros+"Km a una velocidad de: "+velocidad+"km/h en un tiempo de:"+tiempo+"h", "¡LLegada Exitosa!",JOptionPane.INFORMATION_MESSAGE, null);  
                   }
                   //verificador = VerificaAndenLibre(proximo);
                   }
              }
             if(verificador ==true)
             {
                kilometros= grafito.llamadoFloyd(ido,idd);
                velocidad = CambiarTrenDeCiudad(nombreO,nombreD);
                restartrenesaciudad(ido);
                sumartrenesaciudad(idd);
                VerificadordeChecksColocar(idd);
                VerificadordeChecksQuitar(ido);     
                double tiempo = kilometros/velocidad;
                JOptionPane.showMessageDialog(this,"El tren a llegado a su dstino recorriendo: "+kilometros+"Km a una velocidad de: "+velocidad+"km/h en un tiempo de:"+tiempo+"h", "¡LLegada Exitosa!",JOptionPane.INFORMATION_MESSAGE, null); 
            }  
          }
        } 
      if(nombreO.equals(""))
          JOptionPane.showMessageDialog(this,"Dato no encontrado contacte a su administrador", "dato no encontradoe!",JOptionPane.ERROR_MESSAGE, null);    
    }
    }                        
   public int CambiarTrenDeCiudad(String NombreO,String NombreD)
   {
       int velocidad=0;
        for(Tren Pivote : Trenes)
       {
           if(Pivote.getCuidadactual().equals(NombreO))
           {
             velocidad = Pivote.getVelocidad();
             Pivote.setCuidadactual(NombreD);
             break;
           }         
       }
        return velocidad;  
   }
 
    public void restartrenesaciudad(int id)
    {
        for(Ciudades Pivote : Ciudad)
       {
           if(Pivote.getId() == id)
           {
             Pivote.setCantrenes(Pivote.getCantrenes()-1);
           }         
       }
    }
      public void sumartrenesaciudad(int id)
    {
        for(Ciudades Pivote : Ciudad)
       {
           if(Pivote.getId() == id)
           {
             Pivote.setCantrenes(Pivote.getCantrenes()+1);
           }         
       }
    }
    public boolean VerificaAndenLibre(int num)
    {
       int trenes;
       boolean Verificador = false;
       for(Ciudades Pivote : Ciudad)
       {
           if(Pivote.getId() == num)
           {
             trenes = Pivote.getCantrenes();
             if(trenes == Pivote.getCantMaximaTren())
             Verificador=false;   
             else
             Verificador = true;    
             break;  
           }         
       }
        return Verificador;
    }
    
       public int ObtenerCiudadId(String nom)
    {
       int Retorno=99;
       for(Ciudades Pivote : Ciudad)
       {
           if(Pivote.getNombre().equals(nom))
           {
              Retorno = Pivote.getId();   
             break;  
           }         
       }
        return Retorno;
    }
       public String ObtenerCiudadnom(int id)
    {
       String Retorno="";
       for(Ciudades Pivote : Ciudad)
       {
           if(Pivote.getId()==id)
           {
              Retorno = Pivote.getNombre();   
             break;  
           }         
       }
        return Retorno;
    }
       public void VerificadordeChecksColocar(int id)
       {
        for(Ciudades Pivote : Ciudad)
       {
           if(Pivote.getId() == id)
           { 
              if(Pivote.getNombre().equals("Winnipeg"))
              {
                if(btnWinnipeg01.isSelected() == false)
                {
                    btnWinnipeg01.setSelected(true);
                }
                else
                {
                    if(btnWinnipeg02.isSelected() == false)
                    {
                      btnWinnipeg02.setSelected(true);
                    }
                    else
                    {
                        if(btnWinnipeg03.isSelected() == false)
                        {
                           btnWinnipeg03.setSelected(true);
                        }   
                         else         
                         {
                             if(btnWinnipeg04.isSelected() == false)
                                 {
                                 btnWinnipeg04.setSelected(true);
                                 } 
                             else
                             {
                                if(btnWinnipeg05.isSelected() == false)
                                {
                                 btnWinnipeg05.setSelected(true);
                                }    
                             }
                         }                  
                    }
                }
           }     
           if(Pivote.getNombre().equals("Victoria"))
           {       
                 if(btnVictoria01.isSelected() == false)
                {
                    btnVictoria01.setSelected(true);
                }
                else
                {
                    if(btnVictoria02.isSelected() == false)
                    {
                      btnVictoria02.setSelected(true);
                    }
                    else
                    {
                        if(btnVictoria03.isSelected() == false)
                        {
                           btnVictoria03.setSelected(true);
                        }   
                         else         
                         {
                             if(btnVictoria04.isSelected() == false)
                                 {
                                 btnVictoria04.setSelected(true);
                                 } 
                             else
                             {
                                if(btnVictoria05.isSelected() == false)
                                {
                                 btnVictoria05.setSelected(true);
                                }    
                             }
                         }                  
                    }
                }   
            }
            if(Pivote.getNombre().equals("Yellowknife"))
            {                 
                if(btnYellowknife01.isSelected() == false)
                {
                    btnYellowknife01.setSelected(true);
                }
                else
                {
                    if(btnYellowknife02.isSelected() == false)
                    {
                      btnYellowknife02.setSelected(true);
                    }
                    else
                    {
                        if(btnYellowknife03.isSelected() == false)
                        {
                           btnYellowknife03.setSelected(true);
                        }   
                         else         
                         {
                             if(btnYellowknife04.isSelected() == false)
                                 {
                                 btnYellowknife04.setSelected(true);
                                 } 
                             else
                             {
                                if(btnYellowknife05.isSelected() == false)
                                {
                                 btnYellowknife05.setSelected(true);
                                }    
                             }
                         }                  
                    }
                }
            }
            if(Pivote.getNombre().equals("Algonquin"))
            {
                  if(btnAlgonquin01.isSelected() == false)
                {
                    btnAlgonquin01.setSelected(true);
                }
                else
                {
                    if(btnAlgonquin02.isSelected() == false)
                    {
                      btnAlgonquin02.setSelected(true);
                    }
                    else
                    {
                        if(btnAlgonquin03.isSelected() == false)
                        {
                           btnAlgonquin03.setSelected(true);
                        }   
                         else         
                         {
                             if(btnAlgonquin04.isSelected() == false)
                                 {
                                 btnAlgonquin04.setSelected(true);
                                 } 
                             else
                             {
                                if(btnAlgonquin05.isSelected() == false)
                                {
                                 btnAlgonquin05.setSelected(true);
                                }    
                             }
                         }                  
                    }
                }
            }
            if(Pivote.getNombre().equals("Whitehorse"))
            {               
               if(btnWhitehorse01.isSelected() == false)
                {
                    btnWhitehorse01.setSelected(true);
                }
                else
                {
                    if(btnWhitehorse02.isSelected() == false)
                    {
                      btnWhitehorse02.setSelected(true);
                    }
                    else
                    {
                        if(btnWhitehorse03.isSelected() == false)
                        {
                           btnWhitehorse03.setSelected(true);
                        }   
                         else         
                         {
                             if(btnWhitehorse04.isSelected() == false)
                                 {
                                 btnWhitehorse04.setSelected(true);
                                 } 
                             else
                             {
                                if(btnWhitehorse05.isSelected() == false)
                                {
                                 btnWhitehorse05.setSelected(true);
                                }    
                             }
                         }                  
                    }
                }
            }
              if(Pivote.getNombre().equals("Churchill"))
              {
                if(btnChurchill01.isSelected() == false)
                {
                    btnChurchill01.setSelected(true);
                }
                else
                {
                    if(btnChurchill02.isSelected() == false)
                    {
                      btnChurchill02.setSelected(true);
                    }
                    else
                    {
                        if(btnChurchill03.isSelected() == false)
                        {
                           btnWhitehorse03.setSelected(true);
                        }   
                         else         
                         {
                             if(btnChurchill04.isSelected() == false)
                                 {
                                 btnChurchill04.setSelected(true);
                                 } 
                             else
                             {
                                if(btnChurchill05.isSelected() == false)
                                {
                                 btnChurchill05.setSelected(true);
                                }    
                             }
                         }                  
                    }
                }
              }
              if(Pivote.getNombre().equals("Dawson"))
              {
                if(btnDawson01.isSelected() == false)
                {
                    btnDawson01.setSelected(true);
                }
                else
                {
                    if(btnDawson02.isSelected() == false)
                    {
                      btnDawson02.setSelected(true);
                    }
                    else
                    {
                        if(btnDawson03.isSelected() == false)
                        {
                           btnDawson03.setSelected(true);
                        }   
                         else         
                         {
                             if(btnDawson04.isSelected() == false)
                                 {
                                 btnDawson04.setSelected(true);
                                 } 
                             else
                             {
                                if(btnDawson05.isSelected() == false)
                                {
                                 btnDawson05.setSelected(true);
                                }    
                             }
                         }                  
                    }
                }
              }
               if(Pivote.getNombre().equals("St Jhons"))
              {
                if(btnStjohns01.isSelected() == false)
                {
                    btnStjohns01.setSelected(true);
                }
                else
                {
                    if(btnStjohns02.isSelected() == false)
                    {
                      btnStjohns02.setSelected(true);
                    }
                    else
                    {
                        if(btnStjohns03.isSelected() == false)
                        {
                           btnStjohns03.setSelected(true);
                        }   
                         else         
                         {
                             if(btnStjohns04.isSelected() == false)
                                 {
                                 btnStjohns04.setSelected(true);
                                 } 
                             else
                             {
                                if(btnStjohns05.isSelected() == false)
                                {
                                 btnStjohns05.setSelected(true);
                                }    
                             }
                         }                  
                    }
                }
              }
              if(Pivote.getNombre().equals("Ottawa"))
              {
                  if(btnOttawa01.isSelected() == false)
                   {
                    btnOttawa01.setSelected(true);
                  }
                 else
                 {
                    if(btnOttawa02.isSelected() == false)
                    {
                      btnOttawa02.setSelected(true);
                    }
                    else
                    {
                        if(btnOttawa03.isSelected() == false)
                        {
                           btnOttawa03.setSelected(true);
                        }   
                         else         
                         {
                             if(btnOttawa04.isSelected() == false)
                                 {
                                 btnOttawa04.setSelected(true);
                                 } 
                             else
                             {
                                if(btnOttawa05.isSelected() == false)
                                {
                                 btnOttawa05.setSelected(true);
                                }    
                             }
                         }                  
                    }
                }    
              }
              if(Pivote.getNombre().equals("Toronto"))
              {
                  btnToronto01.setSelected(true);
                  
                   if(btnToronto01.isSelected() == false)
                   {
                    btnToronto01.setSelected(true);
                  }
                 else
                 {
                    if(btnToronto02.isSelected() == false)
                    {
                      btnToronto02.setSelected(true);
                    }
                    else
                    {
                        if(btnToronto03.isSelected() == false)
                        {
                           btnToronto03.setSelected(true);
                        }   
                         else         
                         {
                             if(btnToronto04.isSelected() == false)
                                 {
                                 btnToronto04.setSelected(true);
                                 } 
                             else
                             {
                                if(btnToronto05.isSelected() == false)
                                {
                                 btnToronto05.setSelected(true);
                                }    
                            }
                        }                  
                    }
                 }    
               }  
             break;  
            }         
       }   
    }
      public void VerificadordeChecksQuitar(int id)
       {
        for(Ciudades Pivote : Ciudad)
       {
           if(Pivote.getId() == id)
           { 
              if(Pivote.getNombre().equals("Winnipeg"))
              {
                if(btnWinnipeg05.isSelected() == true)
                {
                    btnWinnipeg05.setSelected(false);
                }
                else
                {
                    if(btnWinnipeg04.isSelected() == true)
                    {
                      btnWinnipeg04.setSelected(false);
                    }
                    else
                    {
                        if(btnWinnipeg03.isSelected() == true)
                        {
                           btnWinnipeg03.setSelected(false);
                        }   
                         else         
                         {
                             if(btnWinnipeg02.isSelected() == true)
                                 {
                                 btnWinnipeg02.setSelected(false);
                                 } 
                             else
                             {
                                if(btnWinnipeg01.isSelected() == true)
                                {
                                 btnWinnipeg01.setSelected(false);
                                }    
                             }
                         }                  
                    }
                }
           }     
           if(Pivote.getNombre().equals("Victoria"))
           {       
                 if(btnVictoria05.isSelected() == true)
                {
                    btnVictoria05.setSelected(false);
                }
                else
                {
                    if(btnVictoria04.isSelected() == true)
                    {
                      btnVictoria04.setSelected(false);
                    }
                    else
                    {
                        if(btnVictoria03.isSelected() == true)
                        {
                           btnVictoria03.setSelected(false);
                        }   
                         else         
                         {
                             if(btnVictoria02.isSelected() == true)
                                 {
                                 btnVictoria02.setSelected(false);
                                 } 
                             else
                             {
                                if(btnVictoria01.isSelected() == true)
                                {
                                 btnVictoria01.setSelected(false);
                                }    
                             }
                         }                  
                    }
                }
                 
            }
            if(Pivote.getNombre().equals("Yellowknife"))
            {                 
                if(btnYellowknife05.isSelected() == true)
                {
                    btnYellowknife05.setSelected(false);
                }
                else
                {
                    if(btnYellowknife04.isSelected() == true)
                    {
                      btnYellowknife04.setSelected(false);
                    }
                    else
                    {
                        if(btnYellowknife03.isSelected() == true)
                        {
                           btnYellowknife03.setSelected(false);
                        }   
                         else         
                         {
                             if(btnYellowknife02.isSelected() == true)
                                 {
                                 btnYellowknife02.setSelected(false);
                                 } 
                             else
                             {
                                if(btnYellowknife01.isSelected() == true)
                                {
                                 btnYellowknife01.setSelected(false);
                                }    
                             }
                         }                  
                    }
                }
            }
            if(Pivote.getNombre().equals("Algonquin"))
            {
                  if(btnAlgonquin05.isSelected() == true)
                {
                    btnAlgonquin05.setSelected(false);
                }
                else
                {
                    if(btnAlgonquin04.isSelected() == true)
                    {
                      btnAlgonquin04.setSelected(false);
                    }
                    else
                    {
                        if(btnAlgonquin03.isSelected() == true)
                        {
                           btnAlgonquin03.setSelected(false);
                        }   
                         else         
                         {
                             if(btnAlgonquin02.isSelected() == true)
                                 {
                                 btnAlgonquin02.setSelected(false);
                                 } 
                             else
                             {
                                if(btnAlgonquin01.isSelected() == true)
                                {
                                 btnAlgonquin01.setSelected(false);
                                }    
                             }
                         }                  
                    }
                }
            }
            if(Pivote.getNombre().equals("Whitehorse"))
            {               
               if(btnWhitehorse05.isSelected() == true)
                {
                    btnWhitehorse05.setSelected(false);
                }
                else
                {
                    if(btnWhitehorse04.isSelected() == true)
                    {
                      btnWhitehorse04.setSelected(false);
                    }
                    else
                    {
                        if(btnWhitehorse03.isSelected() == true)
                        {
                           btnWhitehorse03.setSelected(false);
                        }   
                         else         
                         {
                             if(btnWhitehorse02.isSelected() == true)
                                 {
                                 btnWhitehorse02.setSelected(false);
                                 } 
                             else
                             {
                                if(btnWhitehorse01.isSelected() == true)
                                {
                                 btnWhitehorse01.setSelected(false);
                                }    
                             }
                         }                  
                    }
                }
            }
              if(Pivote.getNombre().equals("Churchill"))
              {
                if(btnChurchill05.isSelected() == true)
                {
                    btnChurchill05.setSelected(false);
                }
                else
                {
                    if(btnChurchill04.isSelected() == true)
                    {
                      btnChurchill04.setSelected(false);
                    }
                    else
                    {
                        if(btnChurchill03.isSelected() == true)
                        {
                           btnWhitehorse03.setSelected(false);
                        }   
                         else         
                         {
                             if(btnChurchill02.isSelected() == true)
                                 {
                                 btnChurchill02.setSelected(false);
                                 } 
                             else
                             {
                                if(btnChurchill01.isSelected() == true)
                                {
                                 btnChurchill01.setSelected(false);
                                }    
                             }
                         }                  
                    }
                }
              }
              if(Pivote.getNombre().equals("Dawson"))
              {
                if(btnDawson05.isSelected() == true)
                {
                    btnDawson05.setSelected(false);
                }
                else
                {
                    if(btnDawson04.isSelected() == true)
                    {
                      btnDawson04.setSelected(false);
                    }
                    else
                    {
                        if(btnDawson03.isSelected() == true)
                        {
                           btnDawson03.setSelected(false);
                        }   
                         else         
                         {
                             if(btnDawson02.isSelected() == true)
                                 {
                                 btnDawson02.setSelected(false);
                                 } 
                             else
                             {
                                if(btnDawson01.isSelected() == true)
                                {
                                 btnDawson01.setSelected(false);
                                }    
                             }
                         }                  
                    }
                }
              }
               if(Pivote.getNombre().equals("St Jhons"))
              {
                if(btnStjohns05.isSelected() == true)
                {
                    btnStjohns05.setSelected(false);
                }
                else
                {
                    if(btnStjohns04.isSelected() == true)
                    {
                      btnStjohns04.setSelected(false);
                    }
                    else
                    {
                        if(btnStjohns03.isSelected() == true)
                        {
                           btnStjohns03.setSelected(false);
                        }   
                         else         
                         {
                             if(btnStjohns02.isSelected() == true)
                                 {
                                 btnStjohns02.setSelected(false);
                                 } 
                             else
                             {
                                if(btnStjohns01.isSelected() == true)
                                {
                                 btnStjohns01.setSelected(false);
                                }    
                             }
                         }                  
                    }
                }
              }
              if(Pivote.getNombre().equals("Ottawa"))
              {
                  if(btnOttawa05.isSelected() == true)
                   {
                    btnOttawa05.setSelected(false);
                  }
                 else
                 {
                    if(btnOttawa04.isSelected() == true)
                    {
                      btnOttawa04.setSelected(false);
                    }
                    else
                    {
                        if(btnOttawa03.isSelected() == true)
                        {
                           btnOttawa03.setSelected(false);
                        }   
                         else         
                         {
                             if(btnOttawa02.isSelected() == true)
                                 {
                                 btnOttawa02.setSelected(false);
                                 } 
                             else
                             {
                                if(btnOttawa01.isSelected() == true)
                                {
                                 btnOttawa01.setSelected(false);
                                }    
                             }
                         }                  
                    }
                }    
              }
              if(Pivote.getNombre().equals("Toronto"))
              {   
                   if(btnToronto05.isSelected() == true)
                   {
                    btnToronto05.setSelected(false);
                  }
                 else
                 {
                    if(btnToronto04.isSelected() == true)
                    {
                      btnToronto04.setSelected(false);
                    }
                    else
                    {
                        if(btnToronto03.isSelected() == true)
                        {
                           btnToronto03.setSelected(false);
                        }   
                         else         
                         {
                             if(btnToronto02.isSelected() == true)
                                 {
                                 btnToronto02.setSelected(false);
                                 } 
                             else
                             {
                                if(btnToronto01.isSelected() == true)
                                {
                                 btnToronto01.setSelected(false);
                                }    
                            }
                        }                  
                    }
                 }    
               }  
             break;  
            }         
       }   
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        this.btnWinnipeg01.setBackground(Color.blue);
        this.btnWinnipeg02.setBackground(Color.blue);
        this.btnWinnipeg03.setBackground(Color.blue);
        this.btnWinnipeg04.setBackground(Color.blue);
        this.btnWinnipeg05.setBackground(Color.blue);
        this.btnVictoria01.setBackground(Color.blue);
        this.btnVictoria02.setBackground(Color.blue);
        this.btnVictoria03.setBackground(Color.blue);
        this.btnVictoria04.setBackground(Color.blue);
        this.btnVictoria05.setBackground(Color.blue);
        this.btnYellowknife01.setBackground(Color.blue);
        this.btnYellowknife02.setBackground(Color.blue);
        this.btnYellowknife03.setBackground(Color.blue);
        this.btnYellowknife04.setBackground(Color.blue);
        this.btnYellowknife05.setBackground(Color.blue);
        this.btnAlgonquin01.setBackground(Color.blue);
        this.btnAlgonquin02.setBackground(Color.blue);
        this.btnAlgonquin03.setBackground(Color.blue);
        this.btnAlgonquin04.setBackground(Color.blue);
        this.btnAlgonquin05.setBackground(Color.blue);
        this.btnWhitehorse01.setBackground(Color.blue);
        this.btnWhitehorse02.setBackground(Color.blue);
        this.btnWhitehorse03.setBackground(Color.blue);
        this.btnWhitehorse04.setBackground(Color.blue);
        this.btnWhitehorse05.setBackground(Color.blue);
        this.btnDawson01.setBackground(Color.blue);
        this.btnDawson02.setBackground(Color.blue);
        this.btnDawson03.setBackground(Color.blue);
        this.btnDawson04.setBackground(Color.blue);
        this.btnDawson05.setBackground(Color.blue);
        this.btnChurchill01.setBackground(Color.blue);
        this.btnChurchill02.setBackground(Color.blue);
        this.btnChurchill03.setBackground(Color.blue);
        this.btnChurchill04.setBackground(Color.blue);
        this.btnChurchill05.setBackground(Color.blue);
        this.btnStjohns01.setBackground(Color.blue);
        this.btnStjohns02.setBackground(Color.blue);
        this.btnStjohns03.setBackground(Color.blue);
        this.btnStjohns04.setBackground(Color.blue);
        this.btnStjohns05.setBackground(Color.blue);
        this.btnOttawa01.setBackground(Color.blue);
        this.btnOttawa02.setBackground(Color.blue);
        this.btnOttawa03.setBackground(Color.blue);
        this.btnOttawa04.setBackground(Color.blue);
        this.btnOttawa05.setBackground(Color.blue);
        this.btnToronto01.setBackground(Color.blue);
        this.btnToronto02.setBackground(Color.blue);
        this.btnToronto03.setBackground(Color.blue);
        this.btnToronto04.setBackground(Color.blue);
        this.btnToronto05.setBackground(Color.blue);
    }

}
