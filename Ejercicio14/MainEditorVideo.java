/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class MainEditorVideo {
    public static void main(String[] args) {
        Proyecto proyecto1 = new Proyecto("Corto Documental", 15);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto1);
    }
}