
package fillmyenergy;

import static fillmyenergy.main.hitungBMR;
import static fillmyenergy.main.hitungCal;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Display extends javax.swing.JFrame {

    public Display() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exerciseRate = new javax.swing.ButtonGroup();
        gender = new javax.swing.ButtonGroup();
        plan = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_umur = new javax.swing.JLabel();
        umur = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        berat = new javax.swing.JTextField();
        txt_berat = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tinggi = new javax.swing.JTextField();
        txt_tinggi = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        exerExplain = new javax.swing.JLabel();
        exerExplainTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exercise1 = new javax.swing.JToggleButton();
        exercise2 = new javax.swing.JToggleButton();
        exercise4 = new javax.swing.JToggleButton();
        exercise3 = new javax.swing.JToggleButton();
        exercise5 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BMRbutton = new javax.swing.JButton();
        BMRvalue = new javax.swing.JLabel();
        femaleButton = new javax.swing.JToggleButton();
        maleButton = new javax.swing.JToggleButton();
        txt_gender = new javax.swing.JLabel();
        weightPlan2 = new javax.swing.JToggleButton();
        weightPlan3 = new javax.swing.JToggleButton();
        weightPlan5 = new javax.swing.JToggleButton();
        weightPlan4 = new javax.swing.JToggleButton();
        weightPlan1 = new javax.swing.JToggleButton();
        weightPlan7 = new javax.swing.JToggleButton();
        weightPlan6 = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        GenerateMeal = new javax.swing.JButton();
        GenerateCal = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        calNeed = new javax.swing.JLabel();
        calMeal = new javax.swing.JLabel();
        priceMeal = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listMakanan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 100));

        txt_umur.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_umur.setForeground(new java.awt.Color(255, 51, 0));
        txt_umur.setText("Insert Your Age:");
        jPanel1.add(txt_umur, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 100, 20));

        umur.setBackground(java.awt.Color.darkGray);
        umur.setForeground(new java.awt.Color(255, 255, 255));
        umur.setBorder(null);
        umur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                umurMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                umurMouseExited(evt);
            }
        });
        umur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umurActionPerformed(evt);
            }
        });
        jPanel1.add(umur, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 160, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 160, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 160, -1));

        berat.setBackground(java.awt.Color.darkGray);
        berat.setForeground(new java.awt.Color(255, 255, 255));
        berat.setBorder(null);
        berat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                beratMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                beratMouseExited(evt);
            }
        });
        berat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beratActionPerformed(evt);
            }
        });
        jPanel1.add(berat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 160, -1));

        txt_berat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_berat.setForeground(new java.awt.Color(255, 51, 0));
        txt_berat.setText("Insert Your Weight:");
        jPanel1.add(txt_berat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 150, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 160, -1));

        tinggi.setBackground(java.awt.Color.darkGray);
        tinggi.setForeground(new java.awt.Color(255, 255, 255));
        tinggi.setBorder(null);
        tinggi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tinggiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tinggiMouseExited(evt);
            }
        });
        tinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinggiActionPerformed(evt);
            }
        });
        jPanel1.add(tinggi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 160, -1));

        txt_tinggi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_tinggi.setForeground(new java.awt.Color(255, 51, 0));
        txt_tinggi.setText("Insert Your Height:");
        jPanel1.add(txt_tinggi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 150, 20));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        exerExplain.setForeground(java.awt.Color.white);
        exerExplain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        exerExplainTitle.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        exerExplainTitle.setForeground(new java.awt.Color(255, 51, 0));
        exerExplainTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fillmyenergy/asset/dumbbell(1).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("EXERCISE RATE");

        jLabel3.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("Select your");

        exercise1.setBackground(new java.awt.Color(51, 51, 51));
        exerciseRate.add(exercise1);
        exercise1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exercise1.setForeground(new java.awt.Color(255, 255, 255));
        exercise1.setText("<html>Little / Never Exercise");
        exercise1.setBorderPainted(false);
        exercise1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exercise1MouseEntered1(evt);
            }
        });
        exercise1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exercise1ActionPerformed(evt);
            }
        });

        exercise2.setBackground(new java.awt.Color(51, 51, 51));
        exerciseRate.add(exercise2);
        exercise2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exercise2.setForeground(new java.awt.Color(255, 255, 255));
        exercise2.setText("Light Exercise");
        exercise2.setBorderPainted(false);
        exercise2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exercise2MouseEntered(evt);
            }
        });
        exercise2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exercise2ActionPerformed(evt);
            }
        });

        exercise4.setBackground(new java.awt.Color(51, 51, 51));
        exerciseRate.add(exercise4);
        exercise4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exercise4.setForeground(new java.awt.Color(255, 255, 255));
        exercise4.setText("Hard Exercise");
        exercise4.setBorderPainted(false);
        exercise4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exercise4MouseEntered(evt);
            }
        });
        exercise4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exercise4ActionPerformed(evt);
            }
        });

        exercise3.setBackground(new java.awt.Color(51, 51, 51));
        exerciseRate.add(exercise3);
        exercise3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exercise3.setForeground(new java.awt.Color(255, 255, 255));
        exercise3.setText("<html>Moderate Exercise");
        exercise3.setBorderPainted(false);
        exercise3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exercise3MouseEntered(evt);
            }
        });

        exercise5.setBackground(new java.awt.Color(51, 51, 51));
        exerciseRate.add(exercise5);
        exercise5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exercise5.setForeground(new java.awt.Color(255, 255, 255));
        exercise5.setText("<html>Very Hard Exercise");
        exercise5.setBorderPainted(false);
        exercise5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exercise5MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exercise1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exercise3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(exercise2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exercise4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exercise5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exerExplain, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exerExplainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(exercise1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exercise3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(exercise2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exercise4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exercise5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(exerExplainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exerExplain, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 290, 710));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fillmyenergy/asset/questionnaire(1).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setText("Find Your");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 3, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setText("BMR");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 0));
        jLabel7.setText("Your Basal Metabolic Rate is:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        BMRbutton.setBackground(new java.awt.Color(255, 51, 0));
        BMRbutton.setText("Enter");
        BMRbutton.setBorderPainted(false);
        BMRbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMRbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(BMRbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 90, -1));

        BMRvalue.setFont(new java.awt.Font("Calibri", 0, 60)); // NOI18N
        BMRvalue.setForeground(new java.awt.Color(255, 255, 255));
        BMRvalue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BMRvalue.setToolTipText("");
        jPanel1.add(BMRvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 180, 80));

        femaleButton.setBackground(new java.awt.Color(255, 153, 153));
        gender.add(femaleButton);
        femaleButton.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        femaleButton.setForeground(new java.awt.Color(255, 51, 0));
        femaleButton.setText("Female");
        jPanel1.add(femaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 80, 40));

        maleButton.setBackground(new java.awt.Color(255, 153, 153));
        gender.add(maleButton);
        maleButton.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        maleButton.setForeground(new java.awt.Color(255, 51, 0));
        maleButton.setText("Male");
        jPanel1.add(maleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 80, 40));

        txt_gender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_gender.setForeground(new java.awt.Color(255, 51, 0));
        txt_gender.setText("Select Your Gender:");
        jPanel1.add(txt_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 150, 20));

        weightPlan2.setBackground(new java.awt.Color(255, 51, 0));
        plan.add(weightPlan2);
        weightPlan2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        weightPlan2.setForeground(new java.awt.Color(255, 255, 255));
        weightPlan2.setText("Weight Loss");
        weightPlan2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                weightPlan2MouseEntered(evt);
            }
        });
        weightPlan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightPlan2ActionPerformed(evt);
            }
        });
        jPanel1.add(weightPlan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 180, 50));

        weightPlan3.setBackground(new java.awt.Color(255, 51, 0));
        plan.add(weightPlan3);
        weightPlan3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        weightPlan3.setForeground(new java.awt.Color(255, 255, 255));
        weightPlan3.setText("Mild Weight Loss");
        weightPlan3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                weightPlan3MouseEntered(evt);
            }
        });
        jPanel1.add(weightPlan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 180, 50));

        weightPlan5.setBackground(new java.awt.Color(255, 51, 0));
        plan.add(weightPlan5);
        weightPlan5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        weightPlan5.setForeground(new java.awt.Color(255, 255, 255));
        weightPlan5.setText("Mild Weight Gain");
        weightPlan5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                weightPlan5MouseEntered(evt);
            }
        });
        jPanel1.add(weightPlan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 180, 50));

        weightPlan4.setBackground(new java.awt.Color(255, 51, 0));
        plan.add(weightPlan4);
        weightPlan4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        weightPlan4.setForeground(new java.awt.Color(255, 255, 255));
        weightPlan4.setText("Maintain Weight");
        weightPlan4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                weightPlan4MouseEntered1(evt);
            }
        });
        weightPlan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightPlan4ActionPerformed(evt);
            }
        });
        jPanel1.add(weightPlan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 180, 50));

        weightPlan1.setBackground(new java.awt.Color(255, 51, 0));
        plan.add(weightPlan1);
        weightPlan1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        weightPlan1.setForeground(new java.awt.Color(255, 255, 255));
        weightPlan1.setText("Extreme Weight Loss");
        weightPlan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                weightPlan1MouseEntered(evt);
            }
        });
        weightPlan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightPlan1ActionPerformed(evt);
            }
        });
        jPanel1.add(weightPlan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 180, 50));

        weightPlan7.setBackground(new java.awt.Color(255, 51, 0));
        plan.add(weightPlan7);
        weightPlan7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        weightPlan7.setForeground(new java.awt.Color(255, 255, 255));
        weightPlan7.setText("Fast Weight Gain");
        weightPlan7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                weightPlan7MouseEntered(evt);
            }
        });
        weightPlan7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightPlan7ActionPerformed(evt);
            }
        });
        jPanel1.add(weightPlan7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 180, 50));

        weightPlan6.setBackground(new java.awt.Color(255, 51, 0));
        plan.add(weightPlan6);
        weightPlan6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        weightPlan6.setForeground(new java.awt.Color(255, 255, 255));
        weightPlan6.setText("Weight Gain");
        weightPlan6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                weightPlan6MouseEntered(evt);
            }
        });
        weightPlan6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightPlan6ActionPerformed(evt);
            }
        });
        jPanel1.add(weightPlan6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 180, 50));

        jLabel9.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 0));
        jLabel9.setText("Choose your");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 0));
        jLabel8.setText("Weight Plan");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fillmyenergy/asset/scale.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 70, 70));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 51, 0));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fillmyenergy/asset/salad.png"))); // NOI18N

        GenerateMeal.setBackground(new java.awt.Color(255, 51, 0));
        GenerateMeal.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        GenerateMeal.setText("Generate Daily Meal Plan");
        GenerateMeal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GenerateMeal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenerateMealMouseClicked(evt);
            }
        });

        GenerateCal.setBackground(new java.awt.Color(255, 51, 0));
        GenerateCal.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        GenerateCal.setText("Generate Your Calorie Needs");
        GenerateCal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GenerateCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateCalActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel12.setText("Your daily callorie needs is:");

        jLabel13.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel13.setText("Total calorie on this meal plan:");

        jLabel14.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        jLabel14.setText("How much it cost (IDR):");

        calNeed.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        calNeed.setForeground(new java.awt.Color(255, 255, 255));

        calMeal.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        calMeal.setForeground(new java.awt.Color(255, 255, 255));

        priceMeal.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        priceMeal.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(calNeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(GenerateCal, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(GenerateMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenerateMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenerateCal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calNeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(3, 3, 3)
                        .addComponent(calMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 150));

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listMakanan.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        listMakanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menu", "Calorie (KKAL)", "Portion (gram)", "Price (IDR)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(listMakanan);
        if (listMakanan.getColumnModel().getColumnCount() > 0) {
            listMakanan.getColumnModel().getColumn(0).setResizable(false);
            listMakanan.getColumnModel().getColumn(1).setResizable(false);
            listMakanan.getColumnModel().getColumn(2).setResizable(false);
            listMakanan.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 470));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 560, 470));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 560, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void umurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_umurActionPerformed

    private void beratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beratActionPerformed

    private void tinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tinggiActionPerformed

    private void umurMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_umurMouseEntered
        txt_umur.setForeground(new Color(255,145,0));
    }//GEN-LAST:event_umurMouseEntered

    private void umurMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_umurMouseExited
        txt_umur.setForeground(new Color(255,51,0));
    }//GEN-LAST:event_umurMouseExited

    private void beratMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beratMouseEntered
        txt_berat.setForeground(new Color(255,145,0));
    }//GEN-LAST:event_beratMouseEntered

    private void beratMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beratMouseExited
        txt_berat.setForeground(new Color(255,51,0));
    }//GEN-LAST:event_beratMouseExited

    private void tinggiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tinggiMouseExited
        txt_tinggi.setForeground(new Color(255,51,0));
    }//GEN-LAST:event_tinggiMouseExited

    private void tinggiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tinggiMouseEntered
        txt_tinggi.setForeground(new Color(255,145,0));
    }//GEN-LAST:event_tinggiMouseEntered

    private void exercise2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercise2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exercise2ActionPerformed

    private void exercise4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercise4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exercise4ActionPerformed

    private void exercise1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercise1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exercise1ActionPerformed
    
    public int getGender(){
    if(maleButton.isSelected())return 1;
    else if(femaleButton.isSelected())return 2;
    else return 0;
    }
   
    public int getExerRate(){
    if(exercise1.isSelected())return 1;
    else if(exercise2.isSelected())return 2;
    else if(exercise3.isSelected())return 3;
    else if(exercise4.isSelected())return 4;
    else if(exercise5.isSelected())return 5;
    else return 0;
    }
    
    public int getWeightPlan(){
    if(weightPlan1.isSelected())return 1;
    else if(weightPlan2.isSelected())return 2;
    else if(weightPlan3.isSelected())return 3;
    else if(weightPlan4.isSelected())return 4;
    else if(weightPlan5.isSelected())return 5;
    else if(weightPlan6.isSelected())return 6;
    else if(weightPlan7.isSelected())return 7;
    else return 0;
    }
    
    private void BMRbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMRbuttonActionPerformed
        
        Float age = Float.parseFloat(umur.getText());
        Float weight = Float.parseFloat(berat.getText());
        Float height = Float.parseFloat(tinggi.getText());
        int gender = getGender();
        
        
        Float BMR = main.hitungBMR(age, weight, height, gender);
        BMRvalue.setText(BMR.toString());
        BMRvalue.setVisible(true);
    }//GEN-LAST:event_BMRbuttonActionPerformed

    private void exercise2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exercise2MouseEntered
       exerExplainTitle.setText("Light Exercise");
       exerExplainTitle.setVisible(true);
       exerExplain.setText("<html>For a slightly active person who performs light exercise 1-3 days a week</html>");
       exerExplain.setVisible(true);
    }//GEN-LAST:event_exercise2MouseEntered

    private void exercise1MouseEntered1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exercise1MouseEntered1
        exerExplainTitle.setText("Little / No Exercise");
       exerExplainTitle.setVisible(true);
       exerExplain.setText("<html>For a a person who does a little to no exercise</html>");
       exerExplain.setVisible(true);
    }//GEN-LAST:event_exercise1MouseEntered1

    private void exercise5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exercise5MouseEntered
        exerExplainTitle.setText("Very Hard Exercise");
       exerExplainTitle.setVisible(true);
       exerExplain.setText("<html>For an extra active person who either has a physically demanding job or has a particularly challenging exercise routine</html>");
       exerExplain.setVisible(true);
    }//GEN-LAST:event_exercise5MouseEntered

    private void exercise4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exercise4MouseEntered
       exerExplainTitle.setText("Hard Exercise");
       exerExplainTitle.setVisible(true);
       exerExplain.setText("<html>For a very active person who performs hard exercise 6-7 days a week</html>");
       exerExplain.setVisible(true);
    }//GEN-LAST:event_exercise4MouseEntered

    private void exercise3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exercise3MouseEntered
        exerExplainTitle.setText("Moderate Exercise");
       exerExplainTitle.setVisible(true);
       exerExplain.setText("<html>For a moderately active person who performs moderate exercise 3-5 days a week</html>");
       exerExplain.setVisible(true);
    }//GEN-LAST:event_exercise3MouseEntered

    private void weightPlan4MouseEntered1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weightPlan4MouseEntered1
        // TODO add your handling code here:
    }//GEN-LAST:event_weightPlan4MouseEntered1

    private void weightPlan4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightPlan4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightPlan4ActionPerformed

    private void weightPlan1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weightPlan1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_weightPlan1MouseEntered

    private void weightPlan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightPlan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightPlan1ActionPerformed

    private void weightPlan3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weightPlan3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_weightPlan3MouseEntered

    private void weightPlan2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weightPlan2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_weightPlan2MouseEntered

    private void weightPlan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightPlan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightPlan2ActionPerformed

    private void weightPlan5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weightPlan5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_weightPlan5MouseEntered

    private void weightPlan7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weightPlan7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_weightPlan7MouseEntered

    private void weightPlan7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightPlan7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightPlan7ActionPerformed

    private void weightPlan6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weightPlan6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_weightPlan6MouseEntered

    private void weightPlan6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightPlan6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightPlan6ActionPerformed

    private void GenerateCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateCalActionPerformed
        Float age = Float.parseFloat(umur.getText());
        Float weight = Float.parseFloat(berat.getText());
        Float height = Float.parseFloat(tinggi.getText());
        int gender = getGender();
        int weightPlan = getWeightPlan();
        int exerRate = getExerRate();
        
        Float calNeedValue = main.hitungCal(age,weight,height,gender,weightPlan,exerRate);
        calNeed.setText(calNeedValue.toString());
        calNeed.setVisible(true);
        
    }//GEN-LAST:event_GenerateCalActionPerformed

    private void GenerateMealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerateMealMouseClicked
        Float age = Float.parseFloat(umur.getText());
        Float weight = Float.parseFloat(berat.getText());
        Float height = Float.parseFloat(tinggi.getText());
        int gender = getGender();
        int weightPlan = getWeightPlan();
        int exerRate = getExerRate();
        
        Float calNeedValue = main.hitungCal(age,weight,height,gender,weightPlan,exerRate);
       
        main.knapsack(calNeedValue);
        addTable();
           
        Float totalCal = 0f;
        for (int i = 0; i < main.pilihan.size(); i++){
        totalCal += main.pilihan.get(i).energy;
        }
        
        Float totalPrice = 0f;
        for (int i = 0; i < main.pilihan.size(); i++){
        totalPrice += main.pilihan.get(i).price;
        }
        
        calMeal.setText(totalCal.toString());
        calMeal.setVisible(true);
        
        priceMeal.setText(totalPrice.toString());
        priceMeal.setVisible(true);
    }//GEN-LAST:event_GenerateMealMouseClicked
    public void addTable(){
    
    DefaultTableModel model = (DefaultTableModel) listMakanan.getModel();
    Object rowData[]=new Object[4];
    for (int i = 0; i < main.pilihan.size(); i++){
        rowData[0] = main.pilihan.get(i).name;
        rowData[1] = main.pilihan.get(i).energy;
        rowData[2] = main.pilihan.get(i).berat;
        rowData[3] = main.pilihan.get(i).price;
        model.addRow(rowData);
    }
    
    }
    
    
    
    
    public static void display() {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BMRbutton;
    private javax.swing.JLabel BMRvalue;
    private javax.swing.JButton GenerateCal;
    private javax.swing.JButton GenerateMeal;
    private javax.swing.JTextField berat;
    private javax.swing.JLabel calMeal;
    private javax.swing.JLabel calNeed;
    private javax.swing.JLabel exerExplain;
    private javax.swing.JLabel exerExplainTitle;
    private javax.swing.JToggleButton exercise1;
    private javax.swing.JToggleButton exercise2;
    private javax.swing.JToggleButton exercise3;
    private javax.swing.JToggleButton exercise4;
    private javax.swing.JToggleButton exercise5;
    private javax.swing.ButtonGroup exerciseRate;
    private javax.swing.JToggleButton femaleButton;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable listMakanan;
    private javax.swing.JToggleButton maleButton;
    private javax.swing.ButtonGroup plan;
    private javax.swing.JLabel priceMeal;
    private javax.swing.JTextField tinggi;
    private javax.swing.JLabel txt_berat;
    private javax.swing.JLabel txt_gender;
    private javax.swing.JLabel txt_tinggi;
    private javax.swing.JLabel txt_umur;
    private javax.swing.JTextField umur;
    private javax.swing.JToggleButton weightPlan1;
    private javax.swing.JToggleButton weightPlan2;
    private javax.swing.JToggleButton weightPlan3;
    private javax.swing.JToggleButton weightPlan4;
    private javax.swing.JToggleButton weightPlan5;
    private javax.swing.JToggleButton weightPlan6;
    private javax.swing.JToggleButton weightPlan7;
    // End of variables declaration//GEN-END:variables

}
