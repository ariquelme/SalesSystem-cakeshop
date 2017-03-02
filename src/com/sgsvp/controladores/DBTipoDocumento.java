/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgsvp.controladores;

import com.sgsvp.entidades.TipoDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * 
 */
public abstract class DBTipoDocumento {
    
    
    public static void insertarCategoria(TipoDocumento td) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement("INSERT INTO tipo_documento (id_tipo_documento,tipo_documento_descripcion) VALUES (?)");
        //ps.setInt(1, td.getIdTipoDocumento());
        ps.setString(1, td.getTipoDocumentoDescripcion());
        ps.executeUpdate();
        cnn.close();
        ps.close();
    }
    
    public static TipoDocumento buscarTipoDocumento(int idTipoDocumento) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        TipoDocumento td = null;
        ps = cnn.prepareStatement("select * from tipo_documento where id_tipo_documento=?");
        ps.setInt(1, idTipoDocumento);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            td = new TipoDocumento() {
            };
            td.setIdTipoDocumento(idTipoDocumento);
            td.setTipoDocumentoDescripcion(rs.getString("tipo_documento_descripcion"));
           
        }
        cnn.close();
        ps.close();
        return td;
    }
    
}
