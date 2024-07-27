import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class quiz extends javax.swing.JFrame {
    static int id ;
    static int score;
  public static int timer=15;
       static Connection con = null;
      static  Statement st = null;
       static ResultSet rs = null;
      public static  String Name;
      public static  String Role;
      public static String Answer;
public static String Two;
public static String Three;
public static String One;
public static String Four;
    public quiz() {
   initComponents();
}
   
  public quiz(String name,String Role1) {
     
    id=1;
     Name=name;
     Role=Role1;
    score=0;

        initComponents();
          welcome.setText(" Welcome       "+name+" ...!");
        answer1.setVisible(false);
       answer.setVisible(false);
        buttonGroup1.add(op1);
        buttonGroup1.add(op2);
        buttonGroup1.add(op3);
        buttonGroup1.add(op4);
        

               try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
                        System.out.println("From parameterized Constructor Loaded");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newproject","root","root");
            System.out.println("Connected");
            
            st = con.createStatement();
            String sql = "SELECT * from "+Role+"  where id=1 ";
            
            rs = st.executeQuery(sql);
            while(rs.next())
            {
               id1.setText(rs.getString(1));
                question.setText(rs.getString(2));
                op1.setText(rs.getString(3));
                op2.setText(rs.getString(4));
            op3.setText(rs.getString(5));
 op4.setText(rs.getString(6));
 answer.setText(rs.getString(7));
 }   con.close();}
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }  
 Two= op2.getText();
       One= op1.getText();
        Three= op3.getText();
         Four= op4.getText();
         Answer=answer.getText();
          submitquiz.setEnabled(false);
           op2.setEnabled(true);op3.setEnabled(true);op1.setEnabled(true);op4.setEnabled(true);
   op4.setBackground(Color.gray);op3.setBackground(Color.gray);op2.setBackground(Color.gray);op1.setBackground(Color.gray);
  
        
       }
public static void Next()
{  id++;

 try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
                                    System.out.println("From Next Constructor Loaded");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newproject","root","root");
            System.out.println("Connected");
            
            st = con.createStatement();}
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
 }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        question = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        answer = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        answer1 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        submitquiz = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        timer3 = new javax.swing.JLabel();
        timer4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(null);

        op1.setBackground(new java.awt.Color(51, 51, 51));
        op1.setFont(new java.awt.Font("Rockwell Condensed", 3, 24)); // NOI18N
        op1.setForeground(new java.awt.Color(255, 255, 255));
        op1.setText("option    1");
        op1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                op1MouseClicked(evt);
            }
        });
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });
        jPanel1.add(op1);
        op1.setBounds(140, 190, 780, 33);

        op2.setBackground(new java.awt.Color(51, 51, 51));
        op2.setFont(new java.awt.Font("Rockwell Condensed", 3, 24)); // NOI18N
        op2.setForeground(new java.awt.Color(255, 255, 255));
        op2.setText("option   2");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });
        jPanel1.add(op2);
        op2.setBounds(140, 260, 780, 33);

        op3.setBackground(new java.awt.Color(51, 51, 51));
        op3.setFont(new java.awt.Font("Rockwell Condensed", 3, 24)); // NOI18N
        op3.setForeground(new java.awt.Color(255, 255, 255));
        op3.setText("option  3    ");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });
        jPanel1.add(op3);
        op3.setBounds(140, 340, 780, 33);

        op4.setBackground(new java.awt.Color(51, 51, 51));
        op4.setFont(new java.awt.Font("Rockwell Condensed", 3, 24)); // NOI18N
        op4.setForeground(new java.awt.Color(255, 255, 255));
        op4.setText("option   4");
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });
        jPanel1.add(op4);
        op4.setBounds(140, 420, 780, 33);

        question.setBackground(new java.awt.Color(204, 204, 204));
        question.setFont(new java.awt.Font("Rockwell Condensed", 3, 24)); // NOI18N
        question.setForeground(new java.awt.Color(0, 51, 51));
        question.setText(" This   is   your  Question");
        jPanel1.add(question);
        question.setBounds(60, 80, 980, 42);

        next.setBackground(new java.awt.Color(255, 204, 255));
        next.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nextlogonew new.jpg"))); // NOI18N
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next);
        next.setBounds(390, 560, 140, 50);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exitnew.jpg"))); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1100, 20, 140, 44);

        answer.setBackground(new java.awt.Color(255, 255, 255));
        answer.setFont(new java.awt.Font("Rockwell Condensed", 3, 24)); // NOI18N
        answer.setForeground(new java.awt.Color(0, 51, 51));
        answer.setText("Answer");
        jPanel1.add(answer);
        answer.setBounds(330, 490, 536, 42);

        welcome.setBackground(new java.awt.Color(0, 153, 153));
        welcome.setFont(new java.awt.Font("Rockwell Condensed", 3, 36)); // NOI18N
        welcome.setForeground(new java.awt.Color(0, 51, 51));
        welcome.setText("Welcome User..");
        jPanel1.add(welcome);
        welcome.setBounds(520, 20, 390, 42);

        answer1.setBackground(new java.awt.Color(255, 255, 255));
        answer1.setFont(new java.awt.Font("Rockwell Condensed", 3, 24)); // NOI18N
        answer1.setForeground(new java.awt.Color(0, 51, 51));
        answer1.setText(" Correct  Answer");
        jPanel1.add(answer1);
        answer1.setBounds(60, 490, 220, 42);

        id1.setBackground(new java.awt.Color(255, 255, 255));
        id1.setFont(new java.awt.Font("Rockwell Condensed", 3, 24)); // NOI18N
        id1.setForeground(new java.awt.Color(0, 51, 51));
        id1.setText("id");
        jPanel1.add(id1);
        id1.setBounds(20, 80, 28, 42);

        submit.setBackground(new java.awt.Color(255, 204, 255));
        submit.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/check.jpg"))); // NOI18N
        submit.setText("Check");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(160, 560, 130, 50);

        submitquiz.setBackground(new java.awt.Color(255, 204, 255));
        submitquiz.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        submitquiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/subsub.jpg"))); // NOI18N
        submitquiz.setText("Submit Quiz");
        submitquiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitquizActionPerformed(evt);
            }
        });
        jPanel1.add(submitquiz);
        submitquiz.setBounds(660, 560, 200, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/j1.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1250, 820);

        timer3.setBackground(new java.awt.Color(51, 51, 255));
        timer3.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        timer3.setForeground(new java.awt.Color(0, 204, 204));
        timer3.setText("Time     :");
        jPanel1.add(timer3);
        timer3.setBounds(520, 10, 114, 42);

        timer4.setBackground(new java.awt.Color(51, 51, 255));
        timer4.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        timer4.setForeground(new java.awt.Color(0, 204, 204));
        timer4.setText("Timer   0:00");
        jPanel1.add(timer4);
        timer4.setBounds(637, 13, 114, 42);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
System.exit(0);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
   op2.setEnabled(true);op3.setEnabled(true);op1.setEnabled(true);op4.setEnabled(true);
   op4.setBackground(Color.gray);op3.setBackground(Color.gray);op2.setBackground(Color.gray);op1.setBackground(Color.gray);
        quiz.Next();
    
 if(id==5)
{ submitquiz.setEnabled(true);}
   buttonGroup1.clearSelection();
        answer.setVisible(false);
        answer1.setVisible(false);
        try
        {String sql = "SELECT * from "+Role+"  where id='"+id+"' ";
            rs = st.executeQuery(sql);
                        System.out.println("From next Action performed Loaded");

            while(rs.next())
            {id1.setText(rs.getString(1));
                question.setText(rs.getString(2));
                op1.setText(rs.getString(3));
                op2.setText(rs.getString(4));
            op3.setText(rs.getString(5));
 op4.setText(rs.getString(6));
 answer.setText(rs.getString(7));}
                     
             con.close();}
        
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
 Two= op2.getText();
       One= op1.getText();
        Three= op3.getText();
         Four= op4.getText();
         Answer=answer.getText();

        
    }//GEN-LAST:event_nextActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
      
    }//GEN-LAST:event_op1ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op4ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
answer1.setVisible(true);
answer.setVisible(true);
if(op1.isSelected()&& One.equals(Answer))
        {score ++;
        op1.setBackground(Color.green);op3.setBackground(Color.red);op2.setBackground(Color.red);op4.setBackground(Color.red);
        op2.setEnabled(false);op3.setEnabled(false);op4.setEnabled(false);
        }
         if(op2.isSelected()&& Two.equals(Answer))
        {score++;  
        op2.setBackground(Color.green);op3.setBackground(Color.red);op4.setBackground(Color.red);op1.setBackground(Color.red);
        op1.setEnabled(false);op3.setEnabled(false);op4.setEnabled(false);
        }
          if(op3.isSelected()&& Three.equals(Answer))
        {score ++;   
        op3.setBackground(Color.green);op4.setBackground(Color.red);op2.setBackground(Color.red);op1.setBackground(Color.red);
        op2.setEnabled(false);op1.setEnabled(false);op4.setEnabled(false);
        }
          if(op4.isSelected()&& Four.equals(Answer))
        {score ++;  
        op4.setBackground(Color.green);op3.setBackground(Color.red);op2.setBackground(Color.red);op1.setBackground(Color.red);
        op2.setEnabled(false);op3.setEnabled(false);op1.setEnabled(false);
        }
          if(op1.isSelected()&& !One.equals(Answer))
          { op1.setBackground(Color.red);
              op2.setEnabled(false);op3.setEnabled(false);op4.setEnabled(false); }
          
          if(op2.isSelected()&& !Two.equals(Answer))
          {op2.setBackground(Color.red);
              op1.setEnabled(false);op3.setEnabled(false);op4.setEnabled(false);  }
          
          if(op3.isSelected()&& !Three.equals(Answer))
          { op3.setBackground(Color.red);
               op2.setEnabled(false);op1.setEnabled(false);op4.setEnabled(false);
          }
          
          if(op4.isSelected()&& !Four.equals(Answer))
          { op4.setBackground(Color.red);
                      op2.setEnabled(false);op3.setEnabled(false);op1.setEnabled(false);

          }
    }//GEN-LAST:event_submitActionPerformed

    private void op1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_op1MouseClicked

    }//GEN-LAST:event_op1MouseClicked

    private void submitquizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitquizActionPerformed

        score sc=new score(Name,score,Role)  ;   
sc.setVisible(true);
this.setVisible(false);
  
    }//GEN-LAST:event_submitquizActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed

    }//GEN-LAST:event_op3ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op2ActionPerformed
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
                new quiz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answer;
    private javax.swing.JLabel answer1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton next;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JLabel question;
    private javax.swing.JButton submit;
    private javax.swing.JButton submitquiz;
    private javax.swing.JLabel timer3;
    private javax.swing.JLabel timer4;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
