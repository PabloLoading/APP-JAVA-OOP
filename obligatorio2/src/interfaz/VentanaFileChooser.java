
package interfaz;

import archivos.ArchivoLectura;
import dominio.*;
import javax.swing.JFileChooser;

public class VentanaFileChooser extends javax.swing.JFrame {

    public VentanaFileChooser() {
        initComponents();
    }
    public void setSistema(Sistema s){
        modelo=s;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfile = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfileActionPerformed
        try{
            String path=jfile.getSelectedFile().getAbsolutePath();
            ArchivoLectura archL=new ArchivoLectura(path);
            while(archL!=null && archL.hayMasLineas()){
                String[] data=archL.linea().split(";");
                int numClientes=Integer.parseInt(data[0]);
                for (int i = 0; i <numClientes; i++) {
                    archL.hayMasLineas();
                    String[] dataC=archL.linea().split(";"); 
                    String nombre=dataC[0];
                    String direccion=dataC[1];
                    String tel=dataC[2];
                    Cliente c=new Cliente(nombre,direccion,tel);
                    modelo.agregarCliente(c);
                }
                archL.hayMasLineas();
                String[] data2=archL.linea().split(";");
                int numCats=Integer.parseInt(data2[0]);
                for (int i = 0; i <numCats; i++) {
                    archL.hayMasLineas();
                    String[] dataCats=archL.linea().split(";");
                    String nombre=dataCats[0];
                    String detalles=dataCats[1];
                    int prio=Integer.parseInt(dataCats[2]);
                    Categoria c=new Categoria(nombre,prio,detalles);
                    modelo.agregarCategoria(c);
                }
                archL.hayMasLineas();
                String[] data3=archL.linea().split(";");
                int numP=Integer.parseInt(data3[0]);
                for (int i = 0; i <numP; i++) {
                    archL.hayMasLineas();
                    String[] dataP=archL.linea().split(";");
                    String nombre=dataP[0];
                    int precio=Integer.parseInt(dataP[1]);
                    Categoria[] pCats=new Categoria[dataP.length-2];
                    for (int j = 0; j < pCats.length; j++) {
                        pCats[j]=modelo.buscarCatgoria(dataP[j+2]);
                    }
                    Producto p=new Producto(nombre,precio,pCats);
                    modelo.agregarProducto(p);
                }
            }  
            archL.cerrar();
        }
        catch(NumberFormatException | NullPointerException e){}
        dispose();
    }//GEN-LAST:event_jfileActionPerformed
     
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
            java.util.logging.Logger.getLogger(VentanaFileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFileChooser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jfile;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}
