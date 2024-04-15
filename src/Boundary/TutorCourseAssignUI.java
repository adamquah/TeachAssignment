/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Boundary;

/**
 *
 * @author hp
 */
public class TutorCourseAssignUI extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public TutorCourseAssignUI() {
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

        jLabelTitle = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Course = new javax.swing.JComboBox<>();
        Course1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableFacultyProgrammeCourseInfo = new javax.swing.JTable();
        jLabelSearch1 = new javax.swing.JLabel();
        jTextSearch = new javax.swing.JTextField();
        jTextSearch1 = new javax.swing.JTextField();
        jTextSearch2 = new javax.swing.JTextField();
        jButtonSearch1 = new javax.swing.JButton();
        jLabelSearch2 = new javax.swing.JLabel();
        jTextSearch3 = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTitle.setText("Tutor, Course & Tutorial Group Information System");

        jTextField1.setText("Enter your name");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Select Courses:");

        Course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BBBE 1033 Economics", "BBDM 1043 Principles of Management", "BMIT 1723 IT Fundamentals and Applications", "BBDM 1013 Business Communication", "BBDT 1013 Principles of Marketing", "BBDM 1023 Business Organisation and Management", "BBMF 1813 Principles of Finance", "BAMS 1753 Financial Mathematics", "BBBL 2023 Commercial Law", "BBDM 2153 Operations Management", "BBDT 3264 Big Data Analytics", "BBDT 3244 Digital Marketing", "BBDM 3303 Entrepreneurship", "BMCS 2123 Natural Language Processing", "BBDT 3314 Business Metrics and Analytics", "MPU - 3133 Falsafah dan Isu Semasa", "BJEL 1023 Academic English", "BBFA 2054 Financial Reporting", "BBMF 2093 Corporate Finance", "Business Strategy", "BAMS 1743 Quantitative Methods", "BBBE 2133 Economics for Strategy", "BBBE 2113 Intermediate Microeconomics", "MPU - 3302 Integrity and Anti-Corruption", "BBBE 2033 Malaysian Economy", "BBBE 3814 Econometrics", "BBDM 1063 Organisational Behaviour", "BBDH 2013 Human Resource Management", "BBDM 3013 Business Research", "BBDH 2013 Human Resource Management", "BJEL 1023 Academic English", "MPU-3302 Integrity and Anti-Corruption", "BBDT 2094 Retail Management", "BBDT 2174 Social Commerce", "BBDM 3194 Strategic Planning and Management", "BHEL 1913 English Language", "BBBE 3023 Research Methodology", "BAIT 2123 Internet of Things", "BHFD 2124 Garment and Pattern Construction II", "BHFD 2133 Software Application for Fashion", "BHFD 2143 Advanced Fashion Design Illustration", "MPU - 3103 Falsafah and Isu Semasa", "MPU - 3232 Entrepreneurship", "BTBE 2052 Research Methodology", "BTBE 2023 Civil Engineering Construction Technology", "BTQS 2023 Measurement of Plumbing and Electrical Services", "BTQS 2054 Development Economics", "BTQS 3033 Prices Analysis For External and Plumbing Works", "BTAR 1016 Design Studio I", "BTAR 1013 Architectural Graphic Techniques", "BTAR 1052 Principles of Construction and Materials", "BTAR 1012 History of Eastern Architecture", "BTAR 1062 Environmental Science", "BTGE 1013 Engineering Mathematics", "BTMM 2153 Strength of Materials", "BGMC 4263 Heat Transfer", "BTGE 2033 Engineering Statistics", "BTMH 4443 Robotic Systems and Design", "BGMC 4282 Finite element Analysis", "BGMC 2183 Dynamics", "BTEH 2223 Microprocessor Systems", "BTMH 1313 Industrial Control and Automation", "BACS 2114 Machine Learning", "BGGE 2044 Project Management and Finance", "BTEC 4213 Embedded System", "BGEC 3314 Digital Signal Processing", "BAMS 2414 Statistics Methods for Scientific Analysis", "BAFS 2333 Sensory Evaluation", "BAFS 3343 Food Preservation", "BAFS 2344 Food Microbiology II", "BAFS 3523 Therapeutic Nutrition", "BAFS 1353 Food Analysis", "BAFS 1313 Introduction to Food Science", "BACS 3183 Advanced Database Management", "BMCS 2013 Data Engineering", "BAIT 3003 Data Warehouse Technology", "BMMS 2074 Statistics for Data Science", "BAIT 3013 Information Systems Implementation", "BAIT 3043 IS Strategy and Management", "BAIT 3133 Database Administration", "BAIT 2144 Fundamentals of Computer Networks", "BAMS 1623 Discrete Mathematics", "BACS 2023 Object-oriented Programming", "BACS 1053 Database Management", "BAIT 3013 Business Intelligence", "BACS 2163 Software Engineering", "BAIT 2203 Human Computer Interaction", "BAIT 2073 Mobile Application Development", "BACS 2173 Graphic Programming", "BACS 3074 Artificial Intelligence", "BAIT 3273 Cloud Computing", "BAIT 1093 Introduction to Computer Security", "BACS 2063 Data Structure and Algorithm", "BACS 2033 Software Requirements Engineering", "BACS 2083 Formal Methods for Software Engineering", "BMMS 2633 Advanced Discrete Mathematics", "BAIT 3343 Agile Software Development", "BAIT 3153 Software Project Management", "BACS 2103 Software Quality Assurance and Testing" }));
        Course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseActionPerformed(evt);
            }
        });

        Course1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tutorial ", "Practical ", "Lecture" }));
        Course1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Course1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Select Course Type:");

        jTextField2.setText("Enter Tutorial Group");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButtonAdd.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        jButtonAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAdd.setText("Add");

        jButtonUpdate.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jButtonUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        jButtonDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        TableFacultyProgrammeCourseInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Tutor Name", "Course", "Course type", "Tutorial Group"
            }
        ));
        TableFacultyProgrammeCourseInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableFacultyProgrammeCourseInfoMouseClicked(evt);
            }
        });
        TableFacultyProgrammeCourseInfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableFacultyProgrammeCourseInfoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TableFacultyProgrammeCourseInfo);

        jLabelSearch1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSearch1.setText("Search:");

        jTextSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearchActionPerformed(evt);
            }
        });

        jTextSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearch1ActionPerformed(evt);
            }
        });

        jTextSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearch2ActionPerformed(evt);
            }
        });

        jButtonSearch1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSearch1.setText("Search by tutor");
        jButtonSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearch1ActionPerformed(evt);
            }
        });

        jLabelSearch2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSearch2.setText("Search:");

        jTextSearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearch3ActionPerformed(evt);
            }
        });

        jButtonSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSearch.setText("Search by course");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Course, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Course1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(149, 149, 149)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonSearch))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(jButtonSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 66, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(447, 447, 447)
                    .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(448, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(457, Short.MAX_VALUE)
                    .addComponent(jTextSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(438, 438, 438)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Course, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSearch1)
                    .addComponent(jTextSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch1))
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSearch2)
                    .addComponent(jTextSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch)
                    .addComponent(Course1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(402, 402, 402)
                    .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(425, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(412, 412, 412)
                    .addComponent(jTextSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(415, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void CourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseActionPerformed

    private void Course1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Course1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Course1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int rowIndex = TableFacultyProgrammeCourseInfo.getSelectedRow();

        if (rowIndex >= 0) {
            // Prompt the user to input new values for faculty, programme, and course
            String newFaculty = JOptionPane.showInputDialog(null, "Enter new faculty name:");
            String newProgramme = JOptionPane.showInputDialog(null, "Enter new programme name:");
            String newCourse = JOptionPane.showInputDialog(null, "Enter new course name:");

            // Find the position of the selected faculty name in the linked list
            int position = findPositionByFacultyName(newFaculty);

            if (position != -1) {
                // Create updated Course object
                Course updatedCourse = new Course(newFaculty, newProgramme, newCourse);

                // Update the Course object in the courseList
                courseList.update(position, updatedCourse);

                // Update the values in the table model
                model.setValueAt(newFaculty, rowIndex, 0);
                model.setValueAt(newProgramme, rowIndex, 1);
                model.setValueAt(newCourse, rowIndex, 2);

                //Save the updated Data into the file
                //saveDataToFile(model);
                JOptionPane.showMessageDialog(null, "Course updated successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Course not found");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to update");
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int rowIndex = TableFacultyProgrammeCourseInfo.getSelectedRow();

        if (rowIndex >= 0) {
            // Remove the selected row from the model
            model.removeRow(rowIndex);
            JOptionPane.showMessageDialog(null, "Course deleted successfully");
            //saveDataToFile(model);

            // Clear selection after deletion
            TableFacultyProgrammeCourseInfo.clearSelection();
            courseList.remove(1);

            // Also, try explicitly setting the selection to -1
            TableFacultyProgrammeCourseInfo.getSelectionModel().setSelectionInterval(-1, -1);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete");
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void TableFacultyProgrammeCourseInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableFacultyProgrammeCourseInfoMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TableFacultyProgrammeCourseInfo.getModel();
        Integer rowIndex = TableFacultyProgrammeCourseInfo.getSelectedRow();

        if (rowIndex != -1 && rowIndex < model.getRowCount()) {
            Faculty.setSelectedItem(model.getValueAt(rowIndex, 0).toString());
            Programme.setSelectedItem(model.getValueAt(rowIndex, 1).toString());
            Course.setSelectedItem(model.getValueAt(rowIndex, 2).toString());
        }
    }//GEN-LAST:event_TableFacultyProgrammeCourseInfoMouseClicked

    private void TableFacultyProgrammeCourseInfoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableFacultyProgrammeCourseInfoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            int rowIndex = TableFacultyProgrammeCourseInfo.getSelectedRow();

            if (rowIndex != -1 && rowIndex < model.getRowCount()) {
                Faculty.setSelectedItem(model.getValueAt(rowIndex, 0).toString());
                Programme.setSelectedItem(model.getValueAt(rowIndex, 1).toString());
                Course.setSelectedItem(model.getValueAt(rowIndex, 2).toString());
            }
        }
    }//GEN-LAST:event_TableFacultyProgrammeCourseInfoKeyReleased

    private void jTextSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearchActionPerformed
        //        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TableFacultyProgrammeCourseInfo.getModel();
        String search = jTextSearch.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        TableFacultyProgrammeCourseInfo.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + search));
    }//GEN-LAST:event_jTextSearchActionPerformed

    private void jTextSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSearch1ActionPerformed

    private void jTextSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearch2ActionPerformed
        //        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TableFacultyProgrammeCourseInfo.getModel();
        String search = jTextSearch.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        TableFacultyProgrammeCourseInfo.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + search));
    }//GEN-LAST:event_jTextSearch2ActionPerformed

    private void jButtonSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSearch1ActionPerformed

    private void jTextSearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearch3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSearch3ActionPerformed

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
            java.util.logging.Logger.getLogger(TutorCourseAssignUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TutorCourseAssignUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TutorCourseAssignUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TutorCourseAssignUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutorCourseAssignUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Course;
    private javax.swing.JComboBox<String> Course1;
    private javax.swing.JTable TableFacultyProgrammeCourseInfo;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSearch1;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelSearch1;
    private javax.swing.JLabel jLabelSearch2;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextSearch;
    private javax.swing.JTextField jTextSearch1;
    private javax.swing.JTextField jTextSearch2;
    private javax.swing.JTextField jTextSearch3;
    // End of variables declaration//GEN-END:variables
}
