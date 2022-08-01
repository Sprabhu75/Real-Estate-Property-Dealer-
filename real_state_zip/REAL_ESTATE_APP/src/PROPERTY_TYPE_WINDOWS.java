
import java.awt.Color;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import Mysql.MySqlDatabase;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class PROPERTY_TYPE_WINDOWS extends javax.swing.JFrame {
    private Object jTextField_Id;

    /**
     * Creates new form PROPERTY_TYPE_WINDOWS
     */
    public PROPERTY_TYPE_WINDOWS() {
        initComponents();
        
           //set border to te jpanel title 
            MatteBorder panel_title_border=BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(125,125,125));
           Border panel_title__border = null;
        jPanel_Title.setBorder(panel_title__border);
        //set border tothe jbutton
         MatteBorder button_title_border=BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255,255,255));
           Border button__title_border = null;
        Border button_border = null;
        jButton_Add_Type.setBorder(button_border);
        jButton_Edit_Type.setBorder(button_border);
        jButton_Remove_Type.setBorder(button_border);
        jButton_Refersh_Type.setBorder(button_border);
        
        
        //popualte the list
        fillTypeList();
    }
 
     // create a function to populate the j list using the Type hsh map
    
    public void fillTypeList()
    {
        
        P_TYPE type =new P_TYPE();
        HashMap<String,Integer> map=type.getTypesMap();
        
        DefaultListModel listModel= new DefaultListModel();
        int i=0;
       
        for(String typeName:map.keySet())
        {
            listModel.add(1,typeName);
            i++;
            
        }
       jList1.setModel(listModel);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Title = new javax.swing.JPanel();
        jLabel_Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jTextField_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jButton_Add_Type = new javax.swing.JButton();
        jButton_Edit_Type = new javax.swing.JButton();
        jButton_Remove_Type = new javax.swing.JButton();
        jButton_Refersh_Type = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel_Title.setBackground(new java.awt.Color(102, 102, 102));

        jLabel_Title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Title.setText("       PROPERTY TYPE");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Description:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Name:");

        jTextField_Name.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jTextField_id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea_Description.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Description);

        jButton_Add_Type.setBackground(new java.awt.Color(0, 204, 51));
        jButton_Add_Type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add_Type.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_Type.setText("ADD");
        jButton_Add_Type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_TypeActionPerformed(evt);
            }
        });

        jButton_Edit_Type.setBackground(new java.awt.Color(0, 204, 255));
        jButton_Edit_Type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Edit_Type.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Edit_Type.setText("EDIT");
        jButton_Edit_Type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_TypeActionPerformed(evt);
            }
        });

        jButton_Remove_Type.setBackground(new java.awt.Color(255, 153, 51));
        jButton_Remove_Type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Remove_Type.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Remove_Type.setText("REMOVE");
        jButton_Remove_Type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_TypeActionPerformed(evt);
            }
        });

        jButton_Refersh_Type.setBackground(new java.awt.Color(255, 153, 102));
        jButton_Refersh_Type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Refersh_Type.setText("REFRESH");
        jButton_Refersh_Type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refersh_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refersh_TypeActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButton_Add_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jButton_Edit_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButton_Remove_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Refersh_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 23, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(124, 124, 124)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(890, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Remove_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Add_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Refersh_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Edit_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(384, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Edit_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_TypeActionPerformed
        // edit the selected type:
       try
       {
           Integer id =Integer.valueOf(jTextField_id.getText());
          String name= jTextField_Name.getText();
          String description =jTextArea_Description.getText();
        
          P_TYPE type=new P_TYPE(id,name,description);
        
        
          if(!name.trim().equals(""))
          {
            if(type.execTypeQuery("edit", type))
             {
               JOptionPane.showMessageDialog(null," Type Updated","Edit Type",1);
             }
            else
              {
               JOptionPane.showMessageDialog(null,"Operation Failed","Edit Type",2);   
              }
          }
            else
           {  
               JOptionPane.showMessageDialog(null,"Enter The Type Name","Edit name",2);   
                }
       }catch(Exception ex)
       {
       
          JOptionPane.showMessageDialog(null,ex.getMessage()+ " Enter a Valid Type Id","Invalid Id",0);   
       }
       
       
        
    }//GEN-LAST:event_jButton_Edit_TypeActionPerformed

    private void jButton_Remove_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_TypeActionPerformed
        MySqlDatabase ms=new MySqlDatabase("PropTan","property_type", "root", "root");
        ms.Execute("Delete From PropTan where idPropTan="+jTextField_id.getText());
        
     //remove the seleceted type:
      
          try{
                  Integer id =Integer.valueOf(jTextField_id.getText());
                 P_TYPE type=new P_TYPE(id,"","");
        
        
              if(!jTextField_id.getText().trim().equals(""))
              {
            // show a confirmation msg before deleteing the type
                int yes_or_no=JOptionPane.showConfirmDialog(null," Do you want delete this Type" ,"Delete type",JOptionPane.YES_NO_OPTION);
                 if( yes_or_no==JOptionPane.YES_OPTION)
               {
         
                 if(type.execTypeQuery("remove", type))
                 {
                    JOptionPane.showMessageDialog(null," Type Deleted","Delete Type",1);
                 }
                else
                 {
                   JOptionPane.showMessageDialog(null,"Operation Failed","Delete Type",2);   
                 }
               }
            }
               else
               {
                  JOptionPane.showMessageDialog(null,"Enter The Type Id","Empty Id",2);   
               }
            }catch(Exception ex)
              {
                JOptionPane.showMessageDialog(null,ex.getMessage()+ " Enter a Valid Type Id","Invalid Id",0);   
             }
    }//GEN-LAST:event_jButton_Remove_TypeActionPerformed

    private void jButton_Refersh_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refersh_TypeActionPerformed
        // TODO add your handling code here:
        MySqlDatabase ms=new MySqlDatabase("PropTan","property_type", "root", "root");
        //int n=ms.getOne("Select count(idPropTan) from PropTan");
        String d="<html><body><div>";
       //jTextField_id.setText(n+"");
        for (int i = 1; i <=Integer.parseInt(jTextField_id.getText()); i++) {
          String [] data= ms.GetValues("idPropTan", i+"", 3);
          d+="<p>"+data[0]+"&nbsp;&nbsp;&nbsp;"+data[1]+"&nbsp;&nbsp;&nbsp;"+data[2]+"</p>";      
        }
      d+="</div></body></html>";
      jLabel4.setText(d);
    }//GEN-LAST:event_jButton_Refersh_TypeActionPerformed

    private void jButton_Add_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_TypeActionPerformed
        // TODO add your handling code here:
        
        //add a new Type
        String name= jTextField_Name.getText();
        String description =jTextArea_Description.getText();
        MyDB db=new MyDB();
      int x=  db.Insert(jTextField_id.getText(),jTextField_Name.getText(), jTextArea_Description.getText());
        //jTextField_id.setText(x+"");
          String d="<html><body><div>";
      MySqlDatabase ms=new MySqlDatabase("PropTan","property_type", "root", "root"); 
        for (int i = 1; i <=Integer.parseInt(jTextField_id.getText()); i++) {
          String [] data= ms.GetValues("idPropTan", i+"", 3);
          d+="<p>"+data[0]+"&nbsp;&nbsp;&nbsp;"+data[1]+"&nbsp;&nbsp;&nbsp;"+data[2]+"</p>";      
        }
      d+="</div></body></html>";
      jLabel4.setText(d);
      
      /*
        P_TYPE type=new P_TYPE(0,name,description);
        
        
        if(!name.trim().equals(""))
        {
         if(type.execTypeQuery("add", type))
        {
            JOptionPane.showMessageDialog(null,"New type Added","ADD Type",1);
        }
        else
        {
          JOptionPane.showMessageDialog(null,"Operation Failed","ADD Type",2);   
        }   
        }
        else
        {
          JOptionPane.showMessageDialog(null,"Enter the Type Name","Empty Name",2);
        }*/
    }//GEN-LAST:event_jButton_Add_TypeActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        //display the selected type from list to the text fields
        P_TYPE type=new P_TYPE();
        HashMap<String,Integer> map=type.getTypesMap();
        Integer typeId;
        typeId = map.get(jList1.getSelectedValuesList().toString());
        type = type.getTypeById(typeId);
        jTextField_id.setText(type.getId().toString());
        jTextField_Name.setText(type.getName());
        jTextArea_Description.setText(type.getDescription());
    }//GEN-LAST:event_jList1MouseClicked

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
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOWS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOWS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOWS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_TYPE_WINDOWS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROPERTY_TYPE_WINDOWS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Type;
    private javax.swing.JButton jButton_Edit_Type;
    private javax.swing.JButton jButton_Refersh_Type;
    private javax.swing.JButton jButton_Remove_Type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea_Description;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_id;
    // End of variables declaration//GEN-END:variables
}