/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.SriUtamiN.latihanmvcjdbc.main;

import edu.SriUtamiN.latihanmvcjdbc.database.KingsBarbershopDatabase;
import edu.SriUtamiN.latihanmvcjdbc.entity.Pelanggan;
import edu.SriUtamiN.latihanmvcjdbc.error.PelangganException;
import edu.SriUtamiN.latihanmvcjdbc.service.PelangganDao;
import edu.SriUtamiN.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author 
 * Nama : Sri Utami Ningsih
 * Nim  : 10116378
 * Kelas: IF-2
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
        
    }
    
}
