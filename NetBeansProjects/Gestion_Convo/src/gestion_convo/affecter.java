/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_convo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joseph chek
 */
public class affecter extends javax.swing.JFrame {
    private Object j;
    private Object l;
    String d;
    String y;
    String m;
    DefaultTableModel model =new DefaultTableModel() ;

    /**
     * Creates new form Convocation
     */
    public affecter() {
       initComponents();
        jLabel1 = new javax.swing.JLabel();
        j = new javax.swing.JComboBox();
        l = new javax.swing.JLabel();
            
        model.addColumn("Id");
        model.addColumn("DATE_JOUR");
        model.addColumn("Horaire");
        model.addColumn("Id_sal");
        model.addColumn("Id_mat");
        model.addColumn("Duree");
           
         try{
//2.Enregistrer le driver JDBC
Class.forName("com.mysql.jdbc.Driver");
}catch(ClassNotFoundException e)
{System.out.println("erreur du chargement du driver"+e);
}
        try{
//3.connextion a la basse

//String url=("jdbc:mysql://localhost:3306/gestion_emprunt2","root","");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionconvo","root","");
//4creation d'un Statement

Statement st=con.createStatement();

//5.execution d'une requete (ResultSet)

ResultSet Rs=st.executeQuery("Select * from affecter");
            while(Rs.next()){
                model.addRow(new Object[]{Rs.getString("Id"),Rs.getString("DATE_JOUR"),Rs.getString("Horaire"),Rs.getString("Id_sal"),Rs.getString("Id_mat"),Rs.getString("Duree")});
                }



st.close();
con.close();
}

catch (SQLException sql){
System.err.println("erreur lors de la connexion"+sql);
 
}

    tbl.setModel(model);
        
        
        try{
//2.Enregistrer le driver JDBC
Class.forName("com.mysql.jdbc.Driver");
}catch(ClassNotFoundException e)
{System.out.println("erreur du chargement du driver"+e);
}
        try{
//3.connextion a la basse

//String url=("jdbc:mysql://localhost:3306/gestion_emprunt2","root","");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionconvo","root","");
//4creation d'un Statement

Statement st=con.createStatement();

//5.execution d'une requete (ResultSet)

String query="SELECT Nom FROM enseignant ORDER BY Nom";
ResultSet resultset=st.executeQuery(query);

//6traiter les donnees retournees

while(resultset.next()){
//String b=resultset.getString("Nom");
combo.addItem(""+resultset.getString("Nom"));
}

st.close();
con.close();
}

catch (SQLException sql){
System.err.println("erreur lors de la connexion"+sql);
}

        
        
        
        try{
//3.connextion a la basse

//String url=("jdbc:mysql://localhost:3306/gestion_emprunt2","root","");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionconvo","root","");
//4creation d'un Statement

Statement st=con.createStatement();

//5.execution d'une requete (ResultSet)


String dt = "SELECT Nom_sal FROM salle ORDER BY Nom_sal";
ResultSet set=st.executeQuery(dt);
//6traiter les donnees retournees


while(set.next()){
//String b=resultset.getString("Nom");
box.addItem(""+set.getString("Nom_sal"));
}

st.close();
con.close();
}

catch (SQLException sql){
System.err.println("erreur lors de la connexion"+sql);
}
   
        
        
        try{
//3.connextion a la basse

//String url=("jdbc:mysql://localhost:3306/gestion_emprunt2","root","");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionconvo","root","");
//4creation d'un Statement

Statement st=con.createStatement();

//5.execution d'une requete (ResultSet)


String dt = "SELECT lib_mat FROM matiére ORDER BY lib_mat";
ResultSet set=st.executeQuery(dt);
//6traiter les donnees retournees


while(set.next()){
//String b=resultset.getString("Nom");
CB.addItem(""+set.getString("lib_mat"));


}

st.close();
con.close();
}

catch (SQLException sql){
System.err.println("erreur lors de la connexion"+sql);
}
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox();
        CB = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        box = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        b2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_convo/affec.png"))); // NOI18N
        jLabel1.setText("Affectation");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 80, 340, 80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NomEnseignant");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 180, 120, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Date du Jour");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 240, 110, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Id_salle");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 300, 110, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Horaire");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 330, 110, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Durée");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 360, 110, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Id_matiere");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 420, 110, 17);

        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        getContentPane().add(t4);
        t4.setBounds(150, 300, 210, 20);
        getContentPane().add(t1);
        t1.setBounds(150, 330, 210, 20);
        getContentPane().add(t3);
        t3.setBounds(150, 360, 210, 20);

        box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        getContentPane().add(combo);
        combo.setBounds(150, 180, 210, 20);

        CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBActionPerformed(evt);
            }
        });
        getContentPane().add(CB);
        CB.setBounds(150, 390, 210, 20);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_convo/save_f2.png"))); // NOI18N
        jButton1.setText("Enregistrer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(390, 290, 190, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Salle");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 270, 110, 20);

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2);
        t2.setBounds(150, 240, 210, 20);
        getContentPane().add(t6);
        t6.setBounds(150, 210, 210, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Matiére");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 390, 110, 17);
        getContentPane().add(t5);
        t5.setBounds(150, 420, 210, 20);

        jLabel10.setBackground(new java.awt.Color(0, 51, 51));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Id_enseignant");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 210, 110, 20);

        box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        box.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });
        getContentPane().add(box);
        box.setBounds(150, 270, 210, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Gestion de Convocation des Examens");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(170, 10, 710, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_convo/uu.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 0, 110, 60);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_convo/F.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 920, 60);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_convo/pensei.png"))); // NOI18N
        jButton2.setText("CONVOQUER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(510, 410, 210, 60);

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Identifiant", "DATE_Jour", "Horaire", "Id_sal", "Id_mat", "Duree"
            }
        ));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(390, 190, 490, 90);

        b2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_convo/config.png"))); // NOI18N
        b2.setText("Modifier");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(650, 290, 190, 50);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_convo/actua.png"))); // NOI18N
        jButton3.setText("Actualiser");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(660, 350, 180, 50);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_convo/trash.png"))); // NOI18N
        jButton5.setText("Supprimer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(390, 350, 190, 50);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_convo/retour.png"))); // NOI18N
        jButton6.setText("Retour");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(10, 70, 160, 40);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_convo/decon.png"))); // NOI18N
        jButton4.setText("Deconnexion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(680, 70, 220, 49);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Copyright MI3-Info juin 2015");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(310, 480, 400, 40);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_convo/F.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 480, 910, 50);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_convo/VRAI.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 60, 910, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void deplace(int i){
       try{
       t6.setText(model.getValueAt(i,0).toString());
       t2.setText(model.getValueAt(i,1).toString());
       t1.setText(model.getValueAt(i,2).toString());
       t4.setText(model.getValueAt(i,3).toString());
       t5.setText(model.getValueAt(i,4).toString());
       t3.setText(model.getValueAt(i,5).toString());
       }catch (Exception e){System.err.println(e);
 JOptionPane.showMessageDialog(null,"erreur de deplacement"+e.getLocalizedMessage());}
   }
    
    private void afficher(){
     try{
//2.Enregistrer le driver JDBC
Class.forName("com.mysql.jdbc.Driver");
}catch(ClassNotFoundException e)
{System.out.println("erreur du chargement du driver"+e);
}
try{
//3.connextion a la basse

//String url=("jdbc:mysql://localhost:3306/gestion_emprunt2","root","");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionconvo","root","");
//4creation d'un Statement
model.setRowCount(0);
Statement st=con.createStatement();

//5.execution d'une requete (ResultSet)

 ResultSet Rs=st.executeQuery("Select * from affecter");
            while(Rs.next()){
               model.addRow(new Object[]{Rs.getString("Id"),Rs.getString("DATE_JOUR"),Rs.getString("Horaire"),Rs.getString("Id_sal"),Rs.getString("Id_mat"),Rs.getString("Duree")});
                }



//6traiter les donnees retournees


//7.fermer les connextion
st.close();
con.close();
}

catch (SQLException sql){
System.err.println("erreur lors de la connexion"+sql);
}
   tbl.setModel(model);
    }
            
    
    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
      // TODO add your handling code here:
        
        if (combo.getSelectedItem()==combo.getSelectedItem()){

String query="Select Id from enseignant where Nom='"+combo.getSelectedItem()+"' ";
//System.out.println(query);

try{
	Class.forName("com.mysql.jdbc.Driver");
}
catch(ClassNotFoundException e)
{System.out.println("erreur du chargement du driver"+e);
}
try{
//String url="jdbc:mysql://localhost/stock","root","";
	
 //String url("jdbc:mysql://localhost:3306/gestion_emprunt2","root","");
	
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionconvo","root","");
Statement st=con.createStatement();
ResultSet resultset=st.executeQuery(query);
while(resultset.next()){

d=resultset.getString("Id");
t6.setText(d);
}
st.close();
con.close();
}
 
catch(SQLException sql){
System.out.println("Eurreur lors de la connection"+sql);
}
        }
    }//GEN-LAST:event_comboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
//2.Enregistrer le driver JDBC
Class.forName("com.mysql.jdbc.Driver");
}catch(ClassNotFoundException e)
{System.out.println("erreur du chargement du driver"+e);
}
try{
//3.connextion a la basse

//String url=("jdbc:mysql://localhost:3306/gestion_emprunt2","root","");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionconvo","root","");
//4creation d'un Statement

Statement st=con.createStatement();

//5.execution d'une requete (ResultSet)

String ret=("SELECT sum(Duree) as Nb FROM affecter WHERE Id='"+t6.getText()+"'");


 ResultSet res =st.executeQuery(ret);
 int nb=99;
if(res.next()){
   nb= res.getInt("Nb");
System.out.print("nb="+nb);
}
System.out.println(ret);
if(nb+Integer.parseInt(t3.getText())<=4){
String query=("INSERT INTO affecter VALUES"+"('"+t6.getText()+"','"+t2.getText()+"','"+t1.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t3.getText()+"')");

st.executeUpdate(query);
JOptionPane.showMessageDialog(null,"le Professeur est bien Ajouter");
       t1.setText("");
       t2.setText("");
       t3.setText("");
       
       afficher();

//6traiter les donnees retournees


//7.fermer les connextion
st.close();
con.close();
}
else 
JOptionPane.showMessageDialog(null,"le Professeur est deja atteint  le durée max 4h!!!");
}

catch (SQLException sql){
    JOptionPane.showMessageDialog(null," ce prof a deja surveiller cette matiere dans cette salle!!!");
System.err.println("erreur lors de la connexion"+sql);
}



    }//GEN-LAST:event_jButton1ActionPerformed

    private void CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBActionPerformed
        // TODO add your handling code here:
        
            if (CB.getSelectedItem()==CB.getSelectedItem()){

String query="Select Id_mat from matiére where lib_mat='"+CB.getSelectedItem()+"' ";
//System.out.println(query);

try{
	Class.forName("com.mysql.jdbc.Driver");
}
catch(ClassNotFoundException e)
{System.out.println("erreur du chargement du driver"+e);
}
try{
//String url="jdbc:mysql://localhost/stock","root","";
	
 //String url("jdbc:mysql://localhost:3306/gestion_emprunt2","root","");
	
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionconvo","root","");
Statement st=con.createStatement();
ResultSet resultset=st.executeQuery(query);
while(resultset.next()){

y=resultset.getString("Id_mat");
t5.setText(y);
}
st.close();
con.close();
}
 
catch(SQLException sql){
System.out.println("Eurreur lors de la connection"+sql);
}
        }
    }//GEN-LAST:event_CBActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
        // TODO add your handling code here:
        
        if (box.getSelectedItem()==box.getSelectedItem()){

String query="Select Id_sal from salle where Nom_sal='"+box.getSelectedItem()+"' ";
//System.out.println(query);

try{
	Class.forName("com.mysql.jdbc.Driver");
}
catch(ClassNotFoundException e)
{System.out.println("erreur du chargement du driver"+e);
}
try{
//String url="jdbc:mysql://localhost/stock","root","";
	
 //String url("jdbc:mysql://localhost:3306/gestion_emprunt2","root","");
	
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionconvo","root","");
Statement st=con.createStatement();
ResultSet resultset=st.executeQuery(query);
while(resultset.next()){

m=resultset.getString("Id_sal");
t4.setText(m);
}
st.close();
con.close();
}
 
catch(SQLException sql){
System.out.println("Eurreur lors de la connection"+sql);
}
        }
                    
    }//GEN-LAST:event_boxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         Convo A =new Convo();
                A.setSize(927, 556);
                A.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:

        try{
            //2.Enregistrer le driver JDBC
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e)
        {System.out.println("erreur du chargement du driver"+e);
        }
        try{
            //3.connextion a la basse

            //String url=("jdbc:mysql://localhost:3306/gestion_emprunt2","root","");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionconvo","root","");
            //4creation d'un Statement

            Statement st=con.createStatement();

            //5.execution d'une requete (ResultSet)

            if(JOptionPane.showConfirmDialog(null,"confirmer la modification","modification",
                JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION){
            st.executeUpdate("UPDATE affecter SET DATE_JOUR='"+t2.getText()+"',Horaire='"+t1.getText()+"',Duree='"+t3.getText()+"',Id_sal='"+t4.getText()+"',Id_mat='"+t5.getText()+"'WHERE Id="+t6.getText());
            afficher();

        }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"erreur de Modifier!!!"+e.getMessage());
            System.err.println(e);}
    }//GEN-LAST:event_b2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        t1.setText("");
        t2.setText("");
        t3.setText("");
        combo.setSelectedItem(2);
        box.setSelectedItem(2);
        CB.setSelectedItem(2);
        
        afficher();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            //2.Enregistrer le driver JDBC
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e)
        {System.out.println("erreur du chargement du driver"+e);
        }
        try{
            //3.connextion a la basse

            //String url=("jdbc:mysql://localhost:3306/gestion_emprunt2","root","");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionconvo","root","");
            //4creation d'un Statement

            Statement st=con.createStatement();

            //5.execution d'une requete (ResultSet)

            if(JOptionPane.showConfirmDialog(null,"Attention vous etes en train de supprimer une affectation , Est ce que vous etes sure?"
                ,"Supprimer l'affectation",
                JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
        if(t6.getText().length() !=0){

            st.executeUpdate("Delete from affecter WHERE Id="+t6.getText()+" and Id_sal="+t4.getText()+" and Id_mat="+t5.getText());

            afficher();
        }
        else{JOptionPane.showMessageDialog(null,"Veuiller SVP remplir le champ Numero d'enseignant!");}
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"erreur de Supprimer\n"+e.getMessage());}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
        
         try{
            int i=tbl.getSelectedRow();
            deplace(i);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"erreur de deplacement"+e.getLocalizedMessage());}
    }//GEN-LAST:event_tblMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Menuform AN =new Menuform();
                 AN.setSize(927, 556);
                AN.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         Administrateur A =new Administrateur();
                A.setSize(927, 556);
                A.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(affecter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(affecter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(affecter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(affecter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              affecter AP =new affecter();
                AP.setSize(927, 556);
                AP.setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CB;
    private javax.swing.JButton b2;
    private javax.swing.JComboBox box;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
