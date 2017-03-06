
package com.sgsvp.entidades;

/**
 *
 * @author ariquelme
 */
public abstract class TipoDocumento {
    
    private int idTipoDocumento;
    private String tipoDocumentoDescripcion;
    
    
    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getTipoDocumentoDescripcion() {
        return tipoDocumentoDescripcion;
    }

    public void setTipoDocumentoDescripcion(String tipoDocumentoDescripcion) {
        this.tipoDocumentoDescripcion = tipoDocumentoDescripcion;
    }
   
    
    
    
    
}
