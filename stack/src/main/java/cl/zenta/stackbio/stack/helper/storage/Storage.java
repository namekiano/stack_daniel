package cl.zenta.stackbio.stack.helper.storage;

import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.zenta.stackbio.stack.controllers.AvatarController;

public abstract class Storage {
	
	String[] allowedExt = {".jpg", ".jpeg", ".png", ".gif"};

    private String fileName = null;
    private String fileURL = null;

    /** The Constant logger. */
    private static final Logger logger = LoggerFactory.getLogger(AvatarController.class);

    /**
     * Se encarga de setear las opciones necesarias
     */
    public abstract void setDefaultStorageSettings();

    /**
     * Se encargará de subir el arhcivo
     * @param fileName
     * @param file
     */
    public abstract boolean uploadFile(String fileName, byte[] file, String newName) throws ServletException;

    /**
     * Cambia las extenciones por defecto
     * @param allowedExt
     * @return
     */
    public void setAllowedExt(String[] allowedExt)
    {
        this.allowedExt = allowedExt;
    }

    /**
     * retorna la dirección url
     * @return
     */
    public String getFileURL()
    {
        return fileURL;
    }

    /**
     * setea la URL pública del archivo
     * @param url
     */
    public void setFileURL(String url)
    {
        this.fileURL = url;
    }

    /**
     * setea el nombre del archivo
     * @param fileName
     */
    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    /**
     * Checks that the file extension is supported.
     */
    public String checkFileExtension(String fileName) throws ServletException {

        if (fileName != null && !fileName.isEmpty() && fileName.contains(".")) {

            for (String ext : allowedExt) {
                if (fileName.endsWith(ext)) {
                    return ext;
                }
            }

            logger.error("extension invalida");
            throw new ServletException("file must be an image");
        }

        logger.error("extension invalida");
        throw new ServletException("file must be an image");
    }

    /**
     * Retorna el nombre del archivo
     *
     * @param fileName
     * @return
     * @throws ServletException
     */
    public String getFileName(String fileName, String newName) throws ServletException {

        String ext = this.checkFileExtension(fileName);

        final String name  = fileName.substring(0, fileName.lastIndexOf('.'));

        // Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String finalName = newName + "-avatar" + ext;
        logger.error("Nombre del archivo " + finalName );

        return finalName;
    }

}
