package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

import controller.AddButtonListener;
import controller.App;
import controller.ClearButtonListener;
import controller.KeyEventHandler;
import controller.MouseEventHandler;
import controller.QtyItemListener;
import controller.RemoveButtonListener;
import controller.ShapeButtonListener;

public class AppWindow extends JFrame{

    public static int SIZE = 40;

    public static final String[] shapeActionCommand = 
    new String[]{"Circle", "Rect", "Stadium"};
    public static final String addActionCommand = "Add";
    public static final String removeActionCommand = "Remove";
    public static final String clearActionCommand = "Clear";
    public static final Integer[] qtyListItems = new Integer[] {
        1,2,3,4,5
    };


    private AppCanvas canvas = new AppCanvas();

    public void init(){
        Container cp = getContentPane();
        cp.add(canvas, BorderLayout.CENTER);
        var mouselistener = new MouseEventHandler();
        canvas.addMouseListener(mouselistener);
        canvas.addKeyListener(new KeyEventHandler());
       //canvas.addMouseMotionListener(mouselistener);

        // shape selection
        JPanel shapePanel = new JPanel();
        shapePanel.setBorder(new TitledBorder("Select Shape"));
        ButtonGroup shapeGroup = new ButtonGroup();
        JRadioButton[] shapeButtons = new JRadioButton[] {
            new JRadioButton(shapeActionCommand[0], App.model.ShapeType == shapeActionCommand[0]), //default 
            new JRadioButton(shapeActionCommand[1], App.model.ShapeType == shapeActionCommand[1]), //default 
            new JRadioButton(shapeActionCommand[2], App.model.ShapeType == shapeActionCommand[2]), //default 
        };
        ShapeButtonListener shapeButtonListener = new ShapeButtonListener();
        for (var b: shapeButtons) {
            b.addActionListener(shapeButtonListener);
            shapePanel.add(b);
            shapeGroup.add(b);
        }

        //add panel
        JPanel addPanel = new JPanel();
        addPanel.setBorder(new TitledBorder("Add"));
        JComboBox<Integer> qtyComboBox = new JComboBox<>();
        for (var q: qtyListItems) {
            qtyComboBox.addItem(q);
        }
        qtyComboBox.addItemListener(new QtyItemListener());

        JButton addButton = new JButton(addActionCommand);
        addButton.addActionListener(new AddButtonListener());
        addPanel.add(qtyComboBox);
        addPanel.add(addButton);

        //remove/clear buttons
        JPanel removeClearPanel = new JPanel();
        removeClearPanel.setBorder(new TitledBorder("Remove/Clear"));
        JButton removeButton = new JButton(removeActionCommand);
        removeButton.addActionListener(new RemoveButtonListener()); 
        JButton clearButton = new JButton(clearActionCommand);
        clearButton.addActionListener(new ClearButtonListener());
        removeClearPanel.add(removeButton);
        removeClearPanel.add(clearButton);

        //south panel
        JPanel southPanel = new JPanel();
        southPanel.setLayout((new GridLayout(3,1)));
        southPanel.add(shapePanel);
        southPanel.add(addPanel);
        southPanel.add(removeClearPanel);

        cp.add(southPanel,BorderLayout.SOUTH);

        //focus on key event
        canvas.setFocusable(true);
        addButton.setFocusable(false);
        qtyComboBox.setFocusable(false);
        removeButton.setFocusable(false);
        clearButton.setFocusable(false);
        for (var b: shapeButtons)
            b.setFocusable(false);

    }

    public void repaintCanvas() {
        canvas.repaint();
    }
    
}
