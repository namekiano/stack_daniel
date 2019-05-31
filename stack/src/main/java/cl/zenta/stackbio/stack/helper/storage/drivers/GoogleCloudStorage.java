package cl.zenta.stackbio.stack.helper.storage.drivers;

import java.io.ByteArrayInputStream;

import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.StorageOptions;

import cl.zenta.stackbio.stack.helper.storage.Storage;
import cl.zenta.stackbio.stack.controllers.AvatarController;

public class GoogleCloudStorage extends Storage{
	
	/** The Constant logger. */
    private static final Logger logger = LoggerFactory.getLogger(AvatarController.class);

    private static String bucketName = System.getenv().get("BUCKET_NAME");
    private static String url = System.getenv().get("GOOGLE_STORAGE_PUBLIC_URL");

    //private static String bucketName = "zwallet-poc-img-front";

    private static com.google.cloud.storage.Storage storage = null;

    public void setDefaultStorageSettings() {

        try {
            storage = StorageOptions.newBuilder()
                    .build()
                    .getService();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     *
     * @param fileName
     * @param file
     * @return
     */
    public boolean uploadFile(String fileName, byte[] file, String newName) throws ServletException {

        this.setDefaultStorageSettings();

        String nameFinal = this.getFileName(fileName, newName);

        storage.create(BlobInfo.newBuilder(bucketName, nameFinal).build(),
                new ByteArrayInputStream(file));


        logger.info( url + bucketName + "/" + nameFinal );

        this.setFileURL( url + bucketName + "/" + nameFinal );
        return true;
    }

}
