/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatrice;

/**
 *
 * @author patatuffolo
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
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
        res = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_divide = new javax.swing.JButton();
        btn_multiply = new javax.swing.JButton();
        btn_minus = new javax.swing.JButton();
        btn_plus = new javax.swing.JButton();
        btn_equal = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_perc = new javax.swing.JButton();
        btn_plusminus = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        numeri = new javax.swing.JPanel();
        btn_9 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_virgola = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(56, 56, 46));

        res.setBackground(new java.awt.Color(56, 56, 56));
        res.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        res.setForeground(new java.awt.Color(235, 235, 235));
        res.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        res.setFocusable(false);

        jPanel2.setBackground(new java.awt.Color(255, 155, 0));

        btn_divide.setBackground(new java.awt.Color(255, 155, 0));
        btn_divide.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        btn_divide.setForeground(new java.awt.Color(255, 255, 255));
        btn_divide.setText("/");
        btn_divide.setBorder(null);
        btn_divide.setBorderPainted(false);
        btn_divide.setContentAreaFilled(false);
        btn_divide.setFocusPainted(false);
        btn_divide.setFocusable(false);
        btn_divide.setRequestFocusEnabled(false);
        btn_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divideActionPerformed(evt);
            }
        });

        btn_multiply.setBackground(new java.awt.Color(255, 155, 0));
        btn_multiply.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        btn_multiply.setForeground(new java.awt.Color(255, 255, 255));
        btn_multiply.setText("x");
        btn_multiply.setBorder(null);
        btn_multiply.setBorderPainted(false);
        btn_multiply.setContentAreaFilled(false);
        btn_multiply.setFocusPainted(false);
        btn_multiply.setFocusable(false);
        btn_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplyActionPerformed(evt);
            }
        });

        btn_minus.setBackground(new java.awt.Color(255, 155, 0));
        btn_minus.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        btn_minus.setForeground(new java.awt.Color(255, 255, 255));
        btn_minus.setText("-");
        btn_minus.setBorder(null);
        btn_minus.setBorderPainted(false);
        btn_minus.setContentAreaFilled(false);
        btn_minus.setFocusPainted(false);
        btn_minus.setFocusable(false);
        btn_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minusActionPerformed(evt);
            }
        });

        btn_plus.setBackground(new java.awt.Color(255, 155, 0));
        btn_plus.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        btn_plus.setForeground(new java.awt.Color(255, 255, 255));
        btn_plus.setText("+");
        btn_plus.setBorder(null);
        btn_plus.setBorderPainted(false);
        btn_plus.setContentAreaFilled(false);
        btn_plus.setFocusPainted(false);
        btn_plus.setFocusable(false);
        btn_plus.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plusActionPerformed(evt);
            }
        });

        btn_equal.setBackground(new java.awt.Color(255, 155, 0));
        btn_equal.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        btn_equal.setForeground(new java.awt.Color(255, 255, 255));
        btn_equal.setText("=");
        btn_equal.setBorder(null);
        btn_equal.setBorderPainted(false);
        btn_equal.setContentAreaFilled(false);
        btn_equal.setFocusPainted(false);
        btn_equal.setFocusable(false);
        btn_equal.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_equal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_equal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(76, 76, 76));

        btn_perc.setBackground(new java.awt.Color(76, 76, 76));
        btn_perc.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        btn_perc.setForeground(new java.awt.Color(255, 255, 255));
        btn_perc.setText("%");
        btn_perc.setBorderPainted(false);
        btn_perc.setContentAreaFilled(false);
        btn_perc.setFocusPainted(false);
        btn_perc.setFocusable(false);
        btn_perc.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_perc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_percActionPerformed(evt);
            }
        });

        btn_plusminus.setBackground(new java.awt.Color(76, 76, 76));
        btn_plusminus.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        btn_plusminus.setForeground(new java.awt.Color(255, 255, 255));
        btn_plusminus.setText("+/-");
        btn_plusminus.setBorderPainted(false);
        btn_plusminus.setContentAreaFilled(false);
        btn_plusminus.setFocusPainted(false);
        btn_plusminus.setFocusable(false);
        btn_plusminus.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_plusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plusminusActionPerformed(evt);
            }
        });

        btn_c.setBackground(new java.awt.Color(76, 76, 76));
        btn_c.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        btn_c.setForeground(new java.awt.Color(255, 255, 255));
        btn_c.setText("C");
        btn_c.setBorderPainted(false);
        btn_c.setContentAreaFilled(false);
        btn_c.setFocusPainted(false);
        btn_c.setFocusable(false);
        btn_c.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_c, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_plusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_perc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_perc, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_plusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_c, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        numeri.setBackground(new java.awt.Color(105, 105, 105));

        btn_9.setBackground(new java.awt.Color(105, 105, 105));
        btn_9.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(255, 255, 255));
        btn_9.setText("9");
        btn_9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 56, 56), 1, true));
        btn_9.setBorderPainted(false);
        btn_9.setContentAreaFilled(false);
        btn_9.setFocusPainted(false);
        btn_9.setFocusable(false);
        btn_9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_8.setBackground(new java.awt.Color(105, 105, 105));
        btn_8.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(255, 255, 255));
        btn_8.setText("8");
        btn_8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 56, 56), 1, true));
        btn_8.setBorderPainted(false);
        btn_8.setContentAreaFilled(false);
        btn_8.setFocusPainted(false);
        btn_8.setFocusable(false);
        btn_8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_7.setBackground(new java.awt.Color(105, 105, 105));
        btn_7.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        btn_7.setForeground(new java.awt.Color(255, 255, 255));
        btn_7.setText("7");
        btn_7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 56, 56), 1, true));
        btn_7.setBorderPainted(false);
        btn_7.setContentAreaFilled(false);
        btn_7.setFocusPainted(false);
        btn_7.setFocusable(false);
        btn_7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_6.setBackground(new java.awt.Color(105, 105, 105));
        btn_6.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(255, 255, 255));
        btn_6.setText("6");
        btn_6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 56, 56), 1, true));
        btn_6.setBorderPainted(false);
        btn_6.setContentAreaFilled(false);
        btn_6.setFocusPainted(false);
        btn_6.setFocusable(false);
        btn_6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_5.setBackground(new java.awt.Color(105, 105, 105));
        btn_5.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(255, 255, 255));
        btn_5.setText("5");
        btn_5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 56, 56), 1, true));
        btn_5.setBorderPainted(false);
        btn_5.setContentAreaFilled(false);
        btn_5.setFocusPainted(false);
        btn_5.setFocusable(false);
        btn_5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_4.setBackground(new java.awt.Color(105, 105, 105));
        btn_4.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_4.setText("4");
        btn_4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 56, 56), 1, true));
        btn_4.setBorderPainted(false);
        btn_4.setContentAreaFilled(false);
        btn_4.setFocusPainted(false);
        btn_4.setFocusable(false);
        btn_4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_3.setBackground(new java.awt.Color(105, 105, 105));
        btn_3.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_3.setText("3");
        btn_3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 56, 56), 1, true));
        btn_3.setBorderPainted(false);
        btn_3.setContentAreaFilled(false);
        btn_3.setFocusPainted(false);
        btn_3.setFocusable(false);
        btn_3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_2.setBackground(new java.awt.Color(105, 105, 105));
        btn_2.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_2.setText("2");
        btn_2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 56, 56), 1, true));
        btn_2.setBorderPainted(false);
        btn_2.setContentAreaFilled(false);
        btn_2.setFocusPainted(false);
        btn_2.setFocusable(false);
        btn_2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_1.setBackground(new java.awt.Color(105, 105, 105));
        btn_1.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setText("1");
        btn_1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 56, 56), 1, true));
        btn_1.setBorderPainted(false);
        btn_1.setContentAreaFilled(false);
        btn_1.setFocusPainted(false);
        btn_1.setFocusable(false);
        btn_1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_0.setBackground(new java.awt.Color(105, 105, 105));
        btn_0.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        btn_0.setForeground(new java.awt.Color(255, 255, 255));
        btn_0.setText("0");
        btn_0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 56, 56), 1, true));
        btn_0.setBorderPainted(false);
        btn_0.setContentAreaFilled(false);
        btn_0.setFocusPainted(false);
        btn_0.setFocusable(false);
        btn_0.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        btn_virgola.setBackground(new java.awt.Color(105, 105, 105));
        btn_virgola.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        btn_virgola.setForeground(new java.awt.Color(255, 255, 255));
        btn_virgola.setText(",");
        btn_virgola.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 56, 56), 1, true));
        btn_virgola.setBorderPainted(false);
        btn_virgola.setContentAreaFilled(false);
        btn_virgola.setFocusPainted(false);
        btn_virgola.setFocusable(false);
        btn_virgola.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_virgola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_virgolaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout numeriLayout = new javax.swing.GroupLayout(numeri);
        numeri.setLayout(numeriLayout);
        numeriLayout.setHorizontalGroup(
            numeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, numeriLayout.createSequentialGroup()
                .addGroup(numeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(numeriLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(numeriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(numeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, numeriLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(numeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, numeriLayout.createSequentialGroup()
                                        .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, numeriLayout.createSequentialGroup()
                                        .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(numeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(numeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_virgola, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, numeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        numeriLayout.setVerticalGroup(
            numeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, numeriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(numeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(numeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(numeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(numeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_virgola, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numeri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(res, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
    
    public String a = "",b = "", operator = "";
    double ia = 0, ib = 0, ris;
    public boolean ab = false;
    private void btn_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equalActionPerformed
        switch (operator) {
            case "+":
                ris = Double.parseDouble(a) + Double.parseDouble(b);
                System.out.print(ris);
                res.setText(String.valueOf(ris));
                break;
            case "-":
                ris = Double.parseDouble(a) - Double.parseDouble(b);
                res.setText(String.valueOf(ris));
                break;
            case "x":
                ris = Double.parseDouble(a) * Double.parseDouble(b);
                res.setText(String.valueOf(ris));
                break;
            case "/":
                ris = Double.parseDouble(a) / Double.parseDouble(b);
                res.setText(String.valueOf(ris));
                break;
            default:
                res.setText("Math ERROR.");
                break;
        }
        a = ""; b = ""; ia = 0; ib = 0;
        ab = false;
    }//GEN-LAST:event_btn_equalActionPerformed

    private void btn_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minusActionPerformed
        ab = true;
        operator = "-";
    }//GEN-LAST:event_btn_minusActionPerformed

    private void btn_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_plusActionPerformed
        ab = true;
        operator = "+";
    }//GEN-LAST:event_btn_plusActionPerformed

    private void btn_multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplyActionPerformed
        ab = true;
        operator = "x";
    }//GEN-LAST:event_btn_multiplyActionPerformed

    private void btn_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divideActionPerformed
        ab = true;
        operator = "/";
    }//GEN-LAST:event_btn_divideActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        if (!ab) {
            a += "9";
            res.setText(a);
        } else {
            b += "9";
            res.setText(b);
        }
        
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_virgolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_virgolaActionPerformed
        if (!ab) {
            a += ".";
            res.setText(a);
        } else {
            b += ".";
            res.setText(b);
        }
    }//GEN-LAST:event_btn_virgolaActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        if (!ab) {
            a += "3";
            res.setText(a);
        } else {
            b += "3";
            res.setText(b);
        }
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        if (!ab) {
            a += "6";
            res.setText(a);
        } else {
            b += "6";
            res.setText(b);
        }
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        if (!ab) {
            a += "2";
            res.setText(a);
        } else {
            b += "2";
            res.setText(b);
        }
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        if (!ab) {
            a += "1";
            res.setText(a);
        } else {
            b += "1";
            res.setText(b);
        }
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        if (!ab) {
            a += "0";
            res.setText(a);
        } else {
            b += "0";
            res.setText(b);
        }
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        if (!ab) {
            a += "5";
            res.setText(a);
        } else {
            b += "5";
            res.setText(b);
        }
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        if (!ab) {
            a += "4";
            res.setText(a);
        } else {
            b += "4";
            res.setText(b);
        }
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        if (!ab) {
            a += "7";
            res.setText(a);
        } else {
            b += "7";
            res.setText(b);
        }
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        if (!ab) {
            a += "8";
            res.setText(a);
        } else {
            b += "8";
            res.setText(b);
        }
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_percActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_percActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_percActionPerformed

    private void btn_plusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_plusminusActionPerformed
        if (!ab) { //ab == false
            ia = Double.parseDouble(res.getText());
            if (ia != 0) {
                ia *= -1;
            }
            res.setText(String.valueOf(ia));
        }
        else {
            ib = Double.parseDouble(res.getText());
            if (ib != 0) {
                ib *= -1;
            }
            res.setText(String.valueOf(ib));
        }
    }//GEN-LAST:event_btn_plusminusActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        a = ""; b = ""; ia = 0; ib = 0;
        res.setText("");
        ab = false;
    }//GEN-LAST:event_btn_cActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_divide;
    private javax.swing.JButton btn_equal;
    private javax.swing.JButton btn_minus;
    private javax.swing.JButton btn_multiply;
    private javax.swing.JButton btn_perc;
    private javax.swing.JButton btn_plus;
    private javax.swing.JButton btn_plusminus;
    private javax.swing.JButton btn_virgola;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel numeri;
    private javax.swing.JLabel res;
    // End of variables declaration//GEN-END:variables
}
