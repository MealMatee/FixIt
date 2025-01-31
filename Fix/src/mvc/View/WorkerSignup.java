/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mvc.View;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import swing.RippleEffectLabel;
import swing.RoundedBorder;
import javax.swing.ButtonGroup;


/**
 *
 * @author Legion
 */
public class WorkerSignup extends javax.swing.JFrame {
private Point initialClick;
    /**
     * Creates new form worker_singup
     */
    public WorkerSignup() {
        initComponents();
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        btnSignin.setVisible(false);
        makeDraggable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradiente1 = new swing.PanelGradiente();
        panelBorder1 = new swing.PanelBorder();
        slidehover = new swing.PanelSlide();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        slide = new swing.PanelSlide();
        lblWorkerSignup = new javax.swing.JLabel();
        btnSignup = new swing.Button();
        lblPassword = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        btnDashBoard = new swing.Button();
        lblLastName = new javax.swing.JLabel();
        lblWorkCertificate = new javax.swing.JLabel();
        txtEmail = new swing.EmailField();
        lblGender = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        txtLastName = new swing.TextField();
        txtContact = new swing.TextField();
        txtFirstName = new swing.TextField();
        txtPassword = new swing.PasswordField();
        txtConfirmPassword = new swing.PasswordField();
        lblEmail = new javax.swing.JLabel();
        rbtnFemale = new javax.swing.JRadioButton();
        rbtnMale = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        titleBar = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelGradiente1.setColorPrimario(new java.awt.Color(0, 153, 204));
        panelGradiente1.setColorSecundario(new java.awt.Color(153, 204, 255));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        slidehover.setBackground(new java.awt.Color(255, 255, 255));
        slidehover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                slidehoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                slidehoverMouseExited(evt);
            }
        });
        slidehover.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Already have an account?");
        slidehover.add(jLabel1);
        jLabel1.setBounds(20, 110, 450, 90);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Please Sign In with your email and password");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        slidehover.add(jLabel2);
        jLabel2.setBounds(20, 220, 460, 70);

        btnSignin = new RippleEffectLabel("Sign In");
        btnSignin.setFont(new java.awt.Font("Segoe UI", 1, 20)); // You can adjust the font as needed
        btnSignin.setForeground(new java.awt.Color(255, 255, 255)); // Text color
        btnSignin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSignin.setBorder(new RoundedBorder(40, Color.WHITE, 2)); // Rounded border as in your original code
        btnSignin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        slidehover.add(btnSignin);
        btnSignin.setBounds(117, 356, 170, 60);

        btnSignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSigninMouseEntered(evt);
            }

        });
        btnSignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSigninMouseClicked(evt);
            }
        });
        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/workersignup.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        slidehover.add(jLabel3);
        jLabel3.setBounds(0, 0, 480, 620);

        panelBorder1.add(slidehover);
        slidehover.setBounds(10, 10, 480, 610);

        slide.setBackground(new java.awt.Color(255, 255, 255));
        // Inside initComponents() method
        genderGroup = new ButtonGroup();
        genderGroup.add(rbtnMale);
        genderGroup.add(rbtnFemale);
        rbtnMale.setSelected(true);
        slide.setLayout(null);

        lblWorkerSignup.setBackground(new java.awt.Color(255, 255, 255));
        lblWorkerSignup.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblWorkerSignup.setForeground(new java.awt.Color(54, 66, 81));
        lblWorkerSignup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWorkerSignup.setText("Worker SignUp");
        slide.add(lblWorkerSignup);
        lblWorkerSignup.setBounds(110, 40, 280, 48);

        btnSignup.setBackground(new java.awt.Color(6, 57, 98));
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setText("Next");
        btnSignup.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSignup.setRound(40);
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        slide.add(btnSignup);
        btnSignup.setBounds(180, 530, 180, 60);

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPassword.setText("Password :");
        slide.add(lblPassword);
        lblPassword.setBounds(50, 340, 90, 25);

        lblFirstName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFirstName.setText("First Name :");
        slide.add(lblFirstName);
        lblFirstName.setBounds(50, 100, 94, 25);

        btnDashBoard.setBackground(new java.awt.Color(123, 26, 7));
        btnDashBoard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashBoard.setText("Home Page");
        btnDashBoard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDashBoard.setRound(40);
        btnDashBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashBoardActionPerformed(evt);
            }
        });
        slide.add(btnDashBoard);
        btnDashBoard.setBounds(420, 10, 110, 50);

        lblLastName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLastName.setText("Last Name :");
        slide.add(lblLastName);
        lblLastName.setBounds(290, 100, 94, 25);

        lblWorkCertificate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblWorkCertificate.setText("Working Sector :");
        slide.add(lblWorkCertificate);
        lblWorkCertificate.setBounds(290, 180, 150, 25);

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setRound(40);
        slide.add(txtEmail);
        txtEmail.setBounds(40, 210, 210, 50);

        lblGender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGender.setText("Gender :");
        slide.add(lblGender);
        lblGender.setBounds(300, 260, 110, 25);

        lblContactNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblContactNo.setText("Contact No. :");
        slide.add(lblContactNo);
        lblContactNo.setBounds(50, 260, 110, 25);

        lblConfirmPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblConfirmPassword.setText("Confirm Password :");
        slide.add(lblConfirmPassword);
        lblConfirmPassword.setBounds(50, 430, 160, 25);

        txtLastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLastName.setPlaceholder("Enter Your Last Name");
        txtLastName.setRound(40);
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        slide.add(txtLastName);
        txtLastName.setBounds(280, 130, 220, 50);

        txtContact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtContact.setPlaceholder("+977 98XXXXXXXX");
        txtContact.setRound(40);
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        slide.add(txtContact);
        txtContact.setBounds(40, 290, 210, 50);

        txtFirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFirstName.setPlaceholder("Enter Your First Name");
        txtFirstName.setRound(40);
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        slide.add(txtFirstName);
        txtFirstName.setBounds(40, 130, 210, 50);

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setPlaceholder("Enter Your Password");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        slide.add(txtPassword);
        txtPassword.setBounds(40, 370, 460, 50);

        txtConfirmPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtConfirmPassword.setPlaceholder("Re-Enter Your Password");
        txtConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordActionPerformed(evt);
            }
        });
        slide.add(txtConfirmPassword);
        txtConfirmPassword.setBounds(40, 460, 460, 50);

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setText("Email :");
        slide.add(lblEmail);
        lblEmail.setBounds(50, 180, 94, 25);

        rbtnFemale.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rbtnFemale.setText("Female");
        rbtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFemaleActionPerformed(evt);
            }
        });
        slide.add(rbtnFemale);
        rbtnFemale.setBounds(370, 300, 80, 20);

        rbtnMale.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rbtnMale.setText("Male");
        rbtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMaleActionPerformed(evt);
            }
        });
        slide.add(rbtnMale);
        rbtnMale.setBounds(300, 300, 70, 20);

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plumbing", "Electrician", "Carpentry" }));
        jComboBox1.setOpaque(true);
        slide.add(jComboBox1);
        jComboBox1.setBounds(290, 210, 200, 50);

        panelBorder1.add(slide);
        slide.setBounds(460, 10, 530, 610);

        titleBar.setBackground(new java.awt.Color(204, 255, 255));

        btnClose.setBackground(new java.awt.Color(204, 255, 255));
        btnClose.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setText("x");
        btnClose.setOpaque(true);
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });

        btnMinimize.setBackground(new java.awt.Color(204, 255, 255));
        btnMinimize.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimize.setText("-");
        btnMinimize.setOpaque(true);
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseExited(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 204, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/usesignupicon.png"))); // NOI18N
        jLabel4.setText("Admin Login");

        javax.swing.GroupLayout titleBarLayout = new javax.swing.GroupLayout(titleBar);
        titleBar.setLayout(titleBarLayout);
        titleBarLayout.setHorizontalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleBarLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        titleBarLayout.setVerticalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelGradiente1.setLayer(panelBorder1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelGradiente1.setLayer(titleBar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelGradiente1Layout = new javax.swing.GroupLayout(panelGradiente1);
        panelGradiente1.setLayout(panelGradiente1Layout);
        panelGradiente1Layout.setHorizontalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradiente1Layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGradiente1Layout.setVerticalGroup(
            panelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGradiente1Layout.createSequentialGroup()
                .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 private void makeDraggable() {
        // MouseListener for dragging the window
        titleBar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();  // Store initial click position
            }
        });
     
     titleBar.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Get the location of the window
                int x = getLocation().x;
                int y = getLocation().y;
                
                // Calculate how far the mouse has moved and set the new position
                int deltaX = e.getX() - initialClick.x;
                int deltaY = e.getY() - initialClick.y;
                
                setLocation(x + deltaX, y + deltaY);
            }
        });
    }
    private void slidehoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slidehoverMouseEntered
     
    }//GEN-LAST:event_slidehoverMouseEntered

    private void slidehoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slidehoverMouseExited
   
    }//GEN-LAST:event_slidehoverMouseExited

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
       
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnDashBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashBoardActionPerformed
        // TODO add your handling code here:
         this.dispose();
        HomePage home = new HomePage();
        home.setVisible(true);
    }//GEN-LAST:event_btnDashBoardActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/workersignupblur.png")));
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        btnSignin.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/workersignup.png")));
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        btnSignin.setVisible(false);

    }//GEN-LAST:event_jLabel3MouseExited

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        // TODO add your handling code here:
        btnClose.setBackground(new Color(139, 0, 0));
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        // TODO add your handling code here:
        btnClose.setBackground(new Color(204, 255, 255));
    }//GEN-LAST:event_btnCloseMouseExited

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        // TODO add your handling code here:
        setState(AdminLogin.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void btnMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseEntered
        // TODO add your handling code here:
        btnMinimize.setBackground(new Color(211,211,211));
    }//GEN-LAST:event_btnMinimizeMouseEntered

    private void btnMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseExited
        // TODO add your handling code here:
        btnMinimize.setBackground(new Color(204,255,255));
    }//GEN-LAST:event_btnMinimizeMouseExited

    private void rbtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnFemaleActionPerformed

    private void rbtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnMaleActionPerformed
private void btnSigninMouseEntered(java.awt.event.MouseEvent evt) {    
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/workersignupblur.png")));
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        btnSignin.setVisible(true);
}
    private void btnSigninMouseClicked(java.awt.event.MouseEvent evt) {
        WorkerLogin login = new WorkerLogin();
        login.setVisible(true);
        this.setVisible(false);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkerSignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private swing.Button btnDashBoard;
    private javax.swing.JLabel btnMinimize;
    private swing.Button btnSignup;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblWorkCertificate;
    private javax.swing.JLabel lblWorkerSignup;
    private swing.PanelBorder panelBorder1;
    private swing.PanelGradiente panelGradiente1;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private swing.PanelSlide slide;
    private swing.PanelSlide slidehover;
    private javax.swing.JPanel titleBar;
    private swing.PasswordField txtConfirmPassword;
    private swing.TextField txtContact;
    private swing.EmailField txtEmail;
    private swing.TextField txtFirstName;
    private swing.TextField txtLastName;
    private swing.PasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
private ButtonGroup genderGroup;
private javax.swing.JLabel btnSignin;
}
