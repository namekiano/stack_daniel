package cl.zenta.stackbio.stack.helper.storage;

import cl.zenta.stackbio.stack.helper.storage.Storage;
import cl.zenta.stackbio.stack.helper.storage.drivers.GoogleCloudStorage;;

public class StorageFactory {
	
	public static Storage getStorage(String driver)
    {
        /**
         * AL AGREGAR NUEVOS METODOS DE STORAGE
         * AGREGAR LÓGICA PARA LA IMPLEMENTACIÓN
         * DE LA CLASE CORRESPONDIENTE
         *
         * MIENTRAS RETORNARÁ LA SIGUIENTE
         */

        if( driver == "google_cloud_storage" ){
            return new GoogleCloudStorage();
        }

        // default
        return new GoogleCloudStorage();
    }

}
