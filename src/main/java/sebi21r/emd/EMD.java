package sebi21r.emd;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EMD implements ModInitializer {
	public static final String Mod_ID = "even_more_decoration";
    public static final Logger LOGGER = LoggerFactory.getLogger(Mod_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world");
	}
}