package exception;

import java.io.IOException;

public class CommandNotFoundException extends IOException {
    public CommandNotFoundException(String command) {
        super(String.format("command %s not found", command));
    }
}
