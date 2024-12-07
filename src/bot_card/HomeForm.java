/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bot_card;

import javax.swing.JOptionPane;

/**
 *
 * @author N ~ N
 */
public class HomeForm extends javax.swing.JFrame {

    /**
     * Creates new form HomeForm
     */
    public HomeForm() {
       initComponents();
       jpnINFO.setVisible(true);
       jpnPIN.setVisible(false);
       jpnSoDu.setVisible(false);
       jpnHISTORY.setVisible(false);
       jpnNapTien.setVisible(false);
       
       jTextField5.setEnabled(false);
       jTextField6.setEnabled(false);
       jTextField7.setEnabled(false);
       jTextField8.setEnabled(false);
       
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jpnpin = new javax.swing.JPanel();
        jlbPIN = new javax.swing.JLabel();
        jpnhis = new javax.swing.JPanel();
        jlbHis = new javax.swing.JLabel();
        jpnif2 = new javax.swing.JPanel();
        jlbINFO = new javax.swing.JLabel();
        jpnConnect = new javax.swing.JPanel();
        jlbConnect = new javax.swing.JLabel();
        jpnsoDu2 = new javax.swing.JPanel();
        jlbSoDu = new javax.swing.JLabel();
        jpnbank1 = new javax.swing.JPanel();
        jlbNap = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlbCancel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jpnINFO = new javax.swing.JPanel();
        juploadpt1 = new javax.swing.JLabel();
        btnup1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        btnUP = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jpnPIN = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        btnCanPIN = new javax.swing.JButton();
        btnupPIN = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jpnSoDu = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        btnThoat = new javax.swing.JButton();
        btnNapThem1 = new javax.swing.JButton();
        jpnHISTORY = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jpnNapTien = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        btnHuy = new javax.swing.JButton();
        btnNapTien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dashboard.png"))); // NOI18N
        jLabel1.setText("Dashboard");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cog.png"))); // NOI18N
        jLabel4.setText("Tùy Chọn");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/atm-card.png"))); // NOI18N
        jLabel8.setText("Banking");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jpnpin.setBackground(new java.awt.Color(102, 102, 102));
        jpnpin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbPIN.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlbPIN.setForeground(new java.awt.Color(255, 255, 255));
        jlbPIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/security.png"))); // NOI18N
        jlbPIN.setText("Mã PIN");
        jlbPIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbPINMouseClicked(evt);
            }
        });
        jpnpin.add(jlbPIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        jPanel1.add(jpnpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 240, 40));

        jpnhis.setBackground(new java.awt.Color(102, 102, 102));
        jpnhis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbHis.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlbHis.setForeground(new java.awt.Color(255, 255, 255));
        jlbHis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/report.png"))); // NOI18N
        jlbHis.setText("Lịch sử giao dịch");
        jlbHis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbHisMouseClicked(evt);
            }
        });
        jpnhis.add(jlbHis, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jPanel1.add(jpnhis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 240, 40));

        jpnif2.setBackground(new java.awt.Color(102, 102, 102));
        jpnif2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbINFO.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlbINFO.setForeground(new java.awt.Color(255, 255, 255));
        jlbINFO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/teamwork.png"))); // NOI18N
        jlbINFO.setText("Thông Tin");
        jlbINFO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbINFOMouseClicked(evt);
            }
        });
        jpnif2.add(jlbINFO, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jPanel1.add(jpnif2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 240, 40));

        jpnConnect.setBackground(new java.awt.Color(102, 102, 102));
        jpnConnect.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbConnect.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlbConnect.setForeground(new java.awt.Color(255, 255, 255));
        jlbConnect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/disruption.png"))); // NOI18N
        jlbConnect.setText("Ngắt kết nối");
        jlbConnect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbConnectMouseClicked(evt);
            }
        });
        jpnConnect.add(jlbConnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        jPanel1.add(jpnConnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 240, 40));

        jpnsoDu2.setBackground(new java.awt.Color(102, 102, 102));
        jpnsoDu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbSoDu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlbSoDu.setForeground(new java.awt.Color(255, 255, 255));
        jlbSoDu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/balance.png"))); // NOI18N
        jlbSoDu.setText("Số Dư");
        jlbSoDu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbSoDuMouseClicked(evt);
            }
        });
        jpnsoDu2.add(jlbSoDu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        jPanel1.add(jpnsoDu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 240, 40));

        jpnbank1.setBackground(new java.awt.Color(102, 102, 102));
        jpnbank1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbNap.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlbNap.setForeground(new java.awt.Color(255, 255, 255));
        jlbNap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mobile-banking.png"))); // NOI18N
        jlbNap.setText("Nạp Tiền");
        jlbNap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbNapMouseClicked(evt);
            }
        });
        jpnbank1.add(jlbNap, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        jPanel1.add(jpnbank1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 240, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 600));

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("USER HOME");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 19, 183, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Xin Chào, User");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        jlbCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        jlbCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbCancelMouseClicked(evt);
            }
        });
        jPanel2.add(jlbCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 770, 70));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnINFO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        juploadpt1.setBackground(new java.awt.Color(204, 204, 204));
        juploadpt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        juploadpt1.setOpaque(true);
        jpnINFO.add(juploadpt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 170, 200));

        btnup1.setBackground(new java.awt.Color(51, 204, 255));
        btnup1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnup1.setText("Upload Photo");
        btnup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnup1ActionPerformed(evt);
            }
        });
        jpnINFO.add(btnup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel17.setText("NHẬP THÔNG TIN CÁ NHÂN");
        jpnINFO.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Biển số xe : ");
        jpnINFO.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));
        jpnINFO.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 320, 40));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Họ Tên : ");
        jpnINFO.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("Năm sinh :");
        jpnINFO.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setText("Quê Quán :");
        jpnINFO.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jpnINFO.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 320, 40));
        jpnINFO.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 320, 40));
        jpnINFO.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 320, 40));

        btnUP.setBackground(new java.awt.Color(255, 102, 102));
        btnUP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUP.setText("Cập Nhật");
        btnUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPActionPerformed(evt);
            }
        });
        jpnINFO.add(btnUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 120, 40));

        btnEdit.setBackground(new java.awt.Color(255, 102, 102));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jpnINFO.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 120, 40));

        jPanel3.add(jpnINFO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 720, 490));

        jpnPIN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("THAY ĐỔI MÃ PIN");
        jpnPIN.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Xác nhận mã pin mới:");
        jpnPIN.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Nhập mã pin mới:");
        jpnPIN.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jpnPIN.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 320, 40));
        jpnPIN.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 320, 40));

        btnCanPIN.setBackground(new java.awt.Color(255, 102, 102));
        btnCanPIN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCanPIN.setText("Hủy Bỏ");
        btnCanPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanPINActionPerformed(evt);
            }
        });
        jpnPIN.add(btnCanPIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 120, 40));

        btnupPIN.setBackground(new java.awt.Color(255, 102, 102));
        btnupPIN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnupPIN.setText("Cập Nhật");
        btnupPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupPINActionPerformed(evt);
            }
        });
        jpnPIN.add(btnupPIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 120, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Mã pin cũ :");
        jpnPIN.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 100, -1));
        jpnPIN.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 320, 40));

        jPanel3.add(jpnPIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 720, 490));

        jpnSoDu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("SỐ DƯ");
        jpnSoDu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Số Dư hiện tại : ");
        jpnSoDu.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 190, 60));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpnSoDu.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 370, 70));

        btnThoat.setBackground(new java.awt.Color(255, 102, 102));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setActionCommand("Xác Nhận");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jpnSoDu.add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 120, 40));

        btnNapThem1.setBackground(new java.awt.Color(255, 102, 102));
        btnNapThem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNapThem1.setText("Nạp Thêm");
        btnNapThem1.setActionCommand("Xác Nhận");
        btnNapThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNapThem1ActionPerformed(evt);
            }
        });
        jpnSoDu.add(btnNapThem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 120, 40));

        jPanel3.add(jpnSoDu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 720, 490));

        jpnHISTORY.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setText("LỊCH SỬ GIAO DỊCH");
        jpnHISTORY.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã GD", "Số Phí", "Ngày GD", "Số Dư còn lại", "Trạng Thái"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jpnHISTORY.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 700, 360));

        jPanel3.add(jpnHISTORY, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 720, 490));

        jpnNapTien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setText("NẠP TIỀN");
        jpnNapTien.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setText("Nhập số tiền cần nạp :");
        jpnNapTien.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 190, 60));

        jTextField10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jpnNapTien.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 370, 60));

        btnHuy.setBackground(new java.awt.Color(255, 102, 102));
        btnHuy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.setActionCommand("Xác Nhận");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jpnNapTien.add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 120, 40));

        btnNapTien.setBackground(new java.awt.Color(255, 102, 102));
        btnNapTien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNapTien.setText("Nạp Tiền");
        btnNapTien.setActionCommand("Xác Nhận");
        btnNapTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNapTienActionPerformed(evt);
            }
        });
        jpnNapTien.add(btnNapTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 120, 40));

        jPanel3.add(jpnNapTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 720, 490));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 760, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jlbINFOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbINFOMouseClicked
       jpnINFO.setVisible(true);
       jpnPIN.setVisible(false);
       jpnSoDu.setVisible(false);
       jpnHISTORY.setVisible(false);
       jpnNapTien.setVisible(false);
    }//GEN-LAST:event_jlbINFOMouseClicked

    private void jlbPINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbPINMouseClicked
       jpnINFO.setVisible(false);
       jpnPIN.setVisible(true);
       jpnSoDu.setVisible(false);
       jpnHISTORY.setVisible(false);
       jpnNapTien.setVisible(false);
    }//GEN-LAST:event_jlbPINMouseClicked

    private void jlbSoDuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbSoDuMouseClicked
       jpnINFO.setVisible(false);
       jpnPIN.setVisible(false);
       jpnSoDu.setVisible(true);
       jpnHISTORY.setVisible(false);
       jpnNapTien.setVisible(false);
    }//GEN-LAST:event_jlbSoDuMouseClicked

    private void jlbHisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbHisMouseClicked
       jpnINFO.setVisible(false);
       jpnPIN.setVisible(false);
       jpnSoDu.setVisible(false);
       jpnHISTORY.setVisible(true);
       jpnNapTien.setVisible(false);
    }//GEN-LAST:event_jlbHisMouseClicked

    private void jlbNapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbNapMouseClicked
       jpnINFO.setVisible(false);
       jpnPIN.setVisible(false);
       jpnSoDu.setVisible(false);
       jpnHISTORY.setVisible(false);
       jpnNapTien.setVisible(true);
    }//GEN-LAST:event_jlbNapMouseClicked

    private void jlbConnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbConnectMouseClicked
        // TODO add your handling code here:
        ConnectJavaCard disConnect = new ConnectJavaCard();
        disConnect.disconnectCard();
    }//GEN-LAST:event_jlbConnectMouseClicked

    private void btnupPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupPINActionPerformed
        // TODO add your handling code here:
         String oldPin = jTextField2.getText();
        String newPin = jTextField4.getText();
        String cofirmPin = jTextField3.getText();
        
        if(newPin.equals(cofirmPin) && !newPin.equals(oldPin)){
            ConnectJavaCard connect = new ConnectJavaCard();
            if(connect.ChangePIN(oldPin, newPin)){
                System.out.println("Đổi mã PIN thành công!");
                new loginForm().setVisible(true);
            }
            else{
                System.out.println("Đổi mã PIN không thành công!");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Kiểm tra mã PIN");
        }
    }//GEN-LAST:event_btnupPINActionPerformed

    private void btnCanPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanPINActionPerformed
        // TODO add your handling code here:
        jpnINFO.setVisible(true);
       jpnPIN.setVisible(false);
       jpnSoDu.setVisible(false);
       jpnHISTORY.setVisible(false);
       jpnNapTien.setVisible(false);
    }//GEN-LAST:event_btnCanPINActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUPActionPerformed

    private void btnup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnup1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnup1ActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnNapThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNapThem1ActionPerformed
        // TODO add your handling code here:
        jpnINFO.setVisible(false);
       jpnPIN.setVisible(false);
       jpnSoDu.setVisible(false);
       jpnHISTORY.setVisible(false);
       jpnNapTien.setVisible(true);
    }//GEN-LAST:event_btnNapThem1ActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnNapTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNapTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNapTienActionPerformed

    private void jlbCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCancelMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jlbCancelMouseClicked
    
    // Field name
    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
        ConnectJavaCard card = new ConnectJavaCard();
        
        
        
        
        
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    
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
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanPIN;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnNapThem1;
    private javax.swing.JButton btnNapTien;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnUP;
    private javax.swing.JButton btnup1;
    private javax.swing.JButton btnupPIN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel jlbCancel;
    private javax.swing.JLabel jlbConnect;
    private javax.swing.JLabel jlbHis;
    private javax.swing.JLabel jlbINFO;
    private javax.swing.JLabel jlbNap;
    private javax.swing.JLabel jlbPIN;
    private javax.swing.JLabel jlbSoDu;
    private javax.swing.JPanel jpnConnect;
    private javax.swing.JPanel jpnHISTORY;
    private javax.swing.JPanel jpnINFO;
    private javax.swing.JPanel jpnNapTien;
    private javax.swing.JPanel jpnPIN;
    private javax.swing.JPanel jpnSoDu;
    private javax.swing.JPanel jpnbank1;
    private javax.swing.JPanel jpnhis;
    private javax.swing.JPanel jpnif2;
    private javax.swing.JPanel jpnpin;
    private javax.swing.JPanel jpnsoDu2;
    private javax.swing.JLabel juploadpt1;
    // End of variables declaration//GEN-END:variables
}
