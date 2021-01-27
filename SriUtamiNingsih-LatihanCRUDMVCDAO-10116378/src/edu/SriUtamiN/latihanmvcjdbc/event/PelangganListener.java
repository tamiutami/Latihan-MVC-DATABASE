/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.SriUtamiN.latihanmvcjdbc.event;

import edu.SriUtamiN.latihanmvcjdbc.entity.Pelanggan;
import edu.SriUtamiN.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author 
 * Nama : Sri Utami Ningsih
 * Nim  : 10116378
 * Kelas: IF-2
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);
}
