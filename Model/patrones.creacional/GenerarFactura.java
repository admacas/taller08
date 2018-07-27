package patrones.creacional;

import java.util.*;

/**
 * 
 */
public class GenerarFactura extends ComprobanteBuilder {

    /**
     * Default constructor
     */
    public GenerarFactura() {
    }

    /**
     * 
     */
    private String detallesEmisor;

    /**
     * 
     */
    private String nombreCliente;

    /**
     * 
     */
    private String numeroAutorizacion;

    /**
     * 
     */
    private String claveAcceso;

    /**
     * 
     */
    private String codigo;

    /**
     * 
     */
    private Date fecha;

    /**
     * 
     */
    private list listProductos;

    /**
     * 
     */
    private double total;

}