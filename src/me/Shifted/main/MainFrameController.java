package me.Shifted.main;

import me.Shifted.EditorClass;

import javax.swing.*;

//Created on 2018-11-03 in package me.Shifted.main
public class MainFrameController {

  private EditorClass editorClass;
  private JTextArea editorTextField;
  private JTabbedPane tabbedPane1;

  public MainFrameController() {
    init();
  }

  private void init() {
    registerComponents();
    registerListeners();
    registerMenu();
  }

  private void registerMenu() {
    JMenu fileMenu = new JMenu("File");
    {
      JMenuItem newItem = fileMenu.add(new JMenuItem("New"));
      JMenuItem openItem = fileMenu.add(new JMenuItem("Open"));
      JMenuItem saveItem = fileMenu.add(new JMenuItem("Save"));
      JMenuItem saveAsItem = fileMenu.add(new JMenuItem("Save As"));
    }
    JMenu editMenu = new JMenu("Edit");
    {
      editMenu.add(new JMenuItem("Copy"));
      editMenu.add(new JMenuItem("Cut"));
      editMenu.add(new JMenuItem("Paste"));
      editMenu.add(new JSeparator());
      editMenu.add(new JMenuItem("Preferences"));
    }

    JMenuBar menuBar = new JMenuBar();
    {
      menuBar.add(fileMenu);
      menuBar.add(editMenu);
    }

    editorClass.setJMenuBar(menuBar);

  }

  private void registerListeners() {

  }

  private void registerComponents() {
    editorClass = new EditorClass();
    editorTextField = editorClass.getEditorTextField();
    tabbedPane1 = editorClass.getTabbedPane1();
  }

  public void showWindow() {
    editorClass.setVisible(true);
  }

}
