// Forklift icon obtained from http://www.flaticon.com/free-icon/forklift_361174#term=forklift&page=1&position=1
// Bender icon obtained from http://icons.webtoolhub.com/icon-n41001-detail.aspx

package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Insets;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Component;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.text.Format.Field;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

public class OperatorUI extends JFrame
{
	private JPanel cpWrhsOperator;
	private JRadioButton rdbtnEnableRetBot1;
	private JRadioButton rdbtnEnableRetBot2;
	private JRadioButton rdbtnEnableRetBot3;
	private JRadioButton rdbtnEnableFL1;
	private JRadioButton rdbtnEnableFL2;
	private JRadioButton rdbtnEnableFL3;
	private JButton btnQaSelect;
	private JButton btnLD1Select;
	private JButton btnLD2Select;
	private JButton btnLD3Select;
	private JButton btnQa;
	private JButton btnA1;
	private JButton btnA2;
	private JButton btnA3;
	private JButton btnA4;
	private JButton btnB1;
	private JButton btnB2;
	private JButton btnB3;
	private JButton btnB4;
	private JButton btnC1;
	private JButton btnC2;
	private JButton btnC3;
	private JButton btnC4;
	private JButton btnD1;
	private JButton btnD2;
	private JButton btnD3;
	private JButton btnD4;
	private JLabel lblA1;
	private JLabel lblA2;
	private JLabel lblA3;
	private JLabel lblA4;
	private JLabel lblB1;
	private JLabel lblB2;
	private JLabel lblB3;
	private JLabel lblB4;
	private JLabel lblC1;
	private JLabel lblC2;
	private JLabel lblC3;
	private JLabel lblC4;
	private JLabel lblD1;
	private JLabel lblD2;
	private JLabel lblD3;
	private JLabel lblD4;
	private JLabel lblQaPallet;
	private JLabel lblLdgDock1Pallet;
	private JLabel lblLdgDock2Pallet;
	private JLabel lblLdgDock3Pallet;
	private JLabel ledFuncRetBot1;
	private JLabel ledAvailRetBot1;
	private JLabel ledFuncRetBot2;
	private JLabel ledAvailRetBot2;
	private JLabel ledFuncRetBot3;
	private JLabel ledAvailRetBot3;
	private JLabel ledFuncFL1;
	private JLabel ledAvailFL1;
	private JLabel ledFuncFL2;
	private JLabel ledAvailFL2;
	private JLabel ledFuncFL3;
	private JLabel ledAvailFL3;
	

	/**
	 * Create the frame.
	 */
	public OperatorUI()
	{
		setTitle("Warehouse Operator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 900);
		cpWrhsOperator = new JPanel();
		cpWrhsOperator.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cpWrhsOperator);
		cpWrhsOperator.setLayout(null);
		
		JPanel pnlQa = new JPanel();
		pnlQa.setBounds(409, 31, 725, 121);
		cpWrhsOperator.add(pnlQa);
		
		JPanel pnlShipCenter = new JPanel();
		pnlShipCenter.setBounds(15, 61, 102, 60);
		pnlShipCenter.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlShipCenter.setBackground(Color.GRAY);
		
		JPanel pnlQaDropoff = new JPanel();
		pnlQaDropoff.setBounds(578, 61, 102, 60);
		pnlQaDropoff.setAlignmentX(Component.RIGHT_ALIGNMENT);
		pnlQaDropoff.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		pnlQaDropoff.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlQaDropoff.setBackground(Color.GRAY);
		pnlQaDropoff.setLayout(new GridLayout(1, 1, 0, 0));
		
		JLabel lblQaDropoff = new JLabel("<html><div style='text-align: center;'>QA Dropoff</div></html>");
		lblQaDropoff.setHorizontalAlignment(SwingConstants.CENTER);
		lblQaDropoff.setFont(new Font("Arial", Font.BOLD, 14));
		pnlQaDropoff.add(lblQaDropoff);
		
		btnQa = new JButton("QA");
		btnQa.setHorizontalTextPosition(SwingConstants.CENTER);
		btnQa.setBounds(526, 71, 43, 34);
		btnQa.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnQa.setAlignmentX(Component.RIGHT_ALIGNMENT);
		btnQa.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnQa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnQa.setForeground(Color.WHITE);
		btnQa.setBackground(new Color(70, 130, 180));
		
		JPanel pnlQaPallet = new JPanel();
		pnlQaPallet.setBounds(345, 90, 135, 31);
		pnlQaPallet.setAlignmentX(Component.RIGHT_ALIGNMENT);
		pnlQaPallet.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		pnlQaPallet.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		btnQaSelect = new JButton("Select Pallet");
		btnQaSelect.setForeground(new Color(255, 255, 255));
		btnQaSelect.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnQaSelect.setBounds(345, 61, 135, 20);
		btnQaSelect.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnQaSelect.setAlignmentX(Component.RIGHT_ALIGNMENT);
		btnQaSelect.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnQaSelect.setBackground(new Color(0, 128, 0));
		
		JLabel lblQaInspectionArea = new JLabel("QA Inspection Area");
		lblQaInspectionArea.setBounds(313, 30, 335, 22);
		lblQaInspectionArea.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblQaInspectionArea.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblQaInspectionArea.setHorizontalAlignment(SwingConstants.CENTER);
		lblQaInspectionArea.setFont(new Font("Tahoma", Font.BOLD, 18));
				
		lblQaPallet = new JLabel();
		pnlQaPallet.add(lblQaPallet);
		pnlQa.setLayout(null);
		
		
		pnlShipCenter.setLayout(new GridLayout(1, 1, 0, 0));		
		JLabel lblShippingCenter = new JLabel("<html><div style='text-align: center;'>Shipping Center</div></html>");
		lblShippingCenter.setLabelFor(pnlShipCenter);
		lblShippingCenter.setFont(new Font("Arial", Font.BOLD, 14));
		lblShippingCenter.setHorizontalAlignment(SwingConstants.CENTER);
		pnlShipCenter.add(lblShippingCenter);
		pnlQa.add(pnlShipCenter);
		pnlQa.add(btnQaSelect);
		pnlQa.add(pnlQaPallet);
		pnlQa.add(btnQa);
		pnlQa.add(pnlQaDropoff);
		pnlQa.add(lblQaInspectionArea);
		
		JPanel pnlRobots = new JPanel();
		pnlRobots.setBounds(38, 152, 372, 531);
		pnlRobots.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cpWrhsOperator.add(pnlRobots);
		pnlRobots.setLayout(new GridLayout(8, 1, 0, 0));
		
		JPanel pnlRetBot1 = new JPanel();
		pnlRetBot1.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlRetBot1.setBackground(Color.GRAY);
		pnlRobots.add(pnlRetBot1);
		
		rdbtnEnableRetBot1 = new JRadioButton("Enable");
		rdbtnEnableRetBot1.setBounds(0, 0, 70, 65);
		rdbtnEnableRetBot1.setOpaque(false);
		rdbtnEnableRetBot1.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnEnableRetBot1.setBackground(Color.GRAY);
		rdbtnEnableRetBot1.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnEnableRetBot1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnEnableRetBot1.setVerticalTextPosition(SwingConstants.TOP);
		rdbtnEnableRetBot1.setSelected(true);
		
		JLabel iconRetBot1 = new JLabel("");
		iconRetBot1.setOpaque(true);
		iconRetBot1.setBackground(Color.WHITE);
		iconRetBot1.setHorizontalTextPosition(SwingConstants.CENTER);
		iconRetBot1.setHorizontalAlignment(SwingConstants.CENTER);
		iconRetBot1.setBounds(80, 5, 45, 55);
		iconRetBot1.setBorder(new LineBorder(new Color(0, 0, 0)));
		iconRetBot1.setAlignmentX(Component.CENTER_ALIGNMENT);
		iconRetBot1.setIcon(new ImageIcon(OperatorUI.class.getResource("/View/bender_55_2.png")));
		pnlRetBot1.setLayout(null);
		pnlRetBot1.add(rdbtnEnableRetBot1);
		pnlRetBot1.add(iconRetBot1);
		
		JPanel pnlStatusRetBot1 = new JPanel();
		pnlStatusRetBot1.setOpaque(false);
		pnlStatusRetBot1.setBounds(135, 0, 140, 65);
		pnlRetBot1.add(pnlStatusRetBot1);
		pnlStatusRetBot1.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel pnlFuncRetBot1 = new JPanel();
		pnlFuncRetBot1.setOpaque(false);
		pnlStatusRetBot1.add(pnlFuncRetBot1);
		GridBagLayout gbl_pnlFuncRetBot1 = new GridBagLayout();
		gbl_pnlFuncRetBot1.columnWidths = new int[]{0, 0, 0};
		gbl_pnlFuncRetBot1.rowHeights = new int[]{0, 0};
		gbl_pnlFuncRetBot1.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlFuncRetBot1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlFuncRetBot1.setLayout(gbl_pnlFuncRetBot1);
		
		ledFuncRetBot1 = new JLabel("\u2022");
		ledFuncRetBot1.setHorizontalTextPosition(SwingConstants.CENTER);
		ledFuncRetBot1.setHorizontalAlignment(SwingConstants.CENTER);
		ledFuncRetBot1.setForeground(new Color(255, 99, 71));
		ledFuncRetBot1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_ledFuncRetBot1 = new GridBagConstraints();
		gbc_ledFuncRetBot1.insets = new Insets(0, 15, 0, 5);
		gbc_ledFuncRetBot1.gridx = 0;
		gbc_ledFuncRetBot1.gridy = 0;
		pnlFuncRetBot1.add(ledFuncRetBot1, gbc_ledFuncRetBot1);
		
		JLabel lblFuncRetBot1 = new JLabel("Functional");
		lblFuncRetBot1.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblFuncRetBot1 = new GridBagConstraints();
		gbc_lblFuncRetBot1.insets = new Insets(0, 2, 0, 0);
		gbc_lblFuncRetBot1.gridx = 1;
		gbc_lblFuncRetBot1.gridy = 0;
		pnlFuncRetBot1.add(lblFuncRetBot1, gbc_lblFuncRetBot1);
		
		JPanel pnlAvailRetBot1 = new JPanel();
		pnlAvailRetBot1.setOpaque(false);
		pnlStatusRetBot1.add(pnlAvailRetBot1);
		GridBagLayout gbl_pnlAvailRetBot1 = new GridBagLayout();
		gbl_pnlAvailRetBot1.columnWidths = new int[]{0, 0, 0};
		gbl_pnlAvailRetBot1.rowHeights = new int[]{0, 0};
		gbl_pnlAvailRetBot1.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlAvailRetBot1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlAvailRetBot1.setLayout(gbl_pnlAvailRetBot1);
		
		ledAvailRetBot1 = new JLabel("\u2022");
		ledAvailRetBot1.setHorizontalTextPosition(SwingConstants.CENTER);
		ledAvailRetBot1.setHorizontalAlignment(SwingConstants.CENTER);
		ledAvailRetBot1.setForeground(new Color(255, 99, 71));
		ledAvailRetBot1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_ledAvailRetBot1 = new GridBagConstraints();
		gbc_ledAvailRetBot1.insets = new Insets(0, 15, 0, 5);
		gbc_ledAvailRetBot1.gridx = 0;
		gbc_ledAvailRetBot1.gridy = 0;
		pnlAvailRetBot1.add(ledAvailRetBot1, gbc_ledAvailRetBot1);
		
		JLabel lblAvailRetBot1 = new JLabel("Available");
		lblAvailRetBot1.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblAvailRetBot1 = new GridBagConstraints();
		gbc_lblAvailRetBot1.insets = new Insets(0, 2, 0, 0);
		gbc_lblAvailRetBot1.gridx = 1;
		gbc_lblAvailRetBot1.gridy = 0;
		pnlAvailRetBot1.add(lblAvailRetBot1, gbc_lblAvailRetBot1);
		
		JButton btnCancelRetBot1 = new JButton("<html>Cancel Move</html>");
		btnCancelRetBot1.setVerticalAlignment(SwingConstants.TOP);
		btnCancelRetBot1.setVerticalTextPosition(SwingConstants.TOP);
		btnCancelRetBot1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCancelRetBot1.setBackground(new Color(205, 92, 92));
		btnCancelRetBot1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancelRetBot1.setBounds(275, 11, 80, 43);
		pnlRetBot1.add(btnCancelRetBot1);
		
		JPanel pnlRetBot2 = new JPanel();
		pnlRetBot2.setLayout(null);
		pnlRetBot2.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlRetBot2.setBackground(Color.GRAY);
		pnlRobots.add(pnlRetBot2);
		
		rdbtnEnableRetBot2 = new JRadioButton("Enable");
		rdbtnEnableRetBot2.setVerticalTextPosition(SwingConstants.TOP);
		rdbtnEnableRetBot2.setSelected(true);
		rdbtnEnableRetBot2.setOpaque(false);
		rdbtnEnableRetBot2.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnEnableRetBot2.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnEnableRetBot2.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnEnableRetBot2.setBackground(Color.GRAY);
		rdbtnEnableRetBot2.setBounds(0, 0, 70, 65);
		pnlRetBot2.add(rdbtnEnableRetBot2);
		
		JLabel iconRetBot2 = new JLabel("");
		iconRetBot2.setIcon(new ImageIcon(OperatorUI.class.getResource("/View/bender_55_2.png")));
		iconRetBot2.setOpaque(true);
		iconRetBot2.setHorizontalTextPosition(SwingConstants.CENTER);
		iconRetBot2.setHorizontalAlignment(SwingConstants.CENTER);
		iconRetBot2.setBorder(new LineBorder(new Color(0, 0, 0)));
		iconRetBot2.setBackground(Color.WHITE);
		iconRetBot2.setAlignmentX(0.5f);
		iconRetBot2.setBounds(80, 5, 45, 55);
		pnlRetBot2.add(iconRetBot2);
		
		JPanel pnlStatusRetBot2 = new JPanel();
		pnlStatusRetBot2.setOpaque(false);
		pnlStatusRetBot2.setBounds(135, 0, 140, 65);
		pnlRetBot2.add(pnlStatusRetBot2);
		pnlStatusRetBot2.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel pnlFuncRetBot2 = new JPanel();
		pnlFuncRetBot2.setOpaque(false);
		pnlStatusRetBot2.add(pnlFuncRetBot2);
		GridBagLayout gbl_pnlFuncRetBot2 = new GridBagLayout();
		gbl_pnlFuncRetBot2.columnWidths = new int[]{0, 0, 0};
		gbl_pnlFuncRetBot2.rowHeights = new int[]{0, 0};
		gbl_pnlFuncRetBot2.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlFuncRetBot2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlFuncRetBot2.setLayout(gbl_pnlFuncRetBot2);
		
		ledFuncRetBot2 = new JLabel("\u2022");
		ledFuncRetBot2.setHorizontalTextPosition(SwingConstants.CENTER);
		ledFuncRetBot2.setHorizontalAlignment(SwingConstants.CENTER);
		ledFuncRetBot2.setForeground(new Color(255, 99, 71));
		ledFuncRetBot2.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_ledFuncRetBot2 = new GridBagConstraints();
		gbc_ledFuncRetBot2.insets = new Insets(0, 15, 0, 5);
		gbc_ledFuncRetBot2.gridx = 0;
		gbc_ledFuncRetBot2.gridy = 0;
		pnlFuncRetBot2.add(ledFuncRetBot2, gbc_ledFuncRetBot2);
		
		JLabel lblFuncRetBot2 = new JLabel("Functional");
		lblFuncRetBot2.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblFuncRetBot2 = new GridBagConstraints();
		gbc_lblFuncRetBot2.insets = new Insets(0, 2, 0, 0);
		gbc_lblFuncRetBot2.gridx = 1;
		gbc_lblFuncRetBot2.gridy = 0;
		pnlFuncRetBot2.add(lblFuncRetBot2, gbc_lblFuncRetBot2);
		
		JPanel pnlAvailRetBot2 = new JPanel();
		pnlAvailRetBot2.setOpaque(false);
		pnlStatusRetBot2.add(pnlAvailRetBot2);
		GridBagLayout gbl_pnlAvailRetBot2 = new GridBagLayout();
		gbl_pnlAvailRetBot2.columnWidths = new int[]{0, 0, 0};
		gbl_pnlAvailRetBot2.rowHeights = new int[]{0, 0};
		gbl_pnlAvailRetBot2.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlAvailRetBot2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlAvailRetBot2.setLayout(gbl_pnlAvailRetBot2);
		
		ledAvailRetBot2 = new JLabel("\u2022");
		ledAvailRetBot2.setHorizontalTextPosition(SwingConstants.CENTER);
		ledAvailRetBot2.setHorizontalAlignment(SwingConstants.CENTER);
		ledAvailRetBot2.setForeground(new Color(255, 99, 71));
		ledAvailRetBot2.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_ledAvailRetBot2 = new GridBagConstraints();
		gbc_ledAvailRetBot2.insets = new Insets(0, 15, 0, 5);
		gbc_ledAvailRetBot2.gridx = 0;
		gbc_ledAvailRetBot2.gridy = 0;
		pnlAvailRetBot2.add(ledAvailRetBot2, gbc_ledAvailRetBot2);
		
		JLabel lblAvailRetBot2 = new JLabel("Available");
		lblAvailRetBot2.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblAvailRetBot2 = new GridBagConstraints();
		gbc_lblAvailRetBot2.insets = new Insets(0, 2, 0, 0);
		gbc_lblAvailRetBot2.gridx = 1;
		gbc_lblAvailRetBot2.gridy = 0;
		pnlAvailRetBot2.add(lblAvailRetBot2, gbc_lblAvailRetBot2);
		
		JButton btnCancelRetBot2 = new JButton("<html>Cancel Move</html>");
		btnCancelRetBot2.setVerticalTextPosition(SwingConstants.TOP);
		btnCancelRetBot2.setVerticalAlignment(SwingConstants.TOP);
		btnCancelRetBot2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCancelRetBot2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancelRetBot2.setBackground(new Color(205, 92, 92));
		btnCancelRetBot2.setBounds(275, 11, 80, 43);
		pnlRetBot2.add(btnCancelRetBot2);
		
		JPanel pnlRetBot3 = new JPanel();
		pnlRetBot3.setLayout(null);
		pnlRetBot3.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlRetBot3.setBackground(Color.GRAY);
		pnlRobots.add(pnlRetBot3);
		
		rdbtnEnableRetBot3 = new JRadioButton("Enable");
		rdbtnEnableRetBot3.setVerticalTextPosition(SwingConstants.TOP);
		rdbtnEnableRetBot3.setSelected(true);
		rdbtnEnableRetBot3.setOpaque(false);
		rdbtnEnableRetBot3.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnEnableRetBot3.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnEnableRetBot3.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnEnableRetBot3.setBackground(Color.GRAY);
		rdbtnEnableRetBot3.setBounds(0, 0, 70, 65);
		pnlRetBot3.add(rdbtnEnableRetBot3);
		
		JLabel iconRetBot3 = new JLabel("");
		iconRetBot3.setIcon(new ImageIcon(OperatorUI.class.getResource("/View/bender_55_2.png")));
		iconRetBot3.setOpaque(true);
		iconRetBot3.setHorizontalTextPosition(SwingConstants.CENTER);
		iconRetBot3.setHorizontalAlignment(SwingConstants.CENTER);
		iconRetBot3.setBorder(new LineBorder(new Color(0, 0, 0)));
		iconRetBot3.setBackground(Color.WHITE);
		iconRetBot3.setAlignmentX(0.5f);
		iconRetBot3.setBounds(80, 5, 45, 55);
		pnlRetBot3.add(iconRetBot3);
		
		JPanel pnlStatusRetBot3 = new JPanel();
		pnlStatusRetBot3.setOpaque(false);
		pnlStatusRetBot3.setBounds(135, 0, 140, 65);
		pnlRetBot3.add(pnlStatusRetBot3);
		pnlStatusRetBot3.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel pnlFuncRetBot3 = new JPanel();
		pnlFuncRetBot3.setOpaque(false);
		pnlStatusRetBot3.add(pnlFuncRetBot3);
		GridBagLayout gbl_pnlFuncRetBot3 = new GridBagLayout();
		gbl_pnlFuncRetBot3.columnWidths = new int[]{0, 0, 0};
		gbl_pnlFuncRetBot3.rowHeights = new int[]{0, 0};
		gbl_pnlFuncRetBot3.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlFuncRetBot3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlFuncRetBot3.setLayout(gbl_pnlFuncRetBot3);
		
		ledFuncRetBot3 = new JLabel("\u2022");
		ledFuncRetBot3.setHorizontalTextPosition(SwingConstants.CENTER);
		ledFuncRetBot3.setHorizontalAlignment(SwingConstants.CENTER);
		ledFuncRetBot3.setForeground(new Color(255, 99, 71));
		ledFuncRetBot3.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_ledFuncRetBot3 = new GridBagConstraints();
		gbc_ledFuncRetBot3.insets = new Insets(0, 15, 0, 5);
		gbc_ledFuncRetBot3.gridx = 0;
		gbc_ledFuncRetBot3.gridy = 0;
		pnlFuncRetBot3.add(ledFuncRetBot3, gbc_ledFuncRetBot3);
		
		JLabel lblFuncRetBot3 = new JLabel("Functional");
		lblFuncRetBot3.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblFuncRetBot3 = new GridBagConstraints();
		gbc_lblFuncRetBot3.insets = new Insets(0, 2, 0, 0);
		gbc_lblFuncRetBot3.gridx = 1;
		gbc_lblFuncRetBot3.gridy = 0;
		pnlFuncRetBot3.add(lblFuncRetBot3, gbc_lblFuncRetBot3);
		
		JPanel pnlAvailRetBot3 = new JPanel();
		pnlAvailRetBot3.setOpaque(false);
		pnlStatusRetBot3.add(pnlAvailRetBot3);
		GridBagLayout gbl_pnlAvailRetBot3 = new GridBagLayout();
		gbl_pnlAvailRetBot3.columnWidths = new int[]{0, 0, 0};
		gbl_pnlAvailRetBot3.rowHeights = new int[]{0, 0};
		gbl_pnlAvailRetBot3.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlAvailRetBot3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlAvailRetBot3.setLayout(gbl_pnlAvailRetBot3);
		
		ledAvailRetBot3 = new JLabel("\u2022");
		ledAvailRetBot3.setHorizontalTextPosition(SwingConstants.CENTER);
		ledAvailRetBot3.setHorizontalAlignment(SwingConstants.CENTER);
		ledAvailRetBot3.setForeground(new Color(255, 99, 71));
		ledAvailRetBot3.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_ledAvailRetBot3 = new GridBagConstraints();
		gbc_ledAvailRetBot3.insets = new Insets(0, 15, 0, 5);
		gbc_ledAvailRetBot3.gridx = 0;
		gbc_ledAvailRetBot3.gridy = 0;
		pnlAvailRetBot3.add(ledAvailRetBot3, gbc_ledAvailRetBot3);
		
		JLabel lblAvailRetBot3 = new JLabel("Available");
		lblAvailRetBot3.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblAvailRetBot3 = new GridBagConstraints();
		gbc_lblAvailRetBot3.insets = new Insets(0, 2, 0, 0);
		gbc_lblAvailRetBot3.gridx = 1;
		gbc_lblAvailRetBot3.gridy = 0;
		pnlAvailRetBot3.add(lblAvailRetBot3, gbc_lblAvailRetBot3);
		
		JButton btnCancelRetBot3 = new JButton("<html>Cancel Move</html>");
		btnCancelRetBot3.setVerticalTextPosition(SwingConstants.TOP);
		btnCancelRetBot3.setVerticalAlignment(SwingConstants.TOP);
		btnCancelRetBot3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCancelRetBot3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancelRetBot3.setBackground(new Color(205, 92, 92));
		btnCancelRetBot3.setBounds(275, 11, 80, 43);
		pnlRetBot3.add(btnCancelRetBot3);
		
		JPanel pnlRetBot4 = new JPanel();
		pnlRetBot4.setLayout(null);
		pnlRetBot4.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlRetBot4.setBackground(Color.GRAY);
		pnlRobots.add(pnlRetBot4);
		
		JPanel pnlFL1 = new JPanel();
		pnlFL1.setLayout(null);
		pnlFL1.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlFL1.setBackground(Color.GRAY);
		pnlRobots.add(pnlFL1);
		
		rdbtnEnableFL1 = new JRadioButton("Enable");
		rdbtnEnableFL1.setVerticalTextPosition(SwingConstants.TOP);
		rdbtnEnableFL1.setSelected(true);
		rdbtnEnableFL1.setOpaque(false);
		rdbtnEnableFL1.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnEnableFL1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnEnableFL1.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnEnableFL1.setBackground(Color.GRAY);
		rdbtnEnableFL1.setBounds(0, 0, 70, 65);
		pnlFL1.add(rdbtnEnableFL1);
		
		JLabel iconFL1 = new JLabel();
		iconFL1.setIcon(new ImageIcon(OperatorUI.class.getResource("/View/forklift_64.png")));
		iconFL1.setOpaque(true);
		iconFL1.setHorizontalTextPosition(SwingConstants.CENTER);
		iconFL1.setHorizontalAlignment(SwingConstants.CENTER);
		iconFL1.setBorder(new LineBorder(new Color(0, 0, 0)));
		iconFL1.setBackground(Color.WHITE);
		iconFL1.setAlignmentX(0.5f);
		iconFL1.setBounds(70, 5, 65, 55);
		pnlFL1.add(iconFL1);
		
		JPanel pnlStatusFL1 = new JPanel();
		pnlStatusFL1.setOpaque(false);
		pnlStatusFL1.setBounds(135, 0, 140, 65);
		pnlFL1.add(pnlStatusFL1);
		pnlStatusFL1.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel pnlFuncFL1 = new JPanel();
		pnlFuncFL1.setOpaque(false);
		pnlStatusFL1.add(pnlFuncFL1);
		GridBagLayout gbl_pnlFuncFL1 = new GridBagLayout();
		gbl_pnlFuncFL1.columnWidths = new int[]{0, 0, 0};
		gbl_pnlFuncFL1.rowHeights = new int[]{0, 0};
		gbl_pnlFuncFL1.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlFuncFL1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlFuncFL1.setLayout(gbl_pnlFuncFL1);
		
		ledFuncFL1 = new JLabel("\u2022");
		ledFuncFL1.setHorizontalTextPosition(SwingConstants.CENTER);
		ledFuncFL1.setHorizontalAlignment(SwingConstants.CENTER);
		ledFuncFL1.setForeground(new Color(255, 99, 71));
		ledFuncFL1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_ledFuncFL1 = new GridBagConstraints();
		gbc_ledFuncFL1.insets = new Insets(0, 15, 0, 5);
		gbc_ledFuncFL1.gridx = 0;
		gbc_ledFuncFL1.gridy = 0;
		pnlFuncFL1.add(ledFuncFL1, gbc_ledFuncFL1);
		
		JLabel lblFuncFL1 = new JLabel("Functional");
		lblFuncFL1.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblFuncFL1 = new GridBagConstraints();
		gbc_lblFuncFL1.insets = new Insets(0, 2, 0, 0);
		gbc_lblFuncFL1.gridx = 1;
		gbc_lblFuncFL1.gridy = 0;
		pnlFuncFL1.add(lblFuncFL1, gbc_lblFuncFL1);
		
		JPanel pnlAvailFL1 = new JPanel();
		pnlAvailFL1.setOpaque(false);
		pnlStatusFL1.add(pnlAvailFL1);
		GridBagLayout gbl_pnlAvailFL1 = new GridBagLayout();
		gbl_pnlAvailFL1.columnWidths = new int[]{0, 0, 0};
		gbl_pnlAvailFL1.rowHeights = new int[]{0, 0};
		gbl_pnlAvailFL1.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlAvailFL1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlAvailFL1.setLayout(gbl_pnlAvailFL1);
		
		ledAvailFL1 = new JLabel("\u2022");
		ledAvailFL1.setHorizontalTextPosition(SwingConstants.CENTER);
		ledAvailFL1.setHorizontalAlignment(SwingConstants.CENTER);
		ledAvailFL1.setForeground(new Color(255, 99, 71));
		ledAvailFL1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_ledAvailFL1 = new GridBagConstraints();
		gbc_ledAvailFL1.insets = new Insets(0, 15, 0, 5);
		gbc_ledAvailFL1.gridx = 0;
		gbc_ledAvailFL1.gridy = 0;
		pnlAvailFL1.add(ledAvailFL1, gbc_ledAvailFL1);
		
		JLabel lblAvailFL1 = new JLabel("Available");
		lblAvailFL1.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblAvailFL1 = new GridBagConstraints();
		gbc_lblAvailFL1.insets = new Insets(0, 2, 0, 0);
		gbc_lblAvailFL1.gridx = 1;
		gbc_lblAvailFL1.gridy = 0;
		pnlAvailFL1.add(lblAvailFL1, gbc_lblAvailFL1);
		
		JButton btnCancelFL1 = new JButton("<html>Cancel Move</html>");
		btnCancelFL1.setVerticalTextPosition(SwingConstants.TOP);
		btnCancelFL1.setVerticalAlignment(SwingConstants.TOP);
		btnCancelFL1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCancelFL1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancelFL1.setBackground(new Color(205, 92, 92));
		btnCancelFL1.setBounds(275, 11, 80, 43);
		pnlFL1.add(btnCancelFL1);
		
		JPanel pnlFL2 = new JPanel();
		pnlFL2.setLayout(null);
		pnlFL2.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlFL2.setBackground(Color.GRAY);
		pnlRobots.add(pnlFL2);
		
		rdbtnEnableFL2 = new JRadioButton("Enable");
		rdbtnEnableFL2.setVerticalTextPosition(SwingConstants.TOP);
		rdbtnEnableFL2.setSelected(true);
		rdbtnEnableFL2.setOpaque(false);
		rdbtnEnableFL2.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnEnableFL2.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnEnableFL2.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnEnableFL2.setBackground(Color.GRAY);
		rdbtnEnableFL2.setBounds(0, 0, 70, 65);
		pnlFL2.add(rdbtnEnableFL2);
		
		JLabel iconFL2 = new JLabel("");
		iconFL2.setIcon(new ImageIcon(OperatorUI.class.getResource("/View/forklift_64.png")));
		iconFL2.setOpaque(true);
		iconFL2.setHorizontalTextPosition(SwingConstants.CENTER);
		iconFL2.setHorizontalAlignment(SwingConstants.CENTER);
		iconFL2.setBorder(new LineBorder(new Color(0, 0, 0)));
		iconFL2.setBackground(Color.WHITE);
		iconFL2.setAlignmentX(0.5f);
		iconFL2.setBounds(70, 5, 65, 55);
		pnlFL2.add(iconFL2);
		
		JPanel pnlStatusFL2 = new JPanel();
		pnlStatusFL2.setOpaque(false);
		pnlStatusFL2.setBounds(135, 0, 140, 65);
		pnlFL2.add(pnlStatusFL2);
		pnlStatusFL2.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel pnlFuncFL2 = new JPanel();
		pnlFuncFL2.setOpaque(false);
		pnlStatusFL2.add(pnlFuncFL2);
		GridBagLayout gbl_pnlFuncFL2 = new GridBagLayout();
		gbl_pnlFuncFL2.columnWidths = new int[]{0, 0, 0};
		gbl_pnlFuncFL2.rowHeights = new int[]{0, 0};
		gbl_pnlFuncFL2.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlFuncFL2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlFuncFL2.setLayout(gbl_pnlFuncFL2);
		
		ledFuncFL2 = new JLabel("\u2022");
		ledFuncFL2.setHorizontalTextPosition(SwingConstants.CENTER);
		ledFuncFL2.setHorizontalAlignment(SwingConstants.CENTER);
		ledFuncFL2.setForeground(new Color(255, 99, 71));
		ledFuncFL2.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_ledFuncFL2 = new GridBagConstraints();
		gbc_ledFuncFL2.insets = new Insets(0, 15, 0, 5);
		gbc_ledFuncFL2.gridx = 0;
		gbc_ledFuncFL2.gridy = 0;
		pnlFuncFL2.add(ledFuncFL2, gbc_ledFuncFL2);
		
		JLabel lblFuncFL2 = new JLabel("Functional");
		lblFuncFL2.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblFuncFL2 = new GridBagConstraints();
		gbc_lblFuncFL2.insets = new Insets(0, 2, 0, 0);
		gbc_lblFuncFL2.gridx = 1;
		gbc_lblFuncFL2.gridy = 0;
		pnlFuncFL2.add(lblFuncFL2, gbc_lblFuncFL2);
		
		JPanel pnlAvailFL2 = new JPanel();
		pnlAvailFL2.setOpaque(false);
		pnlStatusFL2.add(pnlAvailFL2);
		GridBagLayout gbl_pnlAvailFL2 = new GridBagLayout();
		gbl_pnlAvailFL2.columnWidths = new int[]{0, 0, 0};
		gbl_pnlAvailFL2.rowHeights = new int[]{0, 0};
		gbl_pnlAvailFL2.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlAvailFL2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlAvailFL2.setLayout(gbl_pnlAvailFL2);
		
		ledAvailFL2 = new JLabel("\u2022");
		ledAvailFL2.setHorizontalTextPosition(SwingConstants.CENTER);
		ledAvailFL2.setHorizontalAlignment(SwingConstants.CENTER);
		ledAvailFL2.setForeground(new Color(255, 99, 71));
		ledAvailFL2.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_ledAvailFL2 = new GridBagConstraints();
		gbc_ledAvailFL2.insets = new Insets(0, 15, 0, 5);
		gbc_ledAvailFL2.gridx = 0;
		gbc_ledAvailFL2.gridy = 0;
		pnlAvailFL2.add(ledAvailFL2, gbc_ledAvailFL2);
		
		JLabel lblAvailFL2 = new JLabel("Available");
		lblAvailFL2.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblAvailFL2 = new GridBagConstraints();
		gbc_lblAvailFL2.insets = new Insets(0, 2, 0, 0);
		gbc_lblAvailFL2.gridx = 1;
		gbc_lblAvailFL2.gridy = 0;
		pnlAvailFL2.add(lblAvailFL2, gbc_lblAvailFL2);
		
		JButton btnCancelFL2 = new JButton("<html>Cancel Move</html>");
		btnCancelFL2.setVerticalTextPosition(SwingConstants.TOP);
		btnCancelFL2.setVerticalAlignment(SwingConstants.TOP);
		btnCancelFL2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCancelFL2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancelFL2.setBackground(new Color(205, 92, 92));
		btnCancelFL2.setBounds(275, 11, 80, 43);
		pnlFL2.add(btnCancelFL2);
		
		JPanel pnlFL3 = new JPanel();
		pnlFL3.setLayout(null);
		pnlFL3.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlFL3.setBackground(Color.GRAY);
		pnlRobots.add(pnlFL3);
		
		rdbtnEnableFL3 = new JRadioButton("Enable");
		rdbtnEnableFL3.setVerticalTextPosition(SwingConstants.TOP);
		rdbtnEnableFL3.setSelected(true);
		rdbtnEnableFL3.setOpaque(false);
		rdbtnEnableFL3.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnEnableFL3.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnEnableFL3.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnEnableFL3.setBackground(Color.GRAY);
		rdbtnEnableFL3.setBounds(0, 0, 70, 65);
		pnlFL3.add(rdbtnEnableFL3);
		
		JLabel iconFL3 = new JLabel("");
		iconFL3.setIcon(new ImageIcon(OperatorUI.class.getResource("/View/forklift_64.png")));
		iconFL3.setOpaque(true);
		iconFL3.setHorizontalTextPosition(SwingConstants.CENTER);
		iconFL3.setHorizontalAlignment(SwingConstants.CENTER);
		iconFL3.setBorder(new LineBorder(new Color(0, 0, 0)));
		iconFL3.setBackground(Color.WHITE);
		iconFL3.setAlignmentX(0.5f);
		iconFL3.setBounds(70, 5, 65, 55);
		pnlFL3.add(iconFL3);
		
		JPanel pnlStatusFL3 = new JPanel();
		pnlStatusFL3.setOpaque(false);
		pnlStatusFL3.setBounds(135, 0, 140, 65);
		pnlFL3.add(pnlStatusFL3);
		pnlStatusFL3.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel pnlFuncFL3 = new JPanel();
		pnlFuncFL3.setOpaque(false);
		pnlStatusFL3.add(pnlFuncFL3);
		GridBagLayout gbl_pnlFuncFL3 = new GridBagLayout();
		gbl_pnlFuncFL3.columnWidths = new int[]{0, 0, 0};
		gbl_pnlFuncFL3.rowHeights = new int[]{0, 0};
		gbl_pnlFuncFL3.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlFuncFL3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlFuncFL3.setLayout(gbl_pnlFuncFL3);
		
		ledFuncFL3 = new JLabel("\u2022");
		ledFuncFL3.setHorizontalTextPosition(SwingConstants.CENTER);
		ledFuncFL3.setHorizontalAlignment(SwingConstants.CENTER);
		ledFuncFL3.setForeground(new Color(255, 99, 71));
		ledFuncFL3.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_ledFuncFL3 = new GridBagConstraints();
		gbc_ledFuncFL3.insets = new Insets(0, 15, 0, 5);
		gbc_ledFuncFL3.gridx = 0;
		gbc_ledFuncFL3.gridy = 0;
		pnlFuncFL3.add(ledFuncFL3, gbc_ledFuncFL3);
		
		JLabel lblFuncFL3 = new JLabel("Functional");
		lblFuncFL3.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblFuncFL3 = new GridBagConstraints();
		gbc_lblFuncFL3.insets = new Insets(0, 2, 0, 0);
		gbc_lblFuncFL3.gridx = 1;
		gbc_lblFuncFL3.gridy = 0;
		pnlFuncFL3.add(lblFuncFL3, gbc_lblFuncFL3);
		
		JPanel pnlAvailFL3 = new JPanel();
		pnlAvailFL3.setOpaque(false);
		pnlStatusFL3.add(pnlAvailFL3);
		GridBagLayout gbl_pnlAvailFL3 = new GridBagLayout();
		gbl_pnlAvailFL3.columnWidths = new int[]{0, 0, 0};
		gbl_pnlAvailFL3.rowHeights = new int[]{0, 0};
		gbl_pnlAvailFL3.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlAvailFL3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlAvailFL3.setLayout(gbl_pnlAvailFL3);
		
		ledAvailFL3 = new JLabel("\u2022");
		ledAvailFL3.setHorizontalTextPosition(SwingConstants.CENTER);
		ledAvailFL3.setHorizontalAlignment(SwingConstants.CENTER);
		ledAvailFL3.setForeground(new Color(255, 99, 71));
		ledAvailFL3.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_ledAvailFL3 = new GridBagConstraints();
		gbc_ledAvailFL3.insets = new Insets(0, 15, 0, 5);
		gbc_ledAvailFL3.gridx = 0;
		gbc_ledAvailFL3.gridy = 0;
		pnlAvailFL3.add(ledAvailFL3, gbc_ledAvailFL3);
		
		JLabel lblAvailFL3 = new JLabel("Available");
		lblAvailFL3.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblAvailFL3 = new GridBagConstraints();
		gbc_lblAvailFL3.insets = new Insets(0, 2, 0, 0);
		gbc_lblAvailFL3.gridx = 1;
		gbc_lblAvailFL3.gridy = 0;
		pnlAvailFL3.add(lblAvailFL3, gbc_lblAvailFL3);
		
		JButton btnCancelFL3 = new JButton("<html>Cancel Move</html>");
		btnCancelFL3.setVerticalTextPosition(SwingConstants.TOP);
		btnCancelFL3.setVerticalAlignment(SwingConstants.TOP);
		btnCancelFL3.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCancelFL3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancelFL3.setBackground(new Color(205, 92, 92));
		btnCancelFL3.setBounds(275, 11, 80, 43);
		pnlFL3.add(btnCancelFL3);
		
		JPanel pnlFL4 = new JPanel();
		pnlFL4.setLayout(null);
		pnlFL4.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlFL4.setBackground(Color.GRAY);
		pnlRobots.add(pnlFL4);
		
		JPanel pnlWrhsFloor = new JPanel();
		pnlWrhsFloor.setBounds(409, 152, 725, 531);
		pnlWrhsFloor.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		pnlWrhsFloor.setBackground(Color.LIGHT_GRAY);
		cpWrhsOperator.add(pnlWrhsFloor);
		GridLayout gl_pnlWrhsFloor = new GridLayout(2, 2);
		pnlWrhsFloor.setLayout(gl_pnlWrhsFloor);
		
		JPanel pnlWrhsFloorA = new JPanel();
		pnlWrhsFloorA.setBackground(SystemColor.scrollbar);
		pnlWrhsFloor.add(pnlWrhsFloorA);
		
		JPanel pnlA1 = new JPanel();
		pnlA1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		lblA1 = new JLabel();
		pnlA1.add(lblA1);
				
		JPanel pnlA2 = new JPanel();
		pnlA2.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		lblA2 = new JLabel();
		pnlA2.add(lblA2);
		
		JPanel pnlA3 = new JPanel();
		pnlA3.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		lblA3 = new JLabel();
		pnlA3.add(lblA3);
		
		JPanel pnlA4 = new JPanel();
		pnlA4.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		lblA4 = new JLabel();
		pnlA4.add(lblA4);
		
		btnA1 = new JButton("A1");
		btnA1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnA1.setForeground(Color.WHITE);
		btnA1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnA1.setBackground(new Color(70, 130, 180));
		
		btnA2 = new JButton("A2");
		btnA2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnA2.setForeground(Color.WHITE);
		btnA2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnA2.setBackground(new Color(70, 130, 180));
		
		btnA3 = new JButton("A3");
		btnA3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnA3.setForeground(Color.WHITE);
		btnA3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnA3.setBackground(new Color(70, 130, 180));
		
		btnA4 = new JButton("A4");
		btnA4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnA4.setForeground(Color.WHITE);
		btnA4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnA4.setBackground(new Color(70, 130, 180));
		
		GroupLayout gl_pnlWrhsFloorA = new GroupLayout(pnlWrhsFloorA);
		gl_pnlWrhsFloorA.setHorizontalGroup(
			gl_pnlWrhsFloorA.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlWrhsFloorA.createSequentialGroup()
					.addContainerGap(79, Short.MAX_VALUE)
					.addGroup(gl_pnlWrhsFloorA.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnA1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnA2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnA3, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnA4, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlWrhsFloorA.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlA1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlA2, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlA4, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlA3, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
					.addGap(80))
		);
		gl_pnlWrhsFloorA.setVerticalGroup(
			gl_pnlWrhsFloorA.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlWrhsFloorA.createSequentialGroup()
					.addContainerGap(48, Short.MAX_VALUE)
					.addGroup(gl_pnlWrhsFloorA.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnA1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(pnlA1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE))
					.addGap(1)
					.addGroup(gl_pnlWrhsFloorA.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlA2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnA2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addGroup(gl_pnlWrhsFloorA.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlA3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnA3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(1)
					.addGroup(gl_pnlWrhsFloorA.createParallelGroup(Alignment.LEADING)
						.addComponent(btnA4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlA4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(44))
		);
		pnlWrhsFloorA.setLayout(gl_pnlWrhsFloorA);
		
		JPanel pnlWrhsFloorB = new JPanel();
		pnlWrhsFloorB.setBackground(SystemColor.scrollbar);
		pnlWrhsFloor.add(pnlWrhsFloorB);		
		
		JPanel pnlB1 = new JPanel();
		pnlB1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		lblB1 = new JLabel();
		pnlB1.add(lblB1);
		
		JPanel pnlB2 = new JPanel();
		pnlB2.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		lblB2 = new JLabel();
		pnlB2.add(lblB2);
		
		JPanel pnlB3 = new JPanel();
		pnlB3.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		lblB3 = new JLabel();
		pnlB3.add(lblB3);
		
		JPanel pnlB4 = new JPanel();
		pnlB4.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		lblB4 = new JLabel();
		pnlB4.add(lblB4);		
		
		btnB1 = new JButton("B1");
		btnB1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnB1.setForeground(Color.WHITE);
		btnB1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnB1.setBackground(new Color(70, 130, 180));
		
		btnB2 = new JButton("B2");
		btnB2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnB2.setForeground(Color.WHITE);
		btnB2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnB2.setBackground(new Color(70, 130, 180));
		
		btnB3 = new JButton("B3");
		btnB3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnB3.setForeground(Color.WHITE);
		btnB3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnB3.setBackground(new Color(70, 130, 180));
		
		btnB4 = new JButton("B4");
		btnB4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnB4.setForeground(Color.WHITE);
		btnB4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnB4.setBackground(new Color(70, 130, 180));		

		GroupLayout gl_pnlWrhsFloorB = new GroupLayout(pnlWrhsFloorB);
		gl_pnlWrhsFloorB.setHorizontalGroup(
			gl_pnlWrhsFloorB.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 354, Short.MAX_VALUE)
				.addGroup(gl_pnlWrhsFloorB.createSequentialGroup()
					.addContainerGap(79, Short.MAX_VALUE)
					.addGroup(gl_pnlWrhsFloorB.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnB1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnB2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnB3, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnB4, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlWrhsFloorB.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlB1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlB2, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlB4, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlB3, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
					.addGap(80))
		);
		gl_pnlWrhsFloorB.setVerticalGroup(
			gl_pnlWrhsFloorB.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 220, Short.MAX_VALUE)
				.addGroup(gl_pnlWrhsFloorB.createSequentialGroup()
					.addContainerGap(48, Short.MAX_VALUE)
					.addGroup(gl_pnlWrhsFloorB.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnB1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(pnlB1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE))
					.addGap(1)
					.addGroup(gl_pnlWrhsFloorB.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlB2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnB2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addGroup(gl_pnlWrhsFloorB.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlB3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnB3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(1)
					.addGroup(gl_pnlWrhsFloorB.createParallelGroup(Alignment.LEADING)
						.addComponent(btnB4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlB4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(44))
		);
		pnlWrhsFloorB.setLayout(gl_pnlWrhsFloorB);
		
		JPanel pnlWrhsFloorC = new JPanel();
		pnlWrhsFloorC.setBackground(SystemColor.scrollbar);
		pnlWrhsFloor.add(pnlWrhsFloorC);
		
		JPanel pnlC1 = new JPanel();
		pnlC1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		lblC1 = new JLabel();
		pnlC1.add(lblC1);
		
		JPanel pnlC2 = new JPanel();
		pnlC2.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		lblC2 = new JLabel();
		pnlC2.add(lblC2);

		JPanel pnlC3 = new JPanel();
		pnlC3.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		lblC3 = new JLabel();
		pnlC3.add(lblC3);
		
		JPanel pnlC4 = new JPanel();
		pnlC4.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		lblC4 = new JLabel();
		pnlC4.add(lblC4);
				
		btnC1 = new JButton("C1");
		btnC1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnC1.setForeground(Color.WHITE);
		btnC1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnC1.setBackground(new Color(70, 130, 180));
		
		btnC2 = new JButton("C2");
		btnC2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnC2.setForeground(Color.WHITE);
		btnC2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnC2.setBackground(new Color(70, 130, 180));
		
		btnC3 = new JButton("C3");
		btnC3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnC3.setForeground(Color.WHITE);
		btnC3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnC3.setBackground(new Color(70, 130, 180));

		btnC4 = new JButton("C4");
		btnC4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnC4.setForeground(Color.WHITE);
		btnC4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnC4.setBackground(new Color(70, 130, 180));
		
		GroupLayout gl_pnlWrhsFloorC = new GroupLayout(pnlWrhsFloorC);
		gl_pnlWrhsFloorC.setHorizontalGroup(
			gl_pnlWrhsFloorC.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 354, Short.MAX_VALUE)
				.addGroup(gl_pnlWrhsFloorC.createSequentialGroup()
					.addContainerGap(79, Short.MAX_VALUE)
					.addGroup(gl_pnlWrhsFloorC.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnC1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnC2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnC3, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnC4, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlWrhsFloorC.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlC1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlC2, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlC4, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlC3, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
					.addGap(80))
		);
		gl_pnlWrhsFloorC.setVerticalGroup(
			gl_pnlWrhsFloorC.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 220, Short.MAX_VALUE)
				.addGroup(gl_pnlWrhsFloorC.createSequentialGroup()
					.addContainerGap(48, Short.MAX_VALUE)
					.addGroup(gl_pnlWrhsFloorC.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnC1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(pnlC1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE))
					.addGap(1)
					.addGroup(gl_pnlWrhsFloorC.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlC2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnC2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addGroup(gl_pnlWrhsFloorC.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlC3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnC3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(1)
					.addGroup(gl_pnlWrhsFloorC.createParallelGroup(Alignment.LEADING)
						.addComponent(btnC4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlC4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(44))
		);
		pnlWrhsFloorC.setLayout(gl_pnlWrhsFloorC);
		
		JPanel pnlWrhsFloorD = new JPanel();
		pnlWrhsFloorD.setBackground(SystemColor.scrollbar);
		pnlWrhsFloor.add(pnlWrhsFloorD);

		JPanel pnlD1 = new JPanel();
		pnlD1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		lblD1 = new JLabel();
		pnlD1.add(lblD1);
		
		JPanel pnlD2 = new JPanel();
		pnlD2.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		lblD2 = new JLabel();
		pnlD2.add(lblD2);

		JPanel pnlD3 = new JPanel();
		pnlD3.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		lblD3 = new JLabel();
		pnlD3.add(lblD3);
		
		JPanel pnlD4 = new JPanel();
		pnlD4.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		lblD4 = new JLabel();
		pnlD4.add(lblD4);
				
		btnD1 = new JButton("D1");
		btnD1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnD1.setForeground(Color.WHITE);
		btnD1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnD1.setBackground(new Color(70, 130, 180));
		
		btnD2 = new JButton("D2");
		btnD2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnD2.setForeground(Color.WHITE);
		btnD2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnD2.setBackground(new Color(70, 130, 180));
		
		btnD3 = new JButton("D3");
		btnD3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnD3.setForeground(Color.WHITE);
		btnD3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnD3.setBackground(new Color(70, 130, 180));
		
		btnD4 = new JButton("D4");
		btnD4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnD4.setForeground(Color.WHITE);
		btnD4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnD4.setBackground(new Color(70, 130, 180));
						
		GroupLayout gl_pnlWrhsFloorD = new GroupLayout(pnlWrhsFloorD);
		gl_pnlWrhsFloorD.setHorizontalGroup(
			gl_pnlWrhsFloorD.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 354, Short.MAX_VALUE)
				.addGroup(gl_pnlWrhsFloorD.createSequentialGroup()
					.addContainerGap(79, Short.MAX_VALUE)
					.addGroup(gl_pnlWrhsFloorD.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnD1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnD2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnD3, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnD4, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlWrhsFloorD.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlD1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlD2, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlD4, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlD3, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
					.addGap(80))
		);
		gl_pnlWrhsFloorD.setVerticalGroup(
			gl_pnlWrhsFloorD.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 220, Short.MAX_VALUE)
				.addGroup(gl_pnlWrhsFloorD.createSequentialGroup()
					.addContainerGap(48, Short.MAX_VALUE)
					.addGroup(gl_pnlWrhsFloorD.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnD1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(pnlD1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE))
					.addGap(1)
					.addGroup(gl_pnlWrhsFloorD.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlD2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnD2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addGroup(gl_pnlWrhsFloorD.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlD3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnD3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(1)
					.addGroup(gl_pnlWrhsFloorD.createParallelGroup(Alignment.LEADING)
						.addComponent(btnD4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlD4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(44))
		);
		pnlWrhsFloorD.setLayout(gl_pnlWrhsFloorD);
		
		JPanel pnlLdgDock = new JPanel();
		pnlLdgDock.setBounds(409, 683, 725, 145);
		cpWrhsOperator.add(pnlLdgDock);
		pnlLdgDock.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel pnlLdgDock1 = new JPanel();
		pnlLdgDock1.setBorder(null);
		pnlLdgDock.add(pnlLdgDock1);
		
		JPanel pnlLdgDock1Pallet = new JPanel();
		pnlLdgDock1Pallet.setBorder(new LineBorder(new Color(0, 0, 0)));
				
		lblLdgDock1Pallet = new JLabel();
		pnlLdgDock1Pallet.add(lblLdgDock1Pallet);
		
		btnLD1Select = new JButton("Select Pallet");
		btnLD1Select.setForeground(new Color(255, 255, 255));
		btnLD1Select.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLD1Select.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnLD1Select.setBackground(new Color(0, 128, 0));
		
		JLabel lblLoadingDock = new JLabel("Loading Dock 1");
		lblLoadingDock.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLoadingDock.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_pnlLdgDock1 = new GroupLayout(pnlLdgDock1);
		gl_pnlLdgDock1.setHorizontalGroup(
			gl_pnlLdgDock1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlLdgDock1.createSequentialGroup()
					.addGap(52)
					.addGroup(gl_pnlLdgDock1.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblLoadingDock, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnLD1Select, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
						.addComponent(pnlLdgDock1Pallet, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
					.addContainerGap(50, Short.MAX_VALUE))
		);
		gl_pnlLdgDock1.setVerticalGroup(
			gl_pnlLdgDock1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlLdgDock1.createSequentialGroup()
					.addComponent(pnlLdgDock1Pallet, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnLD1Select, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblLoadingDock)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		pnlLdgDock1.setLayout(gl_pnlLdgDock1);
		
		JPanel pnlLdgDock2 = new JPanel();
		pnlLdgDock2.setBorder(null);
		pnlLdgDock.add(pnlLdgDock2);
		
		JPanel pnlLdgDock2Pallet = new JPanel();
		pnlLdgDock2Pallet.setBorder(new LineBorder(new Color(0, 0, 0)));
				
		lblLdgDock2Pallet = new JLabel();
		pnlLdgDock2Pallet.add(lblLdgDock2Pallet);
		
		btnLD2Select = new JButton("Select Pallet");
		btnLD2Select.setForeground(new Color(255, 255, 255));
		btnLD2Select.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLD2Select.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnLD2Select.setBackground(new Color(0, 128, 0));
		
		JLabel lblLoadingDock_1 = new JLabel("Loading Dock 2");
		lblLoadingDock_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoadingDock_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		GroupLayout gl_pnlLdgDock2 = new GroupLayout(pnlLdgDock2);
		gl_pnlLdgDock2.setHorizontalGroup(
			gl_pnlLdgDock2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlLdgDock2.createSequentialGroup()
					.addGap(52)
					.addGroup(gl_pnlLdgDock2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLoadingDock_1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLD2Select, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlLdgDock2Pallet, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
					.addGap(50))
		);
		gl_pnlLdgDock2.setVerticalGroup(
			gl_pnlLdgDock2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlLdgDock2.createSequentialGroup()
					.addComponent(pnlLdgDock2Pallet, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnLD2Select, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblLoadingDock_1)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		pnlLdgDock2.setLayout(gl_pnlLdgDock2);
		
		JPanel pnlLdgDock3 = new JPanel();
		pnlLdgDock3.setBorder(null);
		pnlLdgDock.add(pnlLdgDock3);
		
		btnLD3Select = new JButton("Select Pallet");
		btnLD3Select.setForeground(new Color(255, 255, 255));
		btnLD3Select.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLD3Select.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnLD3Select.setBackground(new Color(0, 128, 0));
		
		JPanel pnlLdgDock3Pallet = new JPanel();
		pnlLdgDock3Pallet.setBorder(new LineBorder(new Color(0, 0, 0)));
				
		lblLdgDock3Pallet = new JLabel();
		pnlLdgDock3Pallet.add(lblLdgDock3Pallet);
		
		JLabel lblLoadingDock_2 = new JLabel("Loading Dock 3");
		lblLoadingDock_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoadingDock_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		GroupLayout gl_pnlLdgDock3 = new GroupLayout(pnlLdgDock3);
		gl_pnlLdgDock3.setHorizontalGroup(
			gl_pnlLdgDock3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlLdgDock3.createSequentialGroup()
					.addGap(52)
					.addGroup(gl_pnlLdgDock3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLoadingDock_2, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLD3Select, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlLdgDock3Pallet, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
					.addGap(50))
		);
		gl_pnlLdgDock3.setVerticalGroup(
			gl_pnlLdgDock3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlLdgDock3.createSequentialGroup()
					.addComponent(pnlLdgDock3Pallet, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnLD3Select, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblLoadingDock_2)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		pnlLdgDock3.setLayout(gl_pnlLdgDock3);
	}
	
	public ArrayList<JRadioButton> getRadioButtons()
	{
		ArrayList<JRadioButton> radioButtons = new ArrayList<JRadioButton>();
		radioButtons.add(rdbtnEnableRetBot1);
		radioButtons.add(rdbtnEnableRetBot2);
		radioButtons.add(rdbtnEnableRetBot3);
		radioButtons.add(rdbtnEnableFL1);
		radioButtons.add(rdbtnEnableFL2);
		radioButtons.add(rdbtnEnableFL3);
		
		return radioButtons;		
	}
	public ArrayList<JButton> getSelectPalletButtons()
	{
		ArrayList<JButton> selectPalletButtons = new ArrayList<JButton>();
		selectPalletButtons.add(btnQaSelect);
		selectPalletButtons.add(btnLD1Select);
		selectPalletButtons.add(btnLD2Select);
		selectPalletButtons.add(btnLD3Select);
		
		return selectPalletButtons;
	}
	public ArrayList<JButton> getDestButtons()
	{
		ArrayList<JButton> destButtons = new ArrayList<JButton>();
		destButtons.add(btnQa);
		destButtons.add(btnA1);
		destButtons.add(btnA2);
		destButtons.add(btnA3);
		destButtons.add(btnA4);
		destButtons.add(btnB1);
		destButtons.add(btnB2);
		destButtons.add(btnB3);
		destButtons.add(btnB4);
		destButtons.add(btnC1);
		destButtons.add(btnC2);
		destButtons.add(btnC3);
		destButtons.add(btnC4);
		destButtons.add(btnD1);
		destButtons.add(btnD2);
		destButtons.add(btnD3);
		destButtons.add(btnD4);
		
		return destButtons;
	}
	public ArrayList<JLabel> getPalletLabels()
	{
		ArrayList<JLabel> palletLabels = new ArrayList<JLabel>();
		palletLabels.add(lblA1);
		palletLabels.add(lblA2);
		palletLabels.add(lblA3);
		palletLabels.add(lblA4);
		palletLabels.add(lblB1);
		palletLabels.add(lblB2);
		palletLabels.add(lblB3);
		palletLabels.add(lblB4);
		palletLabels.add(lblC1);
		palletLabels.add(lblC2);
		palletLabels.add(lblC3);
		palletLabels.add(lblC4);
		palletLabels.add(lblD1);
		palletLabels.add(lblD2);
		palletLabels.add(lblD3);
		palletLabels.add(lblD4);
		palletLabels.add(lblQaPallet);
		palletLabels.add(lblLdgDock1Pallet);
		palletLabels.add(lblLdgDock2Pallet);
		palletLabels.add(lblLdgDock3Pallet);
		
		return palletLabels;
	}
	public ArrayList<JLabel> getForkliftLEDs()
	{
		ArrayList<JLabel> forkliftLEDs = new ArrayList<JLabel>();
		forkliftLEDs.add(ledFuncFL1);
		forkliftLEDs.add(ledAvailFL1);
		forkliftLEDs.add(ledFuncFL2);
		forkliftLEDs.add(ledAvailFL2);
		forkliftLEDs.add(ledFuncFL3);
		forkliftLEDs.add(ledAvailFL3);
		
		return forkliftLEDs;
	}
	public ArrayList<JLabel> getRetBotLEDs()
	{
		ArrayList<JLabel> retbotLEDs = new ArrayList<JLabel>();
		retbotLEDs.add(ledFuncRetBot1);
		retbotLEDs.add(ledAvailRetBot1);
		retbotLEDs.add(ledFuncRetBot2);
		retbotLEDs.add(ledAvailRetBot2);
		retbotLEDs.add(ledFuncRetBot3);
		retbotLEDs.add(ledAvailRetBot3);
		
		return retbotLEDs;
	}
	public int getPalletLabelIndex(String shelf)
	{		
		int index = -100;
		char shelfGroup = shelf.charAt(0);
		int shelfNo = Character.getNumericValue(shelf.charAt(1));	
		
		System.out.println("Shelf " + shelf + "; group " + shelfGroup + "; no " + shelfNo);
		
		if (shelfGroup=='A') index = (0*4)+(shelfNo-1);
		else if (shelfGroup=='B') index = (1*4)+(shelfNo-1);
		else if (shelfGroup=='C') index = (2*4)+(shelfNo-1);
		else if (shelfGroup=='D') index = (3*4)+(shelfNo-1);
		else if (shelf.equals("QA")) index = 16;
		else if (shelf.equals("LD1")) index = 17;
		else if (shelf.equals("LD2")) index = 18;
		else if (shelf.equals("LD3")) index = 19;
		
		System.out.println(index);
		
		return index;
	}
}
