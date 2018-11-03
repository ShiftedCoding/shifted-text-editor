package me.Shifted;

import javax.swing.*;

//Created on 2018-11-03 in package me.Shifted
public class EditorClass extends JFrame{

  public static int WIDTH = 1920;
  public static int HEIGHT = 1080;

  private JTextArea editorTextField;
  private JTabbedPane tabbedPane1;
  private JPanel editorTextArea;
  private JPanel mainArea;

  public EditorClass() {
    setSize(WIDTH, HEIGHT);
    setContentPane(mainArea);
    setLocationRelativeTo(null);
  }

  public JTextArea getEditorTextField() {
    return editorTextField;
  }

  public JTabbedPane getTabbedPane1() {
    return tabbedPane1;
  }
}
