package net.hiskarma.stellarTest;

import net.hiskarma.stellarTest.configuration.CommonDefs;
import net.hiskarma.stellarTest.util.PrefixedLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Launcher {
    private static final PrefixedLogger logger = PrefixedLogger.getLogger(Launcher.class);

    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }

    public static void shutdown(CommonDefs.EXITCODE code) {
        logger.warn("Shutdown : {} ({})", code.name(), code.getCode());
        System.exit(code.getCode());
    }
}
